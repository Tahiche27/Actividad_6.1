/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author tahic
 */
public class Planetas extends Astros {

    private String color;



    public Planetas( String nombre, double masa, double diametro, double rotacion, double traslacion, double distancia, double gravedad, String color) {
        
        super(nombre,masa, diametro, rotacion, traslacion, distancia, gravedad);
        
        this.color = color;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }



}
