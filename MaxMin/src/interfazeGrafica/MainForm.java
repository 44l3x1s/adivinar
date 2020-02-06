package interfazeGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
//import javax.swing.JTextPane;
import javax.swing.JLabel;

import bussiness.Operaciones;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainForm {

	private JFrame frame;
	private JTextField txtNumberOne;
	private JTextField txtNumberTwo;
	private JTextField txtResultado;
	private Operaciones op;
	private String valorAmostrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm window = new MainForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainForm() {
		initialize();
		op = new Operaciones();
		valorAmostrar = "";
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSuma = new JButton("SUMA");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				String valor1 = txtNumberOne.getText();
				String valor2 = txtNumberTwo.getText();
				double num1 = Double.parseDouble(valor1);
				double num2 = Double.parseDouble(valor2);
				double resultado = op.suma(num1, num2);
				valorAmostrar = String.valueOf(resultado);
				txtResultado.setText(valorAmostrar);
				}catch(Exception e1){
					JOptionPane.showConfirmDialog(null,"Ingrese valores correctos","Advertencia",JOptionPane.WARNING_MESSAGE);
				}
				
				
			}
		});
		btnSuma.setBounds(32, 129, 117, 25);
		frame.getContentPane().add(btnSuma);
		
		JButton btnResta = new JButton("RESTA");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String valor1 = txtNumberOne.getText();
					String valor2 = txtNumberTwo.getText();
					double num1 = Double.parseDouble(valor1);
					double num2 = Double.parseDouble(valor2);
					double resultado = op.resta(num1, num2);
					valorAmostrar = String.valueOf(resultado);
					txtResultado.setText(valorAmostrar);
				}catch(Exception e1){
					JOptionPane.showConfirmDialog(null,"Ingrese valores correctos","Advertencia",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnResta.setBounds(199, 129, 117, 25);
		frame.getContentPane().add(btnResta);
		
		JButton btnMmm = new JButton("MULTIPLICAR");
		btnMmm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String valor1 = txtNumberOne.getText();
					String valor2 = txtNumberTwo.getText();
					double num1 = Double.parseDouble(valor1);
					double num2 = Double.parseDouble(valor2);
					double resultado = op.producto(num1, num2);
					valorAmostrar = String.valueOf(resultado);
					txtResultado.setText(valorAmostrar);
				}catch(Exception e1){
					JOptionPane.showConfirmDialog(null,"Ingrese valores correctos","Advertencia",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnMmm.setBounds(32, 166, 131, 25);
		frame.getContentPane().add(btnMmm);
		
		JButton btnDividir = new JButton("DIVIDIR");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String valor1 = txtNumberOne.getText();
					String valor2 = txtNumberTwo.getText();
					double num1 = Double.parseDouble(valor1);
					double num2 = Double.parseDouble(valor2);
					double resultado = op.divicion(num1, num2);
					String valorAmostrar = String.valueOf(resultado);
					txtResultado.setText(valorAmostrar);
				}catch(Exception e1){
					JOptionPane.showConfirmDialog(null,"Ingrese valores correctos","Advertencia",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnDividir.setBounds(199, 166, 117, 25);
		frame.getContentPane().add(btnDividir);
		
		txtNumberOne = new JTextField();
		txtNumberOne.setBounds(184, 26, 114, 19);
		frame.getContentPane().add(txtNumberOne);
		txtNumberOne.setColumns(10);
		
		JLabel lblIngreseNumero = new JLabel("Ingrese Numero");
		lblIngreseNumero.setBounds(32, 28, 131, 15);
		frame.getContentPane().add(lblIngreseNumero);
		
		JLabel lblIngreseNumero_1 = new JLabel("Ingrese Numero");
		lblIngreseNumero_1.setBounds(32, 62, 117, 15);
		frame.getContentPane().add(lblIngreseNumero_1);
		
		txtNumberTwo = new JTextField();
		txtNumberTwo.setBounds(184, 60, 114, 19);
		frame.getContentPane().add(txtNumberTwo);
		txtNumberTwo.setColumns(10);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setBounds(184, 91, 224, 26);
		frame.getContentPane().add(txtResultado);
		txtResultado.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(69, 89, 94, 15);
		frame.getContentPane().add(lblResultado);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNumberOne.setText(null);
				txtNumberTwo.setText(null);
				txtResultado.setText(null);
			}
		});
		btnClear.setBounds(310, 26, 117, 25);
		frame.getContentPane().add(btnClear);
	}
}
