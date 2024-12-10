/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.sql.SQLException;


public class CBusca {
    
    private final CConsultas cnslt = new CConsultas();
    private String consulta;
    
    
   
    
     public String buscaCuenta(String curp, String contraseña) throws SQLException {//no la use
    consulta = "SELECT id_cuenta " +
               "FROM cuenta " +
               "WHERE curp = '" + curp + "' " +
               "AND contraseña = '" + contraseña + "';";
    return cnslt.buscarValor(consulta);
}
     
    public String buscaCURP(String curp) throws SQLException {
    consulta = "SELECT id_cuenta FROM cuenta WHERE curp ='" + curp + "';";
    return cnslt.buscarValor(consulta);
}
    
      public String buscaContrasena(String contrasena) throws SQLException {//no la use
    consulta = "SELECT id_cuenta FROM cuenta WHERE curp ='" + contrasena + "';";
    return cnslt.buscarValor(consulta);
}
      
 
      public String buscaCURPcontrasena(String id_cuenta, String contrasena) throws SQLException {
    consulta = "SELECT curp FROM cuenta WHERE id_cuenta = '" + id_cuenta + "' AND contraseña = '" + contrasena + "';";   
    return cnslt.buscarValor(consulta);
}
      
    
    
}
