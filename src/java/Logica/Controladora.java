
package Logica;


import Persistencia.ControladoraPersistencia;


public class Controladora {
    
     ControladoraPersistencia controlPersist = new ControladoraPersistencia();
    
    public void crearUsuario(){
        
        Usuario usuario = new Usuario ("15", "Alberto", "234");
        
        controlPersist.crearUsuario(usuario);
        
    }

    public void crearCliente() {
        //Probando saco los parametros: String dni, String nombre, String apellido, String edad
        Cliente cliente = new Cliente();
        
        cliente.setDni("dni");
        cliente.setNombre("nombre");
        cliente.setApellido("apellido");
        cliente.setEdad("edad");
        
        controlPersist.crearCliente(cliente);
        
    }

    

    
    
}
