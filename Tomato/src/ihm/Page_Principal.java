package ihm;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Page_Principal extends JFrame {
	private JPanel contentPane;
	private JTextField txtJdsssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssdsdsdsdsdsdsdskdjksjdskjdskdjskdjksdjskdjskdjskdjskdjskdjskdjskdskdjskdjskjdksjsk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page_Principal frame = new Page_Principal();
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
	public Page_Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	
		
		import javax.swing.JLabel;

		// ...

		JLabel label = new JLabel("<html>Votre texte<br>sur plusieursdsssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss<br> lignes</html>");
		contentPane.add(label);

	}

}
