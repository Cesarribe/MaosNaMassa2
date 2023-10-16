package org.br.cesar.services.generics;

import org.br.cesar.domain.Persistente;
import org.br.cesar.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericService <T extends Persistente, E extends Serializable> {


    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;


    public void excluir(E valor);


    public void alterar(T entity) throws TipoChaveNaoEncontradaException;

    public T consultar(E valor);


    public Collection<T> buscarTodos();

}
