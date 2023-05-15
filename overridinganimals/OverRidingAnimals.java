/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overridinganimals;

/**
 *
 * @author User
 */
public class OverRidingAnimals {

   class Animal {
   public void sound() {
      System.out.println("Hewan membuat suara...");
   }
}

class Cat extends Animal {
   @Override
   public void sound() {
      System.out.println("Meong-meong");
   }
}

class Dog extends Animal {
   @Override
   public void sound() {
      System.out.println("Guk-guk");
   }
}

public class Main {
   public static void main(String[] args) {
      Animal animal = new Animal();
      animal.sound(); // Output: Hewan membuat suara...

      Cat cat = new Cat();
      cat.sound(); // Output: Meong-meong

      Dog dog = new Dog();
      dog.sound(); // Output: Guk-guk
   }
}

    
}
