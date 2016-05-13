package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Toolkit;

public class LoginWindow {

	public JFrame frmLogIn;
	private JTextField textFieldUser;
	private JPasswordField passwordFieldPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow window = new LoginWindow();
					window.frmLogIn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogIn = new JFrame();
		frmLogIn.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\javier\\workspace\\sevenDenTickets\\icons\\Icono7denTickets.png"));
		frmLogIn.setTitle("Login");
		frmLogIn.setBounds(100, 100, 261, 274);
		frmLogIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogIn.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panelDatos = new JPanel();
		panelDatos.setBackground(Color.WHITE);
		frmLogIn.getContentPane().add(panelDatos);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\javier\\workspace\\sevenDenTickets\\icons\\Logo7denTickets.png"));
		panelDatos.add(label);
		
		JPanel panelUser = new JPanel();
		panelUser.setBackground(Color.WHITE);
		panelDatos.add(panelUser);
		panelUser.setLayout(new GridLayout(1, 0, 0, 0));
		
		
		
		JLabel lblUser = new JLabel("Usuario:");
		panelUser.add(lblUser);
		
		textFieldUser = new JTextField();
		panelUser.add(textFieldUser);
		textFieldUser.setColumns(10);
		
		JPanel panelPass = new JPanel();
		panelDatos.add(panelPass);
		panelPass.setBackground(Color.WHITE);
		panelPass.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblPass = new JLabel("Contrase\u00F1a:");
		panelPass.add(lblPass);
		
		passwordFieldPass = new JPasswordField();
		panelPass.add(passwordFieldPass);
		passwordFieldPass.setColumns(10);
		
		JPanel panelBoton = new JPanel();
		panelBoton.setBackground(Color.WHITE);
		frmLogIn.getContentPane().add(panelBoton, BorderLayout.SOUTH);
		
		JButton btnLogIn = new JButton("Iniciar sesi\u00F3n");
		panelBoton.add(btnLogIn);
	}

}
