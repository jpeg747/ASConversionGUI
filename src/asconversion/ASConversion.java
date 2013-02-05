/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package asconversion;

import java.io.*;

/**
 *
 * @author jquinlan
 */
public class ASConversion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File old = new File("Eval_Results.txt");
            old.delete();
            File out = new File("Eval_Results.txt");
            out.createNewFile();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
