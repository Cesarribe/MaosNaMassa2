package org.br.cesar.services.generics;

import org.br.cesar.dao.IClienteDAO;
import org.br.cesar.dao.generics.IGenericDAO;
import org.br.cesar.domain.Cliente;
import org.br.cesar.domain.Persistente;
import org.br.cesar.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public abstract class GenericService<T extends Persistente, E extends Serializable>
        implements IGenericService<T, E> {

    protected IGenericDAO<T,E> dao;

    public GenericService(IClienteDAO dao) {
        this.dao = (IGenericDAO<T, E>) dao;
    }

    @Override
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException {
        return this.dao.cadastrar(entity);
    }

    @Override
    public void excluir(E valor) {
        this.dao.excluir((Long) valor);
    }

    @Override
    public void alterar(T entity) throws TipoChaveNaoEncontradaException {
        this.dao.alterar(entity);
    }

    @Override
    public T consultar(E valor) {
        return this.dao.consultar((Long) valor);
    }

    @Override
    public Collection<T> buscarTodos() {
        return this.dao.buscarTodos();
    }

    public abstract Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;
}