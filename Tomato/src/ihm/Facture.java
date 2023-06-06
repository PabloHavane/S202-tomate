package ihm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Facture extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Facture frame = new Facture();
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
	public Facture() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Facture");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("img");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblNewLabel_1, BorderLayout.WEST);
		
		JLabel lblNewLabel_2 = new JLabel("Merci de votre visite !");
		panel.add(lblNewLabel_2, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		textField = new JTextField();
		scrollPane.setViewportView(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Imprimer");
		panel_1.add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("Quitter");
		panel_1.add(btnNewButton_1, BorderLayout.EAST);
	}

}
