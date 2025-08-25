import java.util.ArrayList;
import java.util.List;

public class Acao {
    String codigo;
    double preco;

    List<Investidor> investidores;
    public Acao(String codigo, double preco) {
        this.codigo = codigo;
        investidores = new ArrayList<>();
    }

    public void adicionarInvestidor(Investidor investidor) {
        investidores.add(investidor);
    }

    public void removerInvestidor(Investidor investidor) {
        investidores.remove(investidor);
    }

    public void notificarInvestidores() {
        for (Investidor investidor : investidores) {
            investidor.atualizar(codigo, preco);
        }
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
        notificarInvestidores();
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


}
