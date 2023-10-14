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

public class Mover5 {
    
    // Estas son variables de instancia para almacenar las rutas de los archivos de origen y destino
    private Path archivoOrigen;
    private Path archivoDestino;

    // Constructor que toma las rutas de los archivos de origen y destino como argumentos
    public Mover5(Path archivoOrigen, Path archivoDestino) {
        this.archivoOrigen = archivoOrigen;
        this.archivoDestino = archivoDestino;
    }

    // Método para mover el archivo de origen al destino
    public void moverArchivo() throws IOException {
        Files.copy(archivoOrigen, archivoDestino);
    }

    public static void main(String[] args) {
        try {
            // Define las rutas de los archivos de origen y destino como objetos 'Path'
            Path archivoOrigen = Paths.get("ruta_del_archivo_origen");
            Path archivoDestino = Paths.get("ruta_del_archivo_destino");

            // Crea una instancia de la clase 'Mover' y llama al método 'moverArchivo' para realizar la operación de copia
            Mover5 mover = new Mover5(archivoOrigen, archivoDestino);
            mover.moverArchivo();
        } catch (IOException e) {
            // Captura cualquier excepción de tipo 'IOException' que pueda ocurrir durante la operación de copia y muestra información sobre el error
            e.printStackTrace();
        }
    }
}
