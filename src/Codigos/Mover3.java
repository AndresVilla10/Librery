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
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Mover3 {

    public void crearArchivo(String nombreArchivo) {
        try {
            // Se crea un objeto 'Path' que representa el nombre del archivo que se va a crear.
            Path archivo = Paths.get(nombreArchivo);
            // Se crea un archivo con el nombre especificado.
            Files.createFile(archivo);
        } catch (IOException e) {
            // En caso de que se produzca una excepción de E/S (por ejemplo, si el archivo ya existe o no se puede crear),
            // se imprime la traza de la excepción.
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Se crea una instancia de la clase Mover3.
        Mover3 mover = new Mover3();
        // Se llama al método 'crearArchivo' para crear un archivo llamado "nuevo.txt".
        mover.crearArchivo("nuevo.txt");
    }
}
