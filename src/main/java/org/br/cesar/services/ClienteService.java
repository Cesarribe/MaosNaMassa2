package org.br.cesar.services;

import org.br.cesar.domain.Cliente;
import org.br.cesar.dao.IClienteDAO;
import org.br.cesar.exceptions.TipoChaveNaoEncontradaException;

public class ClienteService implements IClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO){

        this.clienteDAO = clienteDAO;
    }

    @Override
    public boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        clienteDAO.cadastrar(cliente);
        return true;
    }

    @Override
    public Cliente buscarPorCPF(long cpf) {

        return clienteDAO.consultar(cpf);
    }

    @Override
    public void excluir(long cpf) {
    clienteDAO.excluir(cpf);
    }

    @Override
    public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        cliente.setNome("CesarRibeiro");
        clienteDAO.alterar(cliente);

    }
}
