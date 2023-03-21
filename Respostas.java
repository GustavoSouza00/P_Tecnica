public class Respostas {

    public void respostaUm() {
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.printf("%nO valor da soma eh - %d%n", SOMA);
        // Resposta: 91
    }

    public void respostaDois(int valor){
        System.out.println("\nSequência de Fibonacci");
        int n1 = 1;
        int n2 = 0;

        while (n2 < valor){
            int n3 = n1 + n2;
            System.out.println(n2);
            n1 = n2;
            n2 = n3;

            if(n2 == valor){
                System.out.printf("%nO Valor pertence a sequência de Fibonacci - %d", valor);
            }else if(n2 > valor){
                System.out.printf("%nO Valor %d não pertence a sequência de Fibonacci", valor);
            }
        }
    }

    /*
     * 3) Descubra a lógica e complete o próximo elemento:
     * 
     * a) 1, 3, 5, 7, 9
     * 
     * b) 2, 4, 8, 16, 32, 64, 128
     * 
     * c) 0, 1, 4, 9, 16, 25, 36, 49
     * 
     * d) 4, 16, 36, 64, 128
     * 
     * e) 1, 1, 2, 3, 5, 8, 13
     * 
     * f) 2, 10, 12, 16, 17, 18, 19, 200
     *
     * 
     * 4 - Dois veículos (um carro e um caminhão) saem respectivamente de cidades
     * opostas pela mesma rodovia. O carro de Ribeirão Preto em direção a Franca, a
     * uma velocidade constante de 110 km/h e o caminhão de Franca em direção a
     * Ribeirão Preto a uma velocidade constante de 80 km/h. Quando eles se cruzarem
     * na rodovia, qual estará mais próximo a cidade de Ribeirão Preto?
     * 
     *
     * IMPORTANTE:
     * 
     * a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <->
     * Franca.
     * 
     * b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos a
     * mais para passar em cada um deles e o carro possui tag de pedágio (Sem Parar)
     * 
     * c) Explique como chegou no resultado.
     * 
     * /---------------------------------------------------------------------------------/
     * 
     * S = S0 + v.t (A melhor equação para esse problema é a equação horaria do movimento, 
     * visto que possuimos a distância entre os pontos, as velocidades, que são constntes, e teremos que utilizar o tempo)
     * 
     * Scarro = 100 - 110.t (A posição inicial para o carro é toda a distância que ele vai ter que percorrer para chegar à Franca e e sua velocidade é negativa pois esta indo na direção contraria a cidade)
     * Scaminhao = 0 + 80.(1,17t) (O caminhão ja esta em franca na posição inicial, e temos que adicionar o tempo dos pedádios)
     * 
     * Scarro = Scaminhao (pois eles se cruzam no mesmo ponto)
     * 
     * 100 - 110.t = + 80.(1,17t)
     * 100 = +110t + 93,6t
     * 100 / 203,6 = t
     * t = 0,5 h
     * 
     * Scarro = 100 - 110.(0,49)
     * Scarro = 100 - 53,9
     * Scarro ~= 46
     * 
     * Scaminhao = 93,6.(0,49)
     * Scaminhao ~= 46
     * 
     * Então ambos estao a uma mesma distancia da cidade aproximadamente 54 Km.
     */

    public void respostaCinco(String palavra){
        String palavraUpper = palavra.toUpperCase();
        String palavraInvertida = "";
        System.out.printf("%n%nInverter a palavra %s - ", palavraUpper);

        for(int i=0; i<palavra.length(); i++){
            char letra = palavraUpper.charAt(i);
            palavraInvertida = letra + palavraInvertida;
        }

        System.out.printf("%s", palavraInvertida);
    }

    public Respostas(){
        System.out.println("Classe de Respostas !");
    }
}
