# Padrão de Projeto: Adapter (GoF) 🧩

Este repositório contém uma implementação prática do padrão **Adapter** em Java, demonstrando como conectar sistemas incompatíveis de forma elegante e profissional.

---
## O que é o Padrão Adapter?
O **Adapter** é um padrão de projeto estrutural que permite que objetos com interfaces incompatíveis colaborem entre si. Ele funciona como um "tradutor" ou um conversor de tomada, permitindo que uma classe seja utilizada por outra que espera um formato diferente.

### Componentes do Padrão:

* **Client :** É quem utiliza o serviço. Ele não conhece os detalhes da implementação, apenas chama os métodos definidos na Interface.
* **Target/Interface :** É o "molde" ou contrato. Ela define **o que** o sistema precisa.
* **Adaptee :** É o sistema antigo ou de terceiros que queremos usar. Ele contém os dados ou metodos, mas sua "língua" é incompatível com o que o Cliente espera.
* **Adapter :** A peça chave. Ele implementa a Interface e "envolve" o Adaptee, conectando os dados brutos para o formato desejado dentro do método de análise.
 
## 1. Como o Padrão Adapter é implementado no projeto ?


### Componentes do Padrão no projeto:

* **Client (A `Main`):** É quem apenas chama os métodos definidos na Interface.
* **Target (A Interface `BibliotecaAnalises`):** É o "molde" ou contrato. Ela define **o que** o sistema precisa (ex: `analisar()`).
* **Adaptee (O `FornecedorDados`):** É o sistema antigo ou de terceiros que queremos usar. Ele contém os dados (XML), mas sua "língua" é incompatível com o que o Cliente espera.
* **Adapter (O `XmlParaJsonAdapter`):** A peça chave. Ele implementa a Interface e "envolve" o Adaptee, convertendo os dados brutos (XML) para o formato desejado (JSON/Binário) dentro do método de análise.

---

## 2. Cenário de Aplicação: A "Dor" do Desenvolvedor

Imagine o seguinte cenário:
Sua empresa utiliza uma **API de terceiros** que busca dados de usuários, mas ela entrega tudo em formato **XML**. Porém, sua biblioteca de análise moderna só aceita dados em **JSON**.

### O Problema: A "God Class"
Se não utilizarmos o **Adapter**, teríamos que colocar toda a lógica de conversão (replaces, tratamentos de string, lógica de bytes) dentro da nossa classe principal (`Main`). 
Isso criaria uma **God Class**. Se o formato da API mudar, o sistema inteiro quebra.

### A Solução com Adapter:
Dividimos as responsabilidades para manter o código limpo e seguindo os princípios **SOLID**:

| Classe | Função Técnica | Princípio Aplicado |
| :--- | :--- | :--- |
| `FornecedorDados` | Apenas entrega o XML bruto. | **SRP** (Responsabilidade Única) |
| `XmlParaJsonAdapter` | Traduz XML para JSON. | **Encapsulamento** da lógica de conversão |
| `BibliotecaAnalises` | Garante que todos falem a mesma língua. | **Abstração** |
| `Main` | Apenas executa a regra de negócio. | **Desacoplamento** |

### Saida do codigo:
=== ANTES (XML) ===
<usuario>João</usuario><senha>1234</senha><cor>azul</cor>

=== DEPOIS (JSON) ===
{"usuario": "João", "senha": "1234", "cor": "azul"}

=== DEPOIS (BINÁRIO) ===
00111100 01110101 01110011 01110101 01100001 01110010 01101001 01101111 00111110 01001010 01101111 11000011 10100011 01101111 00111100 00101111 01110101 01110011 01110101 01100001 01110010 01101001 01101111 00111110 00111100 01110011 01100101 01101110 01101000 01100001 00111110 00110001 00110010 00110011 00110100 00111100 00101111 01110011 01100101 01101110 01101000 01100001 00111110 00111100 01100011 01101111 01110010 00111110 01100001 01111010 01110101 01101100 00111100 00101111 01100011 01101111 01110010 00111110 


---

## 3. Por que isso é melhor?

1.  **SRP (Single Responsibility Principle):** Cada classe cuida de apenas uma parte do processo.
2.  **OCP (Open/Closed Principle):** Se precisarmos de um novo formato (como Binário), não precisamos mexer no código existente. Basta criar um novo Adapter (`XmlParaBinarioAdapter`) e "plugar" no sistema. O código está **aberto para extensão e fechado para modificação**.

---
*Projeto desenvolvido para fins didáticos sobre Padrões de Projeto (GoF).*
