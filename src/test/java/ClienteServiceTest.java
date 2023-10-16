import dao.ClienteDAOMock;
import org.br.cesar.domain.Cliente;
import org.br.cesar.dao.IClienteDAO;
import org.br.cesar.exceptions.TipoChaveNaoEncontradaException;
import org.br.cesar.services.ClienteService;
import org.br.cesar.services.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTest {

    private IClienteService clienteService;
    private Cliente cliente;

    public ClienteServiceTest(){
        IClienteDAO dao = new ClienteDAOMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init (){
        cliente = new Cliente();
        cliente.setCpf(123456789);
        cliente.setNome("Cesar ribeiro");
        cliente.setCidade("Carpina");
        cliente.setEnd("Av. Dr goncalves");
        cliente.setEstado("Pernambuco");
        cliente.setTel(98073348L);


    }

    @Test
    public void pesquisarCliente (){

        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);

    }
    @Test
    public void salvarCliente () throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteService.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }
    @Test
    public void excluirCliente (){

        clienteService.excluir(cliente.getCpf());
    }


    @Test
    public void alterarCliente () throws TipoChaveNaoEncontradaException {
        cliente.setNome("CesarRibeiro");
        clienteService.alterar(cliente);
        Assert.assertEquals("CesarRibeiro", cliente.getNome());
    }
}
