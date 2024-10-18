/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labp2_joanahernandez;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author joana
 */
public class LabP2_JoanaHernandez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        //Pedrile al usuario que ingrese un numero de las opciones disponibles
        System.out.println("Menu de opciones");
        System.out.println("1-Numeros comunes en mutiplicacion");
        System.out.println("2-Juego de suerte");
        System.out.println("3-Llenar el trapecio");
        System.out.println("Salida");
        System.out.println("Elija una opcion: ");
        int respuesta = scanner.nextInt();
        
        //Validacion de opciones
        //opcion 1
        if (respuesta == 1) {
           System.out.println("");
           System.out.println("Ingrese numero de la primera tabla: ");
           int numero1 = scanner.nextInt();
           System.out.println("Ingrese numero de la segund tabla: ");
           int numero2 = scanner.nextInt();
           
           boolean bandera = false;
           
               int i = 1;
               while (i <= 12) {
                   int tabla1 = numero1 * i;
                   int j =1;
                   
                   while (j <=12){
                       int tabla2 = numero2 * j;
                  
                       if (tabla1==tabla2) {
                           System.out.println(tabla1 + " ");
                           bandera = true;
                      }    
                       j++;
                }
                   i++;
                   if (bandera = false){
                       System.out.print(" __ ");
                   }
                   bandera = false;
                   
            } 
        } else if (respuesta == 2){
            int u = 0;
            int o = 4;
            
            int jugador = 0;
            int computadora = 0;
            
            while (u != 4) {
            Random ran = new Random();
            int ran1 = ran.nextInt(10) + 1;
            int ran2 = ran.nextInt(10) + 1;
            
            jugador = jugador + ran1;
            computadora = computadora + ran2;
            
            System.out.println("Puntos de jugador: " + jugador);
            System.out.println("Puntos de maquina: " + computadora);
            System.out.println("------------------------------------------");
            
            int menu = 0;
            System.out.println("Que desea hacer? ");
            System.out.println("1) Agregar 1");
            System.out.println("2) Agregar 2");
            System.out.println("3) seguir");
            System.out.println("4) terminar");
            menu = scanner.nextInt();
            
                while (u !=0) {
                 if (menu ==1) {
                    jugador = jugador + 1;
                    computadora = computadora + 2;
                 } 
                 if (menu==2) {
                     jugador = jugador + 2;
                     computadora = computadora + 2;
                    } 
                 if (menu==3) {
                    break;
                  } 
                 if (menu==4) {
                     break;
                    }
                    u++;
                }
             }
                 System.out.println("Jugador: "+ jugador); 
                 System.out.println("Computadora: "+ computadora);  
                 if (jugador > 20 && computadora <=20) {
                     System.out.println("Computadora gana");
                 } else {
                    System.out.println("Jugador gana");
                 }
    } else if (respuesta ==3) {
         int i = 1;
           while (i <= 12) {
            int j = 1;
            while (j <= i) {
                System.out.print("*"); 
                j++;
            }
            System.out.println(); 
            i++;
        }     
     } else {
        System.out.println("Numero invalido");
    }
   }
}