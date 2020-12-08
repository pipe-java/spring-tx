package io.xlkx.dvgd.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(String email,String name){
        String sql = "insert into user(email,name) values(?,?)";
        jdbcTemplate.update(sql, email,name);
    }
}
