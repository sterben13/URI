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
public class Main1009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(System.out);
        br.readLine();
        double salary = Double.parseDouble(br.readLine());
        double sale = Double.parseDouble(br.readLine());
        pw.printf("TOTAL = R$ %.2f\n", (salary+(sale*0.15f)));
        pw.flush();
        pw.close();
    }   
}