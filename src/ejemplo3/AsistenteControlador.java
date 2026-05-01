/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo3;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class AsistenteControlador {
    ArrayList <Asistente> lista_asistente = new ArrayList ();
    
    public void agregar_asistente(Asistente asis){
        lista_asistente.add(asis);
    }
    
    public void lista_asistentes(){
        System.out.println("La lista de asitente es: ");
        for(Asistente asistente : lista_asistente){
            asistente.categorizar();
            asistente.verDatos();
        }
    }
}
