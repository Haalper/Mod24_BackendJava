package br.com.halisson.dao;


import br.com.halisson.domain.Contrato;

public interface IContratoDao {
    void salvar();
    Contrato buscar(Long id);
    void excluir(Long id);
    void atualizar(Contrato contrato);
}
