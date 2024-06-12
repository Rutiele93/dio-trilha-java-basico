# DIO - Trilha Java Básico

#### Autores
- [Gleyson Sampaio](https://github.com/glysns)

## Desenvolvedora da solução: 
- [Rutiele Rios](https://github.com/Rutiele93)

## Sintaxe - Desafio
Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

## Sintaxe - Desafio

Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

1. Crie o projeto `ContaBanco` que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
2. Dentro do projeto, crie a classe `ContaTerminal.java` para realizar toda a codificação do nosso programa.

###### Revise sobre regras de declaração de variáveis

| Atributo  | Tipo     | Exemplo   
| --------- | ---------| ------- 
| Numero    | Inteiro  | 1021 
| Agencia   | Texto    | 067-8
| Nome Cliente | Texto    | MARIO ANDRADE
| Saldo | Decimal |237.48


###### Revise sobre terminal, main args e a classe Scanner
2. Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:

* Programa: "Por favor, digite o número da Agência !"
* Usuário: 1021 *(depois ENTER para o próximo campo)* 

###### Revise sobre concatenação e classe String com método concat

3. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:

*"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".*

## Descrição Lógica Desenvolvida Por Rutiele Rios:
A descrição da lógica desenvolvida para a solução desse desafio foi estruturada da seguinte maneira:

1. Definição da Classe Usuario:
- Foi criada uma classe chamada Usuario para representar as informações da conta bancária, como número da conta, agência, nome do cliente e saldo.
  
2. Atributos da Classe Usuario:

- A classe Usuario possui os seguintes atributos:
`numero:` int
`agencia:` String
`nomeCliente:` String
`saldo:` Double

3. Método `imprimir` na Classe `Usuario`:

- Foi implementado um método chamado `imprimir` que recebe como parâmetros o número da conta, a agência, o nome do cliente e o saldo.

4. Aula `ContaTerminal` :

- Na classe ContaTerminal, foi implementado o método mainsobre
- Foi criado um objeto da classe Usuario para manipular as informações da conta bancária.
- Utilizando a classe Scanner, o programa solicita ao usuário que insira os dados da conta, como número da conta, agência, nome do cliente e saldo.
- Após a inserção de todas as informações, o método imprimir do objeto usuario é chamado para exibir a mensagem final com os detalhes da conta.

5. Interatividade com o Usuário:

- Cada solicitação é acompanhada por uma mensagem indicando qual informação está sendo solicitada.
- Após a inserção de todas as informações, o programa agradece ao cliente e exibe os detalhes da conta, atraves do metodo `imprimir` existente no classe `Usuario`.
