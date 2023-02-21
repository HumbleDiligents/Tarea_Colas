/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_colas;

/**
 *
 * @author Sebastian
 */
public class Banco {
    private Nodo inicio;
    private Nodo fin;

    public void llegaNuevoCliente(Persona cliente) {
        Nodo nuevo = new Nodo(cliente);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            if (cliente.tieneDiscapacidad()) {
                nuevo.siguiente = inicio;
                inicio = nuevo;
            } else {
                fin.siguiente = nuevo;
                fin = nuevo;
            }
        }
    }

    public Persona atenderCliente() {
        if (inicio == null) {
            return null; // no hay clientes en la fila
        } else {
            Persona cliente = inicio.cliente;
            inicio = inicio.siguiente;
            if (inicio == null) {
                fin = null;
            }
            return cliente;
        }
    }

    public boolean encuentra(int x) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.cliente.getCedula() == x) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    private class Nodo {
        private Persona cliente;
        private Nodo siguiente;

        public Nodo(Persona cliente) {
            this.cliente = cliente;
            this.siguiente = null;
        }
    }
}

class Persona {
    private String nombre;
    private int cedula;
    private boolean discapacidad;

    public Persona(String nombre, int cedula, boolean discapacidad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.discapacidad = discapacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public boolean tieneDiscapacidad() {
        return discapacidad;
    }
}
