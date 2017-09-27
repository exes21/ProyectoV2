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

import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;

public class Inicio {

	private JFrame frmJpirpucmm;
	private JTextArea textNivelSenal;
	private JPanel panel_4;
	private static JTabbedPane contenedor;
	private JButton btnStart;
	private JButton btnStop;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
		frmJpirpucmm.setTitle("JPIR-PUCMM");

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		
		frmJpirpucmm.setExtendedState(Frame.MAXIMIZED_BOTH);
		//buscar el alto y ancho de la pantalla
		int ancho = (int)d.getWidth();
		int alto = (int)d.getHeight();
		frmJpirpucmm.setSize(new Dimension(ancho, alto)); // para que tenga el tamñado de la pantalla
		
		
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
		
		JLabel lblJpirPucmm = new JLabel("JPIR - PUCMM");
		lblJpirPucmm.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblJpirPucmm.setBounds(597, 19, 241, 44);
		panel_2.add(lblJpirPucmm);
		
		btnStart = new JButton("Inicio\r\n");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnStart.setBounds(1138, 35, 89, 23);
		panel_2.add(btnStart);
		
		btnStop = new JButton("Parar");
		btnStop.setBounds(1244, 35, 89, 23);
		panel_2.add(btnStop);
		
		//----------------------Uso esto para que cuando inicie el programa no se vean los bontones de la pestaña 1--------------------------------------
		btnStart.setEnabled(false);
		btnStop.setEnabled(false);
		btnStart.setVisible(false);
		btnStop.setVisible(false);
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
		panel.setBounds(10, 27, 643, 552);
		TapCalidad.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Niveles de se\u00F1al:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 11, 195, 14);
		panel.add(lblNewLabel);
		
		JLabel lblPerdidaDePaquetes = new JLabel("Perdida de paquetes:");
		lblPerdidaDePaquetes.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPerdidaDePaquetes.setBounds(10, 188, 211, 14);
		panel.add(lblPerdidaDePaquetes);
		
		JLabel lblNewLabel_1 = new JLabel("Relaci\u00F3n Se\u00F1al-Ruido:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 356, 195, 14);
		panel.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(47, 45, 357, 123);
		panel.add(scrollPane);
		
		textNivelSenal = new JTextArea();
		scrollPane.setViewportView(textNivelSenal);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(47, 213, 357, 123);
		panel.add(scrollPane_1);
		
		JTextArea TextPaquetes = new JTextArea();
		scrollPane_1.setViewportView(TextPaquetes);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_2.setBounds(47, 381, 357, 123);
		panel.add(scrollPane_2);
		
		JTextArea textSegnalRuido = new JTextArea();
		scrollPane_2.setViewportView(textSegnalRuido);
		
		JLabel lblPromedio = new JLabel("Valor Promedio");
		lblPromedio.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPromedio.setBounds(488, 78, 100, 14);
		panel.add(lblPromedio);
		
		JLabel label_1 = new JLabel("Valor Promedio");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label_1.setBounds(488, 242, 100, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Valor Promedio");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label_2.setBounds(488, 392, 100, 14);
		panel.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(488, 103, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(488, 267, 86, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(488, 417, 86, 20);
		panel.add(textField_2);

		
		panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(684, 26, 643, 553);
		TapCalidad.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblLatencia = new JLabel("Latencia:");
		lblLatencia.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblLatencia.setBounds(10, 11, 119, 14);
		panel_4.add(lblLatencia);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_3.setBounds(47, 45, 357, 123);
		panel_4.add(scrollPane_3);
		
		JTextArea textLatencia = new JTextArea();
		scrollPane_3.setViewportView(textLatencia);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_4.setBounds(47, 213, 357, 123);
		panel_4.add(scrollPane_4);
		
		JTextArea textJitter = new JTextArea();
		scrollPane_4.setViewportView(textJitter);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_5.setBounds(47, 383, 357, 123);
		panel_4.add(scrollPane_5);
		
		JTextArea textThrougput = new JTextArea();
		scrollPane_5.setViewportView(textThrougput);
		
		JLabel lblJitter = new JLabel("Jitter:");
		lblJitter.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblJitter.setBounds(10, 188, 90, 14);
		panel_4.add(lblJitter);
		
		JLabel lblThroughput = new JLabel("Throughput:");
		lblThroughput.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblThroughput.setBounds(10, 358, 129, 14);
		panel_4.add(lblThroughput);
		
		JLabel label_3 = new JLabel("Valor Promedio");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label_3.setBounds(474, 78, 100, 14);
		panel_4.add(label_3);
		
		JLabel label_4 = new JLabel("Valor Promedio");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label_4.setBounds(474, 242, 100, 14);
		panel_4.add(label_4);
		
		JLabel label_5 = new JLabel("Valor Promedio");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label_5.setBounds(474, 392, 100, 14);
		panel_4.add(label_5);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(474, 103, 86, 20);
		panel_4.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(474, 267, 86, 20);
		panel_4.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(488, 417, 86, 20);
		panel_4.add(textField_5);
				
		}
	
	}
