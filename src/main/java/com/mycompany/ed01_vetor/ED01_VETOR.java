package com.mycompany.ed01_vetor;

public class ED01_VETOR {

    public static void main(String[] args) {
        Lista lista = new Lista(100);
        
        Estudante estudante1 = new Estudante("Mario", 123);
        Estudante estudante2 = new Estudante("Marcia", 456);
        Estudante estudante3 = new Estudante("Marchelo", 789);
        
        lista.adicionarInicio(estudante1);
        lista.adicionarFim(estudante2);
        lista.adicionarPosicao(estudante3, 1);
        
        lista.listarElementos();
        
        System.out.println("Tamanho da lista: " + lista.tamanhoLista());
        System.out.println("Lista cheia? " + lista.listaCheia());
        System.out.println("Lista vazia? " + lista.listaVazia());
        
         Estudante estudante4 = new Estudante("Maria", 111);
         System.out.println("Estudante Maria existe na lista? " + lista.verificarExistencia(estudante4));
        
        lista.removerPosicao(1);
         
        lista.listarElementos();
    }
}
