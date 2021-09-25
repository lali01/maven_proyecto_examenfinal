package examen;
import java.util.Arrays;
import java.util.Scanner;

import proyecto.fiinal.Libro;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	
		
		Scanner in = new Scanner(System.in);
		Scanner inInt = new Scanner(System.in);
		
		
		do {
			System.out.println("******************************************");
			System.out.println("Aseguradora del sur, Elija una Opcion: ");
			System.out.println("1. Ingresar Poliza: ");
			System.out.println("2. Actualizar Valor: ");
			System.out.println("3. Consultar Poliza");
			System.out.println("4. Imprimir Reporte");
			System.out.println("5. SALIR");
			System.out.println("******************************************");
			String opcion = in.nextLine();
			
			switch(opcion) {
				
			case"1":
				System.out.println("Escoja el Tipo de Poliza");
				System.out.println("a) Poliza General");
				System.out.println("b) Poliza Vip");
				System.out.println("Seleccione una Opcion");
				String opcion2 = in.nextLine();
				
			if(opcion2.equals("a")) {
				System.out.println("Ingrese su nombre: ");
				String nombre = in.nextLine();
				System.out.println("Ingrese la descripcion: ");
				String descripcion = in.nextLine();
				System.out.println("Ingrese el anio de vigencia: ");
				int aniovig = inInt.nextInt();
				System.out.println("Ingrese codigo de poliza: ");
				String codigo = in.nextLine();
				System.out.println("Ingrese el valor de la poliza: ");
				int valorpol = inInt.nextInt();
				System.out.println("Ingrese codigo de descuento: ");
				String coddes = in.nextLine();
				System.out.println("Ingrese numero de seguro");
				int numero = inInt.nextInt();
				
			}else if(opcion2.equals("b")){
				System.out.println("Ingrese su nombre: ");
				String nombre = in.nextLine();
				System.out.println("Ingrese la descripcion: ");
				String descripcion = in.nextLine();
				System.out.println("Ingrese el anio de vigencia: ");
				int aniovig = inInt.nextInt();
				System.out.println("Ingrese codigo de poliza: ");
				String codigo = in.nextLine();
				System.out.println("Ingrese el valor de la poliza: ");
				int valorpol = inInt.nextInt();
				System.out.println("Ingrese el beneficio: ");
				String beneficio = in.nextLine();
				
				Poliza poliza1 = new Poliza();
				poliza1.setCodigo(codigo);
				poliza1.setDescripcion(descripcion);
				poliza1.setNombre(nombre);
				poliza1.setValorPoliza(valorpol);
				poliza1.setVigencia(valorpol);
				
				
				
			}
				
			}
			
	}while(!opcion.equals("5"));
	}
}


///Libro libro1 =  new Libro();
//libro1.setCodigo (codigo);
//libro1.setNombre (nombre);
//libro1.setAutor (autor);
//libro1.setAnio(anio);
//libro1.setEditorial(editorial);
//libro1.setCantidadPaginas(canPag);
//libro1.setPrecio(precio);