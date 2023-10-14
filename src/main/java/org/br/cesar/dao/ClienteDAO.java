package org.br.cesar.dao;

import org.br.cesar.dao.generics.GenericDAO;
import org.br.cesar.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDAO {


    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {

    }

    public ClienteDAO(){
        super();
    }
}
