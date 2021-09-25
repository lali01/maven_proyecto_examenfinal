package examen;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		String opcion = "";
		
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("******************************************");
			System.out.println("Aseguradora del sur, Elija una Opcion: ");
			System.out.println("1. Ingresar Poliza: ");
			System.out.println("2. Actualizar Valor: ");
			System.out.println("3. Consultar Poliza");
			System.out.println("4. Imprimir Reporte");
			System.out.println("5. SALIR");
			System.out.println("******************************************");
			opcion = in.nextLine();
			
			switch(opcion)
				
			case"1":
				System.out.println("Escoja el Tipo de Poliza");
				System.out.println("a) Poliza General");
				System.out.println("b) Poliza Vip");
				System.out.println("Seleccione una Opcion");
				int opcion2 = in.nextInt();
				
			if(opcion2==a) {
				
			}
			
	}while(!opcion.equals("5"));
	}
}


//case"1":
//	 System.out.println("a. Consultar Libros");
//	 System.out.println("b. Reservar Libros");
//	 oEstu = in.nextLine();
// if(oEstu.equals("a")){
//	 System.out.println("Ingrese el nombre y/o autor: ");
//	 nombreLibro = in.nextLine();
//	 System.out.println("Libros: ");
//	 System.out.println(Arrays.toString(listaLibros));
//	 
// }else if(oEstu.equals("b´")) {
//		 System.out.println("Ingrese codigo del libro a reservar: ");
//		 codigoLibro = in.nextLine();
//		 System.out.println("Ingrese su Cedula: ");
//		 cedula = in.nextLine();
//		 break;