	import java.sql.Connection;// import java sqlConnection package
	import java.sql.*; //import java sql package
	import java.sql.PreparedStatement;//import sql prepared statement package
	import java.util.Scanner;//import java util package
	public class  CreateOperation //class name
	{
	   public static void main(String[] args)//main method
		{
			int customer_id; //variable initialization using integer data type of customer id
			String customer_name;//variable initialization using String  data type customer name
			String customer_email;//variable initialization using String data type customer email
			String customer_mobile;//variable initialization using String data type customer mobile
		    String customer_address;//variable initialization using String data type customer address
		    Scanner sc=new Scanner(System.in); //giving input, by creating an object called sc
	        System.out.println("enter customer id"); //print statement of enter customer id
	        customer_id=sc.nextInt();//object of customer id
	        System.out.println("enter customer name");//print statement of enter customer name
	        customer_name=sc.next();//object of customer name
	        System.out.println("enter customer email");//print statement of enter customer email
	        customer_email=sc.next();//object of customer email
	        System.out.println("enter customer mobile");//print statement of enter customer mobile
	        customer_mobile=sc.next();//object of customer mobile
	        System.out.println("enter customer address");//print statement of enter customer address
	        customer_address=sc.next();//object of customer address
	        try //try exception handling block 
	        {
	        	Class.forName("com.mysql.cj.jdbc.Driver");//driver name
	        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkart","root","1234");//get a connection
	        	String sql="insert into customer values(?,?,?,?,?)";
	        	PreparedStatement ps=con.prepareStatement(sql); //obtain prepared statement select *from customer
	        	ps.setInt(1,customer_id);//ps.setInt of customer id
	        	ps.setString(2,customer_name);//ps.setstring customer name
	        	ps.setString(3,customer_email);//ps.setstring customer email
	        	ps.setString(4,customer_mobile);//ps.setstring customer mobile
	        	ps.setString(5,customer_address);//ps.setstring customer address
	            int i=ps.executeUpdate();
	            if(i>0)//if condition
	            {
	            	System.out.println("connection established successfully");//print and final statement if given statement is true
	            }
	            else //else block
	            {
	            	System.out.println("connection is not established successfully ");//print and final statement if given statement is false
	            con.close(); //closing connection
	            }
	            }
		   catch(Exception e)//catch block exception handling
	        {
			   e.printStackTrace();
	        }
		    }
	        }


