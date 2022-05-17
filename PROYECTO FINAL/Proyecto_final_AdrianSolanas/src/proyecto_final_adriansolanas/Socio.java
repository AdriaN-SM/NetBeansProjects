/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_adriansolanas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author adria
 */
public class Socio {
    
    private String dni;
    private String nombre;
    private String email;
    private String telefono;
    
    private boolean formatoNumeroCorrecto(String numero) {
        Pattern patron = Pattern.compile("9[0-9][0-9]-{[0-9]}\4");
        Matcher matcher = patron.matcher(numero);
        if (matcher.matches()) return true;
        
        return false;
    }

    public Socio(String dni, String nombre, String email, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        if (formatoNumeroCorrecto(telefono)) {
            this.telefono = telefono;
        }
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
