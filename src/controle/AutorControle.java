package controle;

import java.util.ArrayList;
import modelos.classes.Autor;
import persistencia.AutorPersistencia;
import modelos.interfaces.ICRUDAutor;

public class AutorControle implements ICRUDAutor {

    ICRUDAutor autorPersistencia = null;

    public AutorControle(String nomeDoArquivoNoDisco) {
        autorPersistencia = new AutorPersistencia(nomeDoArquivoNoDisco);
    }

    public AutorPersistencia getAutorPersistencia() {
        return (AutorPersistencia) autorPersistencia;
    }

    public void setAutorPersistencia(AutorPersistencia autorPersistencia) {
        this.autorPersistencia = autorPersistencia;
    }

    @Override
    public void incluir(Autor autorObj) throws Exception {
        try {
            autorPersistencia.incluir(autorObj);
        } catch (Exception errorApi) {
            throw errorApi;
        }
    }

    @Override
    public void alterar(Autor antigoAuto, Autor autorAtual) throws Exception {
        try {
            autorPersistencia.alterar(antigoAuto, autorAtual);
        } catch (Exception errorApa) {
            throw errorApa;
        }
    }

    @Override
    public ArrayList<Autor> listagem() throws Exception {
        try {
            return autorPersistencia.listagem();
        } catch (Exception errorApl) {
            throw errorApl;
        }
    }

    @Override
    public void excluir(String nome) throws Exception {
        try {
            autorPersistencia.excluir(nome);
        } catch (Exception erroExcluir) {
            throw erroExcluir;
        }
    }

    @Override
    public Autor getNomeAutor(String nomeAutor) throws Exception {
        try {
            return autorPersistencia.getNomeAutor(nomeAutor);
        } catch (Exception erroControleAutorListarNome) {
            throw erroControleAutorListarNome;
        }
    }

    @Override
    public Autor getIdAutor(int idAutor) throws Exception {
        try {
            return autorPersistencia.getIdAutor(idAutor);
        } catch (Exception e) {
            throw e;
        }
    }
}
