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

# (S) Single Responsibility Principle
- Principio da Responsabilidade unica.
- Soh pq vc pode colocar um sistema inteiro em uma unica classe, nao significa que vc deveria fazer assim
- "Uma classe deveria ter apenas um unico motivo para mudar" (Robert Martin, Uncle Bob)
- A classe tem que mudar sempre que tiver alguma alteracao relacionada a ela
- Ela soh nao pode mudar quando a mudança tem que acontecer em outra classe... Se mudar outra classe significar ter que mudar a classe funcionario, significa que tem algum problema de SRP
- Esse principio tem o objetivo de deixar as classes coesas

# (O) Open Closed Principle
- Principio do aberto fechado
- Vc nao precisa abrir seu peito pra colocar um casaco
- Usamos interface e polimorfismo para tornar a classe mais extensivel
- "Entidades de software (classes, modulos, funcoes e etc) devem estar abertas para extensao, porem fechadas para modificacao" (Bertrand Meyer)
- Quanto menos modificarmos uma classe menos bug a ser introduzido no software

# (L) Liskov Substitution Principle
- Se parece com um pato faz quack igual um pato mas precisa de baterias, entao nao eh um pato, ta usando abstracao da maneira incorreta
- Usar heranca errado, acaba tendo comportamentos errados.
- "Se q(x) eh uma propriedade demonstravel dos objetos x de tipo T, entao q(y) deve ser verdadeiro para objetos y de tipo S, onde S eh um subtipo de T" (Barbara Liskov)
- Se ferir o principio de Liskov, entao o uso da heranca estah incorreto!

# (I) 

# (D) 

### Extras
- Tomar cuidado com herança. O ideal eh favorecer a composicao ao inves da heranca.
- Em alguns casos eh possivel que a composicao seja melhor que heranca.
- A composicao eh uma classe com informacoes coincidentes entre duas classes
- Pode ser que essa informacao estava em uma classe e vc queira usar em outra
- Ao inves de estender dessa classe, tirar as informacoes coincidentes para uma pequena classe e instancanciar nas duas classes. Isso eh composicao.
- 