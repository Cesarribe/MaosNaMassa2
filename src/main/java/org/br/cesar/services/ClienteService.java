package org.br.cesar.services;

import org.br.cesar.domain.Cliente;
import org.br.cesar.dao.IClienteDAO;
import org.br.cesar.exceptions.TipoChaveNaoEncontradaException;
import org.br.cesar.services.generics.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
        this.clienteDAO = clienteDAO;
    }

	@Override
	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		return clienteDAO.cadastrar(cliente);
	}

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return this.dao.consultar(cpf);
    }
}