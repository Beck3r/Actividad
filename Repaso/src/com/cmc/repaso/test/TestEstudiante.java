package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante est1 = new Estudiante("Santiago");
		est1.calificar(5.9);
		System.out.println(est1.getResultado());
		
		est1.calificar(9.8);
		System.out.println(est1.getResultado());
	}

}
