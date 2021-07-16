package com.cmc.test;

import java.util.ArrayList;
import java.util.HashMap;

public class TestMapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listas=new ArrayList<String>();
		listas.add("uno");
		String valor=listas.get(0); /*recuperar */
		HashMap<String, String> mapas = new HashMap<String, String>();
		mapas.put("a", "Mario");
		mapas.put("b", "Beto");
		
		//para recuperar
		String res=mapas.get("b");
		System.out.println(res);
		
		
		

	}

}
