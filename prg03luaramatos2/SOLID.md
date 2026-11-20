Auditoria SOLID — Atividade 21

1. Exemplos dos cinco princípios SOLID

SRP — Princípio da Responsabilidade Única

* Arquivo: UsuarioService.java
* Linhas: 7–47
* Exemplo: A classe UsuarioService é responsável pelas operações relacionadas às regras de serviço dos usuários, delegando a persistência ao DAO (UsuarioIDao). Assim, a responsabilidade de acesso aos dados fica separada da camada de serviço.

OCP — Princípio Aberto/Fechado

* Arquivo: ProcessadorAutenticacao.java
* Linhas: 5–9
* Exemplo: O método processar recebe qualquer objeto que implemente a interface Autenticavel. Dessa forma, novas classes podem utilizar o processamento de autenticação sem precisar modificar essa classe.

LSP — Princípio da Substituição de Liskov

* Arquivo: Administrador.java
* Linhas: 8–23
* Exemplo: A classe Administrador herda de Usuario e pode ser utilizada como um usuário, inclusive em operações de autenticação, pois implementa o método autenticar com seu comportamento específico.

ISP — Princípio da Segregação de Interfaces

* Arquivo: Autenticavel.java
* Linhas: 3–4
* Exemplo: A interface Autenticavel possui somente o método autenticar, mantendo o contrato pequeno e específico para classes que precisam oferecer autenticação.

DIP — Princípio da Inversão de Dependência

* Arquivo: UsuarioController.java
* Linhas: 4 e 9–12
* Exemplo: A classe UsuarioController depende da abstração IUsuarioService, recebida pelo construtor, em vez de criar diretamente uma implementação concreta do serviço.

2. Violações dos princípios SOLID identificadas

Violação 1 — SRP (Responsabilidade Única)

* Arquivo: TelaLogin.java
* Linhas: 125–139.
* Explicação: A tela de login, além de apresentar a interface e receber os dados do usuário, também cria um usuário fictício e realiza a validação da autenticação. Essas responsabilidades deveriam estar separadas da interface gráfica.

Violação 2 — SRP (Responsabilidade Única)

* Arquivo: ValidadorUsuario.java
* Linhas: 6–30.
* Explicação: A classe reúne diferentes validações, como palavras proibidas, preenchimento de campos e confirmação de senha. Essas responsabilidades poderiam ser separadas em validadores específicos, caso o sistema passe a exigir regras independentes.

Violação 3 — OCP (Aberto/Fechado)

* Arquivo: TelaLogin.java
* Linhas: 130–134.
* Explicação: Os dados de acesso estão fixos diretamente na tela. Para alterar o usuário e a senha utilizados na autenticação, é necessário modificar o código da interface, em vez de utilizar uma fonte de dados ou serviço independente.

3. Correções realizadas

Correção 1 — SRP (Responsabilidade Única)

* Arquivo: TelaLogin.java
* Alteração: A tela deixou de realizar diretamente a autenticação. Agora ela recebe os dados digitados e encaminha a solicitação ao UsuarioController, que utiliza o serviço responsável pela autenticação.
* Justificativa: A interface gráfica fica responsável pela interação com o usuário, enquanto a autenticação é delegada às camadas apropriadas.

Correção 2 — OCP (Aberto/Fechado)

* Arquivo: TelaLogin.java
* Alteração: Foram removidos o usuário e a senha fictícios que estavam fixos no código. A autenticação agora consulta os usuários por meio do DAO.
* Justificativa: A tela não precisa ser modificada para trocar os dados fictícios de acesso, pois utiliza os dados cadastrados no sistema.

4. Renomeação de identificadores

Foram renomeados cinco componentes da classe TelaLogin.java, utilizando a ferramenta Refactor → Rename do NetBeans:

Nome anterior	Novo nome
jButton1	btnEntrar
jTextField1	txtLogin
jPasswordField1	txtSenha
jLabel6	lblCadastrar
jLabel4	lblResultado

As alterações tornaram os nomes mais claros e representativos da função de cada componente, melhorando a legibilidade e a manutenção do código.


5. Revisão de comentários

* Arquivo: Usuario.java
* Alteração: Foi removido o comentário // Construtor vazio, localizado antes do construtor sem parâmetros.
* Justificativa: O comentário apenas descrevia o que o código já demonstrava claramente, sem acrescentar informação relevante.