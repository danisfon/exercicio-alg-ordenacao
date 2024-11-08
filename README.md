### Comparação de Algoritmos de Ordenação:

**Descrição:**
Implemente os algoritmos de ordenação Merge Sort, Bubble Sort, Selection Sort e Insertion Sort em classes específicas. A tarefa é comparar o tempo de execução de cada algoritmo em arrays de tamanhos variados, observando o desempenho à medida que o tamanho do array aumenta.

**Passos:**

### Implementar os Algoritmos:
Implemente cada um dos quatro algoritmos de ordenação:

- Merge Sort (Divisão e Conquista, O(n log n))
- Bubble Sort (Trocas consecutivas, O(n²))
- Selection Sort (Seleção do menor, O(n²))
- Insertion Sort (Inserção direta, O(n²))

### Geração de Arrays Aleatórios:
1. Escreva uma função que gere arrays de inteiros de tamanhos variados (ex: 1000, 10000, 100000, 1000000) preenchidos com números aleatórios.
2. Os algoritmos devem ser testados com os mesmos arrays, pois a ordem dos elementos pode influenciar no desempenho.

### Medição de Tempo:
1. Use o método `System.nanoTime()` para medir o tempo de execução de cada algoritmo ao ordenar arrays de diferentes tamanhos.
2. Realize várias execuções para garantir a precisão das medições (por exemplo, calcule a média após 10 execuções).

### Comparação de Resultados - tabela:
- Compare os tempos de execução para cada algoritmo com base nos diferentes tamanhos de arrays.
- Descreva como o desempenho de cada algoritmo muda à medida que o tamanho dos dados aumenta.
- Explique a diferença entre algoritmos de complexidade O(n²) e O(n log n).

**Discussão:**
Explique, com base nos resultados, porque algoritmos de complexidade O(n²) se tornam ineficientes para grandes conjuntos de dados em comparação com o Merge Sort (O(n log n)).
