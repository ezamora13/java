package com.example.demo;

public class Arbol {

	private NodoArbol raiz;

	public Arbol() {
		raiz = null;
	}

	public void insertarNodo(int valorIngresa) {
		if (raiz == null) {
			raiz = new NodoArbol(valorIngresa);
		}else {
			//insertar nodo
		}
	}

}
