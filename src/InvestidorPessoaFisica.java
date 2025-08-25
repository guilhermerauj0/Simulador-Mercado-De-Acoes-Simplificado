public class InvestidorPessoaFisica implements Investidor {
    String nome;

    public InvestidorPessoaFisica(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String codigoAcao, double novoPreco) {
        System.out.println("Notificacao para "+ nome + ":\nA acao " + codigoAcao + "teve se precco alterado para R$"+ novoPreco);
    }
}
