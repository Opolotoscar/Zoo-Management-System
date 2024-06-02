/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo.zms;

public class Animal {
  
    // Fields
     String name;
     int age;
    
    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Methods
    public void makeSound() {
        System.out.println("Animal sound");
    }
    
    public void eat() {
        System.out.println("Animal is eating");
    }
    
    // Overloaded methods
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Animal makes sound");
        }
    }
    
    public void eat(String foodType) {
        System.out.println("Animal is eating " + foodType);
    }
    public void animalDetails(){
        System.out.println("Name :"+ name);
        System.out.println("Age: " + age);
    }
    // Getters
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }  
}
