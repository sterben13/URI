/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


/**
 *
 * @author rous
 */
public class Main2484 {

    public static void procesar(StringBuilder sb) {
        int tam = sb.length();
        String espacio = " ";
        for (int i = 1; i < tam; i++) {
            sb.deleteCharAt(sb.length() - 1);
            String aux = sb.toString().replaceAll("", " ");
            System.out.println(espacio+aux.substring(1, aux.length()-1));
            espacio+=" ";
        }
        System.out.println("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String path = new File(".").getCanonicalPath() + "/src/datos.txt";
        //InputStreamReader isr = new InputStreamReader(System.in);
        InputStreamReader isr = new InputStreamReader(new FileInputStream(path));
        BufferedReader br = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(System.out);
        String linea = "";
        StringBuilder sb;
        while (br.ready()) {
            linea = br.readLine();
            sb = new StringBuilder(linea);
            String aux = sb.toString().replaceAll("", " ");
            System.out.println(aux.substring(1, aux.length()-1));
            
            
            procesar(sb);
        }
    }
}

abstract class Plantilla {

    protected String path;
    protected InputStreamReader isr;
    protected InputStreamReader isrFile;
    protected BufferedReader br;
    protected BufferedReader brFile;
    protected PrintWriter pw;

    public Plantilla() throws IOException {
        this.path = new File(".").getCanonicalPath() + "/src/datos.txt";
        this.isr = new InputStreamReader(System.in);
        this.isrFile = new InputStreamReader(new FileInputStream(path));
        this.br = new BufferedReader(isr);
        this.brFile = new BufferedReader(isrFile);
        this.pw = new PrintWriter(System.out);
    }

    abstract void input();

    abstract void uotput();
}
