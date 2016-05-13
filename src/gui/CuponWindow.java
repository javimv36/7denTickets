package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class CuponWindow {

	public JFrame frmFormularioCupn;
	private JTextField txtTitulo;
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
					CuponWindow window = new CuponWindow();
					window.frmFormularioCupn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CuponWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFormularioCupn = new JFrame();
		frmFormularioCupn.setResizable(false);
		frmFormularioCupn.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\javier\\workspace\\sevenDenTickets\\icons\\newCupon.png"));
		frmFormularioCupn.setTitle("Formulario cup\u00F3n");
		frmFormularioCupn.setBounds(100, 100, 406, 319);
		frmFormularioCupn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(Color.WHITE);
		FlowLayout flowLayout = (FlowLayout) panelCenter.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		frmFormularioCupn.getContentPane().add(panelCenter, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panelCenter.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo");
		panel.add(lblTtulo);
		
		txtTitulo = new JTextField();
		panel.add(txtTitulo);
		txtTitulo.setColumns(15);
		
		JLabel lblPrecio = new JLabel("Precio");
		panel.add(lblPrecio);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNmeroDeCupones = new JLabel("N\u00FAmero de cupones");
		panel.add(lblNmeroDeCupones);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmpresa = new JLabel("Empresa");
		panel.add(lblEmpresa);
		
		textField_2 = new JTextField();
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblLocalizacin = new JLabel("Localizaci\u00F3n");
		panel.add(lblLocalizacin);
		
		textField_3 = new JTextField();
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNTelfono = new JLabel("N\u00BA Tel\u00E9fono");
		panel.add(lblNTelfono);
		
		textField_4 = new JTextField();
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panelCenter.add(panel_1);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
		panel_1.add(lblDescripcin);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_1.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setRows(5);
		textArea.setColumns(25);
		
		JPanel panelControl = new JPanel();
		panelControl.setBackground(Color.WHITE);
		frmFormularioCupn.getContentPane().add(panelControl, BorderLayout.SOUTH);
		
		JButton btnGuardar = new JButton("");
		btnGuardar.setBackground(Color.WHITE);
		btnGuardar.setToolTipText("Guardar");
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\javier\\workspace\\sevenDenTickets\\icons\\newCupon.png"));
		panelControl.add(btnGuardar);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.setToolTipText("Cancelar");
		btnCancelar.setIcon(new ImageIcon("C:\\Users\\javier\\workspace\\sevenDenTickets\\icons\\delete.png"));
		btnCancelar.setBackground(Color.WHITE);
		panelControl.add(btnCancelar);
	}

}
