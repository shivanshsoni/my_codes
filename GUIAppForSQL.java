import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
class GUIAppForSQL implements ActionListener
{
	JFrame fr;
	JPanel pnl;
	JTextField t1,t2,t3,t4,t5;
	JLabel l1,l2,l3,l4,l5;
	JButton bt1,bt2,bt3,bt4;
	
	GridLayout grid;

	Connection conn;
	PreparedStatement ps;
	ResultSet res;
	
	GUIAppForSQL()
	{
		fr=new JFrame("Employee Details");
		pnl=new JPanel();
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t4=new JTextField(20);
		t5=new JTextField(20);

		l1=new JLabel("Enter Employee Code");
		l2=new JLabel("Enter Employee Name");
		l3=new JLabel("Enter Employee Desigination");
		l4=new JLabel("Enter Employee Department");
		l5=new JLabel("Enter Employee Salary");
		
		bt1=new JButton("Insert");
		bt2=new JButton("Delete");
		bt3=new JButton("Update");
		bt4=new JButton("Select");
		
		grid=new GridLayout(7,2);
		fr.add(pnl);
		pnl.setLayout(grid);
		pnl.add(l1);
		pnl.add(t1);
		pnl.add(l2);
		pnl.add(t2);
		pnl.add(l3);
		pnl.add(t3);
		pnl.add(l4);
		pnl.add(t4);
		pnl.add(l5);
		pnl.add(t5);
		pnl.add(bt1);
		bt1.addActionListener(this);
		pnl.add(bt2);
		bt2.addActionListener(this);
		pnl.add(bt3);	
		bt3.addActionListener(this);
		pnl.add(bt4);
		bt4.addActionListener(this);

		pnl.setBackground(Color.cyan);
		fr.setSize(400,400);
		fr.setVisible(true);
	}
	public void actionPerformed(ActionEvent ev)
	{
		Object ob;
		ob=ev.getSource();
		
			//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            		//conn=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=emp_db;user=sa;password=admin@123");
		//insert code
		if(ob==bt1)
		{
			try
			{
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//conn=DriverManager.getConnection("jdbc:odbc:Myconn","sa","admin@123");
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          	conn=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=employee_db;user=sa;password=admin@123");
			
			String Query="insert into employee values(?,?,?,?,?)";
			
			ps=conn.prepareStatement(Query);
			
			ps.setInt(1,Integer.parseInt(t1.getText()));
			ps.setString(2,(t2.getText()));
			ps.setString(3,(t3.getText()));
			ps.setString(4,(t4.getText()));
			ps.setInt(5,Integer.parseInt(t5.getText()));
			
			int rest=ps.executeUpdate();
		
			JOptionPane.showMessageDialog(null,"Row Inserted");
			}
			catch(Exception es)
			{
			JOptionPane.showMessageDialog(null,"Exception Raised"+es);
			}
		
		}

		//code for delete
		if(ob==bt2)
		{
			try
			{
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//conn=DriverManager.getConnection("jdbc:odbc:Myconn","sa","admin@123");
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           	conn=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=employee_db;user=sa;password=admin@123");
			String Query="delete from employee where ecode=?";
			
			ps=conn.prepareStatement(Query);
			
			ps.setInt(1,Integer.parseInt(t1.getText()));
					
			int rest=ps.executeUpdate();
		
			JOptionPane.showMessageDialog(null,"Row Deleted");
			}
			catch(Exception es)
			{
			JOptionPane.showMessageDialog(null,"Exception Raised"+es);
			}
		
		}	

		//code for update
		if(ob==bt3)
		{
			try
			{
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//conn=DriverManager.getConnection("jdbc:odbc:Myconn","sa","admin@123");
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           	conn=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=employee_db;user=sa;password=admin@123");
			String Query="update  employee set ename=?,desigination=?,department=?,salary=? where ecode=?";
			
			ps=conn.prepareStatement(Query);
			
			
			ps.setString(1,(t2.getText()));
			ps.setString(2,(t3.getText()));
			ps.setString(3,(t4.getText()));
			ps.setInt(4,Integer.parseInt(t5.getText()));
			ps.setInt(5,Integer.parseInt(t1.getText()));
			
					
			int rest=ps.executeUpdate();
		
			JOptionPane.showMessageDialog(fr,"Row Update");
			}
			catch(Exception es)
			{
			JOptionPane.showMessageDialog(null,"Exception Raised"+es);
			}
		
		}	
		//SELECT CODE

		if(ob==bt4)
		{
			try
			{
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//conn=DriverManager.getConnection("jdbc:odbc:Myconn","sa","admin@123");
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=employee_db;user=sa;password=admin@123");
			String Query="SELECT * FROM employee where ecode=?";
			ps=conn.prepareStatement(Query);
						
			ps.setInt(1,Integer.parseInt(t1.getText()));
									
			res =ps.executeQuery();
			int flag=1;
			while(res.next())
			{
				
				t2.setText(res.getString(2));
				t3.setText(res.getString(3));
				t4.setText(res.getString(4));
				t5.setText(res.getString(5));
				flag=0;
					
			}
			if(flag==1)
			{
				JOptionPane.showMessageDialog(null,"SORRY NO RECORD AVAILABEL FOR THE ECODE");	
			}
		
			
			}
			catch(Exception es)
			{
			JOptionPane.showMessageDialog(null,"Exception Raised"+es);
			}
		
		}	



	}
	public static void main(String []args)
	{
		new GUIAppForSQL();
	}
		
}
