/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia1;
import java.util.*;
/**
 *
 * @author ARGOM
 */
public class Dia1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido usuario");
        System.out.println("¿Que deseas hacer el día de hoy?");
        System.out.printf("1. modulo campers%n2. modulo trainers%n3. modulo coordinadores%n4. modulo de reportes%n ");
        int o = sc.nextInt();
        if (o == 1){
            System.out.print("\033[H\033[2J");
            System.out.println("Bienvenido al modulo de campers");
            System.out.println("¿Que deseas hacer el dia de hoy?");
            System.out.printf("1. ver notas%n2. ver salones%n3. ver trainers%n ");
        }
        else if(o == 2){
            System.out.println("Bienvenido al modulo de trainers");
            System.out.println("¿Que deseas hacer el dia de hoy?");
            System.out.printf("1. modulo campers%n2. modulo trainers%n3. modulo coordinadores%n ");
        }
    }
    
}
