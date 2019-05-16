package Jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Dbcon1 {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe","system","cat");
Statement stm =con.createStatement();
ResultSet rs=stm.executeQuery("select*from employee15");
while(rs.next()) {
	System. out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
}//end of while
con.close();

	}

}
