import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JButton;

public class Main extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	
	ArrEstudiante escalafon;
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
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido(a), seleccione el tipo de estudiante a ingresar");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(184, 11, 399, 14);
		getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnSecundaria = new JRadioButton("Secundaria");
		rdbtnSecundaria.setBounds(159, 32, 109, 23);
		getContentPane().add(rdbtnSecundaria);
		panel.setBounds(10, 111, 377, 332);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		txtDPISec = new JTextField();
		txtDPISec.setBounds(53, 39, 162, 20);
		panel.add(txtDPISec);
		txtDPISec.setColumns(10);
		
		txtNombreSec = new JTextField();
		txtNombreSec.setBounds(53, 8, 162, 20);
		panel.add(txtNombreSec);
		txtNombreSec.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 11, 46, 14);
		panel.add(lblNombre);
		
		JLabel lblDPI = new JLabel("DPI:");
		lblDPI.setBounds(10, 36, 46, 14);
		panel.add(lblDPI);
		
		JLabel lblPromSeptimo = new JLabel("Promedio de s\u00E9ptimo:");
		lblPromSeptimo.setBounds(10, 66, 103, 14);
		panel.add(lblPromSeptimo);
		
		txtPromSepSec = new JTextField();
		txtPromSepSec.setBounds(129, 63, 86, 20);
		panel.add(txtPromSepSec);
		txtPromSepSec.setColumns(10);
		
		JLabel lblPromSep = new JLabel("Promedio de octavo:");
		lblPromSep.setBounds(10, 91, 103, 14);
		panel.add(lblPromSep);
		
		txtPromOctavSec = new JTextField();
		txtPromOctavSec.setBounds(129, 88, 86, 20);
		panel.add(txtPromOctavSec);
		txtPromOctavSec.setColumns(10);
		
		JLabel lblPromedioDeNoveno = new JLabel("Promedio de noveno:");
		lblPromedioDeNoveno.setBounds(10, 116, 103, 14);
		panel.add(lblPromedioDeNoveno);
		
		txtPromNovSec = new JTextField();
		txtPromNovSec.setBounds(129, 113, 86, 20);
		panel.add(txtPromNovSec);
		txtPromNovSec.setColumns(10);
		
		JLabel lblNotaDeExamen = new JLabel("Nota de examen de matem\u00E1tica:");
		lblNotaDeExamen.setBounds(10, 141, 162, 14);
		panel.add(lblNotaDeExamen);
		
		txtNotaMateSec = new JTextField();
		txtNotaMateSec.setBounds(170, 138, 45, 20);
		panel.add(txtNotaMateSec);
		txtNotaMateSec.setColumns(10);
		
		JLabel lblNotaDeExamen_1 = new JLabel("Nota de examen de historia:");
		lblNotaDeExamen_1.setBounds(10, 166, 148, 14);
		panel.add(lblNotaDeExamen_1);
		
		txtNotaHistoriaSec = new JTextField();
		txtNotaHistoriaSec.setText("");
		txtNotaHistoriaSec.setBounds(170, 163, 45, 20);
		panel.add(txtNotaHistoriaSec);
		txtNotaHistoriaSec.setColumns(10);
		
		JLabel lblNotaDeExamen_2 = new JLabel("Nota de examen de espa\u00F1ol:");
		lblNotaDeExamen_2.setBounds(10, 189, 148, 14);
		panel.add(lblNotaDeExamen_2);
		
		txtNotaEspSec = new JTextField();
		txtNotaEspSec.setBounds(170, 186, 45, 20);
		panel.add(txtNotaEspSec);
		txtNotaEspSec.setColumns(10);
		
		JLabel lblNotaDeExamen_3 = new JLabel("Nota de examen de aptitud:");
		lblNotaDeExamen_3.setBounds(10, 214, 148, 14);
		panel.add(lblNotaDeExamen_3);
		
		txtNotaAptDesv = new JTextField();
		txtNotaAptDesv.setBounds(170, 211, 45, 20);
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
		btnVerificarRen.setBounds(225, 27, 142, 23);
		panel.add(btnVerificarRen);
		
		JLabel lblIngreseElValor = new JLabel("Ingrese el valor que desea ");
		lblIngreseElValor.setBounds(225, 66, 142, 14);
		panel.add(lblIngreseElValor);
		
		JLabel lblNewLabel_2 = new JLabel("usar como par\u00E1metro");
		lblNewLabel_2.setBounds(225, 77, 109, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("para comprar:");
		lblNewLabel_3.setBounds(225, 91, 109, 14);
		panel.add(lblNewLabel_3);
		
		txtRendimiento = new JTextField();
		txtRendimiento.setBounds(248, 113, 86, 20);
		panel.add(txtRendimiento);
		txtRendimiento.setColumns(10);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(258, 144, 46, 14);
		panel.add(lblResultado);
		
		JRadioButton rdbtnDesvinculadoDeSecundaria = new JRadioButton("Desvinculado de secundaria");
		rdbtnDesvinculadoDeSecundaria.setBounds(159, 58, 199, 23);
		getContentPane().add(rdbtnDesvinculadoDeSecundaria);
		
		JRadioButton rdbtnBachillerato = new JRadioButton("Bachillerato");
		rdbtnBachillerato.setBounds(454, 32, 109, 23);
		getContentPane().add(rdbtnBachillerato);
		
		JRadioButton rdbtnDesvinculadoDeBachillerato = new JRadioButton("Desvinculado de bachillerato");
		rdbtnDesvinculadoDeBachillerato.setBounds(454, 58, 164, 23);
		getContentPane().add(rdbtnDesvinculadoDeBachillerato);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(353, 88, 89, 23);
		getContentPane().add(btnSiguiente);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(452, 111, 299, 332);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNombreBach = new JLabel("Nombre:");
		lblNombreBach.setBounds(10, 11, 46, 14);
		panel_2.add(lblNombreBach);
		
		txtNombreBach = new JTextField();
		txtNombreBach.setText("");
		txtNombreBach.setBounds(66, 8, 152, 20);
		panel_2.add(txtNombreBach);
		txtNombreBach.setColumns(10);
		
		JLabel lblDpi = new JLabel("DPI:");
		lblDpi.setBounds(10, 44, 46, 14);
		panel_2.add(lblDpi);
		
		txtDPIBach = new JTextField();
		txtDPIBach.setBounds(66, 41, 152, 20);
		panel_2.add(txtDPIBach);
		txtDPIBach.setColumns(10);
		
		JLabel lblPromedioDeDcimo = new JLabel("Promedio de D\u00E9cimo:");
		lblPromedioDeDcimo.setBounds(10, 69, 112, 14);
		panel_2.add(lblPromedioDeDcimo);
		
		txtDecimo = new JTextField();
		txtDecimo.setBounds(132, 66, 86, 20);
		panel_2.add(txtDecimo);
		txtDecimo.setColumns(10);
		
		JLabel lblPromedioDeOnceavo = new JLabel("Promedio de Onceavo:");
		lblPromedioDeOnceavo.setBounds(10, 94, 112, 14);
		panel_2.add(lblPromedioDeOnceavo);
		
		txtPromOnceavo = new JTextField();
		txtPromOnceavo.setBounds(132, 91, 86, 20);
		panel_2.add(txtPromOnceavo);
		txtPromOnceavo.setColumns(10);
		
		JLabel lblNotaDeExamen_4 = new JLabel("Nota de examen de Historia:");
		lblNotaDeExamen_4.setBounds(10, 119, 152, 14);
		panel_2.add(lblNotaDeExamen_4);
		
		txtNotaHistoriaBach = new JTextField();
		txtNotaHistoriaBach.setBounds(154, 116, 60, 20);
		panel_2.add(txtNotaHistoriaBach);
		txtNotaHistoriaBach.setColumns(10);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(104, 144, 89, 23);
		panel_2.add(btnAgregar);
		
		JButton btnVerificar = new JButton("Verificar rendimiento de estudiantes desvinculados");
		btnVerificar.setBounds(10, 178, 279, 23);
		panel_2.add(btnVerificar);
		
		JButton btnVerEscalafn = new JButton("Ver escalaf\u00F3n");
		btnVerEscalafn.setBounds(66, 212, 152, 23);
		panel_2.add(btnVerEscalafn);
		
		JButton btnMenu = new JButton("Volver al men\u00FA ");
		btnMenu.setBounds(78, 298, 140, 23);
		panel_2.add(btnMenu);
		
		JLabel lblNewLabel_1 = new JLabel(" ");
		lblNewLabel_1.setBounds(116, 256, 46, 14);
		panel_2.add(lblNewLabel_1);
		jPanel2.setVisible(false);
		
	}
	private void initComponents() {
		jPanel1 = new javax.swing.JPanel();
		
	}
}
