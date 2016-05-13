package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class UserWindow {

	public JFrame frmLa;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserWindow window = new UserWindow();
					window.frmLa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLa = new JFrame();
		frmLa.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\javier\\workspace\\sevenDenTickets\\icons\\newUser.png"));
		frmLa.setResizable(false);
		frmLa.setTitle("Formulario de usuario");
		frmLa.setBounds(100, 100, 363, 240);
		frmLa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelControl = new JPanel();
		panelControl.setBackground(Color.WHITE);
		frmLa.getContentPane().add(panelControl, BorderLayout.SOUTH);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.setBackground(Color.WHITE);
		btnGuardar.setToolTipText("Guardar");
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\javier\\workspace\\sevenDenTickets\\icons\\newUser.png"));
		panelControl.add(btnGuardar);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.setToolTipText("Cancelar");
		btnCancelar.setIcon(new ImageIcon("C:\\Users\\javier\\workspace\\sevenDenTickets\\icons\\delete.png"));
		btnCancelar.setBackground(Color.WHITE);
		panelControl.add(btnCancelar);
		
		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(Color.WHITE);
		frmLa.getContentPane().add(panelCenter, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panelCenter.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNick = new JLabel("Nick");
		panel.add(lblNick);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(15);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		panel.add(lblApellidos);
		
		textField_2 = new JTextField();
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNTelefono = new JLabel("N de tel\u00E9fono");
		panel.add(lblNTelefono);
		
		textField_3 = new JTextField();
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPuntos = new JLabel("Puntos");
		panel.add(lblPuntos);
		
		textField_4 = new JTextField();
		panel.add(textField_4);
		textField_4.setColumns(10);
	}

}
