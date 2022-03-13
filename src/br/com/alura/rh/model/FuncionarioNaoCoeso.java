package br.com.alura.rh.model;

import java.math.BigDecimal;

public class FuncionarioNaoCoeso {
    private String nome;
    private String cpf;
    private Cargo cargo;
    private BigDecimal salario;
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String uf;

    public void formatarCpf() {
        // logica para formatacao do CPF
    }

    public void formatarCep() {
        // logica para formatacao do CEP
    }

    public void completarEndereco() {
        // logica para consulta ao WS dos correios
    }

    /*
    * Essa é uma classe não coesa.
    * Possui metodos e atributos que não estão relacionados a classe em si
    * Por exemplo, a classe é de funcionarios mas possui atributos e metodos relacionados a endereço
    */
}
