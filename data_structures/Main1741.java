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
public class Main1741 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(System.out);
        Stack<String> operador = new Stack<>();
        Stack<Integer> num = new Stack<>();
        try{
        
        }catch(ArithmeticException e){
            pw.println("Division by zero.");
            pw.flush();
        }
        pw.close();
    }
    
}
