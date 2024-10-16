

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class GetResult extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			int id=Integer.parseInt(request.getParameter("id"));
			// to load the driver select the folder->build path->add external jar(add mysqlDriverConnector and apply)->deployee assembly->add->(add the mysqldriver connector)->apply and close
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/july_24","root","V_!m@L2!!2");
			
			String s="select * from student where id=?;";
			PreparedStatement pstmt=con.prepareStatement(s);
			pstmt.setInt(1, id);
			ResultSet res=pstmt.executeQuery();
			
			PrintWriter out=response.getWriter();
			
			if(res.next())
			{
				out.println(res.getInt(1)+"  "+res.getString(2)+"  "+res.getInt(3)+"  "+res.getInt(4)+"  "+res.getInt(5));
			}
			else {
				out.println("Invalid id...");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
