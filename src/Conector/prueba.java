/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Conector;
import crud.CCargaBox;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class prueba {
    
     public static void main(String[] args) {
     CConector conecta=new CConector();
     conecta.conectar();
     
     CCargaBox box =new CCargaBox();
     ArrayList<String> datosListas = new ArrayList<>();
     try {
            // Cargar datos en la lista
            datosListas = box.cargaComboNacionalidad();
            
            // Imprimir los resultados en consola
            System.out.println("Datos de nacionalidad:");
            for (String nacionalidad : datosListas) {
                System.out.println(nacionalidad);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
     
    }
     
}
