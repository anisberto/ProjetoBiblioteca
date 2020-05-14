package persistencia;

import java.util.ArrayList;
import modelos.classes.Editora;
import modelos.interfaces.IcrudEditora;

public class EditoraPersistencia implements IcrudEditora {

    private String nomeDoArquivoNoDisco;

    public EditoraPersistencia(String nomeDoArquivo) {
        this.nomeDoArquivoNoDisco = nomeDoArquivo;
    }

    @Override
    public void incluir(Editora editoraObjeto) throws Exception {
        System.out.println("Estou gravando no arquivo! ");
    }

    @Override
    public void alterar(Editora antigoEditora, Editora atualEditora) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Editora> listagem() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
