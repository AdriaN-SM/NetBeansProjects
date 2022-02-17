/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propiedadescadena;

/**
 *
 * @author adria
 */
public class PropiedadesCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int t;
        String num ="0123456789", trozo;
        String let ="abcdefghijklmnop";
        char letra;
        //escritura acumulada
        System.out.println("Escritura acumulada");
        for (t=0;t<=num.length();t++) {
            trozo=num.substring(0, t);
            System.out.println("este es el trozo obtenido;"+trozo);
        }
        //deletreo o recorrido de un string caracter a caracter
        System.out.println("Deletreo o recorrido de un string caracter a caracter");
        for (t=0;t<num.length();t++) {
            trozo=num.substring(t, t+1);
            System.out.println("este es el trozo obtenido;"+trozo);
        }

        System.out.println("Reemplazo de caracteres en cadenas");
        let=let.replace('c','X');
        let=let.replace('d','X');
        let=let.replace('e','X');
        System.out.println("despues del remmeplzao de las equis>>>"+let);
        // si solo se ejecuta el método replace el contenido de let no cambia
        System.out.println("Si solo se ejecuta el método replace el contenido de let no cambia");
        let.replace('c','Z');
        let.replace('d','Z');
        let.replace('e','Z');
        System.out.println("despues del remmeplzao de las zetas>>>"+let);

        letra=num.charAt(6);
        t=letra;
        letra = (char)letra;

        System.out.println("la letras sexta ha sido " + letra + " nº ASCII " + t );
        let=String.valueOf(letra);
        // Alfabeto mayusculas
        for (letra=65;letra<=90;letra++)
        System.out.print(letra+"/");
        System.out.println();
        // Alfabeto minusculas
        for (letra=97;letra<=122;letra++)
        System.out.print(letra+"/");
        // numeros tratados como caracteres
        for (letra=48;letra<=57;letra++)
                System.out.print(letra+"/");
        System.out.println();

        //impresion de caracteres.
        for (letra='A';letra<='Z';letra++)
        System.out.print(letra+"/");
        System.out.println();
        // numeros tratados como caracteres
        for (letra='a';letra<='z';letra++)
                System.out.print(letra+"/");
        System.out.println();
        
    }
    
}
