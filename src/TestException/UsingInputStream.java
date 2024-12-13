/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestException;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author B045_05
 */
public class UsingInputStream {
        public static void usingScanner(){
            Scanner in = new Scanner(System.in);
            System.out.println("Digita un intero:");
            try{
                String line = in.next();
                int intValue = Integer.parseInt(line);
                System.out.println("Valore: " + intValue);
            } catch(NumberFormatException e){
                System.err.println("Non hai inserito un valore numerico!!");
            } catch (InputMismatchException e) {
			System.out.println("Exception message: " + e.getMessage());
            }finally{
                in.close();
            }
        }
}
