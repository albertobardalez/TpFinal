package Logica;

import Logica.Entrada;
import Logica.Horario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-21T17:29:45")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Integer> cantidadVenta;
    public static volatile ListAttribute<Venta, Entrada> listaEntrada;
    public static volatile SingularAttribute<Venta, Integer> tipoPago;
    public static volatile SingularAttribute<Venta, String> idVenta;
    public static volatile ListAttribute<Venta, Horario> listaHorario;

}