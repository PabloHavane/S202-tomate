package ihm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
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
import javax.swing.SpinnerNumberModel;

import modèle.MonPanier;
import javax.swing.JSpinner;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PagePlusDinformation extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPrix;
	private JTextField textFieldQuantité;

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
		
		textFieldPrix = new JTextField("Prix");
		textFieldPrix.setEditable(false);
		panel_2.add(textFieldPrix);
		textFieldPrix.setColumns(10);

		
		JLabel lblQuantit = new JLabel("Quantité :");
		panel_2.add(lblQuantit);
		
		textFieldQuantité = new JTextField();
		textFieldQuantité.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float prix=PagePrincipale.selectedTomato.getPrixTTC();
				if (textFieldQuantité.getText().isEmpty()) {
					textFieldPrix.setText("0.0€");
				}else {
					float q = Float.valueOf(textFieldQuantité.getText());
					if (q<=0) {
						textFieldPrix.setText("0.0€");
					} else if (q>PagePrincipale.selectedTomato.getNombreDeGraines()) {
						q=PagePrincipale.selectedTomato.getNombreDeGraines();
						textFieldPrix.setText(Float.toString(prix*q)+"€");
						textFieldQuantité.setText(Float.toString(q));
					} else {
						textFieldPrix.setText(Float.toString(prix*q)+"€");
					}
				}
						
			}
		});
		panel_2.add(textFieldQuantité);
		textFieldQuantité.setColumns(10);
		
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
		textAreaDescription.append(PagePrincipale.selectedTomato.toStringAvecTomatesApparentées());
		textAreaDescription.setLineWrap(true);
		scrollPane.setViewportView(textAreaDescription);
		
		
		JLabel lblImg = new JLabel();
		contentPane.add(lblImg, BorderLayout.EAST);
		lblImg.setIcon(new ImageIcon("images/"+PagePrincipale.selectedTomato.getNomImage()+".jpg"));
		
		JLabel lblTitre = new JLabel("Plus d'informations sur votre choix");
		lblTitre.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitre, BorderLayout.NORTH);
		
		JButton btnAjouterAuPanier = new JButton("Ajouter ce produit au panier");
		btnAjouterAuPanier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textFieldPrix.getText() == "0.0€" || textFieldQuantité.getText().isEmpty()) {
					PagePrincipale.main(null);
					setVisible(false);
				}else {
					for (int i=0; i < Float.valueOf(textFieldQuantité.getText()); i++) {
						MonPanier.monPanier.addMesTomate(PagePrincipale.selectedTomato, 1);
					}
					PagePrincipale.main(null);
					setVisible(false);
				}
			}
		});
		contentPane.add(btnAjouterAuPanier, BorderLayout.SOUTH);
	}

}
