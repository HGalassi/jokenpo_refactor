# Jokenpo
# Martin Fowler(UML/XP/DDD), Ward Cunningham(Wiki/XP) e Kent Beck(XP/TDD/Implementation Patterns)
# O que é refatoração?

- Refatoração é o processo de modificar um sistema de software de modo que não altere o comportamento 
do código, embora melhore a sua estrutura interna.
  É uma maneira disciplinada de reorganizar o código, minimizando as chances de introduzir bugs. Em sua essência, ao refatorar, você estará aperfeiçoando o design do código depois que ele foi escrito.
  




- Pensava-se que definir o design antes era a melhor prática para o desenvolvimento de um software. Porém o código com o tempo seria modificado, e a integridade do sistema - sua estrutura de acordo com esse design - entraria gradualmente em decadência.



- Com a refatoração podemos partir de um cenário caótico e transformá-lo em um código bem estruturado



- O efeito CUMULATIVO dessas pequenas modificações pode melhorar radicalmente o design


# Como fazer uma refatoração segura e eficaz? 

- Garantir que exista um conjunto robusto de testes para a sessão de código que sofrerá alterações

- Refatorar em pequenos passos, de modo que, se você cometer um erro, será fácil localizar o bug. 

- Ciclo : compila-testa-commit 

- " O verdadeiro teste para um bom código é a facilidade com que ele pode ser alterado"

- " O segredo para uma refatoração eficaz é reconhecer que você será mais rápido se der passos minúsculos, pois o código nunca apresenta falhas e você pode combinar esses passos pequenos em alterações substanciais."


# Quais os benefícios de fazer refatorar? 

- Preparar o terreno para o acréscimo de uma funcionalidade : É mais fácil alterar um código que é familiar a você, e é mais facil se você o escrever de uma forma que voce entenda sempre que olhar para ele novamente. Não sendo necessário entender o que ele faz toda vez que voce olhar para o código novamente ou precisar guardar na memória o que ele faz.<br/> Ou seja você pode acrescentar novas funcionalidades de maneira mais rápida e com menos "surpresas"

- " O principal propósito da refatoração é fazer com que programemos mais rápido, agregando mais valor com menos esforço"

