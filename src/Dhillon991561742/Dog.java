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
public class Dog extends Mammal implements INameable, Comparable {

    /*Datafields of the class */
    private String name;
    private String breed;

    /*Default Constructor*/
    public Dog() {
        this.name = "none";
        this.age = 0;
        this.breed = "none";
    }

    /**
     *
     * @param age of the dog
     * @param name of the dog
     * @param breed of the dog
     */
    public Dog(int age, String name, String breed) {
        super(age);
        this.breed = breed;
        this.name = name;
    }

    /**
     *
     * @return name of the dog
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     *
     * @param Set name of the dog
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return breed of the dog
     */
    public String getBreed() {
        return breed;
    }

    /**
     *
     * @param Set breed of the dog
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /*Method animalSound*/
    @Override
    public void animalSound() {
        System.out.println("Dog makes a sound bow wow bow wow!");
    }
    
    /**
     * 
     * @param obj 
     * @return 
     */
    @Override
    public int compareTo(Object obj){
        Dog d = (Dog)obj;
        if(this.age == d.age){
            return 0;
        }
        else {
            return this.age > d.age ? 1 : -1;
        }
        
    }
    
    /*toString*/
    @Override
    public String toString() {
        return "\nAge = " + age + "\nName = " + name + "\nBreed = " + breed;
    }

}
