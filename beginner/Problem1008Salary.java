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
public class Problem1008Salary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(System.out);
        int iN1=Integer.parseInt(br.readLine());
        int iN2=Integer.parseInt(br.readLine());
        float fH=Float.parseFloat(br.readLine());
        pw.println("NUMBER = "+iN1);
        pw.flush();
        pw.printf("SALARY = U$ %.2f\n", (iN2*fH));
        pw.close();
    }
    
}
