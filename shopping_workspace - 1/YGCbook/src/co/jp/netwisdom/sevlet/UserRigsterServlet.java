package co.jp.netwisdom.sevlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.key.dao.BookDiscussDAO;
import co.jp.netwisdom.dao.UserinfoDAO;
import co.jp.netwisdom.entity.UserInfo;

public class UserRigsterServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		String major = request.getParameter("major");
		String intro = request.getParameter("intro");
		//TO DO
		String hobby = request.getParameter("hobby");
		
		UserinfoDAO dao = new  UserinfoDAO();
		//用户信息表更新
		if(dao.save(new UserInfo(username, password, sex, major, intro))){
			System.out.println("用户信息表更新成功");
		}else{
			System.out.println();
		};
		//TO DO 用户爱好表

	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
