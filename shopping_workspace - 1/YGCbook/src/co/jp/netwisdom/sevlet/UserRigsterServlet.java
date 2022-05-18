package co.jp.netwisdom.sevlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.jp.netwisdom.dao.HobbyDAO;
import co.jp.netwisdom.dao.UserinfoDAO;
import co.jp.netwisdom.entity.Hobby;
import co.jp.netwisdom.entity.Userinfo;

public class UserRigsterServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		String major = request.getParameter("major");
		String intro = request.getParameter("intro");

		String[] hobbyArray = request.getParameterValues("hobby");
		List hobbyList = new ArrayList();
		for(int i = 0;i< hobbyArray.length;i++){
			Hobby hobbyObject = new Hobby();
			hobbyObject.setUsername(username);
			hobbyObject.setHobby(hobbyArray[i]);
			hobbyList.add(hobbyObject);
		}


		
		UserinfoDAO userinfoDAO = new  UserinfoDAO();
		HobbyDAO hobbyDAO = new  HobbyDAO();
		boolean successFlag = true;
		//用户信息表更新
		if(userinfoDAO.save(new Userinfo(username, password, sex, major, intro))){
			System.out.println("用户信息表更新成功");
		}else{
			System.out.println("用户信息表更新失败");
			successFlag = false;
		};
		//用户爱好表更新
		if(hobbyDAO.save(hobbyList)){
			System.out.println("用户爱好表更新成功");
		}else{
			System.out.println("用户爱好表更新失败");
			successFlag = false;
		};
		if(successFlag){
			request.getRequestDispatcher("/userRegSuccess.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("/userRegError.jsp").forward(request, response);
		}
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
