package co.jp.netwisdom.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import cn.key.Tools.DataTool;
import cn.key.dbManager.JdbcTemplate;
import cn.key.entity.BookInfo;
import cn.key.mapping.BookInfoMapping;
import co.jp.netwisdom.entity.Hobby;
import co.jp.netwisdom.entity.Userinfo;

public class HobbyDAO {
	private JdbcTemplate template = new JdbcTemplate();
	public boolean save(List list) {

		String sql = "insert into hobby(username,hobby) " +
						" values(?,?)";
		
		try {

			for(Object object : list){
				Hobby hobbyObject = (Hobby)object;
			
				Object[] values = new Object[]{
						hobbyObject.getUsername(),
						hobbyObject.getHobby()};
				template.updata(sql, values);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	
	
}

