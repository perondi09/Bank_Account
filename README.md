# Projeto de Controle de Conta Bancária

## 📑 Descrição
Este projeto implementa uma aplicação simples para controlar uma conta bancária, seja ela virtual ou física. O usuário pode realizar operações como consulta de saldo, depósito e saque, além de visualizar informações básicas da conta.

## 🔨 Funcionalidades
Cabeçalho Inicial: Exibe os dados do cliente, como Nome, Tipo da Conta e Saldo Inicial.
Menu Interativo: O menu apresenta opções para:
Realizar um depósito (entrada de valores).
Efetuar um saque (saída de valores), com verificação de saldo suficiente.
Consultar o saldo atual da conta.
Finalizar a aplicação.
Validação de Operações: O sistema garante que não seja possível sacar valores maiores do que o saldo disponível.
Loop do Menu: O menu será exibido repetidamente até que o usuário selecione a opção de saída.
Tratamento de Erros: Caso uma opção inválida seja escolhida, uma mensagem de erro é exibida.

## 🛠️ Tecnologias Utilizadas
Linguagem: Java
Bibliotecas: java.util.Scanner para a leitura de entradas do usuário.

## 📋 Requisitos
Java 8 ou superior instalado no seu sistema.

## 💻 Funcionalidades do Sistema
O sistema oferece as seguintes opções:

Entrada de Valor (Depósito): Adiciona o valor inserido ao saldo da conta.
Saída de Valor (Saque): Subtrai o valor inserido do saldo da conta, desde que haja saldo suficiente.
Consulta de Saldo: Mostra o saldo atual da conta.
Finalizar: Encerra a aplicação.
