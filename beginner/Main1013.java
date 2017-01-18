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
public class Main1013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(System.out);
        int data[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        pw.println(mayor(mayor(data[0], data[1]),data[2])+" eh o maior");
        pw.flush();
        pw.close();
    }

    static int mayor(int a, int b) {
        return ((a + b) + Math.abs(a - b)) / 2;
    }

}
