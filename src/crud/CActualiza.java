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
public class CActualiza {

    private final CConsultas cnslt = new CConsultas();
    private String consulta;

    public ArrayList<String[]> busca_objetos_model() throws SQLException {
        consulta = "SELECT * FROM persona WHERE 1";
        return cnslt.buscar_objetos(consulta);
    }

    public boolean actualiza_objeto_model(int id, String nombre, String paterno, String materno, String rfc, String correo, int civil, int direccion, int nacionalidad) throws SQLException {
        consulta = "UPDATE persona SET nombre='" + nombre + "', "
                + " apellido_paterno = '" + paterno + "', "
                + " apellido_materno = '" + materno + "', "
                + " rfc = '" + rfc + "' ,"
                + " correo = '" + correo + "', "
                + " id_civil = " + civil + " ,"
                + " id_direccion = " + direccion + " ,"
                + " id_nacionalidad = " + nacionalidad + " ,"
                + "WHERE persona.id_persona= " + id;
        return cnslt.actualiza_objeto(consulta);
    }

    public ArrayList<String[]> carga_tipo_pasajero() throws SQLException {
        consulta = "select civil.id_civil, civil.estadoCivil from civil ";
        return cnslt.buscar_civil(consulta);

    }

    public ArrayList<String[]> carga_tipo_direccion() throws SQLException {
        consulta = "select direccion.id_direccion, direccion.codigo_postal from direccion ";
        return cnslt.buscar_direccion(consulta);

    }

    public ArrayList<String[]> carga_tipo_nacionalidad() throws SQLException {
        consulta = "select nacionalidad.id_nacionalidad, nacionalidad.nacionalidad from nacionalidad ";
        return cnslt.buscar_nacionalidad(consulta);

    }

}
