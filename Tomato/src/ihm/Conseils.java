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

import modèle.Tomates;
import javax.swing.JTextArea;

public class Conseils extends JFrame {

	private JPanel contentPane;

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
		
		JTextArea textAreaConseilTitre = new JTextArea();
		textAreaConseilTitre.setEditable(false);
		textAreaConseilTitre.setText(Tomates.CONSEILS_DE_CULTURE_TITRE);
		panel_1.add(textAreaConseilTitre, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea textAreaConseils = new JTextArea();
		textAreaConseils.setEditable(false);
		textAreaConseils.setText(Tomates.CONSEILS_DE_CULTURE);
		scrollPane.setViewportView(textAreaConseils);
		
		JButton btnAccueil = new JButton("Retour à l'accueil");
		contentPane.add(btnAccueil, BorderLayout.SOUTH);
	}

}
