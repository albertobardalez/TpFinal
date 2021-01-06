
package Logica;


import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Empleado extends Persona implements Serializable {
    
    @Id
    String idEmpleado;
    
    String departamento;
    @OneToOne(cascade = CascadeType.PERSIST)
    Usuario usuario;                                                                                                                                                                                                                                                        

    public Empleado() {
    }

    public Empleado(String idEmpleado, String departamento, Usuario usuario, String dni, String nombre, String apellido, String edad) {
        super(dni, nombre, apellido, edad);
        this.idEmpleado = idEmpleado;
        this.departamento = departamento;
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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
