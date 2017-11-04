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
	private JTextField textField;
	private JTextField textField_1;
	
	
	
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
		lblNewLabel.setBounds(69, 11, 399, 14);
		getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnSecundaria = new JRadioButton("Secundaria");
		rdbtnSecundaria.setBounds(69, 32, 109, 23);
		getContentPane().add(rdbtnSecundaria);
		panel.setBounds(10, 128, 225, 172);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(53, 39, 162, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(53, 8, 162, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 11, 46, 14);
		panel.add(lblNombre);
		
		JLabel lblDPI = new JLabel("DPI:");
		lblDPI.setBounds(10, 36, 46, 14);
		panel.add(lblDPI);
		
		JRadioButton rdbtnDesvinculadoDeSecundaria = new JRadioButton("Desvinculado de secundaria");
		rdbtnDesvinculadoDeSecundaria.setBounds(69, 58, 199, 23);
		getContentPane().add(rdbtnDesvinculadoDeSecundaria);
		
		JRadioButton rdbtnBachillerato = new JRadioButton("Bachillerato");
		rdbtnBachillerato.setBounds(304, 32, 109, 23);
		getContentPane().add(rdbtnBachillerato);
		
		JRadioButton rdbtnDesvinculadoDeBachillerato = new JRadioButton("Desvinculado de bachillerato");
		rdbtnDesvinculadoDeBachillerato.setBounds(304, 58, 164, 23);
		getContentPane().add(rdbtnDesvinculadoDeBachillerato);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(212, 88, 89, 23);
		getContentPane().add(btnSiguiente);
		jPanel2.setVisible(false);
		
	}
	private void initComponents() {
		jPanel1 = new javax.swing.JPanel();
		
	}
}
