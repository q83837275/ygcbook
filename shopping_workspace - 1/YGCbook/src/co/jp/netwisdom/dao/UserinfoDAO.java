package co.jp.netwisdom.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import cn.key.Tools.DataTool;
import cn.key.dbManager.JdbcTemplate;
import cn.key.entity.BookInfo;
import cn.key.mapping.BookInfoMapping;
import co.jp.netwisdom.entity.UserInfo;

public class UserinfoDAO {
	private JdbcTemplate template = new JdbcTemplate();
	public boolean save(UserInfo userInfo) {
		int row = 0;
		String sql = "insert into userinfo(username,password,sex,major,intro) " +
						" values(?,?,?,?,?)";
		Object[] values = new Object[]{
			userInfo.getUsername(),
			userInfo.getPassword(),
			userInfo.getSex(),
			userInfo.getMajor(),
			userInfo.getIntro(),
			};
		try {
			row = template.updata(sql, values);
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return (row == 1);
	}
	
	
	
}
