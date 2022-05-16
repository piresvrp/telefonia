package ifSuldeMinas.Telefonia.model.entity.comercial;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity


public class CelularPrePago extends Celular {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private double saldo;
    @Temporal(TemporalType.DATE)
    private Date diaDeValidade;
}
