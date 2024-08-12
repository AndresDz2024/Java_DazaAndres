/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author DZ
 */
class FabricaMac implements FabricaDeGUI {
    public Boton crearBoton() {
        return new BotonMac();
    }

    public Checkbox crearCheckbox() {
        return new CheckboxMac();
    }
}
