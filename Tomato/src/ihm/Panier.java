package ihm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Panier extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panier frame = new Panier();
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
	public Panier() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblMonPanier = new JLabel("Mon Panier");
		lblMonPanier.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblMonPanier, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton ButtonValide = new JButton("Valider la commande");
		panel_1.add(ButtonValide, BorderLayout.WEST);
		
		JButton ButtonSuppr = new JButton("Supprimer le panier");
		panel_1.add(ButtonSuppr, BorderLayout.CENTER);
		
		JButton ButtonAccueil = new JButton("Retour à l'accueil");
		panel_1.add(ButtonAccueil, BorderLayout.EAST);
		
		table = new JTable();
		panel.add(table, BorderLayout.CENTER);
	}

}
