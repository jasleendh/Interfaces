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
public class Lizard implements INameable, Cloneable {
    /*datafiels of the class*/
    private String name;
    private String color;
    private String category;

    /*Default Constructor*/
    public Lizard() {
        this.color = "none";
        this.category = "none";
        this.name = "none";
    }

    /**
     *
     * @param name of the lizard
     * @param color of the lizard
     * @param category from which lizard belongs
     */
    public Lizard(String name, String color, String category) {
        this.color = color;
        this.category = category;
        this.name = name;
    }
    
        /**
     *
     * @return name of the lizard
     */
    @Override
    public String getName() {
        return name;
    }
    
    /**
     *
     * @param set name of the lizard
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return color of the lizard
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param set color of the lizard
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return category of the lizard
     */
    public String getCategory() {
        return category;
    }

    /**
     *
     * @param category of the lizard
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /* Cloneable method*/
    @Override
    protected Lizard clone() throws CloneNotSupportedException {
        return (Lizard) super.clone(); 
    }

    
    
    /* toString method*/ 
    @Override
    public String toString() {
        return "Lizard: " + "\nName = " + name + "\nColor = " + color + "\nCategory = " + category;
    }

}
