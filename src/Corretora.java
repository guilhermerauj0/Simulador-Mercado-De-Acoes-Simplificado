import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Corretora implements Investidor {
    private String nome;

    private Map<String, List<Investidor>> clientesPorAcao = new HashMap<>();

    public Corretora(String nome) {
        this.nome = nome;
    }


    public void registrarCliente(Investidor cliente, Acao acao) {
        String codigoAcao = acao.getCodigo();

        // Se for a primeira vez que um cliente se interessa por esta ação,
        // a corretora precisa começar a observar a ação.
        if(!clientesPorAcao.containsKey(codigoAcao)){
            acao.adicionarInvestidor(this); // A corretora se torna um observer da ação
            System.out.println(String.format("[Corretora %s]: Cliente registrado para receber atualizacoes de %s\n", this.nome, codigoAcao));

        }

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
