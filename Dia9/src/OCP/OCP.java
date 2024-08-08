/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OCP;

/**
 *
 * @author ARGOM
 */
public class OCP {

    public static void main(String[] args) {
        Forma rectangulo = new Rectangulo(5, 10);
        Forma circulo = new Circulo(7);

        CalculadoraArea calculadora = new CalculadoraArea();

        System.out.println("Área del rectángulo: " + calculadora.calcularArea(rectangulo));
        System.out.println("Área del círculo: " + calculadora.calcularArea(circulo));
    }
}
