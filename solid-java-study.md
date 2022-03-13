# Coesão

#### Classes nao coesas tendem a crescer indefinidamente, o que as tornam dificeis de manter
- Eh possivel verificar um exemplo de classe nao Coesa na classe FuncionarioNaoCoeso

#### Classes coesas executam bem a sua UNICA tarefa, de forma concisa.

# Encapsulamento

#### Incluir ou proteger alguma coisa em uma capsula
- A ideia eh proteger uma classe contra influencias externas, manipulações externas que podem prejudicar a consistencia das informacoes
- Eh possivel verificar um exemplo de classe nao encapsulada na classe FuncionarioNaoEncapsulado
- Lah o metodo setSalario eh um metodo sem validacao alguma para salario, qualquer classe que instanar Funcionario pode fazer um Set no salario sem validacao
- "Classes nao encapsuladas permitem violacao de regras de negocio, alem de aumentarem o acomplamento"
- Getters e setters por si só não fornecem nenhum tipo de encapsulamento.
- Encapsulamento ajuda no uso correto dos objetos.

# Acoplamento

#### Acao de acoplar, agrupamento aos pares
- Exemplo ruim:
```
double valorTotalReajusts = 0;
List<Reajuste> reajustes = funcionario.getReajustes();
for(Reajuste r : reajustes) {
    valorTotalReajustes += r.getValor();
}
```
- Fazer uma regra de negocio que devia estar dentro da classe Funcionario, dentro de outra classe que ta chamando a classe funcionario. É um forte acoplamento.
- "Classes acopladas causam fragilidade no codigo da aplicacao, o que dificulta a sua manutencao"

