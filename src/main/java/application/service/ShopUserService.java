package application.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import application.model.ShopUser;
import org.springframework.stereotype.Service;

@Repository
public class ShopUserService extends JdbcDaoSupport {

    PasswordEncoder encoder = new BCryptPasswordEncoder();

    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize(){
        setDataSource(dataSource);
    }

    public void registerShopUser(ShopUser user) {
        String sql = "INSERT INTO webshop.public.shop_user(email, name, password, username, zip, address) VALUES (?, ?, ?, ?, ?, ?)" ;
        assert getJdbcTemplate() != null;
        getJdbcTemplate().update(sql, user.getEmail(), user.getName(), encoder.encode(user.getPassword()), user.getUsername(), user.getZip(), user.getAddress());
    }

    public void updateUserDetails(ShopUser user){
        String sql = "UPDATE webshop.public.shop_user SET email=?, name=?, zip=?, address=? WHERE username LIKE "+ "'" + user.getUsername() + "'";

        getJdbcTemplate().update(sql, user.getEmail(), user.getName(), user.getZip(), user.getAddress());
    }

    public boolean updateUserPassword(String newpass, String newpassagain, String currentUser){
        String sql = "UPDATE webshop.public.shop_user SET password=? WHERE username LIKE "+ "'" + currentUser + "'";

        if (newpass.equals(newpassagain)) {
            getJdbcTemplate().update(sql, encoder.encode(newpass));
            return true;
        }

        return false;
    }

    public List<ShopUser> listShopUsers(){
        String sql = "SELECT * FROM webshop.public.shop_user";
        List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

        List<ShopUser> result = new ArrayList<ShopUser>();
        for(Map<String, Object> row:rows){
            ShopUser cus = new ShopUser();
            cus.setId((Integer) row.get("shop_user_id"));
            cus.setAddress((String) row.get("address"));
            cus.setEmail((String) row.get("email"));
            cus.setPassword((String) row.get("password"));
            cus.setUsername((String) row.get("username"));
            cus.setZip((Integer) row.get("zip"));
            cus.setName((String)row.get("name"));
            result.add(cus);
        }

        return result;
    }


    public ShopUser findByUserName(String s){
        String sql = "SELECT * FROM webshop.public.shop_user WHERE username LIKE "+ "'" + s + "'";
        List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

        List<ShopUser> result = new ArrayList<ShopUser>();
        for(Map<String, Object> row:rows){
            ShopUser cus = new ShopUser();
            cus.setId((Integer) row.get("shop_user_id"));
            cus.setAddress((String) row.get("address"));
            cus.setEmail((String) row.get("email"));
            cus.setPassword((String) row.get("password"));
            cus.setUsername((String) row.get("username"));
            cus.setZip((Integer) row.get("zip"));
            cus.setName((String)row.get("name"));
            cus.setAdmin((Boolean) row.get("is_admin"));
            result.add(cus);
        }

        return result.get(0);
    }

    public String getCurrentUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();

        return currentPrincipalName;
    }

}

