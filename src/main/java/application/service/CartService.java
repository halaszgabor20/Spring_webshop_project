package application.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import application.model.Cart;
import application.model.Product;

@Repository
public class CartService  extends JdbcDaoSupport{
	
 	@Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize(){
        setDataSource(dataSource);
    }
    
    public void addToCart(int id) {
    	Cart cart = new Cart();
    	ShopUserService userService = new ShopUserService();
    	String currUser = userService.getCurrentUser();
   
    	String sql2 = "Select shop_user_id From shop_user Where username ="+"'"+ currUser+"'";
    	List<Map<String, Object>> rows3 = getJdbcTemplate().queryForList(sql2);
    	List<Integer> result = new ArrayList<Integer>();
    	for(Map<String, Object> row:rows3){
           int ID;
           ID = (int) row.get("shop_user_id");
           result.add(ID);
    	}
    	cart.setUser_id(result.get(0));
    	String sql3 = "Select name From product Where product_id ="+ id;
    	List<Map<String, Object>> rows2 = getJdbcTemplate().queryForList(sql3);
    	List<String> result2 = new ArrayList<String>();
    	for(Map<String, Object> row:rows2){
           String name=null;
           name = (String) row.get("name");
           result2.add(name);
    	}
    	cart.setProduct_name(result2.get(0));
    	String sql = "INSERT INTO webshop.public.cart( product_name, user_id) "
    			+ "VALUES ( ?, ?)";
    			assert getJdbcTemplate() != null;
    			getJdbcTemplate().update(sql, cart.getProduct_name(),cart.getUser_id());
	}
    
    public List<Product> listCart(){
    	ShopUserService userService = new ShopUserService();
		String currUser = userService.getCurrentUser();
    	String sql2 = "Select shop_user_id From shop_user Where username ="+"'"+ currUser+"'";
    	List<Map<String, Object>> rows3 = getJdbcTemplate().queryForList(sql2);
    	List<Integer> result2 = new ArrayList<Integer>();
    	for(Map<String, Object> row:rows3){
           int ID;
           ID = (int) row.get("shop_user_id");
           result2.add(ID);
    	}
		String sql = "SELECT * FROM webshop.public.cart WHERE user_id ="+ "'"+result2.get(0)+ "'" ;
        List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
        List<String> productNames = new ArrayList<String>();
        List<Cart> result = new ArrayList<Cart>();
        for(Map<String, Object> row:rows){
            Cart cus = new Cart();
            cus.setCart_id((Integer) row.get("cart_id"));
            cus.setProduct_name((String) row.get("product_name"));
            cus.setUser_id((Integer) row.get("user_id"));
            result.add(cus);
            productNames.add(cus.getProduct_name());
        }
        List<Product> products = new ArrayList<Product>();
        for(int i = 0; i<productNames.size();i++) {
        	String sql3= "Select * from webshop.public.product WHERE name="+ "'"+productNames.get(i)+"'";
        	List<Map<String, Object>> rowsP = getJdbcTemplate().queryForList(sql3);
   
           
            for(Map<String, Object> row:rowsP){
            	Product cus = new Product();
	            cus.setProduct_id((Integer) row.get("product_id"));
	            cus.setCategory((String) row.get("category"));
	            cus.setName((String) row.get("name"));
	            cus.setIs_active((Boolean) row.get("is_active"));
	            cus.setPrice((Integer) row.get("price"));
	            cus.setImg((String) row.get("img"));
	            products.add(cus);
            }
        }

        return products;
		
	
}
    public void deleteProduct(int id) {
    	String sql3 = "Select name From product Where product_id ="+ id;
    	List<Map<String, Object>> rows2 = getJdbcTemplate().queryForList(sql3);
    	List<String> result2 = new ArrayList<String>();
    	for(Map<String, Object> row:rows2){
           String name=null;
           name = (String) row.get("name");
           result2.add(name);
    	}
		String sql = "DELETE FROM webshop.public.cart where product_name ="+ "'" + result2.get(0)+"'";
		assert getJdbcTemplate() != null;
		getJdbcTemplate().update(sql);
	}
}
