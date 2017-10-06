package grafica;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.LayoutManager;

import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JToolBar;
import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;


import javafx.embed.swing.JFXPanel;
import logical.Conex;

import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;

public class Inicio {

	private JFrame frmJpirpucmm;
	private static JTabbedPane contenedor;
	private JButton btnStart;
	private JButton btnStop;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.frmJpirpucmm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
					
			}
		});
		
		
/*	Conex uno;
		try {
			uno = new Conex();
			uno.startServer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		  
	}

	/**
	 * Create the application.
	 */
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJpirpucmm = new JFrame();
		frmJpirpucmm.setTitle("JPIR-Administrador");

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		
		frmJpirpucmm.setExtendedState(Frame.MAXIMIZED_BOTH);
		//buscar el alto y ancho de la pantalla
		int ancho = (int)d.getWidth();
		int alto = (int)d.getHeight();
		frmJpirpucmm.setSize(new Dimension(ancho, alto)); // para que tenga el tamaño de la pantalla
		
		
		frmJpirpucmm.setBounds(100, 100, ancho, alto);
		frmJpirpucmm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJpirpucmm.getContentPane().setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 1362, 65);
		frmJpirpucmm.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1362, 24);
		panel_2.add(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenu mnAlaramas = new JMenu("Alarmas");
		menuBar.add(mnAlaramas);
		
		JMenu mnEstadsticas = new JMenu("Estad\u00EDsticas");
		menuBar.add(mnEstadsticas);
		
		JMenu mnConfiguracin = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracin);
		
		JMenuItem mntmServidor = new JMenuItem("Servidor");
		mntmServidor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ConfigServidor ventServidor = new ConfigServidor();
				ventServidor.setVisible(true);
				
			}
		});
		mnConfiguracin.add(mntmServidor);
		
		JMenuItem mntmAplicacin = new JMenuItem("Aplicaci\u00F3n");
		mntmAplicacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ConfigAplicaccion ventConfigApp = new ConfigAplicaccion();
				ventConfigApp.setVisible(true);
				
				
			}
		});
		mnConfiguracin.add(mntmAplicacin);
		
		JLabel lblJpirPucmm = new JLabel("JPIR - Administrador");
		lblJpirPucmm.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblJpirPucmm.setBounds(597, 19, 273, 44);
		panel_2.add(lblJpirPucmm);
		//-----------------------------------------------------------------------------------------------------------------------------------------------
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 64, 1352, 2);
		frmJpirpucmm.getContentPane().add(separator);
		
		contenedor = new JTabbedPane(JTabbedPane.TOP);
		
		
		contenedor.addMouseListener(new MouseAdapter() { // evento: me da el número de pestaña seleccionada
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//System.out.println(contenedor.getSelectedIndex());
				
				switch (contenedor.getSelectedIndex()) {
				case 0:
						btnStart.setEnabled(false);
						btnStop.setEnabled(false);
						btnStart.setVisible(false);
						btnStop.setVisible(false);
					break;
					
				case 1:
					btnStart.setEnabled(true);
					btnStop.setEnabled(true);
					btnStart.setVisible(true);
					btnStop.setVisible(true);
					break;

				default:
					break;
				}
				
			}
		});
		
		
		contenedor.setBounds(10, 76, 1342, 618);
		frmJpirpucmm.getContentPane().add(contenedor);
		
		JPanel TapMapa = new JPanel();
		contenedor.addTab("Mapa", null, TapMapa, null);
		TapMapa.setLayout(null);		
		
		JLabel lblMapaIlustrativo = new JLabel("MAPA ILUSTRATIVO");
		lblMapaIlustrativo.setBounds(319, 191, 722, 239);
		TapMapa.add(lblMapaIlustrativo);
		lblMapaIlustrativo.setForeground(Color.RED);
		lblMapaIlustrativo.setFont(new Font("Times New Roman", Font.BOLD, 63));
		
		
		
		JLabel label = new JLabel("");
		label.setBounds(10, 0, 1116, 587);
		TapMapa.add(label);
		label.setIcon(new ImageIcon(Inicio.class.getResource("/imagenes/Ruta-II-Carrera-del-Bu\u0301ho-2015.jpg")));
		
		JButton btnActulizar = new JButton("Actualizar Mapa");
		btnActulizar.setBounds(1153, 26, 150, 23);
		TapMapa.add(btnActulizar);
		btnActulizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnActulizar.setActionCommand("Actualizar");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(1136, 90, 191, 497);
		TapMapa.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNotificaciones = new JLabel("NOTIFICACIONES");
		lblNotificaciones.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNotificaciones.setBounds(38, 11, 131, 14);
		panel_1.add(lblNotificaciones);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(10, 31, 171, 455);
		panel_1.add(scrollPane_6);
		
		JTextArea textArea = new JTextArea();
		scrollPane_6.setViewportView(textArea);
		
		JPanel TapCalidad = new JPanel();
		contenedor.addTab("Calidad de la red WLAN", null, TapCalidad, null);
		TapCalidad.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 26, 1317, 552);
		TapCalidad.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Niveles de se\u00F1al:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(1049, 384, 195, 14);
		panel.add(lblNewLabel);
		
		JLabel lblPerdidaDePaquetes = new JLabel("Perdida de paquetes:");
		lblPerdidaDePaquetes.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPerdidaDePaquetes.setBounds(1049, 185, 129, 14);
		panel.add(lblPerdidaDePaquetes);
		
		JLabel lblNewLabel_1 = new JLabel("Relaci\u00F3n Se\u00F1al-Ruido:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(196, 384, 195, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblPromedio = new JLabel("Valor Promedio");
		lblPromedio.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPromedio.setBounds(1004, 401, 100, 14);
		panel.add(lblPromedio);
		
		JLabel label_1 = new JLabel("Valor Promedio");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label_1.setBounds(1004, 213, 100, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Valor Promedio");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label_2.setBounds(154, 401, 100, 14);
		panel.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(1114, 398, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(1114, 210, 86, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(283, 398, 86, 20);
		panel.add(textField_2);
		
		JLabel lblThroughput = new JLabel("Throughput:");
		lblThroughput.setBounds(611, 384, 129, 14);
		panel.add(lblThroughput);
		lblThroughput.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JLabel lblJitter = new JLabel("Jitter:");
		lblJitter.setBounds(611, 194, 90, 14);
		panel.add(lblJitter);
		lblJitter.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		textField_5 = new JTextField();
		textField_5.setBounds(754, 398, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel label_5 = new JLabel("Valor Promedio");
		label_5.setBounds(601, 401, 100, 14);
		panel.add(label_5);
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		textField_4 = new JTextField();
		textField_4.setBounds(754, 210, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_4 = new JLabel("Valor Promedio");
		label_4.setBounds(601, 216, 100, 14);
		panel.add(label_4);
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		textField_3 = new JTextField();
		textField_3.setBounds(754, 30, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_3 = new JLabel("Valor Promedio");
		label_3.setBounds(601, 33, 100, 14);
		panel.add(label_3);
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JLabel lblLatencia = new JLabel("Latencia:");
		lblLatencia.setBounds(617, 11, 119, 14);
		panel.add(lblLatencia);
		lblLatencia.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JLabel lblDataRate = new JLabel("Data Rate");
		lblDataRate.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblDataRate.setBounds(1049, 14, 86, 14);
		panel.add(lblDataRate);
		
		JLabel label_6 = new JLabel("Valor Promedio");
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label_6.setBounds(1004, 33, 100, 14);
		panel.add(label_6);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(1114, 30, 86, 20);
		panel.add(textField_6);
		
		JLabel lblTiempoDeMedicin = new JLabel("Tiempo de medici\u00F3n");
		lblTiempoDeMedicin.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTiempoDeMedicin.setBounds(38, 113, 112, 14);
		panel.add(lblTiempoDeMedicin);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(213, 110, 166, 20);
		panel.add(textField_7);
		
		JLabel lblLaltimaMedicion = new JLabel("La \u00FAltima medicion fue hace:");
		lblLaltimaMedicion.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblLaltimaMedicion.setBounds(38, 156, 162, 14);
		panel.add(lblLaltimaMedicion);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(213, 153, 166, 20);
		panel.add(textField_8);
		
		btnStart = new JButton("Inicio\r\n");
		btnStart.setBounds(61, 47, 89, 23);
		panel.add(btnStart);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		//----------------------Uso esto para que cuando inicie el programa no se vean los bontones de la pestaña 1--------------------------------------
	
		
		btnStop = new JButton("Parar");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { //estoy es una prueba
			}
		});
		btnStop.setBounds(213, 47, 89, 23);
		panel.add(btnStop);
		
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_4.setBounds(903, 429, 378, 123);
		panel.add(scrollPane_4);
		
		JTextPane textPane_4 = new JTextPane();
		scrollPane_4.setViewportView(textPane_4);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_5.setBounds(478, 429, 378, 123);
		panel.add(scrollPane_5);
		
		JTextPane textPane_3 = new JTextPane();
		scrollPane_5.setViewportView(textPane_3);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_2.setBounds(53, 429, 378, 123);
		panel.add(scrollPane_2);
		
		JTextPane textPane_1 = new JTextPane();
		scrollPane_2.setViewportView(textPane_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(903, 252, 378, 123);
		panel.add(scrollPane);
		
		JTextPane textPane_5 = new JTextPane();
		scrollPane.setViewportView(textPane_5);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(478, 252, 378, 123);
		panel.add(scrollPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		scrollPane_1.setViewportView(textPane_2);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_3.setBounds(903, 60, 378, 123);
		panel.add(scrollPane_3);
		
		JTextPane textPane_6 = new JTextPane();
		scrollPane_3.setViewportView(textPane_6);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_7.setBounds(478, 60, 378, 123);
		panel.add(scrollPane_7);
		
		JTextPane textPane = new JTextPane();
		scrollPane_7.setViewportView(textPane);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(48, 189, 377, 184);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JRadioButton rdbtnAreaNombrerea = new JRadioButton("Area nombre \u00E1rea");
		rdbtnAreaNombrerea.setBounds(20, 87, 143, 23);
		panel_3.add(rdbtnAreaNombrerea);
		
		JLabel lblreasAMedir = new JLabel("\u00C1reas a medir");
		lblreasAMedir.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblreasAMedir.setBounds(148, 11, 109, 14);
		panel_3.add(lblreasAMedir);
		
		JRadioButton rdbtnTotasLasreas = new JRadioButton("Totas las \u00E1reas");
		rdbtnTotasLasreas.setBounds(20, 47, 143, 23);
		panel_3.add(rdbtnTotasLasreas);
		
		JRadioButton radioButton = new JRadioButton("Area nombre \u00E1rea");
		radioButton.setBounds(20, 132, 143, 23);
		panel_3.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Area nombre \u00E1rea");
		radioButton_1.setBounds(233, 47, 143, 23);
		panel_3.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Area nombre \u00E1rea");
		radioButton_2.setBounds(233, 87, 143, 23);
		panel_3.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("Area nombre \u00E1rea");
		radioButton_3.setBounds(233, 132, 143, 23);
		panel_3.add(radioButton_3);
		btnStop.setVisible(false);
		btnStart.setVisible(false);
				
		}
	}
