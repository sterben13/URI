/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures;

import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Stack;

/**
 *
 * @author rous
 */
public class Main1068 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //String path = new File(".").getCanonicalPath() + "/src/datos.txt";
        //InputStreamReader isr = new InputStreamReader(new FileInputStream(path));
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(System.out);
        Stack<String> pila = new Stack<>();

        while (br.ready()) {
            boolean flag = true;
            String line[] = br.readLine().split("");
            for (String line1 : line) {
                if (line1.equals("(")) {
                    pila.push("(");
                } else if (line1.equals(")")) {
                    if (pila.isEmpty()) {
                        flag = false;
                        break;
                    } else {
                        pila.pop();
                    }
                }
            }
            if (pila.isEmpty() && flag) {
                pw.println("correct");
                pw.flush();
            } else {
                pw.println("incorrect");
                pw.flush();
            }
            pila.clear();
        }
        pw.close();
    }
}
