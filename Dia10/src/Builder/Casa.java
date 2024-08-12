/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author DZ
 */
class Casa {
    private String paredes;
    private String techo;
    private String piscina;

    public void setParedes(String paredes) {
        this.paredes = paredes;
    }

    public void setTecho(String techo) {
        this.techo = techo;
    }

    public void setPiscina(String piscina) {
        this.piscina = piscina;
    }

    @Override
    public String toString() {
        return "Casa con paredes: " + paredes + ", techo: " + techo + ", piscina: " + piscina;
    }
}
