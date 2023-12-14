import java.sql.Connection;//import java.sql.connection package,objects database
import java.sql.DriverManager;//import java.sql.drivermanager package,objects database
import java.sql.PreparedStatement;//import java.sql.preparedstatement package,objects database
import java.util.Scanner;//import java.util.scanner package,objects database
public class UpdateOperation //class name
{
public static void main(String[] args)//main method
	{
	    int customer_id; //using integer data type initializing the customer id
	    String customer_email;//using string data type assigning the customer email
        Scanner sc=new Scanner(System.in);//scanner input method
        System.out.println("enter customer id");//print statement of customer id 
        customer_id=sc.nextInt();//customer id object creation
        System.out.println("enter customer email to change");//print statement of customer id 
        customer_email=sc.next();//customer name object creation
        try //try block organize the details,related packages here and place in the block
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");// representing the Class path 
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkart","root","1234");//connection and driver manager of sql statement
        	String sql="update customer set cemail='"+customer_email+"'where cid='"+customer_id+"'"; //writing a query of customer to update a customer mail 
        	PreparedStatement ps= con.prepareStatement(sql); //prepared object is belongs to sql statement 
        	int i=ps.executeUpdate();//initializing of i=ps object.excuteUpdate method();
        	if(i==1)//if condition and its syntax i==1
        	{
        		System.out.println("customer information updated successfully");//final statement print if above condition is true
        	}
        	else//else block
        	{
        		System.out.println("customer information is not updated");//final statement print if condition is false
        	}
            }
        	catch(Exception e)//catch block ,check if any runtime errors are a raised from try block 
        	{
        		e.printStackTrace();//e.printStackTrace of catch block
        	}
            }
	        }