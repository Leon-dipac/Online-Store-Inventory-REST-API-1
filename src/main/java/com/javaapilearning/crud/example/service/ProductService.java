// Complete File for this project
package com.javaapilearning.crud.example.service;

import com.javaapilearning.crud.example.entity.Product;
import com.javaapilearning.crud.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// Let's push it on Github
public class ProductService {

  @Autowired
  private ProductRepository repository;

  /*
     You can perform all this API Methods using POstman. Use Postman as a REST client
     to create and execute queries (Postman also works with SOAP and GraphQL).

     Postman Rest Client sends Requests, inspect responses, and easily debug REST APIs.
     You can use Postman downloaded App or you can access it directly through your
     Web Browser.

     Postman is basically a platform with a Request builder.


  */

  /**************   Post Methods *************************************************************/
  public Product saveProduct (Product product) {

      return repository.save(product);
  }

  // Let's save the list of products :
  public List <Product>  saveProducts (List<Product> products) {

      return repository.saveAll(products);
  }
  /************** End of my Post Methods *************************************************************/

  /**************   Get Methods *************************************************************/
  // Let's get the list of products :
  public List <Product>  getProducts ( ) {

      return repository.findAll( );
  }

  // Let's get a product using a given ID. This should return 'null' if ID not found.
  public Product  getProductById (int id) {

      return repository.findById(id).orElse(null);
  }

  // Let's get a product using a given name. This should return 'null' if name not found.
  public Product  getProductByName (String name) {

        return repository.findByName(name);
  }
  /************** End of my Get Methods *************************************************************/


  /**************   Put or Update Methods *************************************************************/
  public Product updateProduct(Product product){
      // Let's get the existing product available in our database and then modify it:
      Product existingProduct = repository.findById(product.getId()).orElse(null);
      existingProduct.setName(product.getName());
      existingProduct.setQuantity(product.getQuantity());
      existingProduct.setPrice(product.getPrice());
      return repository.save(existingProduct);
  }


  /************** End of my Put or Update Methods *************************************************************/



  /**************   Delete Methods *************************************************************/
  public String deleteProduct(int id){
      repository.deleteById(id);
      return "Product has been removed or deleted !!  " +id;
  }


  /************** End of my Delete Methods *************************************************************/


}
