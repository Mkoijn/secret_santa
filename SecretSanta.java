import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.awt.*;

class SecretSanta extends JFrame implements ActionListener{
	
	JFrame f;
	JLayeredPane lp;
	
	String value = "";
	String spousename;
	String secondname;
	String checkname;
	
	JButton enter;
	JButton b1, b2, b3, b4, b5, b6, b7, b8;
	JButton n1, n2, n3, n4, n5, n6, n7, n8;
	
	ArrayList<String> arraynames = 
				new ArrayList<String>(Arrays.asList
					("Paul", "Mike", "Cynthia","Laureen","Seth","Aidan","Janis","Edel"));
	
	public SecretSanta(){	
		
		Collections.shuffle(arraynames);
		
		lp = getLayeredPane();
		f = new JFrame("SecretSanta");
		f.add(lp);
		
		// Current user Start Button
		enter = new JButton("START");
		enter.setBounds(10, 430, 200, 200);
		lp.add(enter);
		enter.setFont(new Font("Arial", Font.BOLD, 40));
		enter.setBorder(BorderFactory.createLineBorder(Color.black));
		enter.addActionListener(new EnterAction());
		enter.setBackground(new Color(255, 255, 0));
		
		// Create Number Buttons
		b1 = new JButton("1");
		b1.setBounds(10, 10, 200, 200);
		lp.add(b1);
		b1.setFont(new Font("Arial", Font.BOLD, 80));
		b1.setBorder(BorderFactory.createLineBorder(Color.black));
		b1.addActionListener(this);
		b1.setBackground(new Color(255, 193, 37));
		
		b2 = new JButton("2");
		b2.setBounds(220, 10, 200, 200);
		lp.add(b2);
		b2.setFont(new Font("Arial", Font.BOLD, 80));
		b2.setBorder(BorderFactory.createLineBorder(Color.black));
		b2.addActionListener(this);
		b2.setBackground(new Color(84, 255, 159));
		
		b3 = new JButton("3");
		b3.setBounds(430, 10, 200, 200);
		lp.add(b3);
		b3.setFont(new Font("Arial", Font.BOLD, 80));
		b3.setBorder(BorderFactory.createLineBorder(Color.black));
		b3.addActionListener(this);
		b3.setBackground(new Color(255, 193, 37));
		
		b4 = new JButton("4");
		b4.setBounds(640, 10, 200, 200);
		lp.add(b4);
		b4.setFont(new Font("Arial", Font.BOLD, 80));
		b4.setBorder(BorderFactory.createLineBorder(Color.black));
		b4.addActionListener(this);
		b4.setBackground(new Color(84, 255, 159));
		
		b5 = new JButton("5");
		b5.setBounds(10, 220, 200, 200);
		lp.add(b5);
		b5.setFont(new Font("Arial", Font.BOLD, 80));
		b5.setBorder(BorderFactory.createLineBorder(Color.black));
		b5.addActionListener(this);
		b5.setBackground(new Color(84, 255, 159));
		
		b6 = new JButton("6");
		b6.setBounds(220,220, 200, 200);
		lp.add(b6);
		b6.setFont(new Font("Arial", Font.BOLD, 80));
		b6.setBorder(BorderFactory.createLineBorder(Color.black));
		b6.addActionListener(this);
		b6.setBackground(new Color(255, 193, 37));
		
		b7 = new JButton("7");
		b7.setBounds(430, 220, 200, 200);
		lp.add(b7);
		b7.setFont(new Font("Arial", Font.BOLD, 80));
		b7.setBorder(BorderFactory.createLineBorder(Color.black));
		b7.addActionListener(this);
		b7.setBackground(new Color(84, 255, 159));
		
		b8 = new JButton("8");
		b8.setBounds(640, 220, 200, 200);
		lp.add(b8);
		b8.setFont(new Font("Arial", Font.BOLD, 80));
		b8.setBorder(BorderFactory.createLineBorder(Color.black));
		b8.addActionListener(this);
		b8.setBackground(new Color(255, 193, 37));
		
		
		
		// Create Name Buttons
		n1 = new JButton(arraynames.get(0));
		n1.setBounds(10, 10, 200, 200);
		lp.add(n1);
		n1.setFont(new Font("Arial", Font.BOLD, 30));
		n1.setBorder(BorderFactory.createLineBorder(Color.black));
		n1.addActionListener(this);
		
		n2 = new JButton(arraynames.get(1));
		n2.setBounds(220, 10, 200, 200);
		lp.add(n2);
		n2.setFont(new Font("Arial", Font.BOLD, 30));
		n2.setBorder(BorderFactory.createLineBorder(Color.black));
		n2.addActionListener(this);
		
		n3 = new JButton(arraynames.get(2));
		n3.setBounds(430, 10, 200, 200);
		lp.add(n3);
		n3.setFont(new Font("Arial", Font.BOLD, 30));
		n3.setBorder(BorderFactory.createLineBorder(Color.black));
		n3.addActionListener(this);
		
		n4 = new JButton(arraynames.get(3));
		n4.setBounds(640, 10, 200, 200);
		lp.add(n4);
		n4.setFont(new Font("Arial", Font.BOLD, 30));
		n4.setBorder(BorderFactory.createLineBorder(Color.black));
		n4.addActionListener(this);
		
		n5 = new JButton(arraynames.get(4));
		n5.setBounds(10, 220, 200, 200);
		lp.add(n5);
		n5.setFont(new Font("Arial", Font.BOLD, 30));
		n5.setBorder(BorderFactory.createLineBorder(Color.black));
		n5.addActionListener(this);
		
		n6 = new JButton(arraynames.get(5));
		n6.setBounds(220,220, 200, 200);
		lp.add(n6);
		n6.setFont(new Font("Arial", Font.BOLD, 30));
		n6.setBorder(BorderFactory.createLineBorder(Color.black));
		n6.addActionListener(this);
		
		n7 = new JButton(arraynames.get(6));
		n7.setBounds(430, 220, 200, 200);
		lp.add(n7);
		n7.setFont(new Font("Arial", Font.BOLD, 30));
		n7.setBorder(BorderFactory.createLineBorder(Color.black));
		n7.addActionListener(this);
		
		n8 = new JButton(arraynames.get(7));
		n8.setBounds(640, 220, 200, 200);
		lp.add(n8);
		n8.setFont(new Font("Arial", Font.BOLD, 30));
		n8.setBorder(BorderFactory.createLineBorder(Color.black));
		n8.addActionListener(this);

		
		f.setVisible(true);
		f.setSize(865,680);
		f.setLocation(250, 50);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(new Color(209, 238, 238));
		
	}
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		// remove numbers if name unless a name you cannot get is underneath.
		if(source==b1 & (value != "") & (!n1.getActionCommand().equals(checkname) & !n1.getActionCommand().equals(spousename) 
							& !n1.getActionCommand().equals(secondname))){
			b1.setVisible(false);
			value = "";
		}
		if(source==b2 & (value != "") & (!n2.getActionCommand().equals(checkname) & !n2.getActionCommand().equals(spousename)
							& !n2.getActionCommand().equals(secondname))){
			b2.setVisible(false);
			value = "";
		}
		if(source==b3 & (value != "") & (!n3.getActionCommand().equals(checkname) & !n3.getActionCommand().equals(spousename)
							& !n3.getActionCommand().equals(secondname))){
			b3.setVisible(false);
			value = "";
		}
		if(source==b4 & (value != "") & (!n4.getActionCommand().equals(checkname) & !n4.getActionCommand().equals(spousename)
						& !n4.getActionCommand().equals(secondname))){
			b4.setVisible(false);
			value = "";
		}
		if(source==b5 & (value != "") & (!n5.getActionCommand().equals(checkname) & !n5.getActionCommand().equals(spousename)
						& !n5.getActionCommand().equals(secondname))){
			b5.setVisible(false);
			value = "";
		}
		if(source==b6 & (value != "") & (!n6.getActionCommand().equals(checkname) & !n6.getActionCommand().equals(spousename)
						& !n6.getActionCommand().equals(secondname))){
			b6.setVisible(false);
			value = "";
		}
		if(source==b7 & (value != "") & (!n7.getActionCommand().equals(checkname) & !n7.getActionCommand().equals(spousename)
						& !n7.getActionCommand().equals(secondname))){
			b7.setVisible(false);
			value = "";
		}
		if(source==b8 & (value != "") & (!n8.getActionCommand().equals(checkname) & !n8.getActionCommand().equals(spousename)
					& !n8.getActionCommand().equals(secondname))){
			b8.setVisible(false);
			value = "";
		}
		
		// remove action for name buttons
		if(source==n1){
			n1.setVisible(false);
		}
		if(source==n2){
			n2.setVisible(false);
		}
		if(source==n3){
			n3.setVisible(false);
		}
		if(source==n4){
			n4.setVisible(false);
		}
		if(source==n5){
			n5.setVisible(false);
		}
		if(source==n6){
			n6.setVisible(false);
		}
		if(source==n7){
			n7.setVisible(false);
		}
		if(source==n8){
			n8.setVisible(false);
			
		}
	}
	public class EnterAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JTextField field = new JTextField();
			Object[] message = {"What's your name:  ", field,};
			
			while(!value.equals("Mike") & 
				  !value.equals("Edel") & 
				  !value.equals("Paul") & 
				  !value.equals("Aidan") & 
				  !value.equals("Laureen") & 
			      !value.equals("Janis") &
				  !value.equals("Cynthia") & 
				  !value.equals("Seth")) {
			
				int option = JOptionPane.showConfirmDialog(null, message, "User Name", JOptionPane.OK_CANCEL_OPTION);
				if (option == JOptionPane.OK_OPTION){
					value = field.getText();
					checkname = value;
						
					if(checkname.equals("Mike")){
						spousename = "Cynthia";
						secondname = "";
					}
					if(checkname.equals("Cynthia")){
						spousename = "Mike";
						secondname = "Laureen";
					}
					if(checkname.equals("Edel")){
						spousename = "Seth";
						secondname = "";
					}
					if(checkname.equals("Seth")){
						spousename = "Edel";
						secondname = "";
					}
					if(checkname.equals("Aidan")){
						spousename = "Janis";
						secondname = "";
					}
					if(checkname.equals("Janis")){
						spousename = "Aidan";
						secondname = "";
					}
					if(checkname.equals("Laureen")){
						spousename = "";
						secondname = "Cynthia";
					}
					if(checkname.equals("Paul")){
						spousename = "";
						secondname = "";
					}
				}
			}
		}
	}
		
	public static void main(String ars[]){
		new SecretSanta();
	}
}
