/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author DZ
 */
class FabricaWindows implements FabricaDeGUI {
    public Boton crearBoton() {
        return new BotonWindows();
    }

    public Checkbox crearCheckbox() {
        return new CheckboxWindows();
    }
}
