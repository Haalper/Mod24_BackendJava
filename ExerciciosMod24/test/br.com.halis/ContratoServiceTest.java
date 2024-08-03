package br.com.halis;

import br.com.halisson.dao.ContratoDao;
import br.com.halisson.dao.IContratoDao;
import br.com.halisson.dao.mocks.ContratoDaoMock;
import br.com.halisson.domain.Contrato;
import br.com.halisson.service.ContratoService;
import br.com.halisson.service.IContratoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContratoServiceTest {

    private IContratoService contratoService;
    private IContratoDao contratoDaoMock;

    @Before
    public void setUp() {
        contratoDaoMock = new ContratoDaoMock();
        contratoService = new ContratoService(contratoDaoMock);
    }

    @Test
    public void salvarTest() {
        String retorno = contratoService.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        service.salvar();
    }

    @Test
    public void buscarTest() {
        contratoService.salvar(); // Salva um contrato para buscar
        Contrato contrato = contratoService.buscar(1L);
        Assert.assertNotNull(contrato);
        Assert.assertEquals("Contrato de Teste", contrato.getTitulo());
    }

    @Test
    public void excluirTest() {
        contratoService.salvar(); // Salva um contrato para excluir
        String resultado = contratoService.excluir(1L);
        Assert.assertEquals("Exclusão realizada com sucesso", resultado);
        Contrato contrato = contratoService.buscar(1L);
        Assert.assertNull(contrato); // Verifica se o contrato foi excluído
    }

    @Test
    public void atualizarTest() {
        contratoService.salvar(); // Salva um contrato para atualizar
        Contrato contrato = contratoService.buscar(1L);
        contrato.setTitulo("Contrato Atualizado");
        String resultado = contratoService.atualizar(contrato);
        Assert.assertEquals("Atualização realizada com sucesso", resultado);
        Contrato contratoAtualizado = contratoService.buscar(1L);
        Assert.assertEquals("Contrato Atualizado", contratoAtualizado.getTitulo());
    }
}
