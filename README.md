# Exercícios Java Santander Code Girls
#### Curso: Variáveis, Tipos de Dados e Operadores Matemáticos em Java da DIO Santander Code Girls
#### Curso: Entendendo Metódos Java da DIO Santander Code Girls
#### Curso: Lógica Condicional e Controle de Fluxos em Java da DIO Santander Code Girls  
#### Curso: Estruturas de Repetição e Arrays em Java
#### Curso: Trabalhando com Collections Java


### Variáveis; Conceituação o que é uma variável? "Um espaço na memória do computador, onde se pode guardar valores."


##### Existem 4 tipos
- Instância: objeto
- Classe: classe
- Local: local dentro de metódos
- Parâmetro: na assinatura do metódo
  
Padrão de definição
- Visibilidade: "public", "protected" e "private"
- Modificador: "static" e "final"
- Tipo: tipo de dado
- Nome: nome que é fornecido a variável
- Valor inicial: um valor inicial, caso se deseje

Convesões e regras
- Não devem começar com números
- Embora permitido, "$" e "_" devem ser evitados
- São case-sensitive
- Sem espaços
- Não podem ser as palavras reservadas do Java

### Tipos de dados: Conceituação tipos de dados? "São os valores e consequentemente operações que as variáveis podem assumir e sofrer, respectivamente."

Tipificação
- Estâtica(forte) vs Dinâmica(fraco)
- Primitivo vs Composto

Opções de tipos de dados
- Textual
- Numeral
- Lógico
- Objeto

Exemplo Numeral
- byte
- short
- int
- long
- float
- double
Exemplo Textual
- char caractere se usa aspas ''
- string como dado textual composto se usa ""
Exemplo Lógico
- boolen true e false
Exemplo de Objeto (vai ser visto em outra aula está e bem básica introdutória)

### Operadores Aritméticos: Conceituação "São símbolos especiais quais são capazes de realizar ações específicas em um, dois ou mais operandos e, em seguida retornar um resultado."

Tipos com precedência
- Pós-fixado: exp++ ou exp-- (usa a expressão e depois soma ou subtrai)
- Prefixado: ++exp, --exp (usa a soma ou subtração e depois avalia e usa a expressão)
- Aritmético Multiplicativo: *, /, %
- Aritmético Aditivo: +,-
- Atribuição: =, +=, -=, *=, /=, %=

### Conversões (Casting): Conceituação "É a transformação de uma determinada variável de tipo menos especifico para um tipo mais especifico ou vice versa."

Tipos
- Upcast(implicíto) tipo menor para um menor é sempre permitido
- Downcast(explicíto) tipo maior para um menor que se deve ter cuidado com a perda de dados, envolve uma verificação de tipo e pode gerar a ClassCastException

### Metódo: Conceituação "É uma porção de código (sub-rotina) que é disponibilizada por uma classe. Este é executado quando é feito uma requisição a ele. São responsáveis por definir e realizar um determinado comportamento."

Padrão de definição
- Visibilidade: "public", "protected" e "private"
- Tipo: concreto ou abstrato
- Modificador: "static" e "final"
- Retorno: tipo de dado ou "void"
- Nome: que é fornecido ao metódo
- (Parâmetros): parâmetros que pode receber
- Exceções: exceções que pode lançar
- Corpo: código que possui ou vazio 
Retorno, nome, (), e o corpo são sempre obrigatórios

Utilização: Passa-se uma mensagem através de uma classe ou objeto. Por padrão a classe se inicia com a primeira letra maiúscula, e o objeto com a primeira letra minúscula.

Particularidades
- Assinatura: É a forma de identificar unicamente o metódo. Exemplo: Ass = nome + parâmetros
- Construtor e Destrutor: São metódos especiais usado na orientação a objetos
- Mensagem: É o ato de solicitar ao método que o mesmo execute. Esta pode ser direcionada a um objeto ou a uma classe.

Boas Práticas
- Nomes devem ser descritivos, mas curtos
- Notação camelo
- Deve possuir entre 80 e 120 linhas
- Evite lista de parâmetros longas
- Visibilidades adequadas

### Sobrecargas: Conceituação "É a capacidade de definir métodos para diferentes contextos, mas preservando seu nome. "
O mesmo metódo vai se comportar de forma diferente ele mantém o mesmo nome, se muda a origem de parâmetros
Alterar a assinatura do método: Ass = nome + parâmetros

Retornos
O método executa seu retorno quando
- Completa todas suas instruções internas
- Chega a uma declaração explícita de retorno
- Ou lança uma exceção
- É uma instrução de interrupção
- Simbologia: return

Considerações
- O tipo de retorno do método é definido na sua criação e pode ser um tipo primitivo ou objeto
- O tipo de dado do return deve ser compatível com o do método
- Se o método for sem retorno(void), pode ou não ter um "return" para encerrar sua execução

### Operadores Lógicos: Conceituação "São simbolos especias quais são capazes de realizar comparações operações lógicas entre operandos lógicos ou expressões e, em seguida retornar um resultado."

Similaridade
- Igualdade ==
- Diferença !=
- Maior >
- Maior igual >=
- Menor <
- Menor <=

Tipos
- Conjunção: && and(e) necessário que ambas comparações sejam true para true
- Disjunção: || or(ou) basta uma das comparações ser true para true
- Disjunção Exclusiva: ^ xor quando as comparações são inversas é true
- Negação: ! inverte o resultado se false será tue ou vice versa

Controle de fluxo
- Decisão: if, if-else, if-else-if, swicth e operador ternário
- Repetição: for, while e do while
- Interrupção: breack, continue, return

  



  


  

