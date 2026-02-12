package pe.com.relari.persistencia;

import pe.com.relari.modelos.Clientes;

import java.util.List;

public class ClientePersistencia {

    private ConecionBaseDeDatos coneccionBaseDeDatos = new ConecionBaseDeDatos();


    public void registrarCliente(Clientes clientes) {
        System.out.println("Registrando cliente...");

        String sql = """
                insert into clientes (id_cliente, nombre, apellido, dni, telefono, correo)
                values (?, ?, ?, ?, ?, ?)
                """;

        System.out.println(coneccionBaseDeDatos.getConecion());
    }

     public void eliminarCliente(Integer idCliente) {
        System.out.println("Eliminando cliente...");

        String sql = """
                delete from clientes
                where id_cliente = ?
                """;
        System.out.println(coneccionBaseDeDatos.getConecion());
    }

     public void actualizarCliente(Integer idCliente, Clientes clientes) {
        System.out.println("Actualizando cliente...");
        String sql = """
                update clientes
                set nombre = ?, apellido = ?, dni = ?, telefono = ?, correo = ?
                where id_cliente = ?
                """;
        System.out.println(coneccionBaseDeDatos.getConecion());
    }

     public List<Clientes> listarClientes() {
        System.out.println("Listando clientes...");
        String sql = """
                select id_cliente, nombre, apellido, dni, telefono, correo
                from clientes
                """;
        System.out.println(coneccionBaseDeDatos.getConecion());
        return List.of(); // Retorna una lista de clientes (simulado)
    }

    public Clientes obtenerClientePorId(Integer idCliente) {
        System.out.println("Obteniendo cliente por ID...");
        String sql = """
                select id_cliente, nombre, apellido, dni, telefono, correo
                from clientes
                where id_cliente = ?
                """;
        System.out.println(coneccionBaseDeDatos.getConecion());
        return new Clientes(); // Retorna un cliente (simulado)
    }
}
