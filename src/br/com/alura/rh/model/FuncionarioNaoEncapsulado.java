package br.com.alura.rh.model;

public class FuncionarioNaoEncapsulado {
    private String nome;
    private String cpf;
    private Cargo cargo;
    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
