# 📦 Otimização Logística Portuária

> Trabalho final da disciplina de Estrutura de Dados — Análise, desenvolvimento e implementação de algoritmo para alocação eficiente de containers em armazéns e caminhões.

---

## 👨‍🏫 Integrantes

- Breno Ramos Miguel - 12623121178
- Christhopper Marques Ferreira - RA: 1292312696
- Kaiky Ângelo Bastos Monteiro - 12623117092
- Manoel Vinicius Silva Souza - 722315125
- Nathan Almeida Gois - 722311425
- Pedro Henrique Antero Pereira - 972311524
- Rodrigo Lomardo - 1262416455

---

## 1. 🧠 Classificação da Complexidade

O problema abordado — **minimizar a quantidade de armazéns e caminhões para armazenar e transportar containers com volumes variados** — pode ser classificado como **NP-completo**, em sua versão de decisão.

### Justificativas:
- **Pertinência à classe NP**:  
  É possível verificar se uma solução proposta (alocação de todos os containers em até *k* armazéns ou caminhões) é válida em tempo polinomial.

- **Equivalência ao problema do Bin Packing**:  
  O problema é uma generalização do **Bin Packing Problem**, que consiste em alocar itens em "bins" de capacidade limitada, minimizando o número de recipientes.

- **Dificuldade computacional**:  
  A versão de otimização é **NP-difícil**, enquanto a versão de decisão é **NP-completa**.

---

## 2. ⚙️ Estratégias de Resolução

Dada a natureza do problema, utilizamos uma abordagem **gulosa**, baseada no algoritmo **First-Fit Decreasing (FFD)**.

### Etapas:
- Os volumes dos containers são ordenados de forma decrescente.
- Cada item é alocado no **primeiro espaço disponível** (armazém ou caminhão) que tenha capacidade suficiente.
- Se não houver espaço, um novo armazém ou caminhão é criado.

### Justificativas:
- Simplicidade de implementação.
- Eficiência prática para casos reais.
- Bom desempenho, mesmo sem garantir a solução ótima.
- Alternativas como programação dinâmica ou busca exaustiva seriam inviáveis para entradas grandes.

---

## 3. 🧮 Desenvolvimento do Algoritmo

> *Esta seção contém a implementação do algoritmo desenvolvida pelos alunos. O código-fonte está disponível neste repositório.*

---

## 4. ⏱️ Análise da Complexidade

A complexidade do algoritmo é dividida em duas etapas principais:

### a) Alocação de Containers em Armazéns

- **Ordenação dos containers em ordem decrescente**  
  Tempo: `O(n log n)`  
  *(n = número de containers)*

- **Alocação com First-Fit Decreasing**  
  Para cada container, o algoritmo pode precisar verificar todos os armazéns existentes até encontrar um com espaço suficiente.  
  No pior caso: `O(n)` comparações por container → Total: `O(n²)`

➡️ **Complexidade dessa etapa**: `O(n²)` no pior caso.

---

### b) Alocação de Armazéns em Caminhões

- **Conversão dos volumes dos armazéns em uma lista de cargas**  
  Tempo: `O(n)`

- **Ordenação dessa lista em ordem decrescente**  
  Tempo: `O(n log n)`

- **Alocação dos volumes em caminhões utilizando FFD**  
  Cada volume pode ser comparado com todos os caminhões existentes.  
  No pior caso: `O(n²)`

➡️ **Complexidade dessa etapa**: `O(n²)` no pior caso.

---

### ✅ Complexidade Total do Algoritmo

Apesar de envolver ordenações com complexidade `O(n log n)`, os dois processos principais de alocação — containers em armazéns e armazéns em caminhões — são dominantes no tempo de execução e ambos têm pior caso `O(n²)`.

Portanto, a **complexidade total do algoritmo é**:

```
O(n²)
```

Essa complexidade significa que, no pior cenário, o tempo de execução do algoritmo cresce proporcionalmente ao quadrado do número de itens (containers ou volumes). Isso ocorre porque, em cada etapa de alocação, pode ser necessário comparar cada novo item com todos os recipientes (armazéns ou caminhões) já criados, o que resulta em um número de comparações que aumenta rapidamente com o tamanho da entrada.

Mesmo assim, **na prática**, o algoritmo apresenta bom desempenho para conjuntos de dados pequenos e médios, justamente por ser simples, direto e por aplicar a estratégia gulosa de forma eficiente. Ele representa um bom equilíbrio entre desempenho e complexidade computacional para o contexto proposto neste trabalho.

---


