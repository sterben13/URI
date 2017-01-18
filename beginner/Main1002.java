/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beginner;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author rous
 */
public class Main1002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(System.out);
        try {
            Double radio = Double.parseDouble(br.readLine());
            pw.printf("A=%.4f\n", radio * radio * 3.14159d);
        } catch (IOException e) {
            pw.println(e.getMessage());
            pw.flush();
        }
        pw.close();
    }
}
