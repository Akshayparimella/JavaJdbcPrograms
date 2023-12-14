import java.sql.Connection;// java.sql.Connection data sources import package
import java.sql.DriverManager;// java.sql.driver manager data sources import package
import java.sql.ResultSet;// java.sql.result set  data sources  package
import java.sql.Statement;// java.sql.Statement data sources import package
public class ReadOperation//class name
{
public static void main(String[] args) //main method
{
int customer_id;//initializing using integer data type is an variable to  customer_id
String customer_name;//using string data type assigning as a variable to customer_name
String customer_email;//using string data type assigning as a variable to customer_email
String customer_mobile;//using string data type assigning as a variable to customer_mobile
String customer_address;//using string data type assigning as a variable to customer_address
try //try block providing details ,related statements and objects here
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkart","root","1234");
    String sql="select *from customer";// presenting a my sql query of create database table name
    Statement st=con.createStatement();//sql statement object for sending sql Statement object(st)=con.createStatement
    ResultSet rs=st.executeQuery(sql);//execute the given sql statements result set object execute query
    while(rs.next())//while condition rs(result set).next
{
	customer_id=rs.getInt(1);//retrieves the value get customer_id
	customer_name=rs.getString(2);//retrieves the value get customer_name
	customer_email=rs.getString(3);//retrieves the value get customer_email
	customer_mobile=rs.getString(4);//retrieves the value get customer_mobile
	customer_address=rs.getString(5);//retrieves the value get customer_address
	System.out.println(customer_id+"\t"+customer_name+"\t"+customer_email+"\t"+customer_mobile+"\t"+customer_address+"\t");//print customer_id,customer_name,customer_email,customer_mobile,customer_address 
}
}
catch(Exception e)//catch block Exception handling check any run time errors are raised from try block
{
	e.printStackTrace();//e.printStackTrace
}
finally //final block
{
	System.out.println("program end");// print final statement 
}
}
}

