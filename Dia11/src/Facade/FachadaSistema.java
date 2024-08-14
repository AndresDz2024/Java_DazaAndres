/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author DZ
 */
public class FachadaSistema {
    private SistemaDeSubsistema1 subsistema1;
    private SistemaDeSubsistema2 subsistema2;
    private SistemaDeSubsistema3 subsistema3;

    public FachadaSistema() {
        this.subsistema1 = new SistemaDeSubsistema1();
        this.subsistema2 = new SistemaDeSubsistema2();
        this.subsistema3 = new SistemaDeSubsistema3();
    }

    public void operacionCompleta() {
        subsistema1.operacionA();
        subsistema2.operacionB();
        subsistema3.operacionC();
    }
}
