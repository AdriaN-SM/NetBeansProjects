/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_repaso_h_p_repaso2_02;

/**
 *
 * @author adria
 */
public abstract class Empleado {
    
    int salario;
    String nombre;
    String apellido;
    int edad;
    final int SALARIO_DEFECTO = 600;

    //Constructor por defecto
    public Empleado() {
        this.salario = SALARIO_DEFECTO;
    }

    //Constructor con todos los atributos
    public Empleado(int salario, String nombre, String apellido, int edad) {
        this.salario = salario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    //Getter y Setter
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
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
    
    //Método abstracto
    public abstract boolean plus(double sueldoPlus);

    //Sobrecarga del método toString()
    @Override
    public String toString() {
        return "Empleado{" + "salario=" + salario + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    
    //Sobrecarga del método equals()
    public boolean equals(Empleado e) {
        if (this.getSalario() == e.getSalario()) {
            if (this.getNombre().equals(e.getNombre())) {
                if (this.getApellido().equals(e.getApellido())) {
                    if (this.getEdad() == e.getEdad()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    
    
}
