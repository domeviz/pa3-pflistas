package com.pa3.deber2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Principal {

	public static <T> List<T> crearListaVacia() {
		return new ArrayList<>();
	}

	public static <T> List<T> crearListaUnElemento(T elemento) {
		List<T> lista = new ArrayList<>();
		lista.add(elemento);
		return lista;
	}

	public static <T, R> List<R> crearListaAPartirDeLista(List<T> original, Function<T, R> funcion) {
		List<R> nuevaLista = new ArrayList<>();
		for (T elemento : original) {
			nuevaLista.add(funcion.apply(elemento));
		}
		return nuevaLista;
	}

	public static <T> List<T> crearListaAPartirDeConjuntoFinitoDatos(T[] datos) {
		List<T> nuevaLista = new ArrayList<>();
		for (T elemento : datos) {
			nuevaLista.add(elemento);
		}
		return nuevaLista;
	}

	public static <T> T getHead(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalArgumentException("Lista Vacia");
		} else {
			return list.get(0);
		}
	}

	public static <T> List<T> getTail(List<T> lista) {
		if (lista.isEmpty()) {
			throw new IllegalArgumentException("Lista Vacia");
		} else {
			List<T> tail = new ArrayList<>();
			for (int i = 1; i < lista.size(); i++) {
				tail.add(lista.get(i));
			}
			return tail;
		}
	}

	public static <T> List<T> copiarLista(List<T> original) {
		List<T> nuevaLista = new ArrayList<>();
		for (T elemento : original) {
			nuevaLista.add(elemento);
		}
		return nuevaLista;
	}

	public static <T> List<T> copiarLista2(List<T> original) {
		return new ArrayList<>(original);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Deber 2");
		// Crear una lista vacia
		System.out.println("\n Lista vacia");
		List<Integer> listaVacia = crearListaVacia();
		System.out.println(listaVacia);

		// Crear una lista con 1 elemento
		System.out.println("\n Lista de 1 elemento");
		List<String> lista = crearListaUnElemento("uno");
		System.out.println(lista);

		// Crear una lista a partir de una lista
		System.out.println("\n Lista a partir de una lista");

		System.out.println("Lista 1");
		List<Integer> lista1 = List.of(2, 1, 5, 3);
		System.out.println(lista1);

		List<Integer> lista2 = crearListaAPartirDeLista(lista1, x -> x * 2);
		System.out.println("Lista 2");
		System.out.println(lista2);

		// Crear una lista a partir de un conjunto finito de datos
		Integer[] datos = { 2, 5, 1, 6, 8 };
		List<Integer> datosLista = crearListaAPartirDeConjuntoFinitoDatos(datos);
		System.out.println("\n Lista a partir de un conjunto de datos");
		System.out.println(datosLista);

		// Obtener head
		System.out.println("\n Obtener head");
		List<Integer> listaHead = List.of(7, 8, 2);
		System.out.println("Lista: " + listaHead);
		Integer head = getHead(listaHead);
		System.out.println("Head: " + head);

		// Obtener tail
		System.out.println("\n Obtener tail");
		List<Integer> listaTail = List.of(5, 9, 3, 1, 6);
		System.out.println("Lista: " + listaTail);
		List<Integer> tail = getTail(listaTail);
		System.out.println("Tail: " + tail);

		// Copiar una lista
		System.out.println("\n Copiar una lista");
		System.out.println("Original");
		List<Integer> listaOriginal = List.of(5, 4, 3, 2, 1);
		System.out.println(listaOriginal);
		System.out.println("Copia 1");
		List<Integer> listaCopiada1 = copiarLista(listaOriginal);
		System.out.println(listaCopiada1);
		System.out.println("Copia 2");
		List<Integer> listaCopiada2 = copiarLista2(listaOriginal);
		System.out.println(listaCopiada2);

	}

}
