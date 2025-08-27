import java.util.List;

public class Corretora implements Investidor {
    private String nome;

    public Corretora(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String codigoAcao, double novoPreco) {
        System.out.println(String.format("\n[Corretora %s]: ALERTA! Mudanca de preco em %s. Notificando clientes...\n", this.nome, codigoAcao));

        List<Investidor> clientesInteressados = clientesPorAcao.get(codigoAcao);
        if(clientesInteressados != null) {
            for(Investidor cliente : clientesInteressados) {
                cliente.atualizar(codigoAcao, novoPreco);
            }
        }
    }
}
