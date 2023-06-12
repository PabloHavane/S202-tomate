package ihm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class PagePlusDinformation extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPrix;
	private JTable tableDescription;
	private DefaultTableModel modeleTable;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PagePlusDinformation frame = new PagePlusDinformation();
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
	public PagePlusDinformation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JLabel lblDescription = new JLabel("Description");
		panel.add(lblDescription);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.SOUTH);
		
		JComboBox comboBoxProduitSimilaire = new JComboBox();
		panel_2.add(comboBoxProduitSimilaire);
		
		textFieldPrix = new JTextField();
		textFieldPrix.setText("Prix");
		panel_2.add(textFieldPrix);
		textFieldPrix.setColumns(10);
		
		JComboBox comboBoxQuantité = new JComboBox();
		panel_2.add(comboBoxQuantité);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea textAreaDescription = new JTextArea();
		if (PagePrincipale.selectedTomato.getSousTitre() == null) {
		textAreaDescription.setText(PagePrincipale.selectedTomato.getDésignation() + "\n" +
				PagePrincipale.selectedTomato.getCouleur() + "\n" +
				PagePrincipale.selectedTomato.getTypeGraine() + "\n" +
				PagePrincipale.selectedTomato.getDescription());
		} else {
			textAreaDescription.setText(PagePrincipale.selectedTomato.getDésignation() + "\n" +
					PagePrincipale.selectedTomato.getSousTitre() + "\n" +
					PagePrincipale.selectedTomato.getCouleur() + "\n" +
					PagePrincipale.selectedTomato.getTypeGraine() + "\n" +
					PagePrincipale.selectedTomato.getDescription());
		}
		scrollPane.setViewportView(textAreaDescription);
		
		
		JLabel lblImg = new JLabel("Img");
		contentPane.add(lblImg, BorderLayout.EAST);
		
		JLabel lblTitre = new JLabel("Plus d'informations sur votre choix");
		lblTitre.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitre, BorderLayout.NORTH);
		
		JButton btnAjouterAuPanier = new JButton("Ajouter ce produit au panier");
		btnAjouterAuPanier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				PagePrincipale.main(null);
			}
		});
		contentPane.add(btnAjouterAuPanier, BorderLayout.SOUTH);
	}

}
