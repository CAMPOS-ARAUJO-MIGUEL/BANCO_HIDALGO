
package crud;

import java.sql.SQLException;
public class CInserta {
    
    private final CConsultas cnslt = new CConsultas();
    private String consulta;

  
    
    
    
    public boolean insertaDireccion(String codigo_postal, String colonia, String num_interior, String num_exterior, String calle, int id_estado) throws SQLException {
    consulta = "INSERT INTO direccion (codigo_postal, colonia, num_interior, num_exterior, calle, id_estado) " +
               "VALUES ('" + codigo_postal + "', '" + colonia + "', '" + num_interior + "', '" + num_exterior + "', '" + calle + "', " + id_estado + ");";
    return cnslt.inserta(consulta);
}
     
    public boolean insertaPersona(String nombre, String apellido_paterno, String apellido_materno, String rfc, String correo, int id_civil,int  id_direccion,int id_nacionalidad) throws SQLException {
    consulta = "INSERT INTO persona (nombre, apellido_paterno, apellido_materno, rfc, correo, id_civil, id_direccion, id_nacionalidad) \n" +
                "VALUES ('" + nombre + "','" + apellido_paterno+ "','" + apellido_materno + "', '" + rfc + "', '" + correo + "','" + id_civil + "','" + id_direccion + "" + id_nacionalidad + ");";
    return cnslt.inserta(consulta);
}
    
    public boolean insertaTelefono(String numero, int id_persona) throws SQLException {
    consulta = "INSERT INTO telefono (numero, id_persona) " +
               "VALUES ('" + numero + "', " + id_persona + ");";
    return cnslt.inserta(consulta);
}
    public boolean insertaCuenta(String curp, String contraseña, int id_persona, int id_tipo_cuenta) throws SQLException {
    consulta = "INSERT INTO cuenta (curp, contraseña, id_persona, id_tipo_cuenta) " +
               "VALUES ('" + curp + "', '" + contraseña + "', " + id_persona + ", " + id_tipo_cuenta + ");";
    return cnslt.inserta(consulta);
}
    
    public boolean insertaPrestamo(int salario, int gastos, int cantidad_prestamo, int plazo, int id_cuenta) throws SQLException {
    consulta = "INSERT INTO prestamo (salario, gastos, cantidad_prestamo, plazo, id_cuenta) " +
               "VALUES (" + salario + ", " + gastos + ", " + cantidad_prestamo + ", " + plazo + ", " + id_cuenta + ");";
    return cnslt.inserta(consulta);
}
    
    public boolean insertaBuro(int id_cuenta) throws SQLException {
    consulta = "INSERT INTO buro (id_cuenta) VALUES (" + id_cuenta + ");";
    return cnslt.inserta(consulta);
}

    
 



    
}
