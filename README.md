## QUESTÃO 1
#### Padrão utilizado: Strategy
Justificativa: No enunciado, é mencionado que deve ser possível trocar de algoritmo de acordo com a necessidade de negócios, sem que o cliente precise conhecer os detalhes de implementação.

## QUESTÃO 2
#### Padrão utilizado: Adapter
Justificativa: É necessário converter uma interface legada em uma atualizada, de forma que seja criado um métodos compatíveis entre elas.

## QUESTÃO 3
#### Padrão utilizado: State 
Justificativa: Neste cenário, a usina possui vários estados de funcionamento, com regras de transição entre eles e validações, por isso usamos o State para alterar entre os possíveis estados.

## QUESTÃO 4
#### Padrão utilizado: Chain of Responsibility
Justificativa: Este padrão foi escolhido justamente por precisar que sejam aplicadas múltiplas regras de validação em cadeia, com cada validador verificando um aspecto específico do documento.