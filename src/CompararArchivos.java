import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CompararArchivos {
  public static void main(String[] args) {
    // Crear dos archivos de texto
    crearArchivo("archivo1.txt", "Hola, mundo!");
    crearArchivo("archivo2.txt", "Hola, mundo!!!");

    // Leer los archivos y comparar su contenido
    String contenido1 = leerArchivo("archivo1.txt");
    String contenido2 = leerArchivo("archivo2.txt");

    // Comparar carácter a carácter
    int resultado = compararCadenas(contenido1, contenido2);

    if (resultado > 0) {
      System.out.println("El archivo 'archivo1.txt' es mayor");
    } else if (resultado < 0) {
      System.out.println("El archivo 'archivo2.txt' es mayor");
    } else {
      System.out.println("Los archivos son iguales");
    }
  }

  // Método para crear un archivo de texto
  public static void crearArchivo(String nombreArchivo, String contenido) {
    try (FileWriter escritor = new FileWriter(nombreArchivo)) {
      escritor.write(contenido);
    } catch (IOException e) {
      System.err.println("Error al crear el archivo: " + e.getMessage());
    }
  }

  // Método para leer un archivo de texto
  public static String leerArchivo(String nombreArchivo) {
    StringBuilder contenido = new StringBuilder();
    try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
      String linea;
      while ((linea = lector.readLine())!= null) {
        contenido.append(linea).append("\n");
      }
    } catch (IOException e) {
      System.err.println("Error al leer el archivo: " + e.getMessage());
    }
    return contenido.toString();
  }

  // Método para comparar dos cadenas carácter a carácter
  public static int compararCadenas(String cadena1, String cadena2) {
    int longitud1 = cadena1.length();
    int longitud2 = cadena2.length();
    int minLongitud = Math.min(longitud1, longitud2);

    for (int i = 0; i < minLongitud; i++) {
      char car1 = cadena1.charAt(i);
      char car2 = cadena2.charAt(i);

      if (car1!= car2) {
        return Character.compare(car1, car2);
      }
    }

    // Si llegamos aquí, las cadenas son iguales hasta el final de la más corta
    return longitud1 - longitud2;
  }
}