public class MercadoFinanceiro {
    public static void main(String[] args) {
        Acao acao1 = new Acao("PETR4", 32.09);
        Acao acao2 = new Acao("VALE3", 29.09);

        Investidor investidorJoao = new InvestidorPessoaFisica("João Silva");
        Investidor investidoraMaria = new InvestidorPessoaFisica("Maria Souza");
        Investidor investidorCarlos = new InvestidorPessoaFisica("Carlos Andrade");

        Corretora xpInvest = new Corretora("XP Invest");

        System.out.println(">>> Início da simulação com Corretora Intermediária.");
        System.out.println("--- Fase de Registro de Interesses ---");

        xpInvest.registrarCliente(investidorJoao, acao1);

        xpInvest.registrarCliente(investidoraMaria, acao1);
        xpInvest.registrarCliente(investidoraMaria, acao2);

        System.out.println("\n--- Fim da Fase de Registro ---\n");

        acao1.setPreco(20.34);
        acao2.setPreco(89.90);
        System.out.println("\n>>> Fim da simulação.");
    }
}