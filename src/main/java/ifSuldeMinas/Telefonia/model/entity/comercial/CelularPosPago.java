package ifSuldeMinas.Telefonia.model.entity.comercial;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CelularPosPago extends Celular {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Temporal(TemporalType.DATE)
    private int diaDeVencimento;


}
