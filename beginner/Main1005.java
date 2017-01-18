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
public class Main1005 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        final float A = 3.5f;
        final float B = 7.5f;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(System.out);
        float a = Float.parseFloat(br.readLine());
        float b = Float.parseFloat(br.readLine());
        br.close();
        pw.printf("MEDIA = %.5f\n", (((a*A)+(b*B))/11));
        pw.close();
    }
    
}
