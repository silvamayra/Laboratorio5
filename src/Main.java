import java.awt.BorderLayout; 
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	
	//Declaracion de variables
	ArrEstudiante baseDatos;
	Estudiante estudiante;
	Secundaria secundariaTemp;
	SecundariaDesvinculado desvSecTemp;
	Bachillerato bachTemp;
	BachilleratoDesvinculado bachDesvTemp;
	DbConnection dbConnection;
	Error errores;
	String mensaje;
	

	/**
	 * Launch the application.
	 */
	
	
	private JTextField txtNombreSec;
	private JTextField txtDPISec;
	private JTextField txtPromSepSec;
	private JTextField txtPromOctavSec;
	private JTextField txtPromNovSec;
	private JTextField txtNotaMateSec;
	private JTextField txtNotaHistoriaSec;
	private JTextField txtNotaEspSec;
	private JTextField txtNotaAptDesv;
	private JTextField txtNombreBach;
	private JTextField txtDPIBach;
	private JTextField txtDecimo;
	private JTextField txtPromOnceavo;
	private JTextField txtNotaHistoriaBach;
	private JTextField txtRendimiento;
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		
		
		panel.setVisible(false);
		dbConnection=new DbConnection();
		errores= new Error();
		
		
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido(a), seleccione el tipo de estudiante a ingresar");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(352, 11, 399, 14);
		getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnSecundaria = new JRadioButton("Secundaria");
		rdbtnSecundaria.setBounds(159, 32, 109, 23);
		getContentPane().add(rdbtnSecundaria);
		
		JRadioButton rdbtnDesvinculadoDeSecundaria = new JRadioButton("Desvinculado de secundaria");
		rdbtnDesvinculadoDeSecundaria.setBounds(159, 58, 199, 23);
		getContentPane().add(rdbtnDesvinculadoDeSecundaria);
		
		
		JRadioButton rdbtnBachillerato = new JRadioButton("Bachillerato");
		rdbtnBachillerato.setBounds(654, 32, 109, 23);
		getContentPane().add(rdbtnBachillerato);
		
		
		JRadioButton rdbtnDesvinculadoDeBachillerato = new JRadioButton("Desvinculado de bachillerato");
		rdbtnDesvinculadoDeBachillerato.setBounds(654, 58, 164, 23);
		getContentPane().add(rdbtnDesvinculadoDeBachillerato);
		
		
		ButtonGroup grupo= new ButtonGroup();
		grupo.add(rdbtnSecundaria);
		grupo.add(rdbtnDesvinculadoDeSecundaria);
		grupo.add(rdbtnBachillerato);
		grupo.add(rdbtnDesvinculadoDeBachillerato);
		
		JButton btnSiguiente = new JButton("Siguiente");
	
		
	
		btnSiguiente.setBounds(476, 80, 89, 23);
		getContentPane().add(btnSiguiente);
		panel.setBounds(10, 111, 527, 453);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		txtDPISec = new JTextField();
		txtDPISec.setBounds(53, 33, 281, 20);
		panel.add(txtDPISec);
		txtDPISec.setColumns(10);
		
		txtNombreSec = new JTextField();
		txtNombreSec.setBounds(53, 8, 281, 20);
		panel.add(txtNombreSec);
		txtNombreSec.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 11, 46, 14);
		panel.add(lblNombre);
		
		JLabel lblDPI = new JLabel("DPI:");
		lblDPI.setBounds(10, 36, 46, 14);
		panel.add(lblDPI);
		
		JLabel lblPromSeptimo = new JLabel("Promedio de s\u00E9ptimo:");
		lblPromSeptimo.setBounds(10, 66, 227, 14);
		panel.add(lblPromSeptimo);
		
		txtPromSepSec = new JTextField();
		txtPromSepSec.setBounds(247, 64, 86, 20);
		panel.add(txtPromSepSec);
		txtPromSepSec.setColumns(10);
		
		
		JLabel lblPromSep = new JLabel("Promedio de octavo:");
		lblPromSep.setBounds(10, 91, 227, 14);
		panel.add(lblPromSep);
		
		txtPromOctavSec = new JTextField();
		txtPromOctavSec.setBounds(248, 88, 86, 20);
		panel.add(txtPromOctavSec);
		txtPromOctavSec.setColumns(10);
		
		
		JLabel lblPromedioDeNoveno = new JLabel("Promedio de noveno:");
		lblPromedioDeNoveno.setBounds(10, 116, 227, 14);
		panel.add(lblPromedioDeNoveno);
		
		txtPromNovSec = new JTextField();
		txtPromNovSec.setBounds(248, 113, 86, 20);
		panel.add(txtPromNovSec);
		txtPromNovSec.setColumns(10);
		
		
		JLabel lblNotaDeExamen = new JLabel("Nota de examen de matem\u00E1tica:");
		lblNotaDeExamen.setBounds(10, 141, 269, 14);
		panel.add(lblNotaDeExamen);
		
		txtNotaMateSec = new JTextField();
		txtNotaMateSec.setBounds(289, 138, 45, 20);
		panel.add(txtNotaMateSec);
		txtNotaMateSec.setColumns(10);
		
		
		JLabel lblNotaDeExamen_1 = new JLabel("Nota de examen de historia:");
		lblNotaDeExamen_1.setBounds(10, 166, 269, 14);
		panel.add(lblNotaDeExamen_1);
		
		txtNotaHistoriaSec = new JTextField();
		txtNotaHistoriaSec.setText("");
		txtNotaHistoriaSec.setBounds(289, 163, 45, 20);
		panel.add(txtNotaHistoriaSec);
		txtNotaHistoriaSec.setColumns(10);
		
		
		JLabel lblNotaDeExamen_2 = new JLabel("Nota de examen de espa\u00F1ol:");
		lblNotaDeExamen_2.setBounds(10, 189, 269, 14);
		panel.add(lblNotaDeExamen_2);
		
		txtNotaEspSec = new JTextField();
		txtNotaEspSec.setBounds(289, 186, 45, 20);
		panel.add(txtNotaEspSec);
		txtNotaEspSec.setColumns(10);
		
		
		JLabel lblNotaDeExamen_3 = new JLabel("Nota de examen de aptitud:");
		lblNotaDeExamen_3.setBounds(10, 214, 269, 14);
		panel.add(lblNotaDeExamen_3);
		
		txtNotaAptDesv = new JTextField();
		txtNotaAptDesv.setBounds(289, 211, 45, 20);
		panel.add(txtNotaAptDesv);
		txtNotaAptDesv.setColumns(10);
		
		
		JButton btnContinuar = new JButton("Agregar");
		
		btnContinuar.setBounds(98, 240, 89, 23);
		panel.add(btnContinuar);
		
		JButton btnVer = new JButton(" Ver escalaf\u00F3n");
		btnVer.setBounds(67, 274, 148, 23);
		panel.add(btnVer);
		
		JButton btnVolverMenu = new JButton("Volver a men\u00FA");
	
		btnVolverMenu.setBounds(77, 308, 127, 23);
		panel.add(btnVolverMenu);
		
		JLabel lblEscalafon = new JLabel(" ");
		lblEscalafon.setBounds(243, 258, 46, 14);
		panel.add(lblEscalafon);
		
		JButton btnVerificarRen = new JButton("Verificar rendimiento");
		btnVerificarRen.setBounds(270, 376, 142, 23);
		panel.add(btnVerificarRen);
		
		JLabel lblIngreseElValor = new JLabel("Ingrese el valor que desea ");
		lblIngreseElValor.setBounds(270, 299, 142, 14);
		panel.add(lblIngreseElValor);
		
		JLabel lblNewLabel_2 = new JLabel("usar como par\u00E1metro");
		lblNewLabel_2.setBounds(270, 312, 109, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("para comparar:");
		lblNewLabel_3.setBounds(270, 324, 109, 14);
		panel.add(lblNewLabel_3);
		
		
		txtRendimiento = new JTextField();
		txtRendimiento.setBounds(270, 343, 130, 20);
		panel.add(txtRendimiento);
		txtRendimiento.setColumns(10);
		
		
		
		btnSiguiente.setBounds(353, 88, 89, 23);
		getContentPane().add(btnSiguiente);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(547, 111, 476, 453);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNombreBach = new JLabel("Nombre:");
		lblNombreBach.setBounds(10, 11, 94, 14);
		panel_2.add(lblNombreBach);
		
		txtNombreBach = new JTextField();
		txtNombreBach.setText("");
		txtNombreBach.setBounds(114, 8, 341, 20);
		panel_2.add(txtNombreBach);
		txtNombreBach.setColumns(10);
		
		JLabel lblDpi = new JLabel("DPI:");
		lblDpi.setBounds(10, 44, 46, 14);
		panel_2.add(lblDpi);
		
		txtDPIBach = new JTextField();
		txtDPIBach.setBounds(114, 39, 341, 20);
		panel_2.add(txtDPIBach);
		txtDPIBach.setColumns(10);
		
		JLabel lblPromedioDeDcimo = new JLabel("Promedio de D\u00E9cimo:");
		lblPromedioDeDcimo.setBounds(10, 119, 185, 14);
		panel_2.add(lblPromedioDeDcimo);
		
		txtDecimo = new JTextField();
		txtDecimo.setBounds(205, 116, 86, 20);
		panel_2.add(txtDecimo);
		txtDecimo.setColumns(10);
		
		
		JLabel lblPromedioDeOnceavo = new JLabel("Promedio de Onceavo:");
		lblPromedioDeOnceavo.setBounds(10, 146, 185, 14);
		panel_2.add(lblPromedioDeOnceavo);
		
		txtPromOnceavo = new JTextField();
		txtPromOnceavo.setBounds(205, 143, 86, 20);
		panel_2.add(txtPromOnceavo);
		txtPromOnceavo.setColumns(10);
		
		
		JLabel lblNotaDeExamen_4 = new JLabel("Nota de examen de Historia:");
		lblNotaDeExamen_4.setBounds(10, 171, 185, 14);
		panel_2.add(lblNotaDeExamen_4);
		
		txtNotaHistoriaBach = new JTextField();
		txtNotaHistoriaBach.setBounds(205, 168, 86, 20);
		panel_2.add(txtNotaHistoriaBach);
		txtNotaHistoriaBach.setColumns(10);
		
		panel_2.setVisible(false);
		
		
		JButton btnAgregar = new JButton("Agregar");
		
		btnAgregar.setBounds(359, 137, 89, 23);
		panel_2.add(btnAgregar);
		
		JButton btnVerificar = new JButton("Verificar rendimiento de estudiantes desvinculados");
		btnVerificar.setBounds(22, 408, 279, 23);
		panel_2.add(btnVerificar);
		
		JButton btnVerEscalafn = new JButton("Ver escalaf\u00F3n");
		btnVerEscalafn.setBounds(22, 357, 152, 23);
		panel_2.add(btnVerEscalafn);
		
		JButton btnMenu = new JButton("Volver al men\u00FA ");
		
		btnMenu.setBounds(22, 320, 140, 23);
		panel_2.add(btnMenu);
		
		//Metoo
		
		
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(rdbtnSecundaria.isSelected()) {
				panel.setVisible(true);
				btnVerificarRen.setVisible(false);
				panel_2.setVisible(false);
				lblIngreseElValor.setVisible(false);
				lblNewLabel_2.setVisible(false);
				txtRendimiento.setVisible(false);
				lblNewLabel_3.setVisible(false);
				txtNotaAptDesv.setVisible(false);
				lblNotaDeExamen_3.setVisible(false);
			
				
			}
				
				if(rdbtnDesvinculadoDeSecundaria.isSelected()) {
					panel.setVisible(true);
					panel_2.setVisible(false);
					
				}
				
				if(rdbtnBachillerato.isSelected()) {
					panel.setVisible(false);
					panel_2.setVisible(true);
					btnVerificar.setVisible(false);
					
				}
				
				if(rdbtnDesvinculadoDeBachillerato.isSelected()) {
					panel_2.setVisible(true);
					panel.setVisible(false);
					
					
				}
		}});
		
		//Metodo para crear el objeto ya sea de secundaria o desvinculado de secundaria
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				float txtPromSep= Float.parseFloat(txtPromSepSec.getText());
				float txtPromOct= Float.parseFloat(txtPromOctavSec.getText());
				float txtPromNov= Float.parseFloat(txtPromNovSec.getText());
				float txtNotaMate=Float.parseFloat(txtNotaMateSec.getText());
				float txtNotaHistoria=Float.parseFloat(txtNotaHistoriaSec.getText());
				float txtNotaEspanol=Float.parseFloat(txtNotaEspSec.getText());
				if(rdbtnSecundaria.isSelected()) {
					
					estudiante = new Secundaria();
					
					//En este metodo se realiza la verificacion, se utiliza excepciones, donde se le solicita al usuario que ingrese un dato valido
					if(errores.verificarString(txtNombreSec.getText())==false) {
						mensaje="¡Debe de ingresar solamente letras!"+"\n"+ "Ingrese los datos nuevamente";
						JOptionPane.showMessageDialog(null, mensaje);
						txtNombreSec.setText("");
						txtDPISec.setText("");
						txtPromSepSec.setText("");
						txtPromOctavSec.setText("");
						txtPromNovSec.setText("");
						txtNotaMateSec.setText("");
						txtNotaHistoriaSec.setText("");
						txtNotaEspSec.setText("");
				}
					
					//En este metodo se hace la verificacion, asegurandose de que el usuario solo ingrese numeros
					
						if(errores.verificarString(txtPromSepSec.getText())==false ) {
							mensaje="¡Debe de ingresar solamente números!"+"\n"+ "Ingrese los datos nuevamente";
							JOptionPane.showMessageDialog(null, mensaje);
							txtNombreSec.setText("");
							txtDPISec.setText("");
							txtPromSepSec.setText("");
							txtPromOctavSec.setText("");
							txtPromNovSec.setText("");
							txtNotaMateSec.setText("");
							txtNotaHistoriaSec.setText("");
							txtNotaEspSec.setText("");
							
						}
						
					if( errores.verificarString(txtPromOctavSec.getText())==true) {
						mensaje="¡Debe de ingresar solamente números!"+"\n"+ "Ingrese los datos nuevamente";
						JOptionPane.showMessageDialog(null, mensaje);
						txtNombreSec.setText("");
						txtDPISec.setText("");
						txtPromSepSec.setText("");
						txtPromOctavSec.setText("");
						txtPromNovSec.setText("");
						txtNotaMateSec.setText("");
						txtNotaHistoriaSec.setText("");
						txtNotaEspSec.setText("");
					}
					if(errores.verificarInt(txtPromNovSec.getText())==false )
						{
						
						}
					if(errores.verificarInt(txtNotaMateSec.getText())==false) {
						
					}
					if(errores.verificarInt(txtNotaHistoriaSec.getText())==false) {
						
					}
					if(errores.verificarInt(txtNotaEspSec.getText())){
						
					}
								
					
					
				secundariaTemp.setNombre(txtNombreSec.getText());
				secundariaTemp.setDpi(txtDPISec.getText());
				secundariaTemp.setPromSeptimo(txtPromSep);
				secundariaTemp.setPromOctavo(txtPromOct);
				secundariaTemp.setPromNoveno(txtPromNov);
				secundariaTemp.setNotaMate(txtNotaMate);
				secundariaTemp.setNotaEspanol(txtNotaEspanol);
				secundariaTemp.setNotaHistoria(txtNotaHistoria);
				secundariaTemp.calcularPromedio(txtPromSep, txtPromOct, txtPromNov);
				secundariaTemp.calcularNota(txtNotaMate, txtNotaEspanol, txtNotaHistoria);
				
				baseDatos.addEstudiante(secundariaTemp);
				dbConnection.addEstudiante(secundariaTemp);
				}
				
				if(rdbtnDesvinculadoDeSecundaria.isSelected()) {
					float txtNotaAptitud=Float.parseFloat(txtNotaAptDesv.getText());
					desvSecTemp = new SecundariaDesvinculado();
					//print txtNombreSec.getText()
					
					desvSecTemp.setNombre(txtNombreSec.getText());
					System.out.println(txtNombreSec.getText());
					desvSecTemp.setDpi(txtDPISec.getText());
					desvSecTemp.setPromSeptimo(txtPromSep);
					desvSecTemp.setPromOctavo(txtPromOct);
					desvSecTemp.setPromNoveno(txtPromNov);
					desvSecTemp.setNotaMate(txtNotaMate);
					desvSecTemp.setNotaEspanol(txtNotaEspanol);
					desvSecTemp.setNotaHistoria(txtNotaHistoria);
					desvSecTemp.setNotaAptitud(txtNotaAptitud);
					desvSecTemp.calcularPromedio(txtPromSep, txtPromOct, txtPromNov);
					desvSecTemp.calcularNota(txtNotaMate,txtNotaEspanol, txtNotaHistoria,txtNotaAptitud);
					baseDatos.addEstudiante(desvSecTemp);
					dbConnection.addEstudiante(desvSecTemp);
				}
				
				
				
			}
		});
		
		//Metodo para crear un objeto bachillerato o desvinculado de bachillerato
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float txtOnceavo= Float.parseFloat(txtPromOnceavo.getText());
				float txtPromDecimo=Float.parseFloat(txtDecimo.getText());
				float txtHistoria=Float.parseFloat(txtNotaHistoriaBach.getText());
				if(rdbtnBachillerato.isSelected()) {
					bachTemp.setNombre(txtNombreBach.getText());
					bachTemp.setDpi(txtDPIBach.getText());
					bachTemp.setPromDecimo(txtPromDecimo);
					bachTemp.setPromOnceavo(txtOnceavo);
					bachTemp.setNotaHistoria(txtHistoria);
					bachTemp.calcularPromedio(txtPromDecimo,txtOnceavo);
					bachTemp.calcularNota(txtHistoria);
					baseDatos.addEstudiante(bachTemp);
					dbConnection.addEstudiante(bachTemp);
				}
				if(rdbtnDesvinculadoDeBachillerato.isSelected()) {
				
					bachDesvTemp.setNombre(txtNombreBach.getText());
					bachDesvTemp.setDpi(txtDPIBach.getText());
					bachDesvTemp.setPromDecimo(txtPromDecimo);
					bachDesvTemp.setPromOnceavo(txtOnceavo);
					bachDesvTemp.setNotaHistoria(txtHistoria);
					bachDesvTemp.calcularPromedio(txtPromDecimo,txtOnceavo);
					bachDesvTemp.calcularNota(txtHistoria);
					baseDatos.addEstudiante(bachDesvTemp);
					dbConnection.addEstudiante(bachDesvTemp);
				}
			}
		});
		
		
		//Metodo para limpiar los text fields, en caso de que desee volver al menu para ingresar otro alumno
		
		btnVolverMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNombreSec.setText("");
				txtDPISec.setText("");
				txtPromSepSec.setText("");
				txtPromOctavSec.setText("");
				txtPromNovSec.setText("");
				txtNotaMateSec.setText("");
				txtNotaHistoriaSec.setText("");
				txtNotaEspSec.setText("");
				txtNotaAptDesv.setText("");
				
			}
		});
		
		//Metodo para limpiar los text fields, en caso de que desee volver al menu para ingresar otro alumno
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtNombreBach.setText("");
				txtDPIBach.setText("");
				txtDecimo.setText("");
				txtPromOnceavo.setText("");
				txtNotaHistoriaBach.setText("");
			}
		});
		
		
		
		
	}
	
	
		
	
}
