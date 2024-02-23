/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_carlosbonilla;

/**
 *
 * @author lospe
 */
public class Player {
    int edad;
    String name;
    String posi;

    public Player(int edad, String name, String posi) {
        this.edad = edad;
        this.name = name;
        this.posi = posi;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosi() {
        return posi;
    }

    public void setPosi(String posi) {
        this.posi = posi;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
