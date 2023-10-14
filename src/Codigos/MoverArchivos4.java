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
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MoverArchivos4 {
    private File archivo; // Representa el archivo que se moverá.
    private File destino; // Representa la ubicación de destino donde se moverá el archivo.

    public MoverArchivos4(String archivoPath, String destinoPath) {
        // Constructor que inicializa los objetos archivo y destino con las rutas especificadas.
        this.archivo = new File(archivoPath);
        this.destino = new File(destinoPath);
    }

    public void moverArchivo() {
        if (archivo.exists()) { // Verifica si el archivo de origen existe.
            if (!destino.exists()) { // Si la ubicación de destino no existe, se crea.
                destino.mkdirs();
            }
            File nuevoArchivo = new File(destino, archivo.getName()); // Crea una instancia para el nuevo archivo en el destino.

            try {
                Files.move(archivo.toPath(), nuevoArchivo.toPath()); // Mueve el archivo de origen al destino.
                System.out.println("Archivo movido con éxito a: " + nuevoArchivo.getAbsolutePath());
            } catch (IOException e) {
                System.err.println("Error al mover el archivo: " + e.getMessage()); // Manejo de excepciones en caso de error.
            }
        } else {
            System.err.println("El archivo no existe en la ubicación especificada.");
        }
    }

    public static void main(String[] args) {
        MoverArchivos4 mover = new MoverArchivos4("archivo.txt", "directorio/archivotxt"); // Crear una instancia del objeto MoverArchivos4.
        mover.moverArchivo(); // Llamar al método moverArchivo para realizar la operación de movimiento.
    }
}
