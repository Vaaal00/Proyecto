package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Usuario implements Serializable{
    
    private int id;
    private String nombre;
    private String rol;
    private LocalDate cumple;
    private String email;
    private String contrasena;
    // telefono y edad
    
    public Usuario() {
    }
    
    public Usuario(String nombre,  String rol, LocalDate cumple, String email, String contrasena, int id) {
        this.cumple = cumple;
        this.nombre = nombre;   
        this.rol = rol;
        this.email = email;
        this.contrasena = contrasena;
        this.id = id;
       
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getCumple() {
        return cumple;
    }

    public void setCumple(LocalDate cumple) {
        this.cumple = cumple;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

  

    

   
    
    public int getEdad (LocalDate cumple){
        Period edad = Period.between(cumple, LocalDate.now());
        return edad.getYears();
    }
    
}
