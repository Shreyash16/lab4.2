package shreyash.cg.gla.spring.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shreyash.cg.gla.spring.dao.ProductDao;
import shreyash.cg.gla.spring.entity.Product;
import shreyash.cg.gla.spring.entity.ProductOld;

@Service
public class ProductService implements ProductServiceInterface {
	@Autowired
	ProductDao productDao;

	@Override
	public Product save(Product product) {
		boolean result = productDao.create(product);

		if (result) {
			return product;
		} else
			return null;
	}

	@Override
	public List<ProductOld> reterive() {
		List<ProductOld> listproductold = new ArrayList<>();
		
		for (Product product : productDao.retrieve1()) {
			ProductOld pr = new ProductOld();
			pr.setProdId(product.getProdId());
			pr.setProdName(product.getProdName());
			pr.setProdPrice(product.getProdPrice());

			listproductold.add(pr);
	}
		return listproductold;
		}

	@Override
	public List<Product> reterivev1() {
		return productDao.retrieve1();
	}
}
