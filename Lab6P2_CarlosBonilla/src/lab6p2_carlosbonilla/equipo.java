/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_carlosbonilla;

/**
 *
 * @author lospe
 */
public class equipo {
    String name;
    String city;
    String nation;
    String stadio;

    public equipo(String name, String city, String nation, String stadio) {
        this.name = name;
        this.city = city;
        this.nation = nation;
        this.stadio = stadio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getStadio() {
        return stadio;
    }

    public void setStadio(String stadio) {
        this.stadio = stadio;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
