package ihm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ooops extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ooops frame = new Ooops();
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
	public Ooops() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 148);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblOoops = new JLabel("Ooops");
		lblOoops.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblOoops, BorderLayout.NORTH);
		
		JButton btnRetour = new JButton("Retour");
		contentPane.add(btnRetour, BorderLayout.SOUTH);
		
		JLabel lblVotrePanierEst = new JLabel("<html>Votre panier est vide. Il faut d'abord que vous<br>ajoutiez un article.</html>");
		lblVotrePanierEst.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblVotrePanierEst, BorderLayout.CENTER);
	}

}
