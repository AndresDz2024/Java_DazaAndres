/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author DZ
 */
public class Aplicacion {
    private Boton boton;
    private Checkbox checkbox;

    public Aplicacion(FabricaDeGUI fabrica) {
        boton = fabrica.crearBoton();
        checkbox = fabrica.crearCheckbox();
    }

    public void pintar() {
        boton.pintar();
        checkbox.marcar();
    }

    public static void main(String[] args) {
        FabricaDeGUI fabrica;
        String sistemaOperativo = "Windows";  

        if (sistemaOperativo.equals("Windows")) {
            fabrica = new FabricaWindows();
        } else {
            fabrica = new FabricaMac();
        }

        Aplicacion app = new Aplicacion(fabrica);
        app.pintar();
    }
}
