/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.util.ArrayList;
import java.sql.SQLException;
/**
 *
 * @author HP
 */
public class CElimina {
       private String consulta;
       private final CConsultas cons = new CConsultas();
        
        // Método para buscar todos los registros de persona
        public ArrayList<String[]> buscaPrestamo() throws SQLException {
        consulta = "SELECT * FROM prestamo WHERE 1";
        return cons.buscar(consulta);
    }

       

    // Método para eliminar un registro de persona
        public boolean eliminaPrestamo(int idPrestamo) throws SQLException {
        consulta = "DELETE FROM prestamo WHERE id_prestamo = " + idPrestamo;
        return cons.elimina(consulta);
    }
        
        
   


}
