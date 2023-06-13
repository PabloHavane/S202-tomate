package ihm;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import modèle.Couleur;
import modèle.GenerationArticles;
import modèle.MonPanier;
import modèle.Tomate;
import modèle.Tomates;
import modèle.TypeTomate;

public class PagePrincipale extends JFrame {

	private JPanel contentPane;
	private JTable tableTomates;
	private DefaultTableModel modeleTable;
	private Tomates tomates = GenerationArticles.générationDeBaseDesTomates();
	public String selectedTomatoName;
	public static Tomate selectedTomato;
	private String stringColor = "Aucun filtre";
	private String stringType = "Aucun filtre";

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

		JLabel lblHeadLeftImg = new JLabel();
		lblHeadLeftImg.setHorizontalAlignment(SwingConstants.LEFT);
		lblHeadLeftImg.setIcon(new ImageIcon("images/tomoatoketchup-rb.png"));
		lblHeadLeftImg.setPreferredSize(new java.awt.Dimension(200, 100));
		panel.add(lblHeadLeftImg);

		JLabel lblTomatoketchup = new JLabel("TomatoKetchup");
		panel.add(lblTomatoketchup);

		JLabel lblHeadRightImg = new JLabel();
		lblHeadRightImg.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHeadRightImg.setIcon(new ImageIcon("images/vector-1456768_1280.png"));
		lblHeadRightImg.setPreferredSize(new java.awt.Dimension(200, 100));
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
		lblChoixTomate.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lblChoixTomate);

		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.CENTER);

		this.modeleTable = new DefaultTableModel(
				new Object[] { "Désignation", "Couleur", "Type de graine", "Prix (€)", "Nombre de graines" }, 0);
		this.tableTomates = new JTable(this.modeleTable);
		this.tableTomates.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = PagePrincipale.this.tableTomates.getSelectedRow();
				if (selectedRow != -1) {
					PagePrincipale.this.selectedTomatoName = PagePrincipale.this.tableTomates.getModel()
							.getValueAt(selectedRow, 0).toString();
					selectedTomato = PagePrincipale.this.tomates.getTomate(PagePrincipale.this.selectedTomatoName);
					PagePrincipale.this.setVisible(false);
					PagePlusDinformation pagePlusDinfo = new PagePlusDinformation();
					pagePlusDinfo.setVisible(true);
				}
			}
		});

		this.tableTomates.setModel(this.modeleTable);
		scrollPane.setViewportView(this.tableTomates);

		JPanel panel_4 = new JPanel();
		this.contentPane.add(panel_4, BorderLayout.SOUTH);

		JButton btnConseil = new JButton("Conseil de culture");
		btnConseil.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PagePrincipale.this.setVisible(false);
				Conseils.main(null);
			}
		});
		panel_4.setLayout(new BorderLayout(0, 0));

		JTextArea txtPanier = new JTextArea();
		panel_4.add(txtPanier);
		txtPanier.setText(
				"Voyez ici tous les produits que vous avez commandé précédemment. Si vous n'avez ajouté aucun produit, vous ne pourrez pas consulter votre panier.");
		txtPanier.setLineWrap(true);
		panel_4.add(btnConseil);

		JPanel panel_3 = new JPanel();
		panel_4.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));

		JComboBox comboBoxProduitSimilaire = new JComboBox();
		comboBoxProduitSimilaire.addItem("Aucun filtre");
		comboBoxProduitSimilaire.addItem(Couleur.BLEU);
		comboBoxProduitSimilaire.addItem(Couleur.VERT);
		comboBoxProduitSimilaire.addItem(Couleur.ROUGE);
		comboBoxProduitSimilaire.addItem(Couleur.ORANGE);
		comboBoxProduitSimilaire.addItem(Couleur.JAUNE);
		comboBoxProduitSimilaire.addItem(Couleur.NOIR);
		comboBoxProduitSimilaire.addItem(Couleur.MULTICOLORE);
		panel_3.add(comboBoxProduitSimilaire);
		
		JComboBox comboBoxProduitSimilaire_1 = new JComboBox();
		comboBoxProduitSimilaire_1.addItem("Aucun filtre");
		comboBoxProduitSimilaire_1.addItem(TypeTomate.TOMATES_CERISES);
		comboBoxProduitSimilaire_1.addItem(TypeTomate.TOMATES);
		panel_3.add(comboBoxProduitSimilaire_1);
		
		comboBoxProduitSimilaire.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	stringColor = comboBoxProduitSimilaire.getSelectedItem().toString();
	            if (stringColor.equals("Aucun filtre")) {
	                stringColor = null;
	            }
	            updateTable();
		    }
		});
		comboBoxProduitSimilaire_1.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	stringType = comboBoxProduitSimilaire_1.getSelectedItem().toString();
	            if (stringType.equals("Aucun filtre")) {
	                stringType = null;
	            }
	            updateTable();
		    }
		});

		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5, BorderLayout.SOUTH);
		panel_5.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("Mon panier");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel, BorderLayout.NORTH);

		JTextArea txtrVoyezIciTous = new JTextArea();
		txtrVoyezIciTous.setText(
				"Voyez ici tous les produits que vous avez commandé précédemment. Si vous n'avez ajouté aucun produit, vous ne pourrez pas consulter votre panier.");
		txtrVoyezIciTous.setLineWrap(true);
		panel_5.add(txtrVoyezIciTous, BorderLayout.CENTER);

		JButton btnPanier1 = new JButton("Accéder au panier");
		btnPanier1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PagePrincipale.this.setVisible(false);
				if (MonPanier.monPanier.sizeMesTomates()!=0)
					Panier.main(null);
				else
					Ooops.main(null);
			}
		});
		panel_5.add(btnPanier1, BorderLayout.SOUTH);
		JButton btnPanier2 = new JButton("Conseil de culture");

		for (int i = 0; i < this.tomates.getLesTomates().size(); i++) {
			this.modeleTable.addRow(new Object[] { this.tomates.getLesTomates().get(i).getDésignation(),
					this.tomates.getLesTomates().get(i).getCouleur(),
					this.tomates.getLesTomates().get(i).getTypeGraine(),
					this.tomates.getLesTomates().get(i).getPrixTTC(),
					this.tomates.getLesTomates().get(i).getNombreDeGraines() });
		}
	}
	
	public void updateTable() {
	    List<Tomate> tomates = GenerationArticles.générationDeBaseDesTomates().getLesTomates();

	 // Filtering by color
	    List<Tomate> filteredByColor = new LinkedList<>();
	    if (stringColor == null || stringColor.equals("Aucun filtre")) {
	        filteredByColor.addAll(tomates);
	    } else {
	        for (Tomate tomate : tomates) {
	            if (tomate.getCouleur().toString().equals(stringColor)) {
	                filteredByColor.add(tomate);
	            }
	        }
	    }

	    // Filtering by type
	    List<Tomate> filtreTomates = new LinkedList<>();
	    if (stringType == null || stringType.equals("Aucun filtre")) {
	        filtreTomates.addAll(filteredByColor);
	    } else {
	        for (Tomate tomate : filteredByColor) {
	            if (tomate.getTypeGraine().toString().equals(stringType)) {
	                filtreTomates.add(tomate);
	            }
	        }
	    }


	    modeleTable.setRowCount(0);

	    for (Tomate tomate : filtreTomates) {
	        modeleTable.addRow(new Object[] { tomate.getDésignation(), tomate.getCouleur(),
	            tomate.getTypeGraine(), tomate.getPrixTTC(), tomate.getNombreDeGraines() });
	    }
	}
}
