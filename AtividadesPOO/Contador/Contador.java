package Contador;

public class Contador {
    int nu;

    public Contador(int nu) {
        this.nu = nu;
    }
    public void Incrementar() {
        this.nu ++;
    }
    public void Decrementar(){
        this.nu --; 
    }
    public void Zerar() {
        this.nu = 0;
    }
    public int getNu() {
        return nu;
    }
}