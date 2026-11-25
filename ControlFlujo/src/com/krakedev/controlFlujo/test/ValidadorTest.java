package com.krakedev.controlFlujo.test;

import com.krakedev.controlFlujo.Validador;

public class ValidadorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validador v1 = new Validador();
		v1.validarEdad(5);
		v1.validarEdad(22);
		v1.validarEdad(15);
		v1.validarEdad(95);
		v1.validarEdad(18);
	}

}
