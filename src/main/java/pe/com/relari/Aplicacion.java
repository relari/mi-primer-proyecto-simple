/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pe.com.relari;

import pe.com.relari.formularios.LavanderiaFormulario;
import pe.com.relari.modelos.Clientes;

/**
 *
 * @author Relari
 */
public class Aplicacion {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        var lavanderiaFormulario = new LavanderiaFormulario();
        var clientes = new Clientes(1, "Juan", "Perez", "12345678", "987654321", "");
        lavanderiaFormulario.btnRegistrarCliente(clientes);
    }
}
