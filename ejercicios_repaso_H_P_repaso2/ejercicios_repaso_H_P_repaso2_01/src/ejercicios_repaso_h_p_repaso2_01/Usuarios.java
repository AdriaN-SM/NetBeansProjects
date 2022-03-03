/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_repaso_h_p_repaso2_01;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Usuarios {
    
    int mensajes;
    String correo;
    String nick;
    Scanner in = new Scanner(System.in);
    
    //Constructor
    public Usuarios(String correo, String nick) {
        this.mensajes = 0;
        this.correo = correo;
        this.nick = nick;
    }

    //Getter y Setter
    public int getMensajes() {
        return mensajes;
    }

    public void setMensajes(int mensajes) {
        this.mensajes = mensajes;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
    
    //Métodos
    public void incrementa() {
        setMensajes(getMensajes()+1);
    }
    
    public void decrementa() {
        setMensajes(getMensajes()-1);
    }
    
    public void modificaCorreo() {
        System.out.print("Introduce el nuevo correo:");
        String mail = in.nextLine();
        setCorreo(mail);
    }
    
}
