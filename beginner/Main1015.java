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
public class Main1015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(System.out);
        double p1 [] = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        double p2 [] = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        double dist = Math.sqrt((Math.pow((p2[0]-p1[0]),2))+(Math.pow((p2[1]-p1[1]),2)));
        pw.printf("%.4f\n", dist);
        pw.flush();
        pw.close();
    }
    
}
