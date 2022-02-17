/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package romanos;

import java.util.Scanner;

public class Romanos{

    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese ROMANO: ");
        String romano = leer.nextLine();
        char Rom[]= {' ','I','V','X','L','C','D','M'}; //GUARDAN LETRAS A COMPARAR
        int valor[] = {0,1,5,10,50,100,500,1000};//SE LE DA VALOR A LA LETRAS
        int ant = 0;
        int suma = 0;
        char letra = ' ';
        for(int i = 0; i < romano.length(); i++){//RECORRER TODA LA FRASE(numero romano)
            letra = romano.charAt(i);
            for(int j = 0; j < Rom.length; j++){//RECORRE ARREGLO ROM
                if(letra == Rom[j]){//si letra recorrida = a letra contenida en rom                 
                    suma = suma + valor [j]; //sumar el valor de la letra
                    if( ant < valor[j]){ //si el valor de letra anterior menor a valor letra   //actual
                        suma = suma - ant*2 ; // restale el doble del menor de los dos
                        ant = valor[j]; // valor anterior = valor letra actual
                    }else {//si no se cumple lo anterior  
                        ant = valor[j];//el dato actual se guarda en anterior
                    }
                }              
            }
        }
        System.out.print(suma);    
    }
}