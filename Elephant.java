/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo.zms;

public class Elephant extends Animal{
  
    // Constructor
      public Elephant(String name, int age) {
super(name, age);
    }
    
    //Override
      @Override
    public void makeSound() {
        System.out.println("Trumpet");
    }
    
    //Override
    public void eat() {
        System.out.println("Eating grass");
    }  
}
