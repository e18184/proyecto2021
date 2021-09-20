package com.example.demo;

import org.orm.PersistentException;

import com.example.demo.modelo.V_usuariorol;
import com.example.demo.modelo.V_usuariorolDAO;


public class Principal {
// en spring boot YA NO HAY ARCHIVOS DE BEANS XML
	private static final int ROW_COUNT = 100;
	public static void main(String[] args) {
		
		// esto es una pruebfa
		com.example.demo.modelo.V_usuariorol[] comexampledemomodeloV_usuariorols = com.example.demo.modelo.V_usuariorolDAO.listV_usuariorolByQuery(null, null);
		int length = Math.min(comexampledemomodeloV_usuariorols.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(comexampledemomodeloV_usuariorols[i].getLogin()
					+" "+
					comexampledemomodeloV_usuariorols[i].getPasswd()+" "+comexampledemomodeloV_usuariorols[i].getCi());
		}
	}

}

