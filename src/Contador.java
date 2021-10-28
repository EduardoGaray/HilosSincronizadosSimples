public class Contador {
    int valor;
    public Contador(int numero){
        this.valor = numero;

    }

    public void incrementar(int numero){
        valor = valor +numero;
    }

    public void decrementar(int numero){
        valor = valor -numero;
    }

    public int getValor(){
        return valor;
    }
}
