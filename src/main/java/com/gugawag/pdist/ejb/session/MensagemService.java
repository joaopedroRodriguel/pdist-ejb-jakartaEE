package com.gugawag.pdist.ejb.session;

import com.gugawag.pdist.modelo.Mensagem;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

import java.util.List;
@Stateless(name="mensagemService")
public class MensagemService {

    @EJB
    private MensagemDao mensagemDao;

    public List<Mensagem> listar() {
        return mensagemDao.listar();
    }

    public void inserir(long id, String mensagem) {
        Mensagem novaMensagem = new Mensagem(id, mensagem);
        mensagemDao.inserir(novaMensagem);
    }

    public Mensagem buscarById(long id) {
        return mensagemDao.pesquisarPorId(id);
    }
}
