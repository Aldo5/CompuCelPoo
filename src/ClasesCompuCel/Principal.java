package ClasesCompuCel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaracion de variables
		Scanner lectura = null;

		String clave;
		String marca;
		String modelo;
		int existencia;
		float precio;
		int indice;

		Computadoras computadora = null;

		List<Computadoras> lista = new ArrayList<Computadoras>();
		int mainMenu, subMenu, index;

		do {
			System.out.println("Bienvenido al sistema");
			System.out.println("1. Alta");
			System.out.println("2. Mostrar");
			System.out.println("3. Buscar por indice");
			System.out.println("4. Editar");
			System.out.println("5. Eliminar por indice");
			System.out.println("6. Buscar por modelo");
			System.out.println("7. Buscar por marca");
			System.out.println("8. Calcular dinero invertido");
			System.out.println("9. Eliminar por modelo");
			System.out.println("10. Salir");

			lectura = new Scanner(System.in);
			mainMenu = lectura.nextInt();

			switch (mainMenu) {
			case 1:
				try {

					System.out.println("Ingrese la clave");
					lectura = new Scanner(System.in);
					clave = lectura.nextLine();

					System.out.println("Ingrese la marca");
					lectura = new Scanner(System.in);
					marca = lectura.nextLine();

					System.out.println("ingres el modelo");
					lectura = new Scanner(System.in);
					modelo = lectura.nextLine();

					System.out.println("Ingresa la existencia");
					lectura = new Scanner(System.in);
					existencia = lectura.nextInt();

					System.out.println("Ingrese el precio");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();

					// Crear el objeto
					computadora = new Computadoras(clave, marca, modelo, existencia, precio);

					// Agregar el objeto a la lista
					lista.add(computadora);
					System.out.println("Se agrego nuevo registro");

				} catch (Exception e) {
					System.out.println("Error al guardar " + e.getMessage());
				}
				break;
			case 2:
				System.out.println(lista);
				break;
			case 3:
				System.out.println("Registros por indice en la lista ");
				for (int i = 0; i < lista.size(); i++) {
					System.out.println("[" + i + "]" + lista.get(i).getMarca());
				}
				try {
					System.out.println("Ingresa el indice a buscar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					computadora = lista.get(indice);
					System.out.println("Se encontro " + computadora);
				} catch (Exception e) {
					System.out.println("Error al buscar " + e.getMessage());
				}
				break;
			case 4:
				System.out.println("Registros por inidice en la lista ");
				for (int i = 0; i < lista.size(); i++) {
					System.out.println("[" + i + "]" + lista.get(i).getMarca());
				}
				try {
					System.out.println("Ingresa el indice a buscar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// precio y modelo
					do {
						System.out.println("Submenu para editar");
						System.out.println("1..  Modelo");
						System.out.println("2.. Precio");
						System.out.println("3.. Regresar M.P");
						lectura = new Scanner(System.in);
						subMenu = lectura.nextInt();

						switch (subMenu) {
						case 1:
							// Editar
							System.out.println("Ingres el nuevo modelo");
							lectura = new Scanner(System.in);
							modelo = lectura.nextLine();

							// Actualizacion
							computadora.setModelo(modelo);
							System.out.println("Se edito con exito");

							break;
						case 2:
							// Editar
							System.out.println("Ingres el nuevo precio");
							lectura = new Scanner(System.in);
							precio = lectura.nextFloat();

							// Actualizacion
							computadora.setPrecio(precio);
							System.out.println("Se edito con exito");
							break;
						case 3:
							break;

						}

					} while (subMenu < 3);

				} catch (Exception e) {
					System.out.println("Error al buscar " + e.getMessage());
				}

				break;
			case 5:
				System.out.println("Registros por inidice en la lista ");
				for (int i = 0; i < lista.size(); i++) {
					System.out.println("[" + i + "]" + lista.get(i).getMarca());
				}
				try {
					System.out.println("Ingresa el indice a eliminar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					// Eliminacion
					lista.remove(indice);
					System.out.println("Se elimino con exito");
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al eliminar");
				}
				break;
			case 6:
				System.out.println("Registros por modelo en la lista ");
				for (int i = 0; i < lista.size(); i++) {
					System.out.println("[" + lista.get(i).getModelo() + "]");
				}
				try {
					System.out.println("Ingresa modelo a buscar");
					lectura = new Scanner(System.in);
					modelo = lectura.nextLine();
					for (Computadoras comp : lista) {
						if (comp.getModelo().equalsIgnoreCase(modelo)) {
							System.out.println("Se encontró: " + comp);
							break;
						}
					}
				} catch (Exception e) {
					System.out.println("Error al buscar " + e.getMessage());
				}
				break;

			case 7:
				System.out.println("Registros por marcas en la lista ");
				for (int i = 0; i < lista.size(); i++) {
					System.out.println("[" + lista.get(i).getMarca() + "]");
				}
				try {
					System.out.println("Ingresa la marca a buscar");
					lectura = new Scanner(System.in);
					marca = lectura.nextLine();
					for (Computadoras mark : lista) {
						if (mark.getMarca().equalsIgnoreCase(marca)) {
							System.out.println("Se encontró: " + mark);
						}
					}
				} catch (Exception e) {
					System.out.println("Error al buscar " + e.getMessage());
				}
				break;
			case 8:
				float resultado = 0;
				System.out.println("Dinero invertido");     
				for (int i = 0; i < lista.size(); i++) {
					resultado += lista.get(i).getExistencia() * lista.get(i).getPrecio();
				}
				System.out.println("Total dinero invertido: " + resultado);
				break;
			case 9:
				System.out.println("Registros por modelo en la lista ");
				for (int i = 0; i < lista.size(); i++) {
					System.out.println("[" + lista.get(i).getModelo() + "]");
				}
				try {
					System.out.println("Ingresa el modelo a eliminar");
					lectura = new Scanner(System.in);
					modelo = lectura.nextLine();
					// Eliminacion
					for (int i = 0 ; i <= lista.size(); i++) {
						if (lista.get(i).getModelo().equalsIgnoreCase(modelo)) {
							lista.remove(i);
							System.out.println("Se elimino con exito");
							break;
						}
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al eliminar");
				}
				break;
			case 10:
				break;
			default:
				break;
			}
		} while (mainMenu < 10);
	}

}
