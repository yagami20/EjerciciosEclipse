package com.cmc.test;

import com.cmc.entidades.Contacto;

public class TestContactos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacto [] contactos=new Contacto[5];
		contactos[0]=new Contacto("123","nom");
		contactos[1]=new Contacto("133","n3om");
		
		Contacto c= contactos[1];
		System.out.println(c);
		
		Contacto contacto=null;
		for(int i=0;i<contactos.length;i++){
			contacto=contactos[i];
			System.out.println(contacto);
		}

	}

}
