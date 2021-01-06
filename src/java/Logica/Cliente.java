
package Logica;


import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Cliente extends Persona implements Serializable {
    
    @Id
    String idCliente;
     
    String telefono;
    @OneToOne(cascade = CascadeType.PERSIST)
    Juego juego;
    @OneToMany(cascade = CascadeType.PERSIST)
    List <Entrada> listaEntrada; 

    public Cliente() {
    }

    public Cliente(String idCliente, String telefono, Juego juego, List<Entrada> listaEntrada, String dni, String nombre, String apellido, String edad) {
        super(dni, nombre, apellido, edad);
        this.idCliente = idCliente;
        this.telefono = telefono;
        this.juego = juego;
        this.listaEntrada = listaEntrada;
    }

    

    public List<Entrada> getListaEntrada() {
        return listaEntrada;
    }

    public void setListaEntrada(List<Entrada> listaEntrada) {
        this.listaEntrada = listaEntrada;
    }

   

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    @Override
    public String getDni() {
        return dni;
    }
    @Override
    public void setDni(String dni) {
        this.dni = dni;
    }
    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String getApellido() {
        return apellido;
    }
    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    @Override
    public String getEdad() {
        return edad;
    }
    @Override
    public void setEdad(String edad) {
        this.edad = edad;
    }

    
    
    
}
