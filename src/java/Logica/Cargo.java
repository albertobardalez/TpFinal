
package Logica;


import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cargo extends Persona implements Serializable {
    
    @Id
    String idCargo;
    
    String sector;
    @OneToOne(cascade = CascadeType.PERSIST)
    Usuario usuario;

    public Cargo() {
    }

    public Cargo(String idCargo, String sector, Usuario usuario, String dni, String nombre, String apellido, String edad) {
        super(dni, nombre, apellido, edad);
        this.idCargo = idCargo;
        this.sector = sector;
        this.usuario = usuario;
    }

    

    public String getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(String idCargo) {
        this.idCargo = idCargo;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
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
