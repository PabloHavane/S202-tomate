package ihm;

import java.awt.EventQueue;

import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modèle.MonPanier;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

import java.time.LocalDate;

public class Facture extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Facture frame = new Facture();
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
	public Facture() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblFacture = new JLabel("Facture");
		lblFacture.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblFacture, BorderLayout.CENTER);
		
		JLabel lblImg = new JLabel("img");
		lblImg.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblImg, BorderLayout.WEST);
		
		JLabel lblRemerciement = new JLabel("Merci de votre visite !");
		panel.add(lblRemerciement, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea textArea = new JTextArea("TomatoKetchup \n");
		textArea.append(LocalDate.now().toString() + "\n");
		textArea.append(MonPanier.monPanier.toStringCoordonnées());
		textArea.append("Montant total : " + MonPanier.monPanier.prixMonPanier());
		scrollPane.setViewportView(textArea);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btnImprimer = new JButton("Imprimer");
		btnImprimer.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        PrinterJob job = PrinterJob.getPrinterJob();
		        boolean ok = job.printDialog();
		        if (ok) {
		            try {
		                job.print();
		            } catch (PrinterException ex) {
		                ex.printStackTrace();
		            }
		        }
		    }
		});
		panel_1.add(btnImprimer, BorderLayout.CENTER);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Panier.main(null);
			}
		});
		panel_1.add(btnQuitter, BorderLayout.EAST);
	}

}