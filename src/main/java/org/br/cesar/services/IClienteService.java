package org.br.cesar.services;

import org.br.cesar.domain.Cliente;
import org.br.cesar.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {
    boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarPorCPF(long cpf);

    void excluir(long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;;
}
