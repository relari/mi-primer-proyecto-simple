package pe.com.relari.formularios;

import pe.com.relari.logica_negocio.ClienteLogicaNegocio;
import pe.com.relari.modelos.Clientes;

/**
 * Formularios o Vistas o algo visible a interactuar
 */

public class LavanderiaFormulario {

    private ClienteLogicaNegocio clienteLogicaNegocio = new ClienteLogicaNegocio();


    public void btnRegistrarCliente(Clientes clientes) {
        System.out.println("Formulario para registrar cliente...");
        clienteLogicaNegocio.registrarCliente(clientes); // Simulación de registro
    }

    public void btnEliminarCliente() {
        System.out.println("Formulario para eliminar cliente...");
        clienteLogicaNegocio.eliminarCliente(1); // Simulación de eliminación
    }

    public void btnActualizarCliente() {
        System.out.println("Formulario para actualizar cliente...");
        clienteLogicaNegocio.actualizarCliente(1); // Simulación de actualización
    }

    public void btnListarClientes() {
        System.out.println("Formulario para listar clientes...");
        clienteLogicaNegocio.listarClientes(); // Simulación de listado
    }




}
