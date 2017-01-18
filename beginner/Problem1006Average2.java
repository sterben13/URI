/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beginner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author rous
 */
public class Problem1006Average2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        final float A = 2f;
        final float B = 3f;
        final float C = 5f;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(System.out);
        float a = Float.parseFloat(br.readLine());
        float b = Float.parseFloat(br.readLine());
        float c = Float.parseFloat(br.readLine());
        br.close();
        pw.printf("MEDIA = %.1f\n", (((a*A)+(b*B)+(c*C))/10));
        pw.close();
    }
    
}

