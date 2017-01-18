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
public class Main1011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(System.out);
        final double PI = 3.14159;
        double div = 4.0/3.0;
        double r = Double.parseDouble(br.readLine());
        pw.printf("VOLUME = %.3f\n", (div*PI*Math.pow(r, 3)));
        pw.flush();
        pw.close();
    }
    
}
