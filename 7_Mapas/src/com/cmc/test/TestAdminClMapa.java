package com.cmc.test;

import com.cmc.entidades.Cliente;
import com.cmc.mapas.AdminClientes;

public class TestAdminClMapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminClientes cliente= new AdminClientes();
		Cliente c=new Cliente("1719615245","MArlon");
		cliente.agregarCliente(c);
		cliente.recuperar("1719615245");
		System.out.println(cliente);
		

	}

}
