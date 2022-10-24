public class Condutor {
    String nome;
    int idade, destreza;

    public void setNome(String novo_nome){
        this.nome = novo_nome;
    }

    public void setIdade(int nova_idade){
        this.idade = nova_idade;
    }

    public void setDestreza(int nova_destreza){
        this.destreza = nova_destreza;
    }

    public int getDestreza(){
        return destreza;
    }
}
