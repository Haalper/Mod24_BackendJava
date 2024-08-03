package br.com.halisson.dao;


import br.com.halisson.domain.Contrato;



public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public Contrato buscar(Long id) {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public void excluir(Long id) {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public void atualizar(Contrato contrato) {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }
}
