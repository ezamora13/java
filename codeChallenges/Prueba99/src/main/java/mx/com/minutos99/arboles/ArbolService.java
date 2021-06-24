package mx.com.minutos99.arboles;

import java.util.ArrayList;
import java.util.List;

import mx.com.minutos99.dto.Neighbor;

public class ArbolService {

	public String height(List<Integer> integers) {
		Arbol arbol = new Arbol();
		for (Integer integer : integers) {
			arbol.insertar(integer);
		}
		System.out.println("La altura del arbol es = " + arbol.retornarAltura());

		return String.valueOf(arbol.retornarAltura());

	}

	public Neighbor neighbors(List<Integer> integers, int node) {
		Arbol arbol = new Arbol();
		for (Integer integer : integers) {
			arbol.insertar(integer);
		}
		return arbol.retornarAlturaVecinos(node);
	}

	public String bfs(List<Integer> integers) {
		List<String> list = new ArrayList<String>();
		Arbol arbol = new Arbol();
		for (Integer integer : integers) {
			arbol.insertar(integer);
		}
		 arbol.retornarAltura();
		list = arbol.imprimirNivel();
		list.remove("null");
		String cad = "";
		for (int i = list.size() - 1; i >= 0; i--) {

			cad += list.get(i);
		}

		return cad;

	}

	public static void main(String[] args) {
		Arbol AB = new Arbol();

		AB.insertar(52);
		AB.insertar(22);
		AB.insertar(42);
		AB.insertar(72);
		AB.insertar(56);
		AB.insertar(12);
		AB.insertar(5);
		System.out.println("LA RAIZ ES: " + AB.raiz());

		System.out.println("");
		// System.out.println("la cantidad de nodos es " + AB.cantidadNodos());

		System.out.println("cantidad de hojas = " + AB.cantidadNodosHoja());

		System.out.println("la altura del arbol es = " + AB.retornarAltura());
		System.out.println(" ");
		AB.menorValor();
		AB.mayorValor();
		AB.imprimirNivel();

//        AB.InOrden(AB.raiz);
//        System.out.println("*******************");
//        AB.PreOrden(AB.raiz);
//        System.out.println("*******************");
//        AB.PostOrden(AB.raiz);
//        System.out.println("*******************");
//        System.out.println(AB.BuscarNodo(12));
//        AB.Eliminar(52);      
//        System.out.println("*******************");
//        System.out.println("LA RAIZ ES: "+AB.Raiz());
//        AB.PostOrden(AB.raiz);

	}
}
