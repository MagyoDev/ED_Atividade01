package com.mycompany.ed01_vetor;

public class Lista {
    private Estudante[] elements; //Armazena os Estudantes
    private int tamanhoAtual; //Controla o tamanho atual da lista
    private int capacidade; //Controla a capacidade máxima da lista
    
    //Construtor
    public Lista(int capacidade) {
        this.capacidade = capacidade; //Define a capacidade da lista
        this.elements = new Estudante[capacidade]; //Array de Objs Estudantes
        this.tamanhoAtual = 0; //Tamanho atual/inicial da lista
    }
    //a. Adicionar um elemento no início da lista.
    public void adicionarInicio(Estudante estudante){
        if (tamanhoAtual == capacidade) { //Verifica se o tamanho atual da lista é igual à capacidade máxima
            System.out.println("Lista cheia. Não é possível adicionar mais elementos.");
            return;
        }
         for (int i = tamanhoAtual; i > 0; i--) { //Move todos os elementos para direita para abrir um espaço no começo da lista
            elements[i] = elements[i - 1]; 
        }
        elements[0] = estudante; //Novo estudante pega essa posição
        tamanhoAtual++; //Incrementa o tamanho atual
    }
    //b.Adicionar um elemento no fim da lista.
    public void adicionarFim(Estudante estudante) {
         if (tamanhoAtual == capacidade) { //Verifica se o tamanho atual da lista é igual à capacidade máxima
            System.out.println("Lista cheia. Não é possível adicionar mais elementos.");
            return;
         }
         //Posiciona o estudante no final da lista
         elements[tamanhoAtual] = estudante; 
         tamanhoAtual++;
    }
    //c.Adicionar um elemento em qualquer posição da lista.
    public void adicionarPosicao(Estudante estudante, int posicao) {
         if (tamanhoAtual == capacidade) { //Verifica se o tamanho atual da lista é igual à capacidade máxima
            System.out.println("Lista cheia. Não é possível adicionar mais elementos.");
            return;
         }
         if (posicao < 0 || posicao > tamanhoAtual) { //Verefica se a posicao é menor que 0 ou maior que o tamanho atual da lista
             System.out.println("Posição inválida");
             return;
         }
         for (int i = tamanhoAtual; i > posicao; i--) { //Começa na ultima posição e decrementa até a posição antes do novo estudante
            elements[i] = elements[i - 1];
        }
         elements[posicao] = estudante; //Posiciona o novo estudante
         tamanhoAtual++;
    }
    //d.Remover um elemento de uma determinada posição da lista.
    public void removerPosicao(int posicao) {
        if (tamanhoAtual == 0) { //verifica se a lista esta vazia antes de remover
            System.out.println("Lista vazia. Não é possível remover elementos.");
            return;
        }
        if (posicao < 0 || posicao >= tamanhoAtual) { //Verefica se a posicao é menor que 0 ou maior ou igual que o tamanho atual da lista
             System.out.println("Posição inválida");
             return;
        }
        for (int i = posicao; i < tamanhoAtual -1; i++) {
            elements[i] = elements[i + 1];
        }
        tamanhoAtual--; //Decrementa
    }
    //e.Verificar se um determinado elemento existe na lista.
    public boolean verificarExistencia(Estudante estudante) { //Verifica toda a lista, se for verdadeiro incrementa 1
        for (int i = 0; i < tamanhoAtual; i++) {
            if (elements[i].equals(estudante)) { //Verifica se o elemento na posição i é igual ao estudante
                return true;
            }
        }
        return false;
    }
    //f.Um método para retornar o tamanho da lista.
    public int tamanhoLista() {
        return tamanhoAtual;
    }
    //g.Verificar se a lista está cheia. (considere que a lista não aumentará de tamanho)
    public boolean listaCheia() {
        return tamanhoAtual == capacidade;
    }
    //h.Verificar se a lista está vazia.
    public boolean listaVazia() {
        return tamanhoAtual == 0;
    }
    //i.Listar todos os elementos da lista.
    public void listarElementos() {
        if (tamanhoAtual == 0) {
            System.out.println("Lista vazia");
            return;
        }
        for (int i = 0; i < tamanhoAtual; i++) {
            System.out.println(elements[i]);
        }
    }
}