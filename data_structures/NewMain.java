/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;

/**
 *
 * @author rous
 */
public class NewMain {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(System.out);
        Stack<Character> diamons = new Stack();
        int cases = Integer.parseInt(br.readLine());
        String line;
        int cant = 0;
        for (int i = 0; i < cases; i++) {
            line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == '<') {
                    diamons.add('<');
                } else if (line.charAt(j) == '>') {
                    if (!diamons.empty()) {
                        diamons.pop();
                        cant++;
                    }
                }
            }
            System.out.println(cant);
            cant = 0;
            diamons.clear();
        }
    }

}
