package Logica;

import Logica.Horario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-21T17:29:45")
@StaticMetamodel(Juego.class)
public class Juego_ { 

    public static volatile SingularAttribute<Juego, String> tipoJuego;
    public static volatile SingularAttribute<Juego, String> idJuego;
    public static volatile SingularAttribute<Juego, Boolean> disponible;
    public static volatile ListAttribute<Juego, Horario> listaHorario;

}