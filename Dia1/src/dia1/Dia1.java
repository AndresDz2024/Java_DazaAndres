/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ARGOM
 */
public class Dia1 {
    private List<Camper> campers;
    private Scanner scanner;
    public Dia1(){
        campers = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    public void addCamper(){
        Camper camper = new Camper();
        System.out.print("Ingrese la identificación del nuevo camper: ");
        camper.setIdentificacion(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Ingrese los nombres del nuevo camper: ");
        camper.setNombres(scanner.nextLine());
        System.out.print("Ingrese los apellidos del nuevo camper: ");
        camper.setApellidos(scanner.nextLine());
        System.out.print("Ingrese la direccion del nuevo camper: ");
        camper.setDireccion(scanner.nextLine());
        System.out.print("Ingrese el acudiente del nuevo camper: ");
        camper.setAcudiente(scanner.nextLine());
        System.out.print("Ingrese el numero de celular del nuevo camper: ");
        camper.setNumeroCelular(scanner.nextInt());
        scanner.nextLine(); 
        System.out.print("Ingrese el numero fijo del nuevo camper: ");
        camper.setNumeroFijo(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Ingrese el estado del nuevo camper: ");
        camper.setEstado(scanner.nextLine());
        System.out.print("Ingrese el riesgo actual del nuevo camper: ");
        camper.setRiesgo(scanner.nextLine());
        campers.add(camper);
        System.out.println("Camper agregado exitosamente.");
    }
    
    public static void main(String[] args) {
        Dia1 dia1 = new Dia1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido usuario");
        System.out.println("¿Que deseas hacer el día de hoy?");
        System.out.printf("1. modulo campers%n2. modulo trainers%n3. modulo coordinadores%n4. modulo de reportes%n ");
        int option = scanner.nextInt();
        scanner.nextLine();
        if (option == 1){
            System.out.print("\033[H\033[2J");
            System.out.println("Bienvenido al modulo de campers");
            System.out.println("¿Que deseas hacer el dia de hoy?");
            System.out.printf("1. ver campers%n2. ver trainers%n");
            Scanner sc1 = new Scanner(System.in);
            option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1){
                
            } else if (option == 2){
                
            }
        }
        else if(option == 2){
            System.out.println("Bienvenido al modulo de trainers");
            System.out.println("¿Que deseas hacer el dia de hoy?");
            System.out.printf("1. ver trainers%n3. ver campers%n ");
            
        }else if (option == 3){
            System.out.println("Bienvenido al modulo de Coordinadores");
            System.out.println("¿Que deseas hacer el dia de hoy?");
            System.out.printf("1. opciones campers%n2. opciones trainers%n");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 1:
                    System.out.println("Entrando a las opciones de modificacion de informacion de campers...");
                    System.out.println("¿Que deseas hacer? ");
                    System.out.printf("1. añadir nuevo camper%n2. ver campers existentes%n3. actualizar camper%n4. eliminar campers%n ");
                    option = scanner.nextInt();
                    scanner.nextLine();
                    switch (option){
                        case 1:
                            dia1.addCamper();
                            break;
                        case 2:
                            break;
                        case 3:    
                            break;
                        case 4:   
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Entrando a las opciones de modificacion de informacion de trainers...");
                    System.out.println("¿Que deseas hacer? ");
                    System.out.printf("1. añadir nuevo trainer%n2. ver trainers existentes%n3. actualizar trainer%ne4. eliminar trainers%n ");           
                    break;
            }
        }
    }
}
