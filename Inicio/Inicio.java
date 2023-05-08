/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inicio;
import clases.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author tahic
 */
public class Inicio {
    
    static ArrayList<Astros> astros = new ArrayList<>();
    static ArrayList<Planetas> planeta = new ArrayList<>();
     static ArrayList<Satelites> satelite = new ArrayList<>();
     
    public static void main(String []args){
    
    Planetas tierra = new Planetas("Tierra", 5.9724, 12756.2, 149.66, 24.32, 365.423,9.8, "Azul");
    Astros sol = new Astros("Sol",23.53543,12.2331, 10.3, 8.12, 15000.34,274.23);
    
    
    
    Menu();
    int opcion = 0;
    Scanner scan = new Scanner(System.in);
    opcion = scan.nextInt();
    do{
    
    switch(opcion){
        
        case 1: 
            ElegirNuevo();
            break;
          

    case 2: 
        for(Planetas planeta: planeta){
            System.out.println(planeta.getNombre());
            
        }
        
             break; 
    } 
    
    }while(opcion>0 && opcion<=3);
    
    }
    
      static void AgregarAstro(){
            
            Scanner scan = new Scanner(System.in);

            System.out.print("Dame el nombre del astro: ");
            
            String nombre = scan.nextLine();

            System.out.print("Masa del astro: ");
            
            double masa = scan.nextDouble();

            System.out.print("Diametro: ");
            
            double diametro = scan.nextDouble();

            System.out.print("Periodo de rotacion: ");
            
            double rotacion = scan.nextDouble();
            
            System.out.print("Periodo de Traslacion: ");
            
            double traslacion = scan.nextDouble();

            System.out.print("Distancia media desde la Tierra: ");
            
            double distancia = scan.nextDouble();
            
            System.out.print("Gravedad: ");
            
            double gravedad = scan.nextDouble();
                    
            astros.add(new Astros(nombre, masa, diametro, rotacion, traslacion,distancia,gravedad));
          
          }
      
      static void AgregarPlaneta(){
            
            Scanner scan = new Scanner(System.in);

            System.out.print("Dame el nombre del planeta: ");
            
            String nombre = scan.nextLine();

            System.out.print("Masa del planeta: ");
            
            double masa = scan.nextDouble();

            System.out.print("Diametro: ");
            
            double diametro = scan.nextDouble();

            System.out.print("Periodo de rotacion: ");
            
            double rotacion = scan.nextDouble();
            
            System.out.print("Periodo de Traslacion: ");
            
            double traslacion = scan.nextDouble();

            System.out.print("Distancia media desde la Tierra: ");
            
            double distancia = scan.nextDouble();
            
            System.out.print("Gravedad: ");
            
            double gravedad = scan.nextDouble();
            
            System.out.print("Color: ");
            
            String color = scan.nextLine();
                    
            planeta.add(new Planetas(nombre, masa, diametro, rotacion, traslacion,distancia,gravedad,color));
          
          }
      static void AgregarSatelite(){
            
            Scanner scan = new Scanner(System.in);

            System.out.print("Dame el nombre del satelite: ");
            
            String nombre = scan.nextLine();

            System.out.print("Masa del satelite: ");
            
            double masa = scan.nextDouble();

            System.out.print("Diametro: ");
            
            double diametro = scan.nextDouble();

            System.out.print("Periodo de rotacion: ");
            
            double rotacion = scan.nextDouble();
            
            System.out.print("Periodo de Traslacion: ");
            
            double traslacion = scan.nextDouble();

            System.out.print("Distancia media desde la Tierra: ");
            
            double distancia = scan.nextDouble();
            
            System.out.print("Gravedad: ");
            
            double gravedad = scan.nextDouble();
            
            System.out.print("Orbita alrededor de: ");
            
            String orbitaPlaneta = scan.nextLine();
                    
            satelite.add(new Satelites(nombre, masa, diametro, rotacion, traslacion,distancia,gravedad,orbitaPlaneta));
          
          }
      
      public static void Menu(){
          
          System.out.println("-----------------MENU-----------------");
          System.out.println("Escoja la operacion a realizar: ");
          System.out.println("1. Agregar Astro");
          System.out.println("2. Listar");
          System.out.println("Salir");
               
      
      
      }
      
      public static void ElegirNuevo(){
        int eleccion = 0;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Elija lo que desea agregar: ");
            System.out.println("1. Astro");
            System.out.println("2. Planeta");
            System.out.println("3. Satelite");
            System.out.println("Cualquier otro numero para salir.");
            
            eleccion = scan.nextInt();
       
            switch (eleccion) {
                case 1:
                    AgregarAstro();
                    break;
                case 2:
                    AgregarPlaneta();
                    break;
                case 3:
                    AgregarSatelite();
                    break;
                default:
                    System.out.println("Saliste del programa. ");
                    break;
            }
          
        }while(eleccion>0 && eleccion<=3);
        
       Menu();
      }
}
