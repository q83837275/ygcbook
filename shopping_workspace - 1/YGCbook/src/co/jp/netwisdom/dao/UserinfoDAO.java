package co.jp.netwisdom.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import cn.key.dbManager.JdbcTemplate;
import cn.key.mapping.UserinfoMapping;
import co.jp.netwisdom.entity.Userinfo;

public class UserinfoDAO {
	private JdbcTemplate template = new JdbcTemplate();
	public boolean save(Userinfo userinfo) {
		int row = 0;
		String sql = "insert into userinfo(username,password,sex,major,intro) " +
						" values(?,?,?,?,?)";
		Object[] values = new Object[]{
				userinfo.getUsername(),
				userinfo.getPassword(),
				userinfo.getSex(),
				userinfo.getMajor(),
				userinfo.getIntro(),
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
	
	public Userinfo findById(String username) {
		String sql = "select * from userinfo where username='" +username+"'";
		List<Userinfo> list = new Vector<Userinfo>();
		try {
			list = template.selete(sql, new UserinfoMapping());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list.get(0);
	}	
	
}

