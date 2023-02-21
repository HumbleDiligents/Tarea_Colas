/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea_colas;

/**
 *
 * @author Sebastian
 */
public class Tarea_Colas {

    public static void main(String[] args) {
        Banco banco = new Banco();
    
    // Agregar algunos clientes a la fila del banco
    banco.llegaNuevoCliente(new Persona("Juan", 123456, false));
    banco.llegaNuevoCliente(new Persona("María", 987654, true));
    banco.llegaNuevoCliente(new Persona("Pedro", 345678, false));
    banco.llegaNuevoCliente(new Persona("Ana", 567890, false));
    
    // Probar el método encuentra
    boolean encontrado = banco.encuentra(987654); // Buscar por cédula 987654 (de María)
    if (encontrado) {
        System.out.println("Se encontró el cliente.");
    } else {
        System.out.println("No se encontró el cliente.");
    }
    
    // Atender algunos clientes de la fila
    Persona cliente1 = banco.atenderCliente();
    if (cliente1 != null) {
        System.out.println("Se atendió al cliente " + cliente1.getNombre());
    } else {
        System.out.println("No hay clientes en la fila.");
    }
    
    Persona cliente2 = banco.atenderCliente();
    if (cliente2 != null) {
        System.out.println("Se atendió al cliente " + cliente2.getNombre());
    } else {
        System.out.println("No hay clientes en la fila.");
    }
    }
}
