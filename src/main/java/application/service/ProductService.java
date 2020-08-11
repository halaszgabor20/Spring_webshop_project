package application.service;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import application.model.Product;
import application.model.ShopUser;

@Repository
public class ProductService extends JdbcDaoSupport{
	
	 	@Autowired
	    DataSource dataSource;

	    @PostConstruct
	    private void initialize(){
	        setDataSource(dataSource);
	    }

	    public void addProduct(Product product) {
			String sql = "INSERT INTO webshop.public.product(name, is_active, price, category, img) VALUES ( ?, ?, ?, ?, ?);";
			assert getJdbcTemplate() != null;
			getJdbcTemplate().update(sql, product.getName(), product.isIs_active(), product.getPrice(), product.getCategory(), product.getImg());
		}

		public void deleteProduct(int id) {
			String sql = "DELETE FROM webshop.public.product where product_id = ?";
			assert getJdbcTemplate() != null;
			getJdbcTemplate().update(sql, id);
		}
	    
	    public List<Product> listProducts(){
	    	
	    		String sql = "SELECT * FROM webshop.public.product";
		        List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

		        List<Product> result = new ArrayList<Product>();
		        for(Map<String, Object> row:rows){
		            Product cus = new Product();
		            cus.setProduct_id((Integer) row.get("product_id"));
		            cus.setCategory((String) row.get("category"));
		            cus.setName((String) row.get("name"));
		            cus.setIs_active((Boolean) row.get("is_active"));
		            cus.setPrice((Integer) row.get("price"));
		            cus.setImg((String) row.get("img"));
		            result.add(cus);
		        }

		        return result;
	    		
	    	
	    }
	    
	    public List<Product> listCategories(){
	    	String sql ="SELECT category from webshop.public.product GROUP BY category";
	    	 List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

		        List<Product> result = new ArrayList<Product>();
		        for(Map<String, Object> row:rows){
		            Product cus = new Product();  
		            cus.setCategory((String) row.get("category"));		       
		            result.add(cus);
		        }

	    	return result;
	    }
	  
	public List<Product> searchProduct(String s){
	
	        String sql = "SELECT * FROM webshop.public.product WHERE LOWER(name) LIKE " + "LOWER('%" + s + "%')" +
															" OR LOWER(category)  LIKE " + "LOWER('" + s + "')";

	        List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

	        List<Product> result = new ArrayList<Product>();
	        for(Map<String, Object> row:rows){
	        	 Product cus = new Product();
		            cus.setProduct_id((Integer) row.get("product_id"));
		            cus.setCategory((String) row.get("category"));
		            cus.setName((String) row.get("name"));
		            cus.setIs_active((Boolean) row.get("is_active"));
		            cus.setPrice((Integer) row.get("price"));
		            cus.setImg((String) row.get("img"));
		            result.add(cus);
	        }

	        return result;
	    }
}
