# POC - Design de Eventos com Java e Spring

## Descrição

Este projeto é uma prova de conceito (POC) que demonstra a implementação do padrão de design Command em uma aplicação bancária simples. A POC abrange a criação de correntistas, contas bancárias, atualização de saldo e pagamento programado utilizando Java e Spring Framework.

## Estrutura do Projeto

### Command Repository

O `Command Repository` é responsável por gerenciar as ações disponíveis para manipularem os correntistas e as contas bancárias. As principais ações disponíveis incluem:

- **GET**: Recuperar informações sobre correntistas e contas.
- **PATCH**: Atualizar detalhes de correntistas ou contas.
- **POST**: Criar novos correntistas e contas.
- **DELETE**: Remover correntistas e contas.

### Command Bank

O `Command Bank` executa operações financeiras relacionadas às contas bancárias. As principais ações disponíveis são:

- **Saque**: Retirar uma quantia da conta.
- **Depósito**: Adicionar uma quantia à conta.

## Funcionalidades

### 1. Criação de Correntista

Permite aos usuários cadastrar novos correntistas no sistema.

### 2. Criação de Conta Bancária

Após a criação do correntista, o sistema permite a criação de uma conta bancária associada a ele.

### 3. Atualização de Saldo

O saldo da conta pode ser atualizado a qualquer momento, seja através de depósitos ou saques.

### 4. Pagamento Programado

Os correntistas podem programar pagamentos para uma data futura, otimizando o gerenciamento de suas finanças.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Spring Framework**: Framework para desenvolvimento de aplicações Java.
- **Banco de Dados**: Utilização de um banco de dados (H2, MySQL, etc.) para persistência dos dados (especificar conforme a escolha).

## Referências
Para mais informações sobre o padrão de design Command, visite Refactoring Guru - Command Pattern. (https://refactoring.guru/pt-br/design-patterns/command)
