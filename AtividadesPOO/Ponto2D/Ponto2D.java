public class Ponto2D {
    private double x;
    private double y; 
    
    public Ponto2D() {
        this.x = 0;
        this.y = 0;
    }
    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distanciaOrigem() {
        double distancia = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return distancia;
    }
    public double distancia(Ponto2D p) {
        double distancia = Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
        return distancia;
    }
}
