package ada2archivos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class libroui extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	libro libro = new libro();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					libroui frame = new libroui();
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
	public libroui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Libros");
		lblNewLabel.setBounds(168, 10, 62, 11);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" Autor");
		lblNewLabel_1.setBounds(89, 42, 37, 11);
		contentPane.add(lblNewLabel_1);
		
		txt1 = new JTextField();
		txt1.setBounds(151, 39, 139, 17);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel(" Editorial");
		lblNewLabel_2.setBounds(70, 90, 71, 11);
		contentPane.add(lblNewLabel_2);
		
		txt2 = new JTextField();
		txt2.setBounds(151, 86, 139, 17);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre");
		lblNewLabel_3.setBounds(89, 142, 37, 11);
		contentPane.add(lblNewLabel_3);
		
		txt3 = new JTextField();
		txt3.setBounds(151, 139, 139, 14);
		contentPane.add(txt3);
		txt3.setColumns(10);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					BufferedWriter out = new BufferedWriter(new FileWriter("datos.txt"));
					String nombre = txt1.getText();
					for(int i=0; i< nombre.length(); i++) {
					   out.write(nombre.charAt(i));
					}
					nombre = txt1.getText();
					out.newLine();
				
					out.write(nombre);
					out.close();
					} catch (IOException e1) {
					 //TODO Auto-generated catch block
					System.out.println(e1.getMessage());
				    e1.printStackTrace();
				 }
				
			}
		});
		btnNewButton.setBounds(168, 176, 77, 19);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Leer");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = "";
				try {
					FileReader in = new FileReader ("datos"); 
					String linea = txt1.getText();
					int c = in.read();
					while(c!=-1) {
						texto = texto +(char)c;
						c= in.read();
					}
					in.close();
				
				    } catch (IOException exepcion) {
				    	System.out.println(exepcion.getMessage());
					}
				System.out.println(texto);
				}
			}
		});
		btnNewButton_1.setBounds(156, 213, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
