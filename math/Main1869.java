/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

/**
 *
 * @author rous
 */
public class Main1869 {

    private static StringBuilder resultado;
    private static String[] base = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V"};

    public static void main(String args[]) throws IOException {
        String path = new File(".").getCanonicalPath() + "/src/datos.txt";
        FileInputStream fis = new FileInputStream(path);
        //InputStreamReader isr = new InputStreamReader(System.in);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(System.out);
        long n;
        while (true) {
            n = Long.parseLong(br.readLine());
            pw.println(procesar(n));
            pw.flush();
            if (n == 0) {
                break;
            }
        }
        pw.close();
    }

    public static String procesar(long n) {
        resultado = new StringBuilder("");
        if (n == 0) {
            return "0";
        } else {
            while (n > 0) {
                resultado.insert(0, base[(int)n % 32]);
                n /= 32;
            }
            return resultado.toString();
        }
    }
}
