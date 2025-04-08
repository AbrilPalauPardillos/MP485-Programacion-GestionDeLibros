/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioninventario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author usuario
 */
public class FileManager {

    public static File directorio;
    public static File archivo;
    ArrayList<Libro> libros = new ArrayList<>();

    public static void startFilesManager() {

        // RUTAS
        String rutaProyecto = System.getProperty("user.dir");
        String separador = File.separator;
        String rutaCarpeta = rutaProyecto + separador + "Gestion_Inventario";

        // CREACION DE LA CARPETA
        directorio = new File(rutaCarpeta);
        if (!directorio.exists()) {
            directorio.mkdir();
        }

        // CREACION DEL ARCHIVO
        archivo = new File(rutaCarpeta + separador + "Inventario_Libros.txt");
        try {
            archivo.createNewFile();
        } catch (IOException ex) {
            System.err.println("No se ha podido crear el archivo.");
        }
    }

    
    public static void readFile() throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);

        String linea = br.readLine(); //leemos los datos

        br.close();
    }

    public static void writeFile(String titulo,ArrayList<String>autores,double precio,String ISBN,int cantidadEnInventario) throws IOException {
        FileWriter fw = new FileWriter(archivo); //Stream conectado al fichero a escribir.
        BufferedWriter bw = new BufferedWriter(fw); //Buffer que almacena datos hacia el stream
        bw.write(titulo + " ; " + autores + " ; " + precio + " ; " + ISBN + " ; " + cantidadEnInventario); //guarda los datos en el buffer
        bw.flush(); //envia los datos que queden al buffer
        bw.close();
    }
}