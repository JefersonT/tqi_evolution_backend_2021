# tqi_evolution_backend_2021
Não pense que é capaz. Saiba que é.

Dado o cenário abaixo, elabore uma sugestão para o back-end necessária para resolver o problema.
Use a criatividade! Você pode explorar aqui todos os seus conhecimentos, demonstrando fluxos, telas, protótipos e/ou codificação.

É importante sabermos por que você decidiu fazer a solução, portanto deixe clara a motivação das suas escolhas.

Uma empresa de empréstimo precisa criar um sistema de análise de crédito para fornecer aos seus clientes as seguintes funcionalidades:

i. Cadastro de clientes
    O cliente pode cadastrar: nome, e-mail, CPF, RG, endereço completo, renda e senha.

ii. Login
    A autenticação será realizada por e-mail e senha.

iii. Solicitação de empréstimo
    Para solicitar um empréstimo, precisamos do valor do empréstimo, data da primeira parcela e quantidade de parcelas.
    O máximo de parcelas será 60 e a data da primeira parcela deve ser no máximo 3 meses após o dia atual.

iv. Acompanhamento das solicitações de empréstimo
    O cliente pode visualizar a lista de empréstimos solicitados por ele mesmo e também os detalhes de um de seus empréstimos.
    Na listagem, devemos retornar no mínimo o código do empréstimo, o valor e a quantidade de parcelas.
    No detalhe do empréstimo, devemos retornar: código do empréstimo, valor, quantidade de parcelas, data da primeira parcela, e-mail do cliente e renda do cliente.

Restrições
1. A implementação deve utilizar linguagem Java ou Kotlin.
2. Use todos os seus conhecimentos adquiridos no bootcamp para explorar bem a solução. Não se preocupe, porque não existe certo ou errado. Só queremos conhecer um pouco mais sobre você.
3. Utilize o GitHub para repositório de código.

O prazo máximo para finalizar esta implementação é 10/01/2022. Portanto, explore bem este tempo!

Quando finalizar, você deve criar uma tag no GitHub chamada tqi_evolution_avaliacao. Desta forma, nosso time já irá avaliar o material final.

Bora pra este desafio?

# Explicação das rotas
### /user_criar_admin
 - Rota utilizada para criação de usuários admin
   - Entrada JSON {name, email, cpf, rg, senha, endereco, renda}
### /user_criar_cliente
- Rota utilizada para criação de usuários clientes
  - Entrada JSON {name, email, cpf, rg, senha, endereco, renda}
### /user_list_id/{id}
- Rota utilizada para listar usuário pelo id
    - Entrada via URL id do usuário
### /user_list
- Rota utilizada para listar todos usuário da base, limitado para admin

### /user_list_email/{email}
- Rota utilizada para listar usuário pelo email
    - Entrada via URL email do usuário
### /login
- Rota utilizada para realização de login e geração de token de authencation
  - Entrada via bory JSON de email e senha
### /solicitacao_criar
- Rota utilizada para criação de solicitação
  - Entrada via JSON de valor, data da primeira parcela, quantidade de parcelas e dados do usuário.
### /solicitacao_listar
- Rota para listar todas as solicitações, limitada para admin
### /solicitacao_listar_id/{id}
- Rota para listar solicitaão pelo id da solicitação limitado para admin
  - Entrada via URL do id da solicitação
### /solicitacao_listar_id_user/{id}
- Rota para lista solicitações pelo id do usuário
  - Entrada via URL do id do usuário
### /solicitacao_listar_id_and_id_user/{id}&{id_user}
- Rota para lista solicitações pelo id da solicitação e pelo id do usuário
  - Entrada via URL do id da solicitação e id do usuário
### /solicitacao_listar_id_and_email/{id}&{email}
- Rota para lista solicitações pelo id da solicitação e pelo email do usuário
    - Entrada via URL do id da solicitação e email do usuário
### /solicitacao_email_user/{email}
- Rota para lista solicitações pelo email do usuário
    - Entrada via URL do email do usuário

## Melhorias a serem implementadas
1. Tornar o Endereço um model separado ao para subistituir o endereço atual ue utiliza apenas uma string.
2. Adicionar funcionalidade de edição de dados.
