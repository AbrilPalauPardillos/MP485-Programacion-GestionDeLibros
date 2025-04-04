/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestioninventario;

import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class GestionInventario {
    
    HashMap <String, Libro> InventarioLibros = new HashMap <>(); // En el string se le pondra el ISBN

            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Inicializar el gestor de archivos
        FileManager.startFilesManager();
        
        // TAN PUNTO DE AL PLAY --> SE ABRA LA INTERFAZ DE MENU
        Menu menu = new Menu();
        menu.setVisible(true);
        
    }
    
}
