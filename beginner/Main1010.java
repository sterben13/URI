/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Arrays;
/**
 *
 * @author rous
 */
public class Main1010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(System.out);
        int line = 2;
        double datos[];
        double total = 0d;
        while (line-- > 0) {
            datos = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            total+=datos[1]*datos[2];
        }
        pw.printf("VALOR A PAGAR: R$ %.2f\n", total);
        pw.flush();
        pw.close();
    }

}
