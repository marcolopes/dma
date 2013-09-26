/*
 * Created by JFormDesigner on Thu Nov 22 12:06:58 GMT 2012
 */

package pt.at.webservices.gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.*;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

/**
 * @author User #2
 */
public class ServicesPanel extends JPanel {
	public ServicesPanel() {
		initComponents();
	}

	public JTextField getUserTf() {
		return userTf;
	}

	public JPasswordField getPasswordTf() {
		return passwordTf;
	}

	public JComboBox getEndpointCb() {
		return endpointCb;
	}

	public JComboBox getOperationCb() {
		return operationCb;
	}

	public JButton getTestBt() {
		return testBt;
	}

	public JTextArea getLogTa() {
		return logTa;
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		panel1 = new JPanel();
		userLb = new JLabel();
		userTf = new JTextField();
		endPointLb = new JLabel();
		endpointCb = new JComboBox();
		testBt = new JButton();
		passwordLb = new JLabel();
		passwordTf = new JPasswordField();
		operationLb = new JLabel();
		operationCb = new JComboBox();
		scrollPane1 = new JScrollPane();
		logTa = new JTextArea();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setBackground(Color.white);
		setBorder(null);
		setLayout(new FormLayout(
			"default, $lcgap, [400dlu,default]:grow, $lcgap, default",
			"4*(default, $lgap), [200dlu,default]:grow, $lgap, default"));

		//======== panel1 ========
		{
			panel1.setBackground(Color.white);
			panel1.setLayout(new FormLayout(
				"default, $lcgap, 60dlu, 2*($lcgap, default), $lcgap, default:grow, $lcgap, default, $lcgap, 50dlu",
				"2*(default, $lgap), default"));

			//---- userLb ----
			userLb.setText("NIF");
			panel1.add(userLb, cc.xy(1, 1));

			//---- userTf ----
			userTf.setBackground(new Color(250, 255, 189));
			panel1.add(userTf, cc.xy(3, 1));

			//---- endPointLb ----
			endPointLb.setText("Endereco");
			panel1.add(endPointLb, cc.xy(7, 1));
			panel1.add(endpointCb, cc.xy(9, 1));

			//---- testBt ----
			testBt.setText("Testar");
			testBt.setBackground(new Color(174, 174, 174));
			testBt.setForeground(Color.white);
			testBt.setOpaque(true);
			testBt.setIcon(null);
			testBt.setBorder(new MatteBorder(1, 1, 1, 1, Color.black));
			panel1.add(testBt, cc.xywh(13, 1, 1, 3));

			//---- passwordLb ----
			passwordLb.setText("Senha");
			panel1.add(passwordLb, cc.xy(1, 3));

			//---- passwordTf ----
			passwordTf.setBackground(new Color(250, 255, 189));
			panel1.add(passwordTf, cc.xy(3, 3));

			//---- operationLb ----
			operationLb.setText("Operacao");
			panel1.add(operationLb, cc.xy(7, 3));
			panel1.add(operationCb, cc.xy(9, 3));
		}
		add(panel1, cc.xy(3, 5));

		//======== scrollPane1 ========
		{
			scrollPane1.setViewportView(logTa);
		}
		add(scrollPane1, cc.xy(3, 9, CellConstraints.DEFAULT, CellConstraints.FILL));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JPanel panel1;
	private JLabel userLb;
	private JTextField userTf;
	private JLabel endPointLb;
	private JComboBox endpointCb;
	private JButton testBt;
	private JLabel passwordLb;
	private JPasswordField passwordTf;
	private JLabel operationLb;
	private JComboBox operationCb;
	private JScrollPane scrollPane1;
	private JTextArea logTa;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
