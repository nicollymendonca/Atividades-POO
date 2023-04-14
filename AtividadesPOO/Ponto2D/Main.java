public static void main(String[] args) {
    Ponto2D ponto1 = new Ponto2D();
    Ponto2D ponto2 = new Ponto2D(3, 4);
    
    System.out.println("Essa é a distância do ponto 1° para a origem: " + ponto1.distanciaOrigem());
    System.out.println("Essa é a distância do ponto 2° para a origem: " + ponto2.distanciaOrigem()); 
    
    double distanciaEntrePontos = ponto1.distancia(ponto2);
    System.out.println("Essa distância entre ponto 1° e ponto 2°: " + distanciaEntrePontos);
}
