package com.cmc.test;

import java.util.HashMap;

import com.cmc.entidades.Cliente;

public class TestMapaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//para importar Cliente Ctrl+Shift+O
		HashMap<String,Cliente> mapa=new HashMap<String, Cliente>();
		
		mapa.put("A", new Cliente("1719615245","Ramiro")); //clave ser elemento de objeto que no se repite
		mapa.put("B", new Cliente("1719615445","Ramon"));
		
		Cliente c=mapa.get("B"); //solo valores existentes por llave sino da null
		System.out.println(c);
	}

}
