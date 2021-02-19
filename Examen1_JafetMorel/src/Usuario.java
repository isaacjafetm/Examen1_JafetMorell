
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 24661
 */
public class Usuario {
    private int codigo;
    private String nombre, apellido;
    private int edad;
    private ArrayList<Libros> librosprestados;
    private boolean admin;
    
    public Usuario() {
    }

    public Usuario(int codigo, String nombre, String apellido, int edad, ArrayList<Libros> librosprestados, boolean admin) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.librosprestados = librosprestados;
        this.admin= admin;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Libros> getLibrosprestados() {
        return librosprestados;
    }

    public void setLibrosprestados(ArrayList<Libros> librosprestados) {
        if(librosprestados.size()<5){
            this.librosprestados = librosprestados;
        }
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    

    @Override
    public String toString() {
        return "Usuario{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", librosprestados=" + librosprestados + '}';
    }
    
    
}
