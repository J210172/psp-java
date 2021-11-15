import java.util.ArrayList;

public class Ejecutor {

	public static void main(String[] args) {
		long tInicio = System.nanoTime();
		ArrayList<String> ficheros = new ArrayList<String>();
		//ficheros.add("/home/alumno/repos/psp-c/prog12-EjercicioCompleto-Prod-Separado/main.c");
		//ficheros.add("/home/alumno/repos/psp-c/prog12-EjercicioCompleto-Prod-Separado/Makefile");
		
		//se ha añadido el fichero salida al repositorio. En una carpeta datos dentro del proyecto
		//así os funcionará en casa
		ficheros.add("./datos/salida.txt");
		ficheros.add("./datos/salida.txt");
		ficheros.add("./datos/salida.txt");
		ficheros.add("./datos/salida.txt");
		ficheros.add("./datos/salida.txt");
		ficheros.add("./datos/salida.txt");
		
		ArrayList<HiloEjecutor> listaHilos= new ArrayList<HiloEjecutor>();
		long tInicioLanzamiento = System.nanoTime();
		for (String rutaFichero : ficheros) {
			String[] parametros = {rutaFichero};
			ContadorPalabras.main(parametros);
		}
		System.out.println("Hilos finalizados. Tardaron "+(float)(System.nanoTime()-tInicio)/1000000+"ms.");
	}
}