public class HiloSumador extends Thread {
    Contador miContador;
    public HiloSumador(Contador parametroContador){
        this.miContador = parametroContador;
    }

    @Override
    public void run(){
        synchronized (miContador){
            for (int n = 0; n <300; n++){
                miContador.incrementar(10);
                try{
                    sleep(20);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("El valor del sumador es: " + miContador.getValor());
        }

    }

}
