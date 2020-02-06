/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Maylngni
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int size, h = 0, t = 0, m = 1;

        size = Integer.parseInt(JOptionPane.showInputDialog(null, "How many inputs"));
        int[] arrayni = new int[size];

        for (int i = 0; i < size; i++) {
            int dsp = i + 1;
            arrayni[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "input #" + dsp));
        }
        System.out.println("Bubble Sort\ninput " + Arrays.toString(arrayni));

        while (m != 0) {
            m = 0;
            for (int i = 0; i < size - 1; i++) {
                h = arrayni[i];
                t = arrayni[i + 1];
                if (h > t) {
                    arrayni[i] = t;
                    arrayni[i + 1] = h;
                    m++;
                    //System.out.println("m"+m);
                }
                System.out.println(Arrays.toString(arrayni));
            }
            //System.out.println(Arrays.toString(arrayni));
        }
        System.out.println("output " + Arrays.toString(arrayni));
    }
}
