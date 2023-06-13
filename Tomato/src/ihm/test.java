package ihm;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import modèle.GenerationArticles;
import modèle.Tomate;
import modèle.Tomates;

public class test extends JFrame {

	private JPanel contentPane;
	private JTable tableTomates;
	private DefaultTableModel modeleTable;
	private Tomates tomates = GenerationArticles.générationDeBaseDesTomates();
	public String selectedTomatoName;
	public static Tomate selectedTomato;

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
		panel_4.setLayout(new GridLayout(3, 1, 0, 0));

		JLabel lblPanier = new JLabel("Mon Panier");
		lblPanier.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblPanier);

		JButton btnPanier = new JButton("Accéder au panier");
		btnPanier.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PagePrincipale.this.setVisible(false);
				Panier.main(null);
			}
		});

		JTextArea txtPanier = new JTextArea();
		panel_4.add(txtPanier);
		txtPanier.setText(
				"Voyez ici tous les produits que vous avez commandé précédemment. Si vous n'avez ajouté aucun produit, vous ne pourrez pas consulter votre panier.");
		txtPanier.setLineWrap(true);
		panel_4.add(btnPanier);

		for (int i = 0; i < this.tomates.getLesTomates().size(); i++) {
			this.modeleTable.addRow(new Object[] { this.tomates.getLesTomates().get(i).getDésignation(),
					this.tomates.getLesTomates().get(i).getCouleur(),
					this.tomates.getLesTomates().get(i).getTypeGraine(),
					this.tomates.getLesTomates().get(i).getPrixTTC(),
					this.tomates.getLesTomates().get(i).getNombreDeGraines() });
		}
	}

}
