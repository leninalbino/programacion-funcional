package org.java8.evaluacion1;



import javax.swing.JOptionPane;

public class Main {

	/*
	 * IServiceProduct productService;
	 * 
	 * public Main(IServiceProduct _productService) {
	 * this.productService=_productService; }
	 */
	
	public static void main(String[] args) {
		
	     //ProductServiceImp productService = new ProductServiceImp();
		IServiceProduct productService = new  ProductServiceImp();
	        int id = 0;
	        String name="";
	        Double price=0.00;
	        Integer stock=0;
	        
	        
	        int menu;
//	        syso para agregar
	       do {
	    	 //System.out.println("hola bienvenido!!!!!");
	        	JOptionPane.showMessageDialog(null, "Bienvenido Estimado Usuario!!!!!");
	        	menu=Integer.parseInt( JOptionPane.showInputDialog("Selecione la sguiente opcion: "
	        			+ "\n1. Listar \n2.Agregar \n3.Buscar \n4.Actualizar \n5.Eliminar \n6.Cancelar"));
	        	switch(menu){
	        	case(1):
	        		System.out.println("hola");
	        		productService.findProduct();
	        		break;
	        	case(2):
	        		
        		id=Integer.parseInt( JOptionPane.showInputDialog("Ingrese el Id: "));
        		name= JOptionPane.showInputDialog("Ingrese el Nombre: ");
        		price=Double.parseDouble( JOptionPane.showInputDialog("Ingrese el Precio: "));
        		stock=Integer.parseInt( JOptionPane.showInputDialog("Ingrese el Stock: "));
        		Product pro = new Product(id, name, price, stock);
        		productService.saveProduc(pro);
        		
	        		break;
	        	
	        	case(3):
	        		
	        		break;
	        	case(4):
	        		id=Integer.parseInt( JOptionPane.showInputDialog("Ingrese el Id: "));
        		name= JOptionPane.showInputDialog("Ingrese el Nombre: ");
        		price=Double.parseDouble( JOptionPane.showInputDialog("Ingrese el Precio: "));
        		stock=Integer.parseInt( JOptionPane.showInputDialog("Ingrese el Stock: "));
        		Product pro2 = new Product(id, name, price, stock);
        		productService.updateProduct(pro2);
	        		break;
	        	case(5):
	        		id=Integer.parseInt( JOptionPane.showInputDialog("Ingrese el Id: "));
	        	productService.deleteById(id);
	        		break;
	        	case(6):
	        		
	        		break;
	        	}
	        
	        
	       }
	       while(menu!=6);
	       
	       
	       
	       
	       
	}
	}
	


