package dao;

import org.br.cesar.domain.Cliente;
import org.br.cesar.dao.IClienteDAO;
import org.br.cesar.exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {
    private Cliente cliente;
    private IClienteDAO clienteDAO;

    public ClienteDAOTest(){
        clienteDAO = new ClienteDAOMock();
    }

        @Before
        public void init () throws TipoChaveNaoEncontradaException {
            cliente = new Cliente();
            cliente.setCpf(123456789);
            cliente.setNome("Cesar ribeiro");
            cliente.setCidade("Carpina");
            cliente.setEnd("Av. Dr goncalves");
            cliente.setEstado("Pernambuco");
            cliente.setTel(98073348L);
            clienteDAO.cadastrar(cliente);

        }
        @Test
    public void pesquisarCliente() {

        Cliente clienteConsultado = clienteDAO.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);

    }

    @Test
    public void excluirCliente (){

        clienteDAO.excluir(cliente.getCpf());
    }

    @Test
    public void salvarCliente () throws TipoChaveNaoEncontradaException {

        Boolean retorno = clienteDAO.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }
    @Test
    public void alterarCliente () throws TipoChaveNaoEncontradaException {
        cliente.setNome("CesarRibeiro");
        clienteDAO.alterar(cliente);
        Assert.assertEquals("CesarRibeiro", cliente.getNome());
    }
}

