package tarefa;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Contato contato1 = new Contato("Nicollas", "19 1234-1234");
        Contato contato2 = new Contato("Feitosa", "55 3455-1234");

        agenda.armazenaContato(contato1);
        agenda.armazenaContato(contato2);
        agenda.removeContato(contato2);

        //agenda.imprimirLista();
        agenda.imprimeContato(agenda.buscaContato("Nicollas"));

        //agenda.imprimeContato(0);
    }
}
