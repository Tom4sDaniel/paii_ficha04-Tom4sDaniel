public class Carro {
    Condutor condutor;
    String matricula;
    int VelocidadeAtual = 0, VelocidadeMaxima = 200, ligado = 0;

    public void setMatricula(String nova_matricula) {
        this.matricula = nova_matricula;
    }

    public void setCondutor(Condutor novo_condutor) {
        this.condutor = novo_condutor;
    }

    public int getVelocidadeAtual(){
        return VelocidadeAtual;
    }

    void ligar() {
        System.out.println("VRUUUUMmmmmmmmmm");
        ligado = 1;
    }

    void desligar() {
        System.out.println("MMMmmmmm");
        ligado = 0;
    }

    void acelerar() {
        VelocidadeAtual += 10 + condutor.getDestreza()*0.1;
        if (VelocidadeAtual > VelocidadeMaxima) VelocidadeAtual = VelocidadeMaxima;
    }

    void travar(int intensidadeTravagem) {
        if (intensidadeTravagem > VelocidadeMaxima) {
            intensidadeTravagem = VelocidadeMaxima;
        }
        else if (intensidadeTravagem < 0) {
            intensidadeTravagem = 0;
        }

        VelocidadeAtual -= intensidadeTravagem;

        if (VelocidadeAtual > VelocidadeMaxima) {
            VelocidadeAtual = VelocidadeMaxima;
        }
        else if (VelocidadeAtual < 0){
            VelocidadeAtual = 0;
        }
    }

    public void checkLigado(int num){
        if(ligado == 1){
            System.out.println("O carro" + num + " está ligado");
        }
        else{
            System.out.println("O carro" + num + " não estám ligado");
        }
    }
}


