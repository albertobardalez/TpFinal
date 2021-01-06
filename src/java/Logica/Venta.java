
package Logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Venta implements Serializable {
    
    @Id
    String idVenta;
    int cantidadVenta;
    int tipoPago;
    @OneToMany(cascade = CascadeType.PERSIST) 
    List <Entrada> listaEntrada;
    @OneToMany(cascade = CascadeType.PERSIST)
    List <Horario> listaHorario;

    public Venta() {
    }

    public Venta(String idVenta, int cantidadVenta, int tipoPago, List<Entrada> listaEntrada, List<Horario> listaHorario) {
        this.idVenta = idVenta;
        this.cantidadVenta = cantidadVenta;
        this.tipoPago = tipoPago;
        this.listaEntrada = listaEntrada;
        this.listaHorario = listaHorario;
    }

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public int getCantidadVenta() {
        return cantidadVenta;
    }

    public void setCantidadVenta(int cantidadVenta) {
        this.cantidadVenta = cantidadVenta;
    }

    public int getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(int tipoPago) {
        this.tipoPago = tipoPago;
    }

    public List<Entrada> getListaEntrada() {
        return listaEntrada;
    }

    public void setListaEntrada(List<Entrada> listaEntrada) {
        this.listaEntrada = listaEntrada;
    }

    public List<Horario> getListaHorario() {
        return listaHorario;
    }

    public void setListaHorario(List<Horario> listaHorario) {
        this.listaHorario = listaHorario;
    }


    
    
    
}
