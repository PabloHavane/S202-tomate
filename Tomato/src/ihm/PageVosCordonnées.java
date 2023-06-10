package ihm;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class PageVosCordonnées extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNom;
	private JTextField textField_1;
	private JTextField textFieldAdresse1;
	private JTextField Adresse2;
	private JTextField textFieldCP;
	private JTextField textFieldVille;
	private JTextField textFieldTel;
	private JTextField textFieldMail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					PageVosCordonnées frame = new PageVosCordonnées();
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
	public PageVosCordonnées() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 450, 350);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		this.setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel_3 = new JPanel();
		this.contentPane.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblImg = new JLabel("Img");
		panel_3.add(lblImg);

		JLabel lblTitre = new JLabel("Vos coordonnées");
		panel_3.add(lblTitre);

		JPanel panel_4 = new JPanel();
		this.contentPane.add(panel_4, BorderLayout.SOUTH);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnAnnuler = new JButton("Annuler");
		panel_4.add(btnAnnuler);

		JButton btnOk = new JButton("Ok");
		panel_4.add(btnOk);

		JPanel panel = new JPanel();
		this.contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblNom = new JLabel("Nom");
		panel_1.add(lblNom);

		this.textFieldNom = new JTextField();
		panel_1.add(this.textFieldNom);
		this.textFieldNom.setColumns(10);

		JPanel panel_1_1 = new JPanel();
		panel.add(panel_1_1);
		panel_1_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblPrenom = new JLabel("Prénom");
		panel_1_1.add(lblPrenom);

		this.textField_1 = new JTextField();
		this.textField_1.setColumns(10);
		panel_1_1.add(this.textField_1);

		JPanel panel_1_2 = new JPanel();
		panel.add(panel_1_2);
		panel_1_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblAdresse1 = new JLabel("Adresse 1");
		panel_1_2.add(lblAdresse1);

		this.textFieldAdresse1 = new JTextField();
		this.textFieldAdresse1.setColumns(10);
		panel_1_2.add(this.textFieldAdresse1);

		JPanel panel_1_3 = new JPanel();
		panel.add(panel_1_3);
		panel_1_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblAdresse2 = new JLabel("Adresse 2");
		panel_1_3.add(lblAdresse2);

		this.Adresse2 = new JTextField();
		this.Adresse2.setColumns(10);
		panel_1_3.add(this.Adresse2);

		JPanel panel_1_4 = new JPanel();
		panel.add(panel_1_4);
		panel_1_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblCP = new JLabel("Code postal");
		panel_1_4.add(lblCP);

		this.textFieldCP = new JTextField();
		this.textFieldCP.setColumns(10);
		panel_1_4.add(this.textFieldCP);

		JPanel panel_1_5 = new JPanel();
		panel.add(panel_1_5);
		panel_1_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblVille = new JLabel("Ville");
		panel_1_5.add(lblVille);

		this.textFieldVille = new JTextField();
		this.textFieldVille.setColumns(10);
		panel_1_5.add(this.textFieldVille);

		JPanel panel_1_6 = new JPanel();
		panel.add(panel_1_6);
		panel_1_6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblTel = new JLabel("Téléphone");
		panel_1_6.add(lblTel);

		this.textFieldTel = new JTextField();
		this.textFieldTel.setColumns(10);
		panel_1_6.add(this.textFieldTel);

		JPanel panel_1_7 = new JPanel();
		panel.add(panel_1_7);
		panel_1_7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblMail = new JLabel("Mail");
		panel_1_7.add(lblMail);

		this.textFieldMail = new JTextField();
		this.textFieldMail.setColumns(10);
		panel_1_7.add(this.textFieldMail);
	}

}
