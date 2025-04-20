import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatoList;

    public Agenda(){
        this.contatoList = new ArrayList<>();
    }

    public void adicionarContato(String nome, String telefone){
        Contato contato = new Contato(nome, telefone);
        this.contatoList.add(contato);
    }
    public void removerContato(String nome){
        Contato contatoParaRemover = null;
        if(!contatoList.isEmpty()){
            for(Contato c : contatoList){
                if(c.getNome().equalsIgnoreCase(nome)){
                    contatoParaRemover = c;
                    break;
                }
            }
            if(contatoParaRemover != null){
                contatoList.remove(contatoParaRemover);
            }
        }
    }
    public Contato pesquisarContato(String nome){
        Contato pesquisador = null;
        if(!contatoList.isEmpty()){
            for(Contato c : contatoList){
                if(c.getNome().equalsIgnoreCase(nome)){
                    pesquisador = c;
                    break;
                }
            }
        }
        return pesquisador;
    }
    public List<Contato> exibirContatos(){
        return contatoList;
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();


        agenda.adicionarContato("Mah", "1234");
        agenda.adicionarContato("Daniela", "4444+");
        agenda.removerContato("Mah");
        System.out.println(agenda.exibirContatos());

        System.out.println("................................");
        System.out.println(agenda.pesquisarContato("Mah"));
    }
}
