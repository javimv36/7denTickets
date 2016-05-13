package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.ListSelectionModel;
import java.awt.Toolkit;

public class MainWindow {

	public JFrame frmdentickets;
	private JTable tablaCupones;
	private JTable table_1;
	private JTable tablaUsuarios;
	private JTable tablaComprados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmdentickets.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmdentickets = new JFrame();
		frmdentickets.setIconImage(Toolkit.getDefaultToolkit().getImage("icons\\Icono7denTickets.png"));
		frmdentickets.getContentPane().setBackground(Color.WHITE);
		frmdentickets.setResizable(false);
		frmdentickets.setTitle("7denTickets");
		frmdentickets.setBounds(100, 100, 776, 440);
		frmdentickets.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.WHITE);
		frmdentickets.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panelUsuarios = new JPanel();
		panelUsuarios.setBackground(Color.WHITE);
		tabbedPane.addTab("Usuarios", null, panelUsuarios, null);
		panelUsuarios.setLayout(new BorderLayout(0, 0));
		
		JPanel panelListaUsuarios = new JPanel();
		panelListaUsuarios.setBackground(Color.WHITE);
		panelUsuarios.add(panelListaUsuarios, BorderLayout.WEST);
		panelListaUsuarios.setLayout(new BorderLayout(0, 0));
		
		JLabel lblListaDeUsuarios = new JLabel("Lista de usuarios");
		lblListaDeUsuarios.setBackground(Color.WHITE);
		panelListaUsuarios.add(lblListaDeUsuarios, BorderLayout.NORTH);
		
		JPanel panelTablaUsuarios = new JPanel();
		panelTablaUsuarios.setBackground(Color.WHITE);
		panelListaUsuarios.add(panelTablaUsuarios, BorderLayout.CENTER);
		panelTablaUsuarios.setLayout(new GridLayout(1, 0, 0, 0));
		
		JScrollPane scrollPaneTablaUsuarios = new JScrollPane();
		panelTablaUsuarios.add(scrollPaneTablaUsuarios);
		
		tablaUsuarios = new JTable();
		tablaUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tablaUsuarios.setBackground(Color.WHITE);
		tablaUsuarios.setShowGrid(false);
		tablaUsuarios.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nick", "Nombre", "Apellidos"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tablaUsuarios.getColumnModel().getColumn(0).setResizable(false);
		tablaUsuarios.getColumnModel().getColumn(0).setPreferredWidth(65);
		tablaUsuarios.getColumnModel().getColumn(1).setResizable(false);
		tablaUsuarios.getColumnModel().getColumn(1).setPreferredWidth(65);
		tablaUsuarios.getColumnModel().getColumn(2).setResizable(false);
		tablaUsuarios.getColumnModel().getColumn(2).setPreferredWidth(85);
		scrollPaneTablaUsuarios.setViewportView(tablaUsuarios);
		
		JPanel panel = new JPanel();
		panelUsuarios.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		
		
		JPanel panelUsuario = new JPanel();
		panelUsuario.setBackground(Color.WHITE);
		panel.add(panelUsuario, BorderLayout.CENTER);
		panelUsuario.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNickUsuarioUsuarios = new JLabel("Nick");
		lblNickUsuarioUsuarios.setForeground(SystemColor.textHighlight);
		lblNickUsuarioUsuarios.setFont(new Font("Tahoma", Font.BOLD, 16));
		panelUsuario.add(lblNickUsuarioUsuarios);
		
		JLabel lblNombreUsuarioUsuarios = new JLabel("Nombre");
		panelUsuario.add(lblNombreUsuarioUsuarios);
		
		JLabel lblApellidoUsuarioUsuarios = new JLabel("Apellido");
		panelUsuario.add(lblApellidoUsuarioUsuarios);
		
		JLabel lblNTelfonoUsuarioUsuarios = new JLabel("N\u00BA Tel\u00E9fono");
		panelUsuario.add(lblNTelfonoUsuarioUsuarios);
		
		JLabel lblPuntosUsuarioUsuarios = new JLabel("Puntos");
		lblPuntosUsuarioUsuarios.setForeground(SystemColor.textHighlight);
		lblPuntosUsuarioUsuarios.setFont(new Font("Tahoma", Font.BOLD, 16));
		panelUsuario.add(lblPuntosUsuarioUsuarios);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnEliminar = new JButton("");
		btnEliminar.setBackground(Color.WHITE);
		btnEliminar.setToolTipText("Editar");
		btnEliminar.setIcon(new ImageIcon("icons\\delete.png"));
		panel_1.add(btnEliminar);
		
		JButton btnModificar = new JButton("");
		btnModificar.setForeground(Color.BLACK);
		btnModificar.setBackground(Color.WHITE);
		btnModificar.setToolTipText("Modificar");
		btnModificar.setIcon(new ImageIcon("icons\\edit.png"));
		panel_1.add(btnModificar);
		
		JPanel panelCupones = new JPanel();
		tabbedPane.addTab("Cupones", null, panelCupones, null);
		panelCupones.setLayout(new BorderLayout(0, 0));
		
		JPanel panelListaCupones = new JPanel();
		panelListaCupones.setBackground(Color.WHITE);
		panelCupones.add(panelListaCupones, BorderLayout.WEST);
		panelListaCupones.setLayout(new BorderLayout(0, 0));
		
		JLabel lblListacuDeCupones = new JLabel("Lista de cupones");
		lblListacuDeCupones.setBackground(Color.WHITE);
		panelListaCupones.add(lblListacuDeCupones, BorderLayout.NORTH);
		
		JPanel panelTablaCupones = new JPanel();
		panelTablaCupones.setBackground(Color.WHITE);
		panelListaCupones.add(panelTablaCupones, BorderLayout.CENTER);
		panelTablaCupones.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneCupones = new JScrollPane();
		scrollPaneCupones.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panelTablaCupones.add(scrollPaneCupones);
		
		tablaCupones = new JTable();
		tablaCupones.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tablaCupones.setShowGrid(false);
		scrollPaneCupones.setViewportView(tablaCupones);
		tablaCupones.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cupon", "Precio", "Ventas"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tablaCupones.getColumnModel().getColumn(0).setResizable(false);
		tablaCupones.getColumnModel().getColumn(0).setPreferredWidth(200);
		tablaCupones.getColumnModel().getColumn(1).setResizable(false);
		tablaCupones.getColumnModel().getColumn(1).setPreferredWidth(50);
		tablaCupones.getColumnModel().getColumn(2).setResizable(false);
		tablaCupones.getColumnModel().getColumn(2).setPreferredWidth(60);
		tablaCupones.setToolTipText("");
		
		JPanel panelCompraCupon = new JPanel();
		panelCupones.add(panelCompraCupon, BorderLayout.CENTER);
		panelCompraCupon.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneCupon = new JScrollPane();
		panelCompraCupon.add(scrollPaneCupon, BorderLayout.CENTER);
		
		JPanel panelCupon = new JPanel();
		panelCupon.setBackground(Color.WHITE);
		scrollPaneCupon.setViewportView(panelCupon);
		panelCupon.setLayout(new BorderLayout(0, 0));
		
		JLabel lblImagenCuponCompra = new JLabel("");
		lblImagenCuponCompra.setIcon(new ImageIcon("icons\\cupon.jpg"));
		lblImagenCuponCompra.setBackground(Color.WHITE);
		lblImagenCuponCompra.setHorizontalAlignment(SwingConstants.CENTER);
		panelCupon.add(lblImagenCuponCompra, BorderLayout.CENTER);
		
		JTextArea textAreaDescripcionCuponCompra = new JTextArea();
		textAreaDescripcionCuponCompra.setEditable(false);
		textAreaDescripcionCuponCompra.setText("Descripci\u00F3n del cupon");
		textAreaDescripcionCuponCompra.setLineWrap(true);
		panelCupon.add(textAreaDescripcionCuponCompra, BorderLayout.SOUTH);
		
		JPanel panelCuponCentro = new JPanel();
		panelCuponCentro.setBackground(Color.WHITE);
		panelCupon.add(panelCuponCentro, BorderLayout.NORTH);
		panelCuponCentro.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblTituloCuponCompra = new JLabel("tituloCupon");
		lblTituloCuponCompra.setBackground(Color.WHITE);
		panelCuponCentro.add(lblTituloCuponCompra);
		lblTituloCuponCompra.setForeground(SystemColor.textHighlight);
		lblTituloCuponCompra.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JLabel lblVentasCuponCopmraPrecio = new JLabel("precio");
		lblVentasCuponCopmraPrecio.setBackground(Color.WHITE);
		lblVentasCuponCopmraPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		lblVentasCuponCopmraPrecio.setForeground(SystemColor.textHighlight);
		lblVentasCuponCopmraPrecio.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panelCuponCentro.add(lblVentasCuponCopmraPrecio);
		
		JLabel lblVentasCuponCompra = new JLabel("---");
		panelCuponCentro.add(lblVentasCuponCompra);
		lblVentasCuponCompra.setForeground(SystemColor.textHighlight);
		lblVentasCuponCompra.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblVentasCuponCompra.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panelComprar = new JPanel();
		panelComprar.setBackground(Color.WHITE);
		panelCompraCupon.add(panelComprar, BorderLayout.NORTH);
		
		JButton btnComprar = new JButton("");
		btnComprar.setBackground(Color.WHITE);
		btnComprar.setToolTipText("Comprar");
		btnComprar.setIcon(new ImageIcon("icons\\buy.png"));
		panelComprar.add(btnComprar);
		
		JPanel panelCuponAdmin = new JPanel();
		panelCuponAdmin.setBackground(Color.WHITE);
		panelCompraCupon.add(panelCuponAdmin, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setToolTipText("Eliminar");
		btnNewButton.setIcon(new ImageIcon("icons\\delete.png"));
		btnNewButton.setBackground(Color.WHITE);
		panelCuponAdmin.add(btnNewButton);
		
		JButton btnModificar_1 = new JButton("");
		btnModificar_1.setBackground(Color.WHITE);
		btnModificar_1.setToolTipText("Modificar");
		btnModificar_1.setIcon(new ImageIcon("icons\\edit.png"));
		panelCuponAdmin.add(btnModificar_1);
		
		JPanel panelPerfil = new JPanel();
		tabbedPane.addTab("Perfil", null, panelPerfil, null);
		panelPerfil.setLayout(new BorderLayout(0, 0));
		
		JPanel panelListaComprados = new JPanel();
		panelListaComprados.setBackground(Color.WHITE);
		panelPerfil.add(panelListaComprados, BorderLayout.WEST);
		panelListaComprados.setLayout(new BorderLayout(0, 0));
		
		JLabel lblComprados = new JLabel("Comprados");
		lblComprados.setBackground(Color.WHITE);
		panelListaComprados.add(lblComprados, BorderLayout.NORTH);
		
		JScrollPane scrollPaneTablaComprados = new JScrollPane();
		panelListaComprados.add(scrollPaneTablaComprados, BorderLayout.EAST);
		
		tablaComprados = new JTable();
		tablaComprados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tablaComprados.setShowGrid(false);
		scrollPaneTablaComprados.setViewportView(tablaComprados);
		tablaComprados.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cupon", "Precio"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tablaComprados.getColumnModel().getColumn(0).setResizable(false);
		tablaComprados.getColumnModel().getColumn(0).setPreferredWidth(200);
		tablaComprados.getColumnModel().getColumn(1).setResizable(false);
		
		JPanel panelPerfilDerecha = new JPanel();
		panelPerfilDerecha.setBackground(Color.WHITE);
		panelPerfil.add(panelPerfilDerecha, BorderLayout.CENTER);
		panelPerfilDerecha.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPanePerfil = new JTabbedPane(JTabbedPane.TOP);
		tabbedPanePerfil.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPanePerfil.setBackground(Color.WHITE);
		panelPerfilDerecha.add(tabbedPanePerfil);
		
		JPanel panelPerfilCupon = new JPanel();
		panelPerfilCupon.setBackground(Color.WHITE);
		tabbedPanePerfil.addTab("", new ImageIcon("icons\\newCupon.png"), panelPerfilCupon, "Mi cup\u00F3n");
		tabbedPanePerfil.setBackgroundAt(0, Color.WHITE);
		panelPerfilCupon.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPreciocupon = new JLabel("precioCupon");
		lblPreciocupon.setHorizontalAlignment(SwingConstants.CENTER);
		lblPreciocupon.setForeground(SystemColor.textHighlight);
		lblPreciocupon.setFont(new Font("Tahoma", Font.BOLD, 25));
		panelPerfilCupon.add(lblPreciocupon, BorderLayout.SOUTH);
		
		JPanel panelPerfilCuponInfo = new JPanel();
		panelPerfilCuponInfo.setBackground(Color.WHITE);
		panelPerfilCupon.add(panelPerfilCuponInfo, BorderLayout.CENTER);
		panelPerfilCuponInfo.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitulocupon = new JLabel("tituloCupon");
		panelPerfilCuponInfo.add(lblTitulocupon, BorderLayout.NORTH);
		lblTitulocupon.setForeground(SystemColor.textHighlight);
		lblTitulocupon.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JLabel lblImagencupon = new JLabel("");
		panelPerfilCuponInfo.add(lblImagencupon, BorderLayout.CENTER);
		lblImagencupon.setIcon(new ImageIcon("icons\\cupon.jpg"));
		lblImagencupon.setHorizontalAlignment(SwingConstants.CENTER);
		
		JTextArea textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setEditable(false);
		textAreaDescripcion.setText("Descripci\u00F3n del cupon");
		textAreaDescripcion.setForeground(Color.DARK_GRAY);
		panelPerfilCuponInfo.add(textAreaDescripcion, BorderLayout.SOUTH);
		textAreaDescripcion.setLineWrap(true);
		
		JPanel panelPerfilUsuario = new JPanel();
		panelPerfilUsuario.setBackground(Color.WHITE);
		tabbedPanePerfil.addTab("", new ImageIcon("icons\\newUser.png"), panelPerfilUsuario, null);
		tabbedPanePerfil.setBackgroundAt(1, Color.WHITE);
		panelPerfilUsuario.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNickUsuario = new JLabel("nickUsuario");
		lblNickUsuario.setForeground(SystemColor.textHighlight);
		lblNickUsuario.setFont(new Font("Tahoma", Font.BOLD, 22));
		panelPerfilUsuario.add(lblNickUsuario);
		
		JLabel lblNombreUsuario = new JLabel("nombreUsuario");
		panelPerfilUsuario.add(lblNombreUsuario);
		
		JLabel lblApellidosUsuario = new JLabel("apellidoUsuario");
		panelPerfilUsuario.add(lblApellidosUsuario);
		
		JLabel lblNTelefonoUsuario = new JLabel("000000000");
		panelPerfilUsuario.add(lblNTelefonoUsuario);
		
		JLabel lblPuntosUsuario = new JLabel("---");
		panelPerfilUsuario.add(lblPuntosUsuario);
		
		JPanel panelAdministrador = new JPanel();
		panelAdministrador.setBackground(Color.WHITE);
		frmdentickets.getContentPane().add(panelAdministrador, BorderLayout.NORTH);
		
		JButton btnNuevoUsuario = new JButton("");
		btnNuevoUsuario.setBackground(Color.WHITE);
		btnNuevoUsuario.setIcon(new ImageIcon("icons\\newUser.png"));
		btnNuevoUsuario.setToolTipText("Nuevo usuario");
		btnNuevoUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelAdministrador.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JButton btnNuevoCupon = new JButton("");
		btnNuevoCupon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNuevoCupon.setBackground(Color.WHITE);
		btnNuevoCupon.setToolTipText("Nuevo cup\u00F3n");
		btnNuevoCupon.setIcon(new ImageIcon("icons\\newCupon.png"));
		panelAdministrador.add(btnNuevoCupon);
		panelAdministrador.add(btnNuevoUsuario);
	}

}
