package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyCalculater extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalculater frame = new MyCalculater();
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
	public MyCalculater() {
		setTitle("MyClaculater v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 259, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("굴림", Font.BOLD, 22));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setBounds(12, 10, 231, 54);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn7.setBounds(12, 74, 46, 45);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(70, 74, 46, 45);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(128, 74, 46, 45);
		contentPane.add(btn9);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(186, 74, 46, 45);
		contentPane.add(btnDiv);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(70, 139, 46, 45);
		contentPane.add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(12, 139, 46, 45);
		contentPane.add(btn4);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(128, 139, 46, 45);
		contentPane.add(btn6);
		
		JButton btnMulti = new JButton("x");
		btnMulti.setBounds(186, 139, 46, 45);
		contentPane.add(btnMulti);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(70, 196, 46, 45);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(12, 196, 46, 45);
		contentPane.add(btn1);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(128, 196, 46, 45);
		contentPane.add(btn3);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(186, 196, 46, 45);
		contentPane.add(btnMinus);
		
		JButton btnCancle = new JButton("c");
		btnCancle.setBounds(70, 252, 46, 45);
		contentPane.add(btnCancle);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(12, 252, 46, 45);
		contentPane.add(btn0);
		
		JButton btneq = new JButton("=");
		btneq.setBounds(128, 252, 46, 45);
		contentPane.add(btneq);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(186, 252, 46, 45);
		contentPane.add(btnPlus);
	}
}
