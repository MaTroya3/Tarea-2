/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana7;

import Clases.NuevoCliente;
import Clases.Direcciones;
import Clases.Proyecto;
import Logica.LogNuevoCliente;
import Logica.LogAntiguoCliente;
import Logica.LogProyecto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * NOMBRE: MARLYN TROYA 
 * GRUPO ACOSTA
 */
public class Semana7 {

        static Scanner sc = new Scanner(System.in);
    static String entrada;
    static NuevoCliente objNuevoCliente = new NuevoCliente();
    static AntiguoCliente objAntiguoCliente = new AntiguoCliente();
    static ArrayList<Direcciones> ArrayDirecciones = new ArrayList<>();
    static Proyecto objProyecto = new Proyecto();
    static LogProyecto objLogProyecto = new LogProyecto();
    static LogNuevoCliente objLogCliente = new LogNuevoCliente();

    // recuperar los paquetes en un array List
    static ArrayList<Proyecto> ArrayPaquetes = new ArrayList<>();
    // importar la clase ArrayList

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        int op = 0;
        do{
            System.out.println("QUE DESEA REALIZAR");
            System.out.println("CREAR NUEVO PROYECTO          <1>");
            System.out.println("SELECCIONAR NUEVO CLIENTE           <2>");
            System.out.println("SELECCIONAR ANTIGUO CLIENTE        <3>");
            System.out.println("SALIR                  <4>");
            op = Integer.parseInt(sc.nextLine());
            switch (op){
                case 1: CrearProyecto(objProyecto); break;
                case 2: Seleccionar NuevoCliente(objNuevoCliente); break;
                case 3: Seleccionar AntiguoCliente(objAntiguoCliente); break;
            }
        } while(op != 4);
    }

    private static void CrearProyecto(Proyecto objProyecto) throws ClassNotFoundException, SQLException {
        LogNuevoCliente objLogNuevoCliente = new LogNuevoCliente();
        objProyecto = new Proyecto();
        System.out.println("Ingrese el codigo del proyecto ");
        entrada = sc.nextLine();
        objProyecto.setCodigo(entrada);
        System.out.println("Ingrese descripcion del proyecto ");
        entrada = sc.nextLine();
        objProyecto.setDescripcion(entrada);
        System.out.println("Ingrese informacion del proyecto");
        entrada = sc.nextLine();
        objPaquete.setInformacion(entrada);
        System.out.println("Ingrese cedula cliente");
        entrada = sc.nextLine();
        objAntiguoCliente.setCedula(entrada);
        objAntiguoCliente = objLogAntiguoCliente.BuscarClienteCedula(objAntiguoCliente);
        if (objAntiguoCliente.getIdAntiguoClie() == 0)
            System.out.println("Cliente No existe: opcion seleccionar nuevo cliente");
        else{
            objProyecto.setNuevoCliente(objNuevoCliente);
            objProyecto.CrearEstados();
            LogProyecto.GrabarPaquete(objPaquete);
            System.out.println("Proyecto Creado ");
        }
    }


    private static void CrearCliente(NuevoCliente objNuevoCliente) throws ClassNotFoundException, SQLException {
        String cedula, nombres, mail, calle1, calle2, num;
        System.out.println("Ingrese cedula del cliente ");
        cedula = sc.nextLine();
        System.out.println("Ingrese nombres del cliente ");
        nombres = sc.nextLine();
        System.out.println("Ingrese mail del cliente ");
        mail = sc.nextLine();
        System.out.println("Ingrese calle1 cliente ");
        calle1 = sc.nextLine();
        System.out.println("Ingrese calle2 cliente ");
        calle2 = sc.nextLine();
        System.out.println("Ingrese num cliente ");
        num = sc.nextLine();
        objNuevoCliente = new NuevoCliente(0,cedula, nombres, mail,0, calle1, calle2, num);
        // llamar al metodo de la capa de Logica del cliente
        objLogNuevoCliente.GrabarCliente(objNuevoCliente);
    }

}