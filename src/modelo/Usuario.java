package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

public class Usuario implements Serializable{
    
    private int id;
    private String nombre;
    private String rol;
    private LocalDate fechaNacimiento;
    private String email;
    private String contrasena;
    private int telefono;
    
    
    public Usuario() {
    }
    
    public Usuario(String nombre,  String rol, LocalDate cumple, String email, String contrasena, int id, int telefono) {
        this.cumple = cumple;
        this.nombre = nombre;   
        this.rol = rol;
        this.email = email;
        this.contrasena = contrasena;
        this.id = id;
        this.telefono = telefono;        
    }

    

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

  
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getEdad() {
         LocalDate hoy = LocalDate.now();
             edad = Period.between(fechaNacimiento, hoy).getYears();
             return edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
}
