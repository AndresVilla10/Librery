/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librerias1;

/**
 *
 * @author Andres Villamil
 */
import java.io.File;
import java.io.IOException;

public class Mover6 {
    // Declara una variable miembro para representar un archivo.
    private File archivo;

    // Constructor que toma la ruta del archivo a mover como parámetro.
    public Mover6(String filePath) {
        archivo = new File(filePath); // Crea un objeto File con la ruta proporcionada.
    }

    // Método para mover el archivo a la ubicación de destino especificada.
    public boolean moverArchivo(String destinoPath) {
        try {
            File destino = new File(destinoPath); // Crea un objeto File para la ubicación de destino.
            if (archivo.exists()) { // Verifica si el archivo original existe.
                if (archivo.renameTo(destino)) { // Intenta mover el archivo a la ubicación de destino.
                    System.out.println("Archivo movido exitosamente."); // Imprime un mensaje de éxito.
                    return true; // Devuelve verdadero para indicar que la operación tuvo éxito.
                } else {
                    System.out.println("No se pudo mover el archivo."); // Imprime un mensaje de error si no se pudo mover.
                }
            } else {
                System.out.println("El archivo no existe en la ubicación actual."); // Imprime un mensaje si el archivo original no existe.
            }
        } catch (SecurityException e) {
            e.printStackTrace(); // Maneja excepciones de seguridad imprimiendo la traza en caso de error.
        }
        return false; // Devuelve falso si la operación no tuvo éxito.
    }

    // Método principal para probar la funcionalidad de la clase.
    public static void main(String[] args) {
        String origenPath = "ruta_del_archivo_a_mover.txt"; // Ruta del archivo de origen.
        String destinoPath = "ruta_del_destino.txt"; // Ruta del archivo de destino.

        Mover6 mover = new Mover6(origenPath); // Crea una instancia de la clase Mover con la ruta de origen.
        mover.moverArchivo(destinoPath); // Llama al método moverArchivo para intentar mover el archivo.
    }
}
