package br.com.halisson.service;

import br.com.halisson.dao.ClienteDao;
import br.com.halisson.dao.ClienteDaoMock;
import br.com.halisson.dao.IClienteDao;


public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }
}
