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

		JLabel lblNewLabel = new JLabel("New label");
		panel.add(lblNewLabel);

		JLabel label = new JLabel("New label");
		panel.add(label);

		JLabel lblNewLabel_1 = new JLabel("New label");
		panel.add(lblNewLabel_1);

		JPanel panel_1 = new JPanel();
		this.contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_3);

		JList list = new JList();
		panel_1.add(list, BorderLayout.CENTER);

		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3_1 = new JPanel();
		panel_3.add(panel_3_1, BorderLayout.NORTH);
		panel_3_1.setLayout(new GridLayout(2, 2, 0, 0));
		
		JComboBox comboBox = new JComboBox();
		panel_3_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		panel_3_1.add(comboBox_1);
		
		JButton btnNewButton = new JButton("New button");
		panel_3_1.add(btnNewButton);
		
		JButton button = new JButton("New button");
		panel_3_1.add(button);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_3.add(btnNewButton_2, BorderLayout.SOUTH);

		JPanel panel_4 = new JPanel();
		this.contentPane.add(panel_4, BorderLayout.SOUTH);
		panel_4.setLayout(new GridLayout(3, 1, 0, 0));

		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_4);

		JLabel label_1 = new JLabel("New label");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(label_1);

		JButton btnNewButton_1 = new JButton("New button");
		panel_4.add(btnNewButton_1);
	}

}
