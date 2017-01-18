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
class Main1001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(System.out);
        try{
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            br.close();
            pw.println("SOMA = "+(n1+n2));
        }catch(IOException e){
            pw.println(e.getMessage());
            pw.flush();
        }
        pw.close();
    }
}
