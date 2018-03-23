import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.border.*;
class Software11
{
	JFrame fr;
	JPanel p1,p2,p3;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	JPasswordField pw1,pw2,pw3,pw4,pw5,pw6,pw7;
	JButton b1,b2,b3,b4;
	JRadioButton rb1,rb2,rb3;
	Icon i1,i2,i3,i4;
	Font fnt;

	GridBagLayout gb;
	GridBagConstraints c;
	JTabbedPane tab;
	
	Software11()
	{
		gb=new GridBagLayout();
		c=new GridBagConstraints();
		
		tab=new JTabbedPane();

		fnt=new Font("Monotype Corsiva",Font.BOLD,20);
		
		fr=new JFrame();
		
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		
		l1=new JLabel("UserName");
		l2=new JLabel("Password");
		l3=new JLabel("Login ID");
		l4=new JLabel("E-mail ID");
		l5=new JLabel("First Name");
		l6=new JLabel("Last Name");
		l7=new JLabel("Password");
		l8=new JLabel("Confirm Password");
		l9=new JLabel("UserName");
		l10=new JLabel("Login ID");
		l11=new JLabel("Password");

		t1=new JTextField(30);
		t2=new JTextField(30);
		t3=new JTextField(30);
		t4=new JTextField(30);
		t5=new JTextField(30);
		t6=new JTextField(30);
		t7=new JTextField(30);
		t8=new JTextField(30);
		t9=new JTextField(30);
		t10=new JTextField(30);

		
		pw1=new JPasswordField(30);
		pw2=new JPasswordField(30);
		pw3=new JPasswordField(30);
		pw4=new JPasswordField(30);
		pw5=new JPasswordField(30);
		pw6=new JPasswordField(30);
		pw7=new JPasswordField(30);


		i1=new ImageIcon("images//submit.png");
		i2=new ImageIcon("images//login.png");
		i3=new ImageIcon("images//fp.png");
		i4=new ImageIcon("images//reset.png");

		
		b1=new JButton(i2);
		b2=new JButton(i4);
		b3=new JButton(i3);
		b4=new JButton(i1);
		
		rb1=new JRadioButton("Male");
		rb2=new JRadioButton("female");
		rb3=new JRadioButton("Other");

		Border brd1=BorderFactory.createLineBorder(Color.blue,2);		
		Border brd2=BorderFactory.createEtchedBorder();
		Border brd3=BorderFactory.createBevelBorder(BevelBorder.RAISED);
		Border brd4=BorderFactory.createBevelBorder(BevelBorder.LOWERED);
		
		l1.setFont(fnt);
		l2.setFont(fnt);
		l3.setFont(fnt);
		l4.setFont(fnt);
		l5.setFont(fnt);
		l6.setFont(fnt);
		l7.setFont(fnt);
		l8.setFont(fnt);
		l9.setFont(fnt);
		l10.setFont(fnt);
		l11.setFont(fnt);





		p1.add(l5);
		p1.add(t1);
		p1.add(l6);
		p1.add(t2);
		p1.add(l4);
		p1.add(t3);
		p1.add(l7);
		p1.add(pw1);
		p1.add(l8);
		p1.add(pw2);
		p1.add(b4);
		p1.add(b2);
		p1.add(b3);


		p2.add(l9);
		p2.add(t4);
		p2.add(l10);
		p2.add(t5);
		p2.add(l11);
		p2.add(pw3);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);


		p3.add(l1);
		p3.add(t6);
		p3.add(l3);
		p3.add(t7);
		p3.add(l7);
		p3.add(pw4);
		b1.setBounds(0,0,20,20);
		p3.add(b1);
		p3.add(b2);
		p3.add(b3);

		fr.add(tab);

		tab.addTab("Register here",null,p1,"This is a Registration Tab");
		tab.addTab("Faculty Login",null,p2,"This is Faculty Login Tab");
		tab.addTab("Student Login",null,p3,"This is a Student Login Tab");

		fr.setSize(300,300);
		fr.setVisible(true);



	}	

 public static void main(String[]args)
{
	Scanner scan=new Scanner(System.in);
	String str;
	System.out.println("Enter the password to continue");
	str=scan.next();

	if(str.equals("Shivansh"))
	{
		new Software11();
	}
	else
	{
		System.exit(0);
	}
}
}