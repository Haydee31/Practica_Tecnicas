/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo3;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        AsistenteControlador controla = new AsistenteControlador ();
        String rpta = "si";
        
        while(rpta.equals("si"))
        {
            Asistente a = new Asistente();
            while(a.getTipo_documento()== null)
            {
                System.out.println("Ingrese el tipo de documento: ");
                a.setTipo_documento(sc.nextLine());
            }
            while(a.getNumero_documento()==null)
            {
                System.out.println("Ingrese el numero de documento: ");
                a.setNumero_documento(sc.nextLine());
            }
            System.out.println("Ingrese el Apellido Paterno: ");
            a.setApellido_paterno(sc.nextLine());
            System.out.println("Ingrese el Apellido Materno: ");
            a.setApellido_materno(sc.nextLine());
            System.out.println("Ingrese el Nombre: ");
            a.setNombre(sc.nextLine());
            System.out.println("Ingrese el Celular: ");
            a.setCelular(sc.nextLine());
            System.out.println("Ingrese el Correo Electronico: ");
            a.setCorreo(sc.nextLine());
            while(a.getEdad()==0)
            {
                System.out.println("Ingrese la edad: ");
                a.setEdad(sc.nextInt());
            }
            sc.nextLine();
            controla.agregar_asistente(a);
            System.out.println("Desea agregar a otro asitente: si/no:  ");
            rpta=sc.nextLine();
        }
        controla.lista_asistentes();
    }
}
