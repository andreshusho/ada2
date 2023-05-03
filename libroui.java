import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class libroui extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	libro libro = new libro();
	libro libro2 = new libro();

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
		setBounds(100, 100, 450, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Libros");
		lblNewLabel.setBounds(138, 10, 169, 11);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" Autor");
		lblNewLabel_1.setBounds(59, 42, 67, 11);
		contentPane.add(lblNewLabel_1);
		
		txt1 = new JTextField();
		txt1.setBounds(151, 39, 139, 17);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel(" Editorial");
		lblNewLabel_2.setBounds(59, 90, 67, 11);
		contentPane.add(lblNewLabel_2);
		
		txt2 = new JTextField();
		txt2.setBounds(151, 86, 139, 17);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre");
		lblNewLabel_3.setBounds(63, 141, 63, 11);
		contentPane.add(lblNewLabel_3);
		
		txt3 = new JTextField();
		txt3.setBounds(151, 139, 139, 14);
		contentPane.add(txt3);
		txt3.setColumns(10);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				libro.setAutor(txt1.getText());
				libro.setEditorial(txt2.getText());
				libro.setNombre(txt3.getText());
			}
		});
		btnNewButton.setBounds(151, 164, 139, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Leer");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "autor: " + libro.getAutor());
				JOptionPane.showConfirmDialog(null, "editorial: " + libro.getEditorial());
				JOptionPane.showConfirmDialog(null, "nombre: " + libro.getNombre());
			}
		});
		btnNewButton_1.setBounds(151, 206, 139, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnPresentar = new JButton("Presentar");
		btnPresentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				libro2.setAutor(txt1.getText());
				libro2.setEditorial(txt2.getText());
				libro2.setNombre(txt3.getText());
				JOptionPane.showMessageDialog(null, "autor: " + libro2.getAutor());
				JOptionPane.showMessageDialog(null, "editorial: " + libro2.getEditorial());
				JOptionPane.showMessageDialog(null, "nombre: " + libro2.getNombre());
			}
		});
		btnPresentar.setBounds(151, 240, 139, 23);
		contentPane.add(btnPresentar);
	}
}