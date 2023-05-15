/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading;

/**
 *
 * @author Rizky Fatkhur R
 */
public class Vector3 {
    
    int skalar, vektorvektor;
    int[] vektorOri;
    int[] vektorKw;
    int[] vektorskalar = new int[3];

    // Construktor

    public Vector3(int[] vektorOri) {
        this.vektorOri = vektorOri;
    }

    // Overloading

    public int[] kali(int skalar) {
        this.skalar = skalar;

        for (int i = 0; i < 3; i++) {
            vektorskalar[i] = this.vektorOri[i] * this.skalar;
        }

        return vektorskalar;
    }

    public int kali(int[] vektorKw) {
        this.vektorKw = vektorKw;

        for (int i = 0; i < 3; i++) {
            vektorvektor += this.vektorOri[i] * this.vektorKw[i];
        }

        return vektorvektor;
    }

    // Menu

    public void display() {
        System.out.println("---- Program Overloading ----\n");
        System.out.println("Vektor 1 = " + Arrays.toString(vektorOri));
        System.out.println("Vektor 2 = " + Arrays.toString(vektorKw));
        System.out.println("Skalar = " + (skalar));
        System.out.println("\nHasil perkalian vektor 1 dengan skalar = " + Arrays.toString(vektorskalar));
        System.out.println("Hasil perkalian vektor 1 dengan vektor 2 = " + (vektorvektor));
    }
}
