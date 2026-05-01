/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo3;

/**
 *
 * @author USUARIO
 */
public class Asistente {
    private String tipo_documento;
    private String numero_documento;
    private String apellido_paterno;
    private String apellido_materno;
    private String nombre;
    private String celular;
    private String correo;
    private int edad;
    private String categoria;

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        if (tipo_documento.equals("DNI") || tipo_documento.equals("CARNET DE ESTRANJERIA")){
            this.tipo_documento = tipo_documento;
        }else{
            System.out.println("El tipo de docuemnto no es correcto");
        } 
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        if(tipo_documento.equals("DNI"))
            if(numero_documento.length()==8){
                this.numero_documento = numero_documento;
            }else{
                System.out.println("El numero de documento debe ser de 8 digitos");
            }else if(tipo_documento.equals("CARNET DE ESTRANJERIA"))
                if(numero_documento.length()==9){
                    this.numero_documento = numero_documento;
                }else{
                    System.out.println("El numero de documento de estranjeria debe ser de 9 digitos");
                }
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>0 && edad <= 100){
            this.edad = edad;
        }else {
            System.out.println("La edad ingresada es incorrecta");
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void verDatos(){
        System.out.println("Asistente => TIPODOC: "+this.tipo_documento+
                " NUMDOC: "+this.numero_documento+" NOMBRE: "+this.nombre+
                " APELLIDO PATERNO: "+this.apellido_paterno+" APELLIDO MATERNO: "+
                this.apellido_materno+" CELULAR: "+this.celular+" CORREO: "+this.correo+
                " EDAD: "+this.edad+" CATEGORIA: "+this.categoria);
    }
    
    public void categorizar(){
        if (this.edad >= 0 && this.edad <= 10){
            this.categoria = "Nino";
        }else if(this.edad >= 11 && this.edad <= 17){
            this.categoria = "Adolescente";
        }else if (this.edad >= 18){
            this.categoria = "Adulto";
        }
    }
    
}
