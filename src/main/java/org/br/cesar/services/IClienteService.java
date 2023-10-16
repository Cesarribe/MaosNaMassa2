package org.br.cesar.services;

import org.br.cesar.domain.Cliente;
import org.br.cesar.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {
    Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;


}
