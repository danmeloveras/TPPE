# TPPE03

<p align="justify">As características de um bom projeto de software apresentadas acima estão, de certo modo, associadas aos maus-cheiros de código apresentados por Martin Fowler em seu catálogo de refatorações e relacionados às operações que tratam tais maus-cheiros. De acordo com a definição do próprio Martin Fowler, refatoração é uma maneira de aperfeiçoar o projeto de código existente sem alterar o seu comportamento externamente observável. Para esse trabalho escolhi 5 características dentre as 9 características de um bom projeto de software apresentadas no enunciado do trabalho, aqui estão.</p>

## 📚 Elegância de código

<p align="justify">Elegância de código se refere à qualidade de um código bem projetado e bem escrito, com uma solução limpa e eficiente para o problema que está sendo resolvido. Isso pode incluir usar técnicas de programação avançadas, como abstração e modularização, e escrever código de maneira concisa e clara. A elegância de código é importante porque pode tornar o código mais fácil de manter e escalar, além de ser mais fácil para outros desenvolvedores compreenderem e colaborarem</p>

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







## 📚 Ausência de duplicidades

<p align="justify">Código duplicado deve ser evitado devido aos seguintes conceitos apresentados abaixo:</p>

<p align="justify">Manutenção: quando um bug precisa ser corrigido ou um recurso precisa ser adicionado, isso deve ser feito em vários lugares se o código estiver duplicado. Isso aumenta a probabilidade de erro humano e dificulta a manutenção.</p>

<p align="justify">Legibilidade do código: o código duplicado torna a base de código mais difícil de ler, entender e manter.</p>

<p align="justify">Tamanho de código aumentado: o código duplicado aumenta o tamanho da base de código, o que pode dificultar o gerenciamento e tornar o aplicativo mais lento.</p>

<p align="justify">Diminuição do desempenho: em alguns casos, o código duplicado pode tornar o aplicativo lento porque aumenta o uso da memória.</p>

<p align="justify">No geral, o uso de código duplicado vai contra os princípios de um bom design de software, como modularidade, legibilidade e manutenção.</p>

<p align="center"><img alt="image" src="https://user-images.githubusercontent.com/117123731/217141741-05a57f44-b18a-4199-8773-3580c0409c9c.png"></p>

<p align="justify">No examplo acima temos uma função que calcula a porcentagem de acordo com algum parâmetro.</p>

### ✨ Relação da característica com os maus-cheiros de código definidos por Fowler
<p align="justify">Se tivéssemos o código acima escrito de uma outra forma como mostrado abaixo por exemplo, teríamos o mau cheiro do <b>código duplicado</b>.</p>

<p align="center"><img alt="image" src="https://user-images.githubusercontent.com/117123731/217141668-850044e8-e7ab-41bb-a6a2-3b8bf8cd256c.png"></p>

### ✨ Operação de refatoração capaz de levar o projeto de código a ter a característica em análise
<p align="justify">Para transformar no mesmo código visto mais acima, aplicamos:</p>

• Extrair método: quando a mesma expressão encontra-se em dois métodos na mesma classe.

• Extrair método / puxar para cima: quando a mesma expressão está em classes irmãs. 

• Extrair método / método template: extrair comportamento comum de dois métodos e implementar a variabilidade em subclasses. 
















## 📚 Idiomático

<p align="justify">O uso de um código de idioma, também conhecido como código de localidade, ajuda a garantir que o software e os sites exibam informações, como datas, horas, moeda e texto, no formato correto para uma região ou idioma específico. Isso ajuda a evitar confusão e má interpretação das informações para os usuários e torna o conteúdo mais acessível para o público global. Além disso, o uso de códigos de idioma também pode ajudar na localização de software e sites, permitindo que sejam traduzidos para diferentes idiomas, tornando-os utilizáveis para uma ampla gama de usuários.</p>

<p align="center"><img alt="image" src="https://user-images.githubusercontent.com/117123731/217144761-255f1a0a-5abb-411e-8843-ded025c2ca98.png"></p>

<p align="justify">No examplo acima temos um código com as variáveis todas em inglêes, garantindo um código idiomático.</p>

### ✨ Relação da característica com os maus-cheiros de código definidos por Fowler
<p align="justify">Se tivéssemos o código acima escrito de uma outra forma como mostrado abaixo por exemplo, teríamos o mau cheiro do <b>campo temporário</b>.</p>

<p align="center"><img alt="image" src="https://user-images.githubusercontent.com/117123731/217144889-65231a55-351d-4621-8f5a-c5e6cb189241.png"></p>

### ✨ Operação de refatoração capaz de levar o projeto de código a ter a característica em análise
<p align="justify">Para transformar no mesmo código visto mais acima, aplicamos:</p>

• Extrair classe: para criar um local onde as variáveis temporárias serão armazenadas. 

## 📚 Boa documentação.

<p align="justify">Uma boa documentação resulta em:</p>

<p align="justify">Melhor compreensibilidade: torna mais fácil para outros desenvolvedores entender o código, especialmente se eles tiverem que modificá-lo ou mantê-lo.</p>

<p align="justify">Manutenção aprimorada: o código bem documentado facilita a manutenção e atualização, reduzindo a probabilidade de introduzir bugs ou causar problemas de compatibilidade.</p>

<p align="justify">Correção de bugs mais rápida: uma boa documentação ajuda na correção de bugs de forma mais rápida e eficiente, fornecendo instruções claras sobre o comportamento pretendido e a funcionalidade do código.</p>

<p align="justify">Melhor colaboração: quando vários desenvolvedores trabalham na mesma base de código, uma documentação clara e concisa permite uma colaboração suave e reduz a chance de mal-entendidos.</p>

<p align="justify">Concluindo, uma boa documentação ajuda a garantir a viabilidade a longo prazo e a manutenção do código.</p>

<p align="center"><img alt="image" src="https://user-images.githubusercontent.com/117123731/217146308-756d6c83-2255-4203-b83d-6b774b46c69d.png"></p>

<p align="justify">No exemplo acima temos a documentação completa do framework React Native.</p>

### ✨ Relação da característica com os maus-cheiros de código definidos por Fowler
<p align="justify">Vale salientar que comentário não é documentação, se fizermos isso, ocasionamos o mau cheiro de <b>Comentário</b>.Pode haver vários motivos pelos quais os comentários não podem ser usados no código como a falta de tempo, às vezes, a pressão para cumprir os prazos pode resultar na omissão de documentação, pois leva tempo para escrever comentários significativos e claros, por exemplo.</p>

<p align="center"><img alt="image" src="https://user-images.githubusercontent.com/117123731/217146194-47eb2e45-1da0-4d79-85b5-59d4ea1dada1.png"></p>

### ✨ Operação de refatoração capaz de levar o projeto de código a ter a característica em análise
<p align="justify">Para melhorar o código basta remover os comentários. É importante ter em mente que os comentários são uma ferramenta valiosa em pouquímos casos, podem melhorar a qualidade e a capacidade de manutenção do código. Eles podem ajudar a reduzir o tempo e o esforço necessários para entender e manter o código, especialmente quando a base de código é grande ou complexa. </p>


