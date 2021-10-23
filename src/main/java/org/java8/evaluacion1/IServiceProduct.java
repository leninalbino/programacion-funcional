package org.java8.evaluacion1;

import java.util.List;

public interface IServiceProduct {

	public  void findProduct();
	public  Product saveProduc(Product producto);
	void deleteById(int id);
	public Product updateProduct(Product upProduct);
	void  buscar(int id);
}
