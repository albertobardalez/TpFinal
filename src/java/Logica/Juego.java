
package Logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Juego implements Serializable {
    
    @Id
    String idJuego;
    String tipoJuego;
    boolean disponible;
    @OneToMany(cascade = CascadeType.PERSIST)
    List <Horario> listaHorario;

    public Juego() {
    }

    public Juego(String idJuego, String tipoJuego, boolean disponible, List<Horario> listaHorario) {
        this.idJuego = idJuego;
        this.tipoJuego = tipoJuego;
        this.disponible = disponible;
        this.listaHorario = listaHorario;
    }

    public List<Horario> getListaHorario() {
        return listaHorario;
    }

    public void setListaHorario(List<Horario> listaHorario) {
        this.listaHorario = listaHorario;
    }

   

    public String getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(String idJuego) {
        this.idJuego = idJuego;
    }

    public String getTipoJuego() {
        return tipoJuego;
    }

    public void setTipoJuego(String tipoJuego) {
        this.tipoJuego = tipoJuego;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
    
}
