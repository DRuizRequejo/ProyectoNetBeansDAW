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
        int num = (int) (Math.random() * 10) + 1;
        switch (num) {
            case 1:
                System.out.println("Mi equipo es el Zaragoza");
                break;
            case 2:
                System.out.println("Mi equipo es el Huesca");
                break;
            case 3:
                System.out.println("Mi equipo es el Real Madrid");
                break;
            case 4:
                System.out.println("Mi equipo es el FCB Barcelona");
                break;
            case 5:
                System.out.println("Mi equipo es el Atlético de Madrid");
                break;
            case 6:
                System.out.println("Mi equipo es el Inazuma Eleven");
                break;
            case 7:
                System.out.println("Mi equipo es el New Team");
                break;
            case 8:
                System.out.println("Mi equipo es la Juventus");
                break;
            case 9:
                System.out.println("Mi equipo es el Galaxy");
                break;
            case 10:
                System.out.println("Mi equipo es la Selección Española");
                break;
        }
    }
}

