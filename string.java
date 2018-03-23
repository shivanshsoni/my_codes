import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;
class cardTest implements ActionListener
{
JFrame fr;
JPanel pnl1;

	JButton b1,b2,b3,b4;

	Icon ic1,ic2,ic3,ic4;

	CardLayout card;		
	cardTest()
	{
		ic1=new ImageIcon("img3.jpg");
		ic2=new ImageIcon("img4.jpg");
		ic3=new ImageIcon("img2.png");
		ic4=new ImageIcon("img1.jpg");
		fr=new JFrame("Menu Test");
		pnl1=new JPanel();
		fr.add(pnl1);
		
		b3=new JButton(ic3);
		b4=new JButton(ic4);
		b1=new JButton(ic1);
		b2=new JButton(ic2);

		card=new CardLayout();

		pnl1.setLayout(card);

		pnl1.add(b1);
		b1.addActionListener(this);
		pnl1.add(b2);
		b2.addActionListener(this);

		pnl1.add(b3);
		b3.addActionListener(this);
		pnl1.add(b4);
		b4.addActionListener(this);
		
		fr.setSize(500,500);
		fr.setVisible(true);



	}
	public void actionPerformed(ActionEvent ed)
	{
		card.next(pnl1);
	}
	public static void main(String []args)
	{
		new cardTest();
	}
}