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
      
         public String buscaCuenta2(String curp) throws SQLException {
    consulta = "SELECT id_cuenta FROM cuenta WHERE curp = '" + curp + "';";  
    return cnslt.buscarValor(consulta);
}
      
         
             public String buscaEstado(String estado) throws SQLException {
    consulta = "SELECT id_estado \n" +
                "FROM estado \n" +
                "WHERE nombreEstado = '" + estado + "';";  
    return cnslt.buscarValor(consulta);
}
             
    public String buscaNacionalidad(String Nacionalidad) throws SQLException {
    consulta = "SELECT id_nacionalidad\n" +
    "FROM nacionalidad\n" +
    "WHERE nacionalidad = '" + Nacionalidad + "';";  
    return cnslt.buscarValor(consulta);
}
           
    public String buscaCivil(String estadoCivil) throws SQLException {
    consulta = "SELECT id_civil\n" +
    "FROM civil\n" +
    "WHERE estadoCivil = '" + estadoCivil + "';";    
    return cnslt.buscarValor(consulta);
}
   
     
      
      public int obtenerUltimoId() throws SQLException {
    consulta = "SELECT LAST_INSERT_ID();";  // Esto obtiene el último id insertado de la sesión.
    return Integer.parseInt(cnslt.buscarValor(consulta));  // Devuelve el último id insertado.
}
      
     public int buscaTipoCuenta(String tipoCuenta) throws SQLException {
    consulta = "SELECT id_tipo_cuenta \n" +
    "FROM tipo_cuenta \n" +
    "WHERE tipo_cuenta =  '" + tipoCuenta + "';";    
    return Integer.parseInt(cnslt.buscarValor(consulta));  // Devuelve el último id insertado.
}
    
    
}
