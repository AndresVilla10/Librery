/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos;

/**
 *
 * @author Andres Villamil
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lectura1 {
    private BufferedReader reader;

    // Constructor de la clase Lectura1 que recibe la ruta del archivo a leer como parámetro.
    public Lectura1(String filePath) {
        try {
            // creamos un BufferedReader para leer el archivo especificado.
            this.reader = new BufferedReader(new FileReader(filePath));
        } catch (IOException e) {
            // Si ocurre un error al abrir el archivo, muestra un mensaje de error en la consola
            // e imprime la traza de excepción.
            System.err.println("Error: No se encuentra el archivo");
            e.printStackTrace();
        }
    }

    // Método para leer el archivo y mostrar su contenido.
    public void leerArchivo() throws IOException {
        String linea;
        // Lee cada línea del archivo hasta llegar al final (cuando readline() retorna null).
        while ((linea = reader.readLine()) != null) {
            System.out.println(linea);
        }
        // Cierra el BufferedReader una vez que se ha terminado de leer el archivo.
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        // Crear una instancia de la clase Lectura1 y especificar el nombre del archivo a leer ("colocamos_el_nombre_del_archivo.txt").
        Lectura1 lector = new Lectura1("archivo.txt");
        // Verificar si se pudo abrir el archivo (si el BufferedReader no es nulo).
        if (lector.reader != null) {
            // Llamar al método leerArchivo para mostrar el contenido del archivo.
            lector.leerArchivo();
        }
    }
}
