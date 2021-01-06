
package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Horario implements Serializable {
    
    @Id
    String idHorario;
    String diaAtencion;
    @Temporal(TemporalType.TIME)
    Date inicioJuego;
     @Temporal(TemporalType.TIME)
    Date finJuego;

    public Horario() {
    }

    public Horario(String idHorario, Date inicioJuego, Date finJuego, String diaAtencion) {
        this.idHorario = idHorario;
        this.inicioJuego = inicioJuego;
        this.finJuego = finJuego;
        this.diaAtencion = diaAtencion;
    }

    public String getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(String idHorario) {
        this.idHorario = idHorario;
    }

    public Date getInicioJuego() {
        return inicioJuego;
    }

    public void setInicioJuego(Date inicioJuego) {
        this.inicioJuego = inicioJuego;
    }

    public Date getFinJuego() {
        return finJuego;
    }

    public void setFinJuego(Date finJuego) {
        this.finJuego = finJuego;
    }

    public String getDiaAtencion() {
        return diaAtencion;
    }

    public void setDiaAtencion(String diaAtencion) {
        this.diaAtencion = diaAtencion;
    }
    
    
    
    
    
}
