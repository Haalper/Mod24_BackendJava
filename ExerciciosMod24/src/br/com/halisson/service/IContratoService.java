package br.com.halisson.service;


import br.com.halisson.domain.Contrato;

public interface IContratoService {
    String salvar();
    Contrato buscar(Long id);
    String excluir(Long id);
    String atualizar(Contrato contrato);
}
