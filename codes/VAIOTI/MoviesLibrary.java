import java.awt.*;
import javax.swing.*;
class newMoviesLibrary
{
	
		JFrame fr;
		JPanel pnl;
		JLabel l1,l2,l3,l4,l5,l6;
		JTextField t1,t2,t3;
		JPasswordField t4;
		JButton b1,b2,b3;

		Font fnt;

		Icon ic1,ic2;

		JRadioButton r1,r2,r3;
		JCheckBox c1,c2,c3;
		JComboBox cmb1,cmb2,cmb3;

		TextArea area;

		newMoviesLibrary()
		{

			r1=new JRadioButton("SMS");
			r2=new JRadioButton("Voice Call");
			r3=new JRadioButton("Email");

			c1=new JCheckBox("Graduate");
				c2=new JCheckBox("Post Graduate");
		c3=	new JCheckBox("Proffessional Qualification");				

			String day[]={"1","2","3","4","5","6","7","8"};
			cmb1=new JComboBox(day);
			cmb1.addItem("9");
			cmb1.addItem("10");
		cmb1.addItem("11");

		String month[]={"JAN","FEB","MAR","APR"};
		cmb2=new JComboBox(month);

		String year[]={"1990","1991","1992","1993"};
		cmb3=new JComboBox(year);

		ic1=new ImageIcon("img1.jpg");
		ic2=new ImageIcon("img2.png");

		b3=new JButton("Ferrari",ic1);
		l5=new JLabel(ic2);

		fnt=new Font("monotype corsiva",Font.BOLD,20);
		b3.setFont(fnt);
		fr=new JFrame("Graphical User Interface");
		pnl=new JPanel();
		l1=new JLabel("Enter Your Name");
		l2=new JLabel("Enter Your Rollno");
		l3=new JLabel("Enter Your Login Id");
		l4=new JLabel("Enter Your Password");
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t4=new JPasswordField(20);
		b1=new JButton("SIGN IN");
		b2=new JButton("SIGN UP");

		l6=new JLabel("Address");

		area=new TextArea(5,15);

		fr.add(pnl);
		
		pnl.add(l5);
		pnl.add(l1);
		pnl.add(t1);
		pnl.add(l2);
		pnl.add(t2);
		pnl.add(l3);
		pnl.add(t3);
		pnl.add(l4);
		pnl.add(t4);
		pnl.add(b1);
		pnl.add(b2);

		pnl.add(r1);
		pnl.add(r2);
		pnl.add(r3);
		pnl.add(c1);
		pnl.add(c2);
		pnl.add(c3);
		pnl.add(cmb1);
		pnl.add(cmb2);
		pnl.add(cmb3);

		pnl.add(l6);
		pnl.add(area);


		pnl.add(b3);
		
		t4.setEchoChar('*');

		l1.setFont(fnt);
		l2.setFont(fnt);
		l3.setFont(fnt);
		l4.setFont(fnt);

		t1.setFont(fnt);
		b1.setFont(fnt);

		t1.setToolTipText("ENTER Your FIRST NAME HERE");
		b1.setToolTipText("Press Sign in Button for Login");

		b1.setMnemonic('G');
		b2.setMnemonic('U');

		pnl.setBackground(Color.yellow);
		b1.setBackground(Color.green);
		l1.setBackground(Color.green);
		l1.setForeground(Color.red);
		b1.setForeground(Color.blue);
		t1.setForeground(Color.blue);

		r1.setBackground(Color.yellow);

		fr.setSize(550,550);
		fr.setVisible(true);

		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocation(110,100);
	}
	public static void main(String[]args)
	{
		new newMoviesLibrary();	
	}
}