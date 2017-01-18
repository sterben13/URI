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
/**
 *
 * @author rous
 */
public class Main1018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(System.out);
        int notes [] = {100, 50, 20, 10, 5, 2, 1};
        String imprimir [] ={
            " nota(s) de R$ 100,00",
            " nota(s) de R$ 50,00",
            " nota(s) de R$ 20,00",
            " nota(s) de R$ 10,00",
            " nota(s) de R$ 5,00",
            " nota(s) de R$ 2,00",
            " nota(s) de R$ 1,00"
        };
        int[] cant = new int[notes.length];
        int value = Integer.parseInt(br.readLine());
        pw.println(value);
        pw.flush();
        for (int i = 0; i < notes.length; i++) {
            cant[i]= value/notes[i];
            value -= (cant[i]*notes[i]);
        }
        for (int i = 0; i < notes.length; i++) {
            pw.println(cant[i]+imprimir[i]);
            pw.flush();
        }
        pw.close();
    }
}
