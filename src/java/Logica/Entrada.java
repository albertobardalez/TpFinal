
package Logica;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity 
public class Entrada implements Serializable {
    
    @Id 
    String idEntrada;
    int cantidad;
    @OneToOne(cascade = CascadeType.PERSIST)
    Juego juego;

    public Entrada() {
    }

    public Entrada(String idEntrada, int cantidad, Juego juego) {
        this.idEntrada = idEntrada;
        this.cantidad = cantidad;
        this.juego = juego;
    }

    public String getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(String idEntrada) {
        this.idEntrada = idEntrada;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    

  
    
    
    
    
}
