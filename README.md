# tp13-avaliacao-imc
# Avaliação de IMC

## Descrição do sistema

Projeto referente ao enunciado 13 da disciplina Técnicas de Programação.

O sistema registra o nome, o peso e a altura de um grupo de pessoas. Para cada pessoa cadastrada, o programa calcula o Índice de Massa Corporal (IMC). O sistema também classifica os resultados por faixa, conta a quantidade de pessoas em cada categoria e apresenta um relatório com o IMC médio do grupo.

## Integrantes e divisão das tarefas

### Desenvolvedora A — Raquel Guimarães

Branch: feature/coleta-dados

Responsabilidades:

- Criação da estrutura inicial do projeto.
- Declaração dos vetores de nomes, pesos, alturas e IMCs.
- Leitura dos dados das pessoas.
- Validação de peso e altura.
- Implementação do método coletarDados().
- Implementação do método calcularImc().
- Integração do cadastro ao menu principal.

### Desenvolvedor B — Guilherme Almeida

Branch: feature/classificacao-relatorio

Responsabilidades:

- Implementação do método classificarImc().
- Classificação dos resultados por faixa de IMC.
- Contagem das pessoas em cada categoria.
- Implementação do método exibirRelatorio().
- Cálculo do IMC médio do grupo.
- Tratamento do relatório sem pessoas cadastradas.

Os dois desenvolvedores modificaram o método exibirCabecalho() em suas respectivas branches para provocar e resolver o conflito obrigatório de merge.

## Compilação

Na pasta raiz do projeto, execute:

text
javac -d bin src/Principal.java


## Execução

Depois da compilação, execute:

text
java -cp bin Principal