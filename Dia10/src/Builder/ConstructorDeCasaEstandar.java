/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author DZ
 */
class ConstructorDeCasaEstandar extends ConstructorDeCasa {
    public void construirParedes() {
        casa.setParedes("Paredes de cartón");
    }

    public void construirTecho() {
        casa.setTecho("Techo de lata");
    }

    public void construirPiscina() {
        casa.setPiscina("Charco");
    }
}
