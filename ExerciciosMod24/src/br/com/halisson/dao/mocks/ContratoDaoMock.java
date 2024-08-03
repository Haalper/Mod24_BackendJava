package br.com.halisson.dao.mocks;


import br.com.halisson.dao.IContratoDao;
import br.com.halisson.domain.Contrato;


import java.util.HashMap;
import java.util.Map;

public class ContratoDaoMock implements IContratoDao {

    private Map<Long, Contrato> banco = new HashMap<>();

    @Override
    public void salvar() {

        Contrato contrato = new Contrato();
        contrato.setId((long) (banco.size() + 1));
        contrato.setTitulo("Contrato de Teste");
        contrato.setDescricao("Descrição do contrato de teste");
        banco.put(contrato.getId(), contrato);
    }

    @Override
    public Contrato buscar(Long id) {

        return banco.get(id);
    }

    @Override
    public void excluir(Long id) {

        banco.remove(id);
    }

    @Override
    public void atualizar(Contrato contrato) {

        banco.put(contrato.getId(), contrato);
    }
}
