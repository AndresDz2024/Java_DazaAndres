/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;

/**
 *
 * @author DZ
 */
public abstract class Forma {
    protected Color color;

    public Forma(Color color) {
        this.color = color;
    }

    abstract void dibujar();
}
