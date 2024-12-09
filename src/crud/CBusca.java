/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.sql.SQLException;


public class CBusca {
    
    private final CConsultas cnslt = new CConsultas();
    private String consulta;
    
    
   
    
     public String buscaCuenta(String curp, String contraseña) throws SQLException {
    consulta = "SELECT id_cuenta " +
               "FROM cuenta " +
               "WHERE curp = '" + curp + "' " +
               "AND contraseña = '" + contraseña + "';";
    return cnslt.buscarValor(consulta);
}
    
    
}
