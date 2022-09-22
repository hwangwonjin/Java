package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ComponentsTest extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest frame = new ComponentsTest();
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
	public ComponentsTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습하기");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 10, 241, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Button 컴포넌트");
		lblNewLabel_1.setBounds(22, 45, 95, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("버튼1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 클릭...");
				
			}
		});
		btn1.setBounds(32, 63, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭....");
			}
		});
		btn2.setBounds(121, 63, 97, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼3 클릭....","일반대화상자",JOptionPane.INFORMATION_MESSAGE);

			}
		});
		btn3.setBounds(214, 63, 97, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int answer = JOptionPane.showConfirmDialog(null, "버튼 4 클릭...","확인대화상자",JOptionPane.YES_NO_OPTION);
				
				if(answer == JOptionPane.YES_NO_OPTION) {
					System.out.println("Yes 클릭");
				}else {
					System.out.println("NO 클릭...");
				}
			}
		});
		btn4.setBounds(312, 63, 97, 23);
		contentPane.add(btn4);
		
		JLabel lblNewLabel_2 = new JLabel("Text Field 컴포넌트");
		lblNewLabel_2.setBounds(22, 99, 146, 15);
		contentPane.add(lblNewLabel_2);
		
		JTextArea txtf1 = new JTextArea();
		txtf1.setBounds(22, 124, 97, 15);
		contentPane.add(txtf1);
		
		JTextArea txtf2 = new JTextArea();
		txtf2.setBounds(20, 160, 97, 15);
		contentPane.add(txtf2);
		
		JTextArea txtf3 = new JTextArea();
		txtf3.setBounds(20, 185, 97, 15);
		contentPane.add(txtf3);
		
		JLabel lblTxtf1Result = new JLabel("결과:");
		lblTxtf1Result.setBounds(254, 124, 57, 15);
		contentPane.add(lblTxtf1Result);
		
		JLabel lblTxtf2Result = new JLabel("결과:");
		lblTxtf2Result.setBounds(254, 160, 57, 15);
		contentPane.add(lblTxtf2Result);
		
		JLabel lblTxtf3Result = new JLabel("결과:");
		lblTxtf3Result.setBounds(254, 185, 57, 15);
		contentPane.add(lblTxtf3Result);
		
		JButton btnTxtf1 = new JButton("확인");
		btnTxtf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf1.getText();
				lblTxtf1Result.setText("결과 :"+txt);
			}
		});
		btnTxtf1.setBounds(121, 124, 97, 15);
		contentPane.add(btnTxtf1);
		
		JButton bntTxtf2 = new JButton("확인");
		bntTxtf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf2.getText();
				lblTxtf2Result.setText("결과 : "+txt);
			}
		});
		bntTxtf2.setBounds(121, 160, 97, 15);
		contentPane.add(bntTxtf2);
		
		JButton btnTxtf3 = new JButton("확인");
		btnTxtf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf3.getText();
				lblTxtf3Result.setText("결과 : "+txt);
			}
		});
		btnTxtf3.setBounds(121, 185, 97, 15);
		contentPane.add(btnTxtf3);
		
		JLabel lblNewLabel_3 = new JLabel("CheckBox 컴포넌트");
		lblNewLabel_3.setBounds(12, 205, 170, 26);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("취미를 고르세요");
		lblNewLabel_5.setBounds(20, 241, 97, 15);
		contentPane.add(lblNewLabel_5);
		
		JCheckBox chk1 = new JCheckBox("등산");
		chk1.setBounds(14, 262, 57, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("여행");
		chk2.setBounds(75, 262, 57, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("독서");
		chk3.setBounds(138, 262, 49, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("운동");
		chk4.setBounds(196, 262, 57, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("게임");
		chk5.setBounds(254, 262, 57, 23);
		contentPane.add(chk5);
		
		JLabel lblChkResult = new JLabel("결과:");
		lblChkResult.setBounds(14, 289, 265, 15);
		contentPane.add(lblChkResult);
		
		JButton btnChk = new JButton("확인");
		btnChk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			List<String> list = new ArrayList<>();	
				
			if(chk1.isSelected()) {
				list.add(chk1.getText());
				
			}
			if(chk2.isSelected()) {
				list.add(chk2.getText());
				
			}	
			if(chk3.isSelected()) {
				list.add(chk3.getText());
				
			}	
			if(chk4.isSelected()) {
				list.add(chk4.getText());
				
			}	
			if(chk5.isSelected()) {
				list.add(chk5.getText());
				
			}	
			lblChkResult.setText("결과:"+list);
				
			}
		});
		btnChk.setBounds(312, 262, 84, 23);
		contentPane.add(btnChk);
		
		JLabel lblNewLabel_4 = new JLabel("RadioButton 컴포넌스");
		lblNewLabel_4.setBounds(12, 312, 146, 15);
		contentPane.add(lblNewLabel_4);
		
		JRadioButton rbMale = new JRadioButton("남자");
		rbMale.setBounds(12, 336, 57, 23);
		contentPane.add(rbMale);
		
		JRadioButton rbFemale = new JRadioButton("여자");
		rbFemale.setBounds(87, 336, 57, 23);
		contentPane.add(rbFemale);
		
		JLabel lblRadResult = new JLabel("결과:");
		lblRadResult.setBounds(14, 360, 200, 15);
		contentPane.add(lblRadResult);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbMale);
		bg.add(rbFemale);
		
		JButton btnRad = new JButton("확인");
		btnRad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rbMale.isSelected()) {
					lblRadResult.setText("결과 : 남자");
				}else {
					lblRadResult.setText("결과 : 여자");
				}
				
			}
		});
		btnRad.setBounds(167, 336, 97, 23);
		contentPane.add(btnRad);
		
		
		
		
		
		
	}
}
