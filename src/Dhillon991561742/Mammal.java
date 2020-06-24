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
public abstract class Mammal {

    /*datafield age*/
    protected int age;

    /*Default Constructor*/
    protected Mammal() {
    }

    /**
     *
     * @param age
     */
    protected Mammal(int age) {
        this.age = age;
    }

    /*Method animalSound*/
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    /**
     *
     * @param set age
     */
    public void setAge(int age){
        this.age = age;
    }

    /**
     *
     * @return age
     */
    public int getAge(){
        return age;
    }

}
