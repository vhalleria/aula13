// Subclasse: Funcionário Comissionado
class FuncionarioComissionado extends Funcionario {
    private double vendas;
    private double percentualComissao;

    public FuncionarioComissionado(String nome, double vendas, double percentualComissao) {
        super(nome);
        this.vendas = vendas;
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularSalario() {
        return vendas * percentualComissao;
    }
}

