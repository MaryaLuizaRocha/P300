package P_09;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Color;

public class ELEIÇÃO_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ELEIÇÃO_GUI frame = new ELEIÇÃO_GUI();
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
	public ELEIÇÃO_GUI() {
		setTitle("VOTA\u00C7\u00C3O");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.highlight"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("DIGITE SUA IDADE");
		
		txtidade = new JTextField();
		txtidade.setBackground(new Color(230, 230, 250));
		txtidade.setColumns(10);
		
		JButton VERIFICAR = new JButton("VERIFICAR");
		VERIFICAR.setBackground(SystemColor.activeCaption);
		VERIFICAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idade = Integer.parseInt(txtidade.getText());
				
				if (idade>=18 && idade<=65) 
					{
					JOptionPane.showMessageDialog(null, "VOTO OBRIGATÓRIO! ", null,JOptionPane.INFORMATION_MESSAGE);
					}
				else if (idade>=16 && idade<=17 || idade>65)
					{
					JOptionPane.showMessageDialog(null, "VOTO FACULTATIVO! ", null,JOptionPane.INFORMATION_MESSAGE);
					}
				else
					JOptionPane.showMessageDialog(null, "NÃO PODE VOTAR! ", null,JOptionPane.INFORMATION_MESSAGE);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(100)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(129, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(171, Short.MAX_VALUE)
					.addComponent(VERIFICAR)
					.addGap(164))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(71)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
					.addComponent(VERIFICAR)
					.addGap(44))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
