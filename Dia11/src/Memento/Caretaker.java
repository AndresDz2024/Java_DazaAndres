/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Memento;

/**
 *
 * @author DZ
 */
import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void agregarMemento(Memento memento) {
        mementoList.add(memento);
    }

    public Memento obtenerMemento(int indice) {
        return mementoList.get(indice);
    }
}
