package shreyash.cg.gla.spring.dao;

import java.util.List;

import shreyash.cg.gla.spring.entity.Product;
import shreyash.cg.gla.spring.entity.ProductOld;


public interface ProductDaoInterface {
	
	public boolean create(Product product);
	public List<Product> retrieve1();
//	public List<ProductOld> retrieve();

}
