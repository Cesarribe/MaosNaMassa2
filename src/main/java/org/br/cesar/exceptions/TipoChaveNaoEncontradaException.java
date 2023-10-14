package org.br.cesar.exceptions;

public class TipoChaveNaoEncontradaException extends Throwable {

    private static final long serialVersionUID = -1389494676398525746L;
    public TipoChaveNaoEncontradaException(String msg) {
        this(msg, null);
    }

    public TipoChaveNaoEncontradaException(String msg, Throwable e) {
        super(msg, e);
    }
}
