package com.example.demo;

public class NodoArbol {
	private NodoArbol nodoIzquierdo;
	private NodoArbol nodoDerecho;

	int datos;

	public NodoArbol() {
		// TODO Auto-generated constructor stub
	}

	public NodoArbol(int datosNodo) {
		datos = datosNodo;
		nodoIzquierdo = nodoDerecho = null;
	}

}
