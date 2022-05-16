package ifSuldeMinas.Telefonia.model.entity.comercial;
import javax.persistence.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Ligacao{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    private int duracao;
}