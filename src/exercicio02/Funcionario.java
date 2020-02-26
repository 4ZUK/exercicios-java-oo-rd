package exercicio02;

public abstract class Funcionario {
    String nome;
    Double salarioMensal;

    public Funcionario(Double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(Double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    void salarioAnual(double salarioMensal){
        Double salarioAnual = (salarioMensal*13);
    }

}
