import java.util.Scanner;

public class main {

	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el tipo que desea\n1. HashSet\n2. LinkedHashSet\n3. TreeSet");
		int seleccion = teclado.nextInt();
		Desarrolladores des = new Desarrolladores(seleccion);
		int ingresar=1, j=0, w=0, c=0;
		String nombre="";
		
		while (ingresar == 1){
			System.out.println("--------------------------------------------Nuevo Ingreso----------------------------------------------");
			System.out.println("Ingrese el Nombre: ");
			nombre = teclado.next();
			System.out.println("Desarrollador java?\n1. Si\n2. No");
			j = teclado.nextInt();
			System.out.println("Desarrollador web?\n1. Si\n2. No");
			w = teclado.nextInt();
			System.out.println("Desarrollador celular?\n1. Si\n2. No");
			c = teclado.nextInt();
			des.agregrDesarrollador(nombre, j, w, c);
			System.out.println("Ingresar otro trabajador\n1. Si\n2. No");
			ingresar = teclado.nextInt();
		}

		System.out.println("-----------------------------------------Resultados--------------------------------------------------");
		des.JWC();
		System.out.println("-----------------------------------------------------------------------------------------------------");
		des.JnoW();
		System.out.println("-----------------------------------------------------------------------------------------------------");
		des.WyCnoJ();
		System.out.println("-----------------------------------------------------------------------------------------------------");
		des.WoC();
		System.out.println("-----------------------------------------------------------------------------------------------------");
		des.javaSubWeb();
		System.out.println("-----------------------------------------------------------------------------------------------------");
		des.mayorDesordenado();
		System.out.println("-----------------------------------------------------------------------------------------------------");
		des.mayorOrdenado();
		System.out.println("---------------------------------------------FIN-----------------------------------------------------");
		
		
	}
}
