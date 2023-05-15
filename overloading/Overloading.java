/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloading;

/**
 *
 * @author Rizky Fatkhur R
 */
public class Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Construktor
        Vector3 vektor = new Vector3(new int[] { 4, 6, 8 });

        // Overloading
        vektor.kali(5);
        vektor.kali(new int[] { 2, 4, 6 });

        // Menu
        vektor.display();
    }
    
}
