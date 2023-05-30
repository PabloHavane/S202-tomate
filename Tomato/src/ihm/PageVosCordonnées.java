package ihm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PageVosCordonnées extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.NORTH);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		panel_3.add(lblNewLabel_9);
		
		JLabel label_1 = new JLabel("New label");
		panel_3.add(label_1);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.SOUTH);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton button = new JButton("New button");
		panel_4.add(button);
		
		JButton btnNewButton = new JButton("New button");
		panel_4.add(btnNewButton);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("New label");
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1_1 = new JPanel();
		panel.add(panel_1_1);
		panel_1_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel_1_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel_1_1.add(textField_1);
		
		JPanel panel_1_2 = new JPanel();
		panel.add(panel_1_2);
		panel_1_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		panel_1_2.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_1_2.add(textField_2);
		
		JPanel panel_1_3 = new JPanel();
		panel.add(panel_1_3);
		panel_1_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		panel_1_3.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_1_3.add(textField_3);
		
		JPanel panel_1_4 = new JPanel();
		panel.add(panel_1_4);
		panel_1_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		panel_1_4.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		panel_1_4.add(textField_4);
		
		JPanel panel_1_5 = new JPanel();
		panel.add(panel_1_5);
		panel_1_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		panel_1_5.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		panel_1_5.add(textField_5);
		
		JPanel panel_1_6 = new JPanel();
		panel.add(panel_1_6);
		panel_1_6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		panel_1_6.add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		panel_1_6.add(textField_6);
		
		JPanel panel_1_7 = new JPanel();
		panel.add(panel_1_7);
		panel_1_7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		panel_1_7.add(lblNewLabel_7);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		panel_1_7.add(textField_7);
	}

}
