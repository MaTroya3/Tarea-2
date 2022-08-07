package com.utpltec.ejercicioclases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Puntaje {
 
    //atributos de la clase
    public String NombresJugadores;
    public int NúmeroParticipantes;
    public int Marcador;
    
    //Constructores 
    public Puntaje(String su_puntaje_es){
    }
    public Puntaje(String NombresJugadores, int NúmeroParticipantes, int Marcador){
        this.NombresJugadores = NombresJugadores;
        this.NúmeroParticipantes = NúmeroParticipantes;
        this.Marcador= Marcador;
    }

    public String getNombresJugadores() {
        return NombresJugadores;
    }

    public void setNombresJugadores(String NombresJugadores) {
        this.NombresJugadores = NombresJugadores;
    }

    public int getNúmeroParticipantes() {
        return NúmeroParticipantes;
    }

    public void setNúmeroParticipantes(int NúmeroParticipantes) {
        this.NúmeroParticipantes = NúmeroParticipantes;
    }

    public int getMarcador() {
        return Marcador;
    }

    public void setMarcador(int Marcador) {
        this.Marcador = Marcador;
    }
      public void puntajeasignado(){ 
        System.out.println("El puntaje asignado es" + this.Marcador );
    }
        //Colecciones        
        public static void main(String[] args) {
        Arraylist<Puntaje> ColeccionPuntajesAsignados = new Arraylist<>();

        Puntaje Puntaje1 = new Puntaje("Su puntaje es");

        ColeccionPuntajesAsignados.add(Puntaje1);

        for (int i = 0; 1 < ColeccionPuntajesAsignados.size(); i++) {
            Puntaje puntaje = ColeccionPuntajesAsignados.get(i);
            puntaje.puntajeasignado ();
        }
    }
}
