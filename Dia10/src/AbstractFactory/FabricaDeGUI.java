/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author DZ
 */
interface Boton {
    void pintar();
}

interface Checkbox {
    void marcar();
}

interface FabricaDeGUI {
    Boton crearBoton();
    Checkbox crearCheckbox();
}