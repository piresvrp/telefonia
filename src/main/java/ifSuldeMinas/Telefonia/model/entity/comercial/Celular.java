package ifSuldeMinas.Telefonia.model.entity.comercial;

import ifSuldeMinas.Telefonia.model.entity.pessoal.Cliente;
import java.util.Set;

public class Celular {
    private long numero;
    private Cliente cliente;
    private Set<Ligacao> ligacoes;
    private Set<Plano>plano;

}
