package BackendApi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
	
	@Autowired
	ProductsRepository repository;
	
	public List<ProductsModel> listOfProducts(){
		
		return repository.findAll();
	}
	
	public void addProducts(ProductsModel products) {
	
		repository.save(products);
	}
	
	public Optional<ProductsModel> getOneProducts(Integer  id) {
		return repository.findById(id);
	}
	
	public void deleteOneProducts(Integer  id) {
		 repository.deleteById(id);
	}
}
