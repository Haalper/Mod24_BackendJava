package br.com.halisson.service;


import br.com.halisson.dao.IContratoDao;
import br.com.halisson.domain.Contrato;


public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public Contrato buscar(Long id) {
        return contratoDao.buscar(id);
    }

    @Override
    public String excluir(Long id) {
        contratoDao.excluir(id);
        return "Exclusão realizada com sucesso";
    }

    @Override
    public String atualizar(Contrato contrato) {
        contratoDao.atualizar(contrato);
        return "Atualização realizada com sucesso";
    }
}
