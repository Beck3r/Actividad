package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i1 = new Item();
		i1.setNombre("Pulseras");
		i1.setProductosActuales(20);
		i1.imprimir();
		i1.vender(12);
		i1.imprimir();
		i1.devolver(10);
		i1.imprimir();
		
		System.out.println("");
		System.out.println("");
		
		Item i2 = new Item();
		i2.setNombre("Consola PS5");
		i2.setProductosActuales(100);
		i2.imprimir();
		i2.vender(59);
		i2.imprimir();
		i2.devolver(20);
		i2.imprimir();
	}

}
