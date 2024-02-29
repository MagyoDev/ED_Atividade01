package com.mycompany.ed01_vetor;

public class Estudante {
    private String nome; //Instanciando
    private int ra; //Instanciando
    //Construtor -> Oferece valores iniciais ao objeto
    public Estudante(String nome, int ra){
        this.nome = nome;
        this.ra = ra;
    }
    //Pegar nome
    public String getNome() {
        return nome; //Retorna o valor
    }
    public int getRa() {
        return ra;
    }
    
    @Override //Serve para substituir o método da superclasse
    public String toString() { //toString serve para sobrescrever o objeto que ta sendo chamado
        //Se não chamar o toString aparece uma representação do objeto
        return "Estudante [nome=" + nome + ", ra=" + ra + "]";
    }
    
}
