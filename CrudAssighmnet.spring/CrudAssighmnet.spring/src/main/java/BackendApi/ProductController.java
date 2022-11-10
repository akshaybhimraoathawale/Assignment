package BackendApi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("getAllProducts")
	public List<ProductsModel> findAllProducts(){
		return service.listOfProducts();
	}
	
	@GetMapping("getOneProduct/{id}")
	public Optional<ProductsModel> getOneProducts(@PathVariable Integer  id) {
		return service.getOneProducts(id);
	}
	
	@PostMapping("addProducts")
	public void addProducts(@RequestBody ProductsModel products) {
		service.addProducts(products);
	}

	@PutMapping("update/{id}")
	public void updateProduct(@RequestBody ProductsModel products,
			                @PathVariable Integer id) {
		Optional<ProductsModel> prod= service.getOneProducts(id);
	service.addProducts(products);	
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteOneProducts(@PathVariable Integer  id) {
		 service.deleteOneProducts(id);
	}
}
