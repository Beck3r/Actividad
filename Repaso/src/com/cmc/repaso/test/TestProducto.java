package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p1 = new Producto("Reloj",50.0);
		System.out.println("Producto 1");
		System.out.println("Nombre Producto: "+p1.getNombre());
		System.out.println("Precio Producto: "+p1.getPrecio());
		System.out.println("Precio con Descuento: "+p1.calcularPrecioPromo(15));
		System.out.println("");
		System.out.println("");
		
		Producto p2 = new Producto("Mouse", 85.77);
		p2.setPrecio(-90.5);
		System.out.println("Producto 2");
		System.out.println("Nombre Producto: "+p2.getNombre());
		System.out.println("Precio Producto: "+p2.getPrecio());
		System.out.println("Precio con Descuento: "+p2.calcularPrecioPromo(25));
		System.out.println("");
		System.out.println("");
		
		
		
		
		
	}

}
