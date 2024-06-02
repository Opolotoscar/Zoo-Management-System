/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zoo.zms;

public class ZOO {
    public static void main(String[] args) {
        // Create instances of each animal
        Animal lion = new Lion("Oscar", 3);
        Animal elephant = new Elephant("Opolot", 17);
        Animal monkey = new Monkey("Paro", 38 );
        
        // Call methods to demonstrate polymorphism
        System.out.println("\nLion");
        lion.animalDetails();
        lion.makeSound();//overriden method
        lion.eat();
        lion.makeSound(3);//overloaded method
        lion.eat("meat");//overloaded method
        
        System.out.println("\nElephant");
        elephant.animalDetails();
        elephant.makeSound();
        elephant.eat();
        elephant.makeSound(2);
        elephant.eat("grass");
        
        System.out.println("\nMonkey");
        monkey.animalDetails();
        monkey.makeSound();
        monkey.eat();
        monkey.makeSound(4);
        monkey.eat("bananas");
    }
}
