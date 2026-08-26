**Documento de Especificação de Requisitos** 

| *Projeto: Controle de Gastos Pessoais  Data de Criação: 20/08/2026  Autor: Luara Matos Cargo: Estudante* |
| :---- |

**Revisão: 01**  
**Conteúdo** 

1 Introdução 

1.1 Objetivo 

1.2 Escopo do produto 

1.3 Definições, Acrônimos e Abreviações 2 Descrição geral 

2.1 Modo de Operação 

2.2 Funções do produto 

2.3 Usuários e sistemas externos 

2.4 Restrições 

2.5 Requisitos Adiados 

3 Requisitos específicos 

3.1 Requisitos Funcionais 

3.2 Requisitos Não-Funcionais 

3.2.1 Desempenho 

3.2.2 Usabilidade 

3.2.3 Segurança 

3.2.4 Expansibilidade 

3.3 Requisitos de Interface 

3.3.1 Interfaces de Usuário 

3.3.2 Interfaces de Hardware 

3.3.3 Interfaces de Software 

3.3.4 Interfaces de Comunicação 

4 Restrições e Limitações 

5 Glossário 

6 Referências 

7 Aprovação  
**1 Introdução** 

O sistema de Controle de Gastos Pessoais tem como finalidade organizar e facilitar o controle das despesas do usuário, permitindo registrar e acompanhar os gastos realizados no dia a dia. O sistema possibilitará o cadastro de despesas, informando dados como descrição, valor, categoria e data, além da consulta dos gastos registrados e do valor total das despesas.

Público-alvo: Pessoas que desejam organizar e acompanhar seus gastos pessoais, facilitando o controle das despesas do dia a dia.

 **1.1 Objetivo** 

Este documento tem como objetivo apresentar de forma detalhada os requisitos funcionais e não funcionais do sistema de Controle de Gastos Pessoais. Ele servirá como guia para o desenvolvimento do software, descrevendo as funcionalidades, características e necessidades que serão abordadas na implementação. 

**1.2 Escopo do produto** 

O escopo deste documento abrange as funcionalidades e características do sistema de Controle de Gastos Pessoais, desde o cadastro de uma nova despesa pelo usuário, passando pelo registro de informações como descrição, valor total das despesas. O sistema terá como foco auxiliar o usuário na organização e no acompanhamento de seus gastos pessoais.

**1.3 Definições, Acrônimos e Abreviações** 

| Nº  | Sigla  | Definição |
| :---- | :---- | :---- |
| 01  | RF  | Requisito funcional |
| 02  | RFN  | Requisito não funcional |
| 03  | CAD | Cadastro de despesa |
| 04  | CD | Controle de despesas |
| 05  |    CG | Controle de gastos |
| 06  | VD  | Visualização de despesas |
| 07  | TD  | Total de despesas |

08 PDF Portable Document Format (formato de documento portátil) 

**2 Descrição geral** 

**2.1 Modo de Operação** 

O sistema de Controle de Gastos Pessoais opera como uma ferramenta voltada para a organização e o acompanhamento das despesas do usuário. Ele permite registrar os gastos realizados no dia a dia, informando dados com descrição, valor, categoria e data, além de consultar as despesas cadastradas e o valor total dos gastos. O principal ator do sistema é o usuário, responsável pelo cadastro e acompanhamento de suas despesas.

**2.2 Funções do produto** 

| Nº  | Função  | Descrição |
| :---- | :---- | :---- |
| 01  | Cadastrar gastos | O usuário pode cadastrar um novo gasto, informando descrição, valor, categoria e data. |
| 02  | Consultar gastos | O usuário pode visualizar os gastos que foram cadastrados no sistema. |
| 03  | Editar gasto | O usuário pode alterar as informações de um gasto já cadastrado. |
| 04  | Excluir gasto | O usuário pode excluir um gasto cadastrado. |
| 05 | Calcular total de gastos | O sistema calcula e apresenta o valor total dos gastos registrados. |
| 06 | Categorizar gastos | O usuário pode classificar os gastos em categorias, como alimentação, transporte, lazer e outras. |
| 07 | Consultar resumo dos gastos | O sistema apresenta um resumo de gastos registrados, auxiliando o usuário no acompanhamento de suas despesas. |

**2.3 Usuários e sistemas externos** 

| Nº  | Usuário  | Descrição |
| :---- | :---- | :---- |
| 01  | Usuário | Pessoa responsável por cadastrar, consultar, editar e excluir seus próprios gastos e acompanhar suas despesas. |
| 02  | Sistema Financeiro | Responsável pelo armazenamento e organização das informações de gastos cadastradas pelo usuário. |
| 03  | Calculadora do Sistema | Responsável por realizar automaticamente os cálculos dos valores gastos e do total das despesas. |

**2.4 Restrições**

| Nº  | Tipo  | Descrição |
| :---- | :---- | :---- |
| 01  02  03  | Software  Hardware  Segurança | O sistema deverá ser desenvolvido utilizando a linguagem Java e executado em um computador compatível com o ambiente de desenvolvimento utilizado.  O sistema deverá funcionar em computador com recursos suficientes para executar o programa e armazenar os dados dos gastos. As informações financeiras cadastradas pelo usuário deverão ser armazenadas de forma protegida e acessíveis somente ao próprio usuário. |
| 04  | Usabilidade | O sistema deverá possuir uma interface simples e fácil de utilizar, permitindo que o usuário cadastre e consulte seus gastos sem dificuldade. |

| Nº  | Tipo  | Descrição |
| :---- | :---- | :---- |
| 05  | Processo | Os cálculos dos valores totais deverão ser realizados automaticamente pelo sistema a partir dos gatos cadastrados pelo usuário. |

**2.5 Requisitos Adiados**

| Nº  | Referência  | Detalhes |
| :---- | :---- | :---- |
| 01  | Relatório de Gastos  | O sistema poderá gerar relatórios mais detalhados sobre os gastos realizados pelo usuário. |
| 02  | Gráficos | O sistema poderá apresentar gráficos para facilitar a visualização dos gastos por categoria. |

**3 Requisitos específicos** 

**3.1 Requisitos Funcionais** 

| Código Nome  | Descrição |
| :---- | :---- |
| RF01 Cadastro de Gastos | O usuário deverá ser capaz de cadastrar um gasto, informando descrição, valor, categoria e data. |
| RF02 Consulta de Gastos | O usuário deve poder visualizar os gastos cadastrados no sistema. |
| RF03 Edição de Gastos | O usuário deve poder editar as informações de um gasto já cadastrado. |
| RF04 Exclusão de Gastos  RF05 Categorização de Gastos |   O usuário deve poder excluir um gasto cadastrado no sistema. O usuário deve poder classificar cada gasto em uma categoria, como alimentação, transporte, lazer e outras. |
| RF06 Cálculo do Total | O sistema deve calcular automaticamente o valor total dos gastos cadastrados. |
| RF07 Consulta por Categoria | O usuário deve poder consultar os gastos de acordo com a categoria escolhida. |
| RF08 Resumo dos Gastos | O sistema deve apresentar um resumo dos gastos cadastrados, facilitando o acompanhamento das despesas.  |

**3.2 Requisitos Não-Funcionais** 

***3.2.1 Desempenho*** 

| Código Requisito / Aplicação  | Descrição |
| :---- | :---- |
| RNF01 Aplicação | O sistema deve apresentar os gastos cadastrados e os valores totais em tempo reduzido. |
| RNF02 Aplicação | O sistema deve realizar o cálculo do total das despesas sem demora perceptível para o usuário. |

***3.2.2 Usabilidade***

| Código Requisito / Aplicação  | Descrição |
| :---- | :---- |
| RNF03 Design intuitivo  RNF04 Orientação ao usuário | O sistema deve possuir uma interface simples, organizada e de fácil utilização .  Os campos e opções do sistema devem apresentar informações claras para auxiliar o usuário durante o cadastro e consulta dos gastos. |

***3.2.3 Segurança*** 

| Código Requisito / Aplicação  | Descrição |
| :---- | :---- |
| RNF05 Proteção dos dados | As informações financeiras cadastradas pelo usuário devem ser protegidas contra alterações ou acesso indevido. |

***3.2.4 Expansibilidade*** 

| Código Requisito / Aplicação  | Descrição |
| :---- | :---- |
| RNF06 Arquitetura Modular | O sistema deve ser desenvolvido de forma organizada e modular, permitindo futuras expansões, como inclusão de gráficos, relatórios e novas funcionalidades. |

**3.3 Requisitos de Interface** 

***3.3.1 Interfaces de Usuário*** 

| Nº  | Nome  | Descrição |
| :---- | :---- | :---- |
| 01  | Tela de Cadastro | Interface online para o administrador cadastrar e gerenciar as unidades de atendimento. |
| 02  | Tela de Consulta | Interface para o usuário visualizar o total e  gastos cadastrados. |
| 03  | Tela de Edição | Interface para o usuário alterar as informações de um gasto já cadastrado. |
| 04  | Tela de Exclusão | Interface para o usuário excluir um gasto cadastrado. |
| 05  | Tela de Categorias | Interface para visualizar e organizar os gastos por categoria. |
| 06 | Tela de Resumo | Interface para o usuário visualizar o total e o resumo dos gastos cadastrados. |

***3.3.2 Interfaces de Hardware*** 

O sistema deverá ser executado em um computador compatível com os requisitos necessários para execução de uma aplicação Java. Não serão necessários dispositivos de hardware adicionais para o funcionamento das funcionalidades principais do sistema. 

***3.3.3 Interfaces de Software*** 

O sistema será desenvolvido utilizando a linguagem de programação Java e o ambiente de desenvolvimento Apache NetBeans. Não haverá integração com sistemas externos no escopo atual do projeto. 

***3.3.4 Interfaces de Comunicação*** 

Não aplicável no escopo atual, pois o sistema não necessita de comunicação com serviços externos ou conexão com a internet para realizar suas funções principais. 

**4 Restrições e Limitações**  
● O funcionamento do sistema dependerá dos dados informados pelo usuário no cadastro dos gastos. 

● O sistema será destinado inicialmente ao controle individual de despesas pessoais.

● O sistema não realizará transações bancárias ou pagamentos.

● O cálculo dos gastos será realizado somente com base nas despesas cadastradas no sistema.

● Funcionalidades como gráficos e relatórios detalhados poderão ser implementadas em versões futuras.

● O sistema dependerá de um ambiente compatível com a execução de aplicações desenvolvidas em Java. 

**5 Glossário** 

| Termo  | Definição |
| :---- | :---- |
| Gasto | Valor utilizado pelo usuário para realizar uma despesa. |
|   Despesa | Quantia de dinheiro utilizada em uma compra, pagamento ou outro tipo de gasto. |
| Categoria | Classificação utilizada para organizar os gastos, como alimentação, transporte e lazer. |
| Usuário | Pessoa responsável por utilizar o sistema para registrar e acompanhar seus gastos pessoais. |
| Cadastro | Registro de uma nova informação no sistema. |
| RF | Requisito Funcional, que representa uma função que o sistema deve realizar. |
| RNF | Requisito Não-Funcional, que representa uma característica ou condição que o sistema deve atender. |

**6 Referências** 

Material didático disponibilizado pelo professor na disciplina de Programação Orientada a Objetos (POO). 

**7 Aprovação** 

Este documento foi revisado e aprovado por: 

Nome: \_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_ 

Cargo: \_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_