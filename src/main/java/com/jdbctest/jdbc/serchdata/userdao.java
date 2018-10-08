package com.jdbctest.jdbc.serchdata;

import com.jdbctest.jdbc.entity.User;
import org.beetl.sql.core.SQLManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class userdao{
    @Autowired
    JdbcTemplate jdbcTemplate;

//    public Integer totalUserInDepartment(String  username,String password) {
//        String sql = "select 1 from user where username= ? and password=?";
//        Integer count = jdbcTemplate.queryForObject(sql, Integer.class, username,password);
//        SQLManager sqlManager=new SQLManager();
//        sqlManager.update(d);
//
//        return count;
//    }
//   public User getUser(String id){
//        String sql="select * from user where id=?";
//       User user=jdbcTemplate.queryForObject(sql, new RowMapper<User>() {
//           @Override
//           public User mapRow(ResultSet resultSet, int i) throws SQLException {
//               User user =new User();
//               user.setId(resultSet.getInt("id"));
//               user.setCreate_time(resultSet.getDate("create_time"));
//               user.setDepartment_id(resultSet.getInt("department_id"));
//               user.setName(resultSet.getString("name"));
//               return  user;
//           }
//       },id);
//    return user;
//   }
//    public User getAllUser(String id){
//        String sql="select * from user where id=?";
//        User user=jdbcTemplate.queryForObject(sql, new RowMapper<User>() {
//            @Override
//            public User mapRow(ResultSet resultSet, int i) throws SQLException {
//                User user =new User();
//                user.setId(resultSet.getInt("id"));
//                user.setCreate_time(resultSet.getDate("create_time"));
//                user.setDepartment_id(resultSet.getInt("department_id"));
//                user.setName(resultSet.getString("name"));
//                return  user;
//            }
//        },id);
//        return user;
//    }
//
//    public void updateUser(User user){
//        String sql="update user set name=? , department_id=?  where id=? ";
//        jdbcTemplate.update(sql,user.getName(),user.getDepartment_id(),user.getId());
//    }
}