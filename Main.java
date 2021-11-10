
package com.mycompany.practobligatoriajava;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner sc_nombre= new Scanner(System.in);
        Scanner sc_apellido= new Scanner(System.in);
        Scanner sc_edad= new Scanner(System.in);
        Scanner sc_hobbie= new Scanner(System.in);
        Scanner sc_codigo= new Scanner(System.in);
        Scanner sc_sistema= new Scanner(System.in);
        
        String nombre;
        String apellido;
        int edad;
        String hobbie;
        String codigo;
        String sistema; 
        
        System.out.println("---------------------------------------------------");
        System.out.println("Bienvenido al Sistema");
        System.out.println("---------------------------------------------------");
        System.out.println("Ingrese su nombre:");
        nombre=sc_nombre.nextLine();
        System.out.println("Ingrese su apellido:");
        apellido=sc_apellido.nextLine();
        System.out.println("Ingrese su edad:");
        edad=sc_edad.nextInt();
        System.out.println("Ingrese su hobbie:");
        hobbie=sc_hobbie.nextLine();
        System.out.println("Ingrese su editor de código preferido:");
        codigo=sc_codigo.nextLine();
        System.out.println("Ingrese su sistema operativo:");
        sistema=sc_sistema.nextLine();
        System.out.println("***************************************************");
        System.out.println (nombre+" "+apellido+" tiene "+edad+ " años.");
        System.out.println ("Su hobbie es "+ hobbie +".");
        System.out.println ("Su editor de código preferido es "+codigo + " y "); 
        System.out.println("usa "+sistema + " como Sistema Operativo.");
        System.out.println("***************************************************");
       
        
}
}
