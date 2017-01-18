/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author rous
 */
public class Main1259 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        String regex = "[0|2|4|6|8]$";
        Pattern patron = Pattern.compile(regex);
        String s;
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();

        int tam = Integer.parseInt(br.readLine());
        for (int i = 0; i < tam; i++) {
            s = br.readLine();
            Matcher emparejador = patron.matcher(s);
            boolean esCoincidente = emparejador.find();
            if (esCoincidente) {
                par.add(Integer.parseInt(s));
            } else {
                impar.add(Integer.parseInt(s));
            }
        }
        
        Collections.sort(par);
        Comparator<Integer> comparador = Collections.reverseOrder();
        Collections.sort(impar, comparador);

        imprimir(par);
        imprimir(impar);
    }

    public static void imprimir(ArrayList a) {
        a.forEach((num) -> {
            System.out.println(num);
        });
    }
}
