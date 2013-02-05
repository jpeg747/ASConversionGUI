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
        char yn = 'n';
        String ynString;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while(Character.toUpperCase(yn) != 'Y')
        {
            System.out.println("WARNING!: This program will mark each text file "
                    + "with '1'. Continue? (y/n): ");
            ynString = scanner.nextLine();
            yn = ynString.charAt(0);
            if(Character.toUpperCase(yn) == 'N')
            {
                System.err.println("Exiting . . . ");
            }
            
        }
    }
}
