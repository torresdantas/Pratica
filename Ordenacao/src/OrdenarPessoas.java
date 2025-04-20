import java.util.ArrayList;
import java.util.List;

public class OrdenarPessoas {
    private List<Pessoa> pessoaLista;

    public OrdenarPessoas(){
        this.pessoaLista = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaLista.add(new Pessoa(nome, idade, altura));
    }

}
