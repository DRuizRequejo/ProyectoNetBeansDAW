/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gittest;

/**
 *
 * @author david
 */
public class Gittest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int cont = 0;
        while (cont < 15) {            
            num = (int) (Math.random() * 10)+1;
            if(num < 5){
                System.out.println("Hello");
            }
            cont++;
        }
    }

}
