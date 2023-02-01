/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import BaseDatos.DBEstados;
import BaseDatos.DBProyecto;
import Clases.Proyecto;
import static Logica.LogNuevoCliente.objDBCliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * Marlyn Troya 
 * GRUPO ACOSTA
 */
public class LogProyecto {
    static DBPaquete objDBPaquete = new DBPaquete();
    static DBEstados objDBEstados = new DBEstados();
    public static void GrabarPaquete(Proyecto objPaquete) throws ClassNotFoundException, SQLException {
        // grabar paquete
        objDBPaquete.InsertarPaquete(objPaquete);
        // buscar el id del paquete
        BuscarIdPaq(objPaquete);
        // insertar el paquete con el id encontrado
        objDBEstados.InsertarEstadosPaquete(objPaquete);
    }

    public static void RecuperarPaquetes(ArrayList<Proyecto> ArrayPaquetes) 
            throws SQLException, ClassNotFoundException 
            {
        Proyecto objPaquete = new Proyecto();
        ResultSet rs = objDBPaquete.SelectPaquetes();
        while (rs.next()){ //recorrdio iterator para setear el paquete
                objPaquete = new Proyecto();
                objPaquete.setIdPaq(Integer.valueOf(rs.getString(1)));
                objPaquete.setCodigo(rs.getString(2));
                objPaquete.setDescripcion(rs.getString(3));
                objPaquete.setDimensiones(rs.getString(4));
                objPaquete.setPeso(rs.getInt(5));
                ArrayPaquetes.add(objPaquete);
        }
        rs.close();
    }

    private static void BuscarIdPaq(Proyecto objPaquete) throws SQLException, ClassNotFoundException {
        ResultSet rs = objDBPaquete.SelectPaqueteCodigo(objPaquete);
        while (rs.next()){
            objPaquete.setIdPaq(Integer.valueOf(rs.getString(1)));
        }
        //return objCliente;
    }
    
}
