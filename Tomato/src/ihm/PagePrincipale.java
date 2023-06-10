package ihm;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class PagePrincipale extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					PagePrincipale frame = new PagePrincipale();
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
	public PagePrincipale() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 724, 453);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		this.setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		this.contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblHeadLeftImg = new JLabel("img");
		lblHeadLeftImg.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblHeadLeftImg);

		JLabel lblTomatoketchup = new JLabel("TomatoKetchup");
		panel.add(lblTomatoketchup);

		JLabel lblHeadRightImg = new JLabel("Img");
		lblHeadRightImg.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblHeadRightImg);

		JPanel panel_1 = new JPanel();
		this.contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNosTomates = new JLabel("Nos tomates au ketchup");
		lblNosTomates.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNosTomates);

		JLabel lblChoixTomate = new JLabel("Choisissez la tomate de vos rêves");
		lblChoixTomate.setEnabled(false);
		lblChoixTomate.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lblChoixTomate);

		JList listTomates = new JList();
		panel_1.add(listTomates, BorderLayout.CENTER);

		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3_1 = new JPanel();
		panel_3.add(panel_3_1, BorderLayout.NORTH);
		panel_3_1.setLayout(new GridLayout(2, 2, 0, 0));
		
		JComboBox comboBoxType = new JComboBox();
		panel_3_1.add(comboBoxType);
		
		JComboBox comboBoxCouleur = new JComboBox();
		panel_3_1.add(comboBoxCouleur);
		
		JButton btnPlusInfo = new JButton("Plus d'information sur cette tomate");
		panel_3_1.add(btnPlusInfo);
		
		JButton btnAjouterPanier = new JButton("Ajouter au panier");
		panel_3_1.add(btnAjouterPanier);
		
		JButton btnConseils = new JButton("Conseils de culture");
		panel_3.add(btnConseils, BorderLayout.SOUTH);

		JPanel panel_4 = new JPanel();
		this.contentPane.add(panel_4, BorderLayout.SOUTH);
		panel_4.setLayout(new GridLayout(3, 1, 0, 0));

		JLabel lblPanier = new JLabel("Mon Panier");
		lblPanier.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblPanier);

		JLabel lblVoyezIciTous = new JLabel("Voyez ici tous les produits que vous avez commandé précédemment.\nSi vous n'avez ajouté aucun produit, vous ne pourrez pas consulter votre panier.");
		lblVoyezIciTous.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblVoyezIciTous);

		JButton btnPanier = new JButton("Accéder au panier");
		panel_4.add(btnPanier);
	}

}
