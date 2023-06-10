package ihm;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;


import modèle.Tomates;
import modèle.GenerationArticles;

public class PagePrincipale extends JFrame {

	private JPanel contentPane;
	private JTable tableTomates;
	private DefaultTableModel modeleTable;
	private Tomates tomates= GenerationArticles.générationDeBaseDesTomates();

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
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
		modeleTable = new DefaultTableModel(
		new Object[] { "Désignation", "Couleur", "Type de graine", "Prix (€)", "Nombre de graines" }, 0);
		tableTomates = new JTable(modeleTable);
		tableTomates.setModel(modeleTable);
		tableTomates.setEnabled(false);
		scrollPane.setViewportView(tableTomates);

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
		
		
		
		// afficher noms, couleur, et type de graine des tomates dans la table
		for (int i = 0; i < tomates.getLesTomates().size(); i++) {
			modeleTable.addRow(
		new Object[] { tomates.getLesTomates().get(i).getDésignation(), tomates.getLesTomates().get(i).getCouleur(),
			tomates.getLesTomates().get(i).getTypeGraine(), tomates.getLesTomates().get(i).getPrixTTC(), 
			tomates.getLesTomates().get(i).getNombreDeGraines()});
		}
	}

}
