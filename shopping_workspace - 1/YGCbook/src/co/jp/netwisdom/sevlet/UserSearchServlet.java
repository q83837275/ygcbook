package co.jp.netwisdom.sevlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import co.jp.netwisdom.dao.UserinfoDAO;
import co.jp.netwisdom.entity.Userinfo;

public class UserSearchServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
	

		
		UserinfoDAO userinfoDAO = new  UserinfoDAO();
		Userinfo userinfo = userinfoDAO.findById(username);
		System.out.println("取得成功");
		System.out.println("向画面表示");
		
		if(true){
			request.getRequestDispatcher("/userRegSuccess.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("/userRegError.jsp").forward(request, response);
		}
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
