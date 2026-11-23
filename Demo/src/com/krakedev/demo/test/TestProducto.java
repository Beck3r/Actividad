package com.krakedev.demo.test;
import com.krakedev.demo.Producto;
public class TestProducto {

	public static void main(String[] args) {
		Producto p1 = new Producto(01,"Papitas");
		p1.setDescripcion("Son papitas fritas de la marca pringles");
		p1.setPeso(12.5);
		
		p1.imprimir();
	}

}
