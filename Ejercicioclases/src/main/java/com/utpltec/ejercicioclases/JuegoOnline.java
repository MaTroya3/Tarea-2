/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpltec.ejercicioclases;

/**
 *
 * @author Usuario
 */
public class JuegoOnline {
      //atributos de la clase
    public String   Nombre1;
    public String Plataforma;
    public int Almacenamiento;
    
    //Constructores 
    public JuegoOnline(){
    }
    public JuegoOnline(String Nombre1, String Plataforma, int Almacenamiento){
        this.Nombre1 = Nombre1;
        this.Plataforma = Plataforma;
        this.Almacenamiento= Almacenamiento;
  
}
 //métodos
    public String getNombre1() {
        return Nombre1;
    }

    public void setNombre1(String Nombre1) {
        this.Nombre1 = Nombre1;
        System.out.println ("¿Cuál es su nombre?");
    }

    public String getPlataforma() {
        return Plataforma;
    }

    public void setPlataforma(String Plataforma) {
        this.Plataforma = Plataforma;
    }

    public int getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setAlmacenamiento(int Almacenamiento) {
        this.Almacenamiento = Almacenamiento;
     
    public void identificaciondeljuego(){ 
        System.out.println("Este juego es" + this.Nombre1 );
    }
        //Colecciones        
        public static void main(String[] args) {
        Arraylist<Juegos> Coleccionjuegosonline = new Arraylist<>();

        Juegos JuegoOnline1 = new Juegos("FreeFire");

        Coleccionjuegosonline.add(JuegoOnline1);

        for (int i = 0; 1 < Coleccionjuegosonline.size(); i++) {
            Juegos juego1 = Coleccionjuegosonline.get(i);
            juego1.identificaciondeljuego ();
        }
    }

}