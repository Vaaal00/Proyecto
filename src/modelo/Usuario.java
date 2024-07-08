
package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;


public class Usuario implements Serializable {

    protected String rol;
    protected int id;
    protected String email;
    protected String contrasena;
    protected int telefono;
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected int edad;

    public Usuario() {
    }
    
    public Usuario(String rol, int id, String email, String contrasena, int telefono, String nombre, 
            LocalDate fechaNacimiento, int edad) {
        this.rol = rol;
        this.id = id;
        this.email = email;
        this.contrasena = contrasena;
        this.telefono = telefono;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        LocalDate hoy = LocalDate.now();
            edad = Period.between(fechaNacimiento, hoy).getYears();
            return edad;
    }

    
}
