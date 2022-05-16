package ifSuldeMinas.Telefonia.model.entity.comercial;

import ifSuldeMinas.Telefonia.model.entity.pessoal.Cliente;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Celular {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long numero;
    private Cliente cliente;
    private Set<Ligacao> ligacoes;
    private Set<Plano>plano;

}
