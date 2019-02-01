package com.internousdev.webproj4.dao;

import com.internousdev.webproj4.dto.HelloStrutsDTO;
import com.internousdev.webproj4.util.DBConnector;


public class HelloStrursDAO {
	List<HelloStrutsDTO> helloStrutsDTOList = new ArrayList<HelloStrutsDTO>();

	public List<HelloStrutsDTO> select(){
		DBConnector db = new DBConnector();
		com.mysql.jdbc.Connection con = db.getConnection();

		Stirng sql = "select * from users";
		try{
			com.mysql.jdbc.PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.nest()){
				HelloStrutsDTO dto = new HelloStrurtsDTO();
				dto.setUserId(rs.getInt("user_id"));
				dto.setUserName(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
				dto.setResult("MySQLと接続できます。");
				helloStrutsDTOList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try {
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return helloStrutsDTOList;
	}

}
