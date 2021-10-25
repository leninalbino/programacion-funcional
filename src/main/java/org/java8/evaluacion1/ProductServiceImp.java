package org.java8.evaluacion1;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class ProductServiceImp implements IServiceProduct {
	
	List<Product> listaProducto = new ArrayList<Product>();
	
	//List<Product> producto = Arrays.asList(new Product(1, "Arroz", 10.00, 10),
											//new Product(2,"Fideos", 15.00, 15));
	
@Override
public void findProduct() {
	listaProducto.forEach(System.out::println);
}

@Override
public Product saveProduc(Product producto) {
	
	listaProducto.add(producto);
	/*
	 * List<Product> nuevoProduct= new ArrayList<Product>(); for(Product prs:
	 * nuevoProduct) { nuevoProduct.add(new Product(prs.getId(),prs.getName(),
	 * prs.getPrice(), prs.getStock())); }
	 */
return producto;	


}

@Override
public void deleteById(int id) {
	listaProducto.removeIf(P -> P.getId() ==id);
		
	}

@Override
public Product updateProduct(Product upProduct) {
	// ? = if
	// : = else
	
	listaProducto = listaProducto.stream().map(p ->p.getId()==upProduct.getId()? upProduct :p)
									.collect(Collectors.toList());
	return upProduct;
}

@Override
public void buscar(int id) {
	 List<Product>listaP=listaProducto.stream().filter(p->p.getId()==id || p.getName().equals(p.getName())).collect(Collectors.toList());
	listaP.forEach(System.out::println);
}

@Override
public boolean checkId(int id) {
	boolean respuesta;
	respuesta = listaProducto.stream().anyMatch(p -> p.getId() == id);
	return respuesta;
}
	
}




