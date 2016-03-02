package org.dma.java.util;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.ByteBuffer;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.Timer;

public class SoundUtils {

	/**
	 * Beeps.
	 *
	 * Currently half-assumes that the format the system expects is
	 * "PCM_SIGNED unknown sample rate, 16 bit, stereo, 4 bytes/frame, big-endian"
	 * I don't know what to do about the sample rate. Using 11025, since that
	 * seems to be right, by testing against A440. I also can't figure out why
	 * I had to *4 the duration. Also, there's up to about a 100 ms delay before
	 * the sound starts playing.
	 *
	 * @param freq
	 * @param millis
	 */
	public static void beep(double freq, final double millis) throws InterruptedException, LineUnavailableException {

		final Clip clip = AudioSystem.getClip();
		/*
		 * AudioFormat of the reclieved clip. Probably you can alter it
		 * someway choosing proper Line.
		 */
		AudioFormat af = clip.getFormat();

		/*
		 * We assume that encoding uses signed shorts. Probably we could
		 * make this code more generic but who cares.
		 */
		if (af.getEncoding() != AudioFormat.Encoding.PCM_SIGNED){
			throw new UnsupportedOperationException("Unknown encoding");
		}

		if (af.getSampleSizeInBits() != 16) {
			throw new UnsupportedOperationException("Weird sample size");
		}

		/** Number of bytes in a single frame */
		int bytesPerFrame = af.getFrameSize();

		/** Number of frames per second */
		double fps = af.getFrameRate();

		/** Number of frames during the clip */
		int frames = (int)(fps * (millis / 1000));

		/** Data */
		ByteBuffer data = ByteBuffer.allocate(frames * bytesPerFrame);

		/*
		 * We will emit sinus, which needs to be scaled so it has proper
		 * frequency --- here is the scaling factor.
		 */
		double freqFactor = (Math.PI / 2) * freq / fps;

		/*
		 * This sinus must also be scaled so it fills short.
		 */
		double ampFactor = Short.MAX_VALUE;

		short sample;

		for (int frame = 0; frame < frames; frame++) {
			sample = (short)(ampFactor * Math.sin(frame * freqFactor));
			data.putShort(sample);
		}
		clip.open(af, data.array(), 0, data.position());

		/*
		 * This is so Clip releases its data line when done.
		 * Otherwise at 32 clips it breaks.
		 */
		clip.addLineListener(new LineListener() {
			@Override
			public void update(LineEvent event) {
				if (event.getType() == LineEvent.Type.START) {
					Timer t = new Timer((int)millis + 1, new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							clip.close();
						}
					});
					t.setRepeats(false);
					t.start();
				}
			}
		});
		clip.start();

		Thread.sleep((long)millis);

	}

	public static void main(String[] args) throws Exception {
		beep(3000, 100);
	}

}
