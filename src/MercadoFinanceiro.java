public class MercadoFinanceiro {
    public static void main(String[] args) {
        Acao acao1 = new Acao("PETR4", 32.09);
        Acao acao2 = new Acao("VALE3", 29.09);

        InvestidorPessoaFisica investidor1 = new InvestidorPessoaFisica("Investidor 1");
        InvestidorPessoaFisica investidor2 = new InvestidorPessoaFisica("Investidor 2");
        InvestidorPessoaFisica investidor3 = new InvestidorPessoaFisica("Investidor 3");
        InvestidorPessoaFisica investidor4 = new InvestidorPessoaFisica("Investidor 4");
        InvestidorPessoaFisica investidor5 = new InvestidorPessoaFisica("Investidor 5");

        acao1.adicionarInvestidor(investidor1);
        acao1.adicionarInvestidor(investidor2);
        acao2.adicionarInvestidor(investidor3);
        acao2.adicionarInvestidor(investidor4);
        acao2.adicionarInvestidor(investidor5);

        acao1.setPreco(20.34);
    }
}