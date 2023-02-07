# TPPE03

<p align="justify">As características de um bom projeto de software apresentadas acima estão, de certo modo, associadas aos maus-cheiros de código apresentados por Martin Fowler em seu catálogo de refatorações e relacionados às operações que tratam tais maus-cheiros. De acordo com a definição do próprio Martin Fowler, refatoração é uma maneira de aperfeiçoar o projeto de código existente sem alterar o seu comportamento externamente observável. Para esse trabalho o grupo escolhi 5 características dentre as 9 características de um bom projeto de software apresentadas no enunciado do trabalho, aqui estão.</p>

## 📚 Elegância de código

<p align="justify">Elegância de código se refere à qualidade de um código que é bem projetado e bem escrito, com uma solução limpa e eficiente para o problema que está sendo resolvido. Isso pode incluir usar técnicas de programação avançadas, como abstração e modularização, e escrever código de maneira concisa e clara. A elegância de código é importante porque pode tornar o código mais fácil de manter e escalar, além de ser mais fácil para outros desenvolvedores compreenderem e colaborarem</p>

<p align="center"><img alt="image" src="https://user-images.githubusercontent.com/117123731/217138266-b1d70b55-d5fe-49fc-8f1a-ceccf523b822.png"></p>

<p align="justify">No examplo acima temos um código elegante.</p>

### ✨ Relação da característica com os maus-cheiros de código definidos por Fowler
<p align="justify">Se tivéssemos o código acima escrito de uma outra forma como mostrado abaixo por exemplo, teríamos um mau cheiro do tipo <b>instruções switch</b>.</p>

<p align="center"><img alt="image" src="https://user-images.githubusercontent.com/117123731/217138561-0f7cb008-2d51-4fc4-bf7e-addf627d7974.png"></p>

### ✨ Operação de refatoração capaz de levar o projeto de código a ter a característica em análise
<p align="justify">Para transformar no mesmo código visto mais acima, iremos :</p>

• Extrair método / Mover método: para extrair todo o comando switch e movê-lo para onde o polimorfismo é necessário. . 

• Trocar tipo por subclasse ou trocar tipo por State / Strategy: uma vez que o método encontra-se no local devido altere-o de moro a usar o polimorfismo. 

## 📚 Simplicidade de código

<p align="justify">A simplicidade do código refere-se à qualidade de um código fácil de entender, manter e alterar. Isso inclui uma estrutura clara, nomes de variáveis ​​significativos, documentação adequada e evitar a duplicação de código. A simplicidade do código é importante porque permite que os desenvolvedores trabalhem com mais eficiência reduzindo o risco de bugs ou erros futuros.</p>

<p align="center"><img alt="image" src="https://user-images.githubusercontent.com/117123731/217139134-a437e150-35ba-493d-8721-0179b4917453.png"></p>

<p align="justify">No examplo acima temos um código simples e conciso.</p>

### ✨ Relação da característica com os maus-cheiros de código definidos por Fowler
<p align="justify">Se tivéssemos o código acima escrito de uma outra forma como mostrado abaixo por exemplo, teríamos o mau cheiro do <b>homem meio</b>. A classe está fazendo delegações simples.</p>

<p align="center"><img alt="image" src="https://user-images.githubusercontent.com/117123731/217139436-c2920be0-4cb2-4853-ad05-24741add7cb4.png"></p>


### ✨ Operação de refatoração capaz de levar o projeto de código a ter a característica em análise
<p align="justify">Para transformar no mesmo código visto mais acima, aplicamos:</p>

• Remover homem do meio: para retirar a indireção e chamar o método diretamente.
• Introduzir método: quando métodos não fazem muita coisa, traga-os para o método que o chama. 
• Trocar delegação com herança: quando há comportamento adicional, transforme a classe de indireção em uma subclasse do objeto real. 

