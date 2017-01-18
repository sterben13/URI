/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beginner;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

/**
 *
 * @author rous
 */
public class Main1021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(System.out);
        Double[] cash = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 1.00,
            50.00, 25.00, 10.00, 5.00, 1.00};
        int[] cant = new int[cash.length];
        String[] impresion = {
            " nota(s) de R$ 100.00",
            " nota(s) de R$ 50.00",
            " nota(s) de R$ 20.00",
            " nota(s) de R$ 10.00",
            " nota(s) de R$ 5.00",
            " nota(s) de R$ 2.00",
            " moeda(s) de R$ 1.00",
            " moeda(s) de R$ 0.50",
            " moeda(s) de R$ 0.25",
            " moeda(s) de R$ 0.10",
            " moeda(s) de R$ 0.05",
            " moeda(s) de R$ 0.01"
        };
        Double value = Double.parseDouble(br.readLine());
        for (int i = 0; i < cash.length; i++) {
            cant[i] = (int) (value / cash[i]);
            value -= (cant[i] * cash[i]);
            if(i==6){
                value *= 100;
            }
        }
        pw.println("NOTAS:");
        pw.flush();
        for (int i = 0; i < cant.length; i++) {
            if(i==6){
                pw.println("MOEDAS:");
                pw.flush();
            }
            pw.println(cant[i]+impresion[i]);
            pw.flush();
        }
        pw.close();
    }
}
