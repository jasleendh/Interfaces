/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dhillon991561742;

/**
 *
 * @author jasleen
 */
public class TestAnimal {

    /**
     * Test and implement other class methods
     */
    public static void main(String[] args) {

        //objects of Dog class
        Dog jackie = new Dog(8, "Jackie", "Golden Retriver");
        Dog mackie = new Dog(8, "Mackie", "Golden Retriver");
        
        //object of lizard class
        Lizard lizard = new Lizard("Camilion", "green", "Anole");

        System.out.println("Dog1: " + jackie.toString());

        //checks if jackie has instanceof Mammal
        if (jackie instanceof Mammal) {
            jackie.animalSound();
        }
        
        System.out.println();

        System.out.println("Dog2: " + mackie.toString());

        //checks if mackie has instanceof Mammal        
        if (mackie instanceof Mammal){
            mackie.animalSound();
        }

        //Compare ages of jackie and mackie
        int compareAge = jackie.compareTo(mackie);
        System.out.println();
        System.out.println("The difference between age of two dogs are: " + compareAge);

        System.out.println();
        System.out.println(lizard.toString());

        //calls cloneable method
        try {
            Lizard liz = (Lizard) lizard.clone();
            System.out.println("The lizards belong to category: " + liz.getCategory());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

}
