package com.utpltec.ejercicioclases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Usuario
 */
public class Jugadores {
    //atributos de la clase

    private String Nombre;
    private String Apellido;
    private int Edad;

    //Constructores 
    public Jugadores(String cecilia, String rubio) {
    }

    public Jugadores(String Nombre, String Apellido, int Edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
    }
//Métodos

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void identificacióndeljugador() {
        System.out.println("Me llamo: " + this.Nombre + this.Apellido);
    }

    //Colecciones    
    //LISTAR, AGREGAR Y ELIMINAR    
    public static void main(String[] args) {
        Arraylist<Jugadores> Coleccionjugadores = new Arraylist<>();

        Jugadores Jugador1 = new Jugadores("Cecilia", "Rubio");

        Coleccionjugadores.add(Jugador1);

        for (int i = 0; 1 < Coleccionjugadores.size(); i++) {
            Jugadores jugador = Coleccionjugadores.get(i);
            jugador.identificacióndeljugador ();
        }
        int elecciónjugadores = 0;
        while (elecciónjugadores != 4){
            System.out.println("Bienvenido");
            System.out.println("Estas son las opciones que puedes realizar");
            System.out.println("1: Inscribirme");
            System.out.println("2: Ver jugadores disponibles");
            System.out.println("3: Elegir un equipo");
            System.out.println("4: Salir");
            
            //Uso de Scanner
            Scanner scan = new Scanner (System.in);
            elecciónjugadores = scan.nextInt ();
            //bucle 
            if (elecciónjugadores == 1){
                 System.out.println ("Su inscripción está completa");
            }
             if (elecciónjugadores == 2){
                 System.out.println ("Esta es la lista de jugadores disponibles");
                 
            } if (elecciónjugadores == 3){
                 System.out.println ("Posibles equipos a escoger");
            }
              if (elecciónjugadores == 4){
                 System.out.println ("Gracias, vuelva pronto");
            }
              //ELIMINAR
              int eliminarjugadores = 0;
            while (eliminarjugadores!= 4){
            System.out.println("Bienvenido");
            System.out.println("¿Qué jugador quiere eliminar");
            System.out.println("1: Hombre  ");
            System.out.println("2: Mujer ");
            System.out.println("3: Ninguno" + "Salir");
      
            Scanner scan = new Scanner (System.in);
            eliminarjugadores = scan.nextInt ();
            //bucle 
            if (eliminarjugadores == 1){
                 System.out.println ("Un jugador hombre ha sido eliminado");
            }
             if (eliminarjugadores == 2){
                 System.out.println ("Una jugadora mujer ha sido eliminada");
                 
            } if (eliminarjugadores == 3){
                 System.out.println ("Gracias, vuelva pronto");
        }
        }
        }
    }
}
