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
    
    public String busca_objeto_model(String curp) throws SQLException {
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
    public String buscaCuentaPorContraseña(String contraseña) throws SQLException {
    consulta = "SELECT id_cuenta FROM cuenta WHERE contraseña = '" + contraseña + "';";  
    return cnslt.buscarValor(consulta);
}
      public String buscaPersonaPorRfc(String rfc) throws SQLException {
    consulta = "SELECT id_persona FROM persona WHERE rfc = '" + rfc + "';";  
    return cnslt.buscarValor(consulta);
}
public String buscaPersonaPorCorreo(String correo) throws SQLException {
    consulta = "SELECT id_persona FROM persona WHERE correo = '" + correo + "';";  
    return cnslt.buscarValor(consulta);
}

public String buscaTelefonoPorNumero(String numero) throws SQLException {
    consulta = "SELECT id_telefono FROM telefono WHERE numero = '" + numero + "';";  
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
   
     
      
      public int obtenerUltimoId() throws SQLException {//NO LA USE
    consulta = "SELECT LAST_INSERT_ID();";  // Esto obtiene el último id insertado de la sesión.
    return Integer.parseInt(cnslt.buscarValor(consulta));  // Devuelve el último id insertado.
}
      
     public int buscaTipoCuenta(String tipoCuenta) throws SQLException {
    consulta = "SELECT id_tipo_cuenta \n" +
    "FROM tipo_cuenta \n" +
    "WHERE tipo_cuenta =  '" + tipoCuenta + "';";    
    return Integer.parseInt(cnslt.buscarValor(consulta));  // Devuelve el último id insertado.
}
     
     
     
       public int ultimoIdDireccion() throws SQLException {
    consulta = "SELECT MAX(id_direccion) \n" +
               "FROM direccion;";  // Esto obtiene el último id insertado de la sesión.
    return Integer.parseInt(cnslt.buscarValor(consulta));  // Devuelve el último id insertado.
}
       
          public int ultimoIdPersona() throws SQLException {
    consulta = "SELECT MAX(id_persona)  \n" +
               "FROM persona;";  // Esto obtiene el último id insertado de la sesión.
    return Integer.parseInt(cnslt.buscarValor(consulta));  // Devuelve el último id insertado.
}
    
    
    
}
