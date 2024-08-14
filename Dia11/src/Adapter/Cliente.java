/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author DZ
 */
public class Cliente {
    public static void main(String[] args) {
        EnchufeEuropeo enchufeEuropeo = new AdaptadorEnchufe(new EnchufeAmericano());
        enchufeEuropeo.conectar(); // "Enchufe americano conectado."
    }
}
