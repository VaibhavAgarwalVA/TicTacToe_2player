import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class tictactoe_main {

	public static int[] arr = new int[9];
	
	public JFrame frame;
	static JButton btnNewButton;
	static JButton btnNewButton_1;
	static JButton button;
	static JButton button_1;
	static JButton button_2;
	static JButton button_3;
	static JButton button_4;
	static JButton button_5;
	static JButton button_6;
	static int chance = 0;

	public static void main(String[] args) {
		tictactoe_main obj= new tictactoe_main();
		obj.frame.setVisible(true);
	}
	
	public void check(){
		int player;
		int flag = 0;
		if(chance%2==0){
			player = 2;
		}
		else{
			player = 1;
		}

		if(arr[0] + arr[1] + arr[2] ==3 || arr[3] + arr[4] + arr[5] ==3 || arr[6] + arr[7] + arr[8] ==3){
			flag=1;
			JOptionPane.showMessageDialog(null, "Player " + player + " wins!!");
			int a = JOptionPane.showConfirmDialog(null, "Play again?");
			if(a==JOptionPane.NO_OPTION){
				frame.setVisible(false);
				System.exit(0);
			}
			else if(a==JOptionPane.YES_OPTION){
				reset();
			}
			else{
				btnNewButton.setEnabled(false);
				btnNewButton_1.setEnabled(false);
				button.setEnabled(false);
				button_1.setEnabled(false);
				button_2.setEnabled(false);
				button_3.setEnabled(false);
				button_4.setEnabled(false);
				button_5.setEnabled(false);
				button_6.setEnabled(false);
			}
		}
		else if(arr[0] + arr[3] + arr[6] ==3 || arr[1] + arr[4] + arr[7] ==3 || arr[2] + arr[5] + arr[8] ==3){
			flag=1;
			JOptionPane.showMessageDialog(null, "Player " + player + " wins!!");
			int a = JOptionPane.showConfirmDialog(null, "Play again?");
			if(a==JOptionPane.NO_OPTION){
				frame.setVisible(false);
				System.exit(0);
			}
			else if(a==JOptionPane.YES_OPTION){
				reset();
			}
			else{
				btnNewButton.setEnabled(false);
				btnNewButton_1.setEnabled(false);
				button.setEnabled(false);
				button_1.setEnabled(false);
				button_2.setEnabled(false);
				button_3.setEnabled(false);
				button_4.setEnabled(false);
				button_5.setEnabled(false);
				button_6.setEnabled(false);
			}
		}
		else if(arr[0] + arr[4] + arr[8] ==3 || arr[2] + arr[4] + arr[6] ==3 ){
			flag=1;
			JOptionPane.showMessageDialog(null, "Player " + player + " wins!!");
			int a = JOptionPane.showConfirmDialog(null, "Play again?");
			if(a==JOptionPane.NO_OPTION){
				frame.setVisible(false);
				System.exit(0);
			}
			else if(a==JOptionPane.YES_OPTION){
				reset();
			}
			else{
				btnNewButton.setEnabled(false);
				btnNewButton_1.setEnabled(false);
				button.setEnabled(false);
				button_1.setEnabled(false);
				button_2.setEnabled(false);
				button_3.setEnabled(false);
				button_4.setEnabled(false);
				button_5.setEnabled(false);
				button_6.setEnabled(false);
			}
		}
		
		if(arr[0] + arr[1] + arr[2] ==-3 || arr[3] + arr[4] + arr[5] ==-3 || arr[6] + arr[7] + arr[8] ==-3){
			flag=1;
			JOptionPane.showMessageDialog(null, "Player " + player + " wins!!");
			int a = JOptionPane.showConfirmDialog(null, "Play again?");
			if(a==JOptionPane.NO_OPTION){
				frame.setVisible(false);
				System.exit(0);
			}
			else if(a==JOptionPane.YES_OPTION){
				reset();
			}
			else{
				btnNewButton.setEnabled(false);
				btnNewButton_1.setEnabled(false);
				button.setEnabled(false);
				button_1.setEnabled(false);
				button_2.setEnabled(false);
				button_3.setEnabled(false);
				button_4.setEnabled(false);
				button_5.setEnabled(false);
				button_6.setEnabled(false);
			}
		}
		else if(arr[0] + arr[3] + arr[6] ==-3 || arr[1] + arr[4] + arr[7] ==-3 || arr[2] + arr[5] + arr[8] ==-3){
			flag=1;
			JOptionPane.showMessageDialog(null, "Player " + player + " wins!!");
			int a = JOptionPane.showConfirmDialog(null, "Play again?");
			if(a==JOptionPane.NO_OPTION){
				frame.setVisible(false);
				System.exit(0);
			}
			else if(a==JOptionPane.YES_OPTION){
				reset();
			}
			else{
				btnNewButton.setEnabled(false);
				btnNewButton_1.setEnabled(false);
				button.setEnabled(false);
				button_1.setEnabled(false);
				button_2.setEnabled(false);
				button_3.setEnabled(false);
				button_4.setEnabled(false);
				button_5.setEnabled(false);
				button_6.setEnabled(false);
			}
		}
		else if(arr[0] + arr[4] + arr[8] ==-3 || arr[2] + arr[4] + arr[6] ==-3 ){
			flag=1;
			JOptionPane.showMessageDialog(null, "Player " + player + " wins!!");
			int a = JOptionPane.showConfirmDialog(null, "Play again?");
			if(a==JOptionPane.NO_OPTION){
				frame.setVisible(false);
				System.exit(0);
			}
			else if(a==JOptionPane.YES_OPTION){
				reset();
			}
			else{
				btnNewButton.setEnabled(false);
				btnNewButton_1.setEnabled(false);
				button.setEnabled(false);
				button_1.setEnabled(false);
				button_2.setEnabled(false);
				button_3.setEnabled(false);
				button_4.setEnabled(false);
				button_5.setEnabled(false);
				button_6.setEnabled(false);
			}
		}
		

		if(chance == 9 && flag == 0){
			JOptionPane.showMessageDialog(null, "Match tied !!");
			int a = JOptionPane.showConfirmDialog(null, "Play again?");
			if(a==JOptionPane.NO_OPTION){
				frame.setVisible(false);
				System.exit(0);
			}
			else if(a==JOptionPane.YES_OPTION){
				reset();
			}
			else{
				btnNewButton.setEnabled(false);
				btnNewButton_1.setEnabled(false);
				button.setEnabled(false);
				button_1.setEnabled(false);
				button_2.setEnabled(false);
				button_3.setEnabled(false);
				button_4.setEnabled(false);
				button_5.setEnabled(false);
				button_6.setEnabled(false);
			}
		}
	}
	
	private void reset() {
		for(int i=0;i<9;i++){
			arr[i] = 0;
		}
		btnNewButton.setEnabled(true);
		btnNewButton_1.setEnabled(true);
		button.setEnabled(true);
		button_1.setEnabled(true);
		button_2.setEnabled(true);
		button_3.setEnabled(true);
		button_4.setEnabled(true);
		button_5.setEnabled(true);
		button_6.setEnabled(true);
		btnNewButton.setText("");
		btnNewButton_1.setText("");
		button.setText("");
		button_1.setText("");
		button_2.setText("");
		button_3.setText("");
		button_4.setText("");
		button_5.setText("");
		button_6.setText("");
		chance=0;
	}

	/**
	 * Create the application.
	 */
	public tictactoe_main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		for(int i=0;i<9;i++){
			arr[i] = 0;
		}
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setTitle("Tic Tac Toe");
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnNewButton = new JButton(" ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chance++;
				if(chance%2==0){
					btnNewButton.setText("X");
					arr[0]= 1;
				}
				else if(chance%2==1){
					btnNewButton.setText("O");
					arr[0]= -1;
				}
				btnNewButton.setEnabled(false);
				check();
			}
		});
		btnNewButton.setBounds(50, 52, 100, 54);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton(" ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chance++;
				if(chance%2==0){
					btnNewButton_1.setText("X");
					arr[1]= 1;
				}
				else if(chance%2==1){
					btnNewButton_1.setText("O");
					arr[1]= -1;
				}
				btnNewButton_1.setEnabled(false);
				check();
			}
		});
		btnNewButton_1.setBounds(162, 52, 100, 54);
		frame.getContentPane().add(btnNewButton_1);
		
		button = new JButton(" ");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chance++;
				if(chance%2==0){
					button.setText("X");
					arr[2]= 1;
				}
				else if(chance%2==1){
					button.setText("O");
					arr[2]= -1;
				}
				button.setEnabled(false);
				check();
			}
		});
		button.setBounds(269, 52, 100, 54);
		frame.getContentPane().add(button);
		
		button_1 = new JButton(" ");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chance++;
				if(chance%2==0){
					button_1.setText("X");
					arr[3]= 1;
				}
				else if(chance%2==1){
					button_1.setText("O");
					arr[3]= -1;
				}
				button_1.setEnabled(false);
				check();
			}
		});
		button_1.setBounds(50, 118, 100, 54);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton(" ");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chance++;
				if(chance%2==0){
					button_2.setText("X");
					arr[4]= 1;
 				}
				else if(chance%2==1){
					button_2.setText("O");
					arr[4]= -1;
				}
				button_2.setEnabled(false);
				check();
			}
		});
		button_2.setBounds(162, 118, 100, 54);
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton(" ");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chance++;
				if(chance%2==0){
					button_3.setText("X");
					arr[5]= 1;
				}
				else if(chance%2==1){
					button_3.setText("O");
					arr[5]= -1;
				}
				button_3.setEnabled(false);
				check();
			}
		});
		button_3.setBounds(269, 118, 100, 54);
		frame.getContentPane().add(button_3);
		
		button_4 = new JButton(" ");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chance++;
				if(chance%2==0){
					button_4.setText("X");
					arr[6]= 1;
				}
				else if(chance%2==1){
					button_4.setText("O");
					arr[6]= -1;
				}
				button_4.setEnabled(false);
				check();
			}
		});
		button_4.setBounds(50, 177, 100, 54);
		frame.getContentPane().add(button_4);
		
		button_5 = new JButton(" ");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chance++;
				if(chance%2==0){
					button_5.setText("X");
					arr[7]= 1;
				}
				else if(chance%2==1){
					button_5.setText("O");
					arr[7]= -1;
				}
				button_5.setEnabled(false);
				check();
			}
		});
		button_5.setBounds(162, 177, 100, 54);
		frame.getContentPane().add(button_5);
		
		button_6 = new JButton(" ");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chance++;
				if(chance%2==0){
					button_6.setText("X");
					arr[8]= 1;
				}
				else if(chance%2==1){
					button_6.setText("O");
					arr[8]= -1;
				}
				button_6.setEnabled(false);
				check();
			}
		});
		button_6.setBounds(269, 177, 100, 54);
		frame.getContentPane().add(button_6);
		
		JLabel lblTictactoe = new JLabel("TIC-TAC-TOE");
		lblTictactoe.setBounds(174, 12, 130, 15);
		frame.getContentPane().add(lblTictactoe);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
			}
		});
		btnExit.setBounds(252, 243, 117, 25);
		frame.getContentPane().add(btnExit);
		
		JButton button_7 = new JButton("Reset");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				reset();
			}
		});
		button_7.setBounds(50, 243, 117, 25);
		frame.getContentPane().add(button_7);
	}
}