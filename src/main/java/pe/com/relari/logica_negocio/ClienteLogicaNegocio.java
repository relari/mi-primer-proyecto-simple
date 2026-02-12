package pe.com.relari.logica_negocio;

import pe.com.relari.modelos.Clientes;
import pe.com.relari.persistencia.ClientePersistencia;

public class ClienteLogicaNegocio {

    private ClientePersistencia clientePersistencia = new ClientePersistencia();

    public void registrarCliente(Clientes clientes) {
        System.out.println("Lógica de negocio para registrar cliente...");

        var clientesPersistencia = clientePersistencia.obtenerClientePorId(clientes.getIdCliente()); // Simulación de obtención de cliente por ID

        if (clientesPersistencia != null) {
            System.out.println("Cliente ya existe, no se puede registrar.");
            return;
        }

        clientePersistencia.registrarCliente(clientes); // Simulación de registro
    }

     public void eliminarCliente(Integer idCliente) {
        System.out.println("Lógica de negocio para eliminar cliente...");
        clientePersistencia.eliminarCliente(idCliente); // Simulación de eliminación
    }

     public void actualizarCliente(Integer idCliente) {
        System.out.println("Lógica de negocio para actualizar cliente...");
        clientePersistencia.actualizarCliente(idCliente, null); // Simulación de actualización
    }

     public void listarClientes() {
        System.out.println("Lógica de negocio para listar clientes...");
        clientePersistencia.listarClientes(); // Simulación de listado
    }

}
