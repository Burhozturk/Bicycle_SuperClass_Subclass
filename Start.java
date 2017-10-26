/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycle;

/**
 *
 * @author burhan
 */
public class Start {
    public static void main(String[] args) {
        System.out.println("Demonstratere Superklasse og Subklasse");
        MountainBike mbike=new MountainBike(1, 2, 3, 4);
        Bicycle bmike=new Bicycle(1, 2, 3);
        System.out.println(mbike.toString());
    }
}
