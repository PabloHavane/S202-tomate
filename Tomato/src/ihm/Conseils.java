package ihm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Component;

public class Conseils extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldConseils;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conseils frame = new Conseils();
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
	public Conseils() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitle = new JLabel("Conseil de culture");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblTitle, BorderLayout.CENTER);
		
		JLabel logoImg = new JLabel("Img");
		panel_1.add(logoImg, BorderLayout.WEST);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblSemis = new JLabel("Semis :");
		lblSemis.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lblSemis);
		
		JLabel lblRepiquage = new JLabel("Repiquage :");
		panel_2.add(lblRepiquage);
		
		JLabel lblRécolte = new JLabel("Récolte :");
		panel_2.add(lblRécolte);
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		textFieldConseils = new JTextField();
		textFieldConseils.setEditable(false);
		scrollPane.setViewportView(textFieldConseils);
		textFieldConseils.setColumns(10);
		
		JButton btnAccueil = new JButton("Retour à l'accueil");
		contentPane.add(btnAccueil, BorderLayout.SOUTH);
	}

}
