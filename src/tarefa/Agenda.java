package tarefa;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos = new ArrayList<>();

    private List<Contato> getContatos() {
        return contatos;
    }

    private void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public void armazenaContato(Contato contato) {
        this.contatos.add(contato);
    }

    public void removeContato(Contato contato) {
        this.contatos.remove(contato);
    }

    public void imprimirLista() {
        for (Contato contato: contatos) {
            System.out.println(contato);
        }
    }

    public void imprimeContato(int index) {
        Contato contato = this.contatos.get(index);
        System.out.println(contato);
    }

    public int buscaContato(String nome) {
        for(Contato contato: contatos) {
            if (contato.getNome().equals(nome)) {
                return contatos.indexOf(contato);
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contatos=" + contatos +
                '}';
    }
}
