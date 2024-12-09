/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class CCargaBox {
     private final CConsultas cnslt = new CConsultas();
    private String consulta;

      public ArrayList<String> cargaComboNacionalidad() throws SQLException {
        // Consulta SQL para obtener los valores de la tabla nacionalidad
        consulta = "SELECT nacionalidad.nacionalidad FROM nacionalidad;";
        
        // Obtenemos el resultado de la consulta usando el método buscarValoresCombos
        ArrayList<String> nacionalidades = cnslt.buscarValoresCombos(consulta);
        
        // Imprimir los resultados en consola
        System.out.println("Resultados de la consulta:");
        for (String nacionalidad : nacionalidades) {
            System.out.println(nacionalidad);  // Imprime cada nacionalidad en una nueva línea
        }
        
        return nacionalidades;
    }
}
