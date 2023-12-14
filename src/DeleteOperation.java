import java.sql.Connection;//connection(session)sql statements executed and returned with a context
import java.sql.DriverManager;//basic service of managing of jdbc drivers
import java.sql.PreparedStatement;//pre compiled sql statement
import java.util.Scanner;//parse primitive strings and strings
public class DeleteOperation//class name
{
	public static void main(String[] args) //main method
	{
		int customer_id;//initialize the customer id using integer data type also for variable declaration
		Scanner sc=new Scanner(System.in);//scanner input
		System.out.println("enter customer id");//print final statements enter student id
		customer_id=sc.nextInt();//object creation
		try//try block organize the details,related packages here and place in the block
		{
			Class.forName("com.mysql.cj.jdbc.Driver");//representation of path
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkart","root","1234");//connect a data sources 
			String sql="delete from customer where cid='"+customer_id+"'"; //sql query deletion customer id
			PreparedStatement ps=con.prepareStatement(sql);//create a prepared statement to sending a parameterized sql statement to the database
			int i=ps.executeUpdate();//execute sql statement in this prepared statement
			if(i==1)//if condition
			{
				System.out.println("customer data deleted");//final statement print customer data deleted
			}
			else //else block
			{
				System.out.println("deletion failed");//final statement print deletion failed
			}
		}
		catch(Exception e)//catch block 
		{
		e.printStackTrace();// trace the error of catch block,Throwable object on the error output stream
		}
	}
}
