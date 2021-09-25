package examen;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args, Poliza[][] new Poliza) {
		
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
				
				PolizaGeneral poliza1 = new PolizaGeneral();
				poliza1.setCodigo(codigo);
				poliza1.setDescripcion(descripcion);
				poliza1.setNombre(nombre);
				poliza1.setValorPoliza(aniovig);
				poliza1.setVigencia(valorpol);
				poliza1.setCodigoDescuento(codigoDescuento);
				poliza1.setnumeroSeguro(numeroSeguro);
				
				PolizaVip poliza2 = new PolizaVip();
				poliza2.setNombre(nombre);
				poliza2.setDescripcion(descripcion);
				poliza2.setVigencia(aniovig);
				poliza2.setValorPoliza(valorpol);
				poliza2.setCodigo(codigo);
				poliza2.setBeneficio(beneficio);
				
				Poliza listaPoliza[] = new Poliza[2];
				listaPoliza[1] = poliza1;
				listaPoliza[2] = poliza1;
				break;
				
				
			case"2":
				System.out.println("Ingrese el codigo de la Poliza:");
				codigo = in.nextLine();
				break;
				
			case"3":
				
				
				
				
				
				
				
				
				
			}
				
			}
			
	}while(!opcion.equals("5"));
	}




