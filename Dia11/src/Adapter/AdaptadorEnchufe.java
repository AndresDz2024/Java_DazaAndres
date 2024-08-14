/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author DZ
 */
public class AdaptadorEnchufe implements EnchufeEuropeo {
    private EnchufeAmericano enchufeAmericano;

    public AdaptadorEnchufe(EnchufeAmericano enchufeAmericano) {
        this.enchufeAmericano = enchufeAmericano;
    }

    @Override
    public void conectar() {
        enchufeAmericano.conectarEnchufeAmericano();
    }
}
