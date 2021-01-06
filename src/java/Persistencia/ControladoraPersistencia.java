package Persistencia;

import Logica.Cliente;
import Logica.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    CargoJpaController cargoJPA = new CargoJpaController();
    ClienteJpaController clienteJPA = new ClienteJpaController();
    EmpleadoJpaController empleadoJPA = new EmpleadoJpaController();
    EntradaJpaController entradaJPA = new EntradaJpaController();
    HorarioJpaController horarioJPA = new HorarioJpaController();
    JuegoJpaController juegoJPA = new JuegoJpaController();
    UsuarioJpaController usuarioJPA = new UsuarioJpaController();
    VentaJpaController ventaJPA = new VentaJpaController();

    public void crearUsuario(Usuario usuario) {
        
        try {
            usuarioJPA.create(usuario);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    public void crearCliente(Cliente cliente) {
        
        try {
            clienteJPA.create(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
        
    
    
}
