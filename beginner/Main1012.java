/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 *
 * @author rous
 */
public class Main1012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        final double PI = 3.14159;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(System.out);
        String array[] = {
            "TRIANGULO: ",
            "CIRCULO: ",
            "TRAPEZIO: ",
            "QUADRADO: ",
            "RETANGULO: "};
        double areas[] = new double[array.length];
        double data[] = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        areas[0] = (data[0] * data[2]) / 2;
        areas[1] = PI * Math.pow(data[2], 2);
        areas[2] = ((data[0]+data[1])/2)*data[2];
        areas[3] = Math.pow(data[1], 2);
        areas[4] = data[0] * data[1];
        for (int i = 0; i < array.length; i++) {
            pw.printf("%s%.3f\n", array[i], areas[i]);
            pw.flush();
        }
        pw.close();
    }

}
