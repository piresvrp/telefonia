package ifSuldeMinas.Telefonia.model.entity;

import ifSuldeMinas.Telefonia.model.entity.comercial.Celular;
import ifSuldeMinas.Telefonia.model.entity.comercial.Plano;
import ifSuldeMinas.Telefonia.model.entity.pessoal.Cliente;

import java.util.Set;

public class Operadora {

    private String  nome;
    private Set<Cliente> clientes;
    private Set<Plano>planos;
    private Set<Celular> celulares;

}
