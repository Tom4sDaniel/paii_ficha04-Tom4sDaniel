public class Corrida {
    //construtores
    public Corrida(){ }
    //Métodos
    public static void main(String[] args) {
        /*Cria os objetos carro1 e carro2 que são instancias da classe Carro*/
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        carro1.setMatricula("11-AA-11");
        carro2.setMatricula("22-BB-22");
        /* Cria os objetos condutor1 e conductor2 que são instancias da classe Condutor*/
        Condutor condutor1 = new Condutor();
        Condutor condutor2 = new Condutor();
        condutor1.setNome(“Antonio”);
        condutor1.setIdade(25);
        condutor1.setDestreza(75);
        condutor2.setNome(“Manuel”);
        condutor2.setIdade(27);
        condutor2.setDestreza(65);
        /*Coloca os condutores nos seus carros*/
        carro1.setCondutor(condutor1);
        carro2.setCondutor(condutor2);
        //Liga os carros
        carro1.ligar();
        carro2.ligar();
        //Inicia a corrida
        carro1.acelerar();
        carro2.acelerar();
        carro1.acelerar();
        carro2.travar(10);
        carro1.acelerar();
        carro1.acelerar();
        carro1.travar(5);
        carro2.acelerar();
        System.out.println("Velocidade do carro1: " + carro1.getVelocidadeAtual());
        System.out.println("Velocidade do carro2: " + carro2.getVelocidadeAtual());
        //Desliga os carros
        carro1.desligar();
        carro2.desligar();
}
