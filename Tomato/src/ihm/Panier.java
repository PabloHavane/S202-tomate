package ihm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import modèle.MonPanier;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class Panier extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel modeleTable;

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
		ButtonValide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				PageVosCordonnées.main(null);
			}
		});
		panel_1.add(ButtonValide, BorderLayout.WEST);
		
		JButton ButtonSuppr = new JButton("Supprimer le panier");
		ButtonSuppr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Ooops.main(null);
			}
		});
		panel_1.add(ButtonSuppr, BorderLayout.CENTER);
		
		JButton ButtonAccueil = new JButton("Retour à l'accueil");
		ButtonAccueil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				PagePrincipale.main(null);
			}
		});
		panel_1.add(ButtonAccueil, BorderLayout.EAST);
		
		this.modeleTable = new DefaultTableModel(
				new Object[] { "Désignation", "Couleur", "Type de graine", "Prix (€)", "Nombre de graines" }, 0);
		table = new JTable(modeleTable);
		table.setModel(this.modeleTable);
		panel.add(table, BorderLayout.CENTER);
		this.table.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = table.getSelectedRow();
				if (selectedRow != -1) {
					
				}
			}
		});
		
		for (int i = 0; i < MonPanier.monPanier.sizeMesTomates(); i++) {
			this.modeleTable.addRow(new Object[] { MonPanier.monPanier.getMesTomates().get(i).getDésignation(),
					MonPanier.monPanier.getMesTomates().get(i).getCouleur(),
					MonPanier.monPanier.getMesTomates().get(i).getTypeGraine(),
					MonPanier.monPanier.getMesTomates().get(i).getPrixTTC(),
					MonPanier.monPanier.getMesTomates().get(i).getNombreDeGraines() });
		}
	}
}