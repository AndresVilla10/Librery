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
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escribir2 {
    private String archivoNombre; // Nombre del archivo que se escribirá

    // Constructor que recibe el nombre del archivo
    public Escribir2(String archivoNombre) {
        this.archivoNombre = archivoNombre;
    }

    // Método para escribir el contenido en el archivo
    public void escribirEnArchivo(String contenido) {
        try {
            // Se crea un BufferedWriter para escribir en el archivo
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivoNombre));
            writer.write(contenido); // Se escribe el contenido en el archivo
            writer.close(); // Se cierra el BufferedWriter
            System.out.println("Contenido escrito en el archivo: " + archivoNombre);
        } catch (IOException e) {
            e.printStackTrace(); // En caso de error, se imprime la excepción
        }
    }

    public static void main(String[] args) {
        // Uso del constructor para crear una instancia de Escribir2
        Escribir2 escritor = new Escribir2("archivo.txt");
        
        // Llamada al método para escribir en el archivo
        escritor.escribirEnArchivo("Hola mundo");
    }
}

