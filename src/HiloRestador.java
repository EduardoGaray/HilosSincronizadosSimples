public class HiloRestador extends Thread {
    Contador objetoContador;
    public HiloRestador(Contador argumentoContador){
        this.objetoContador = argumentoContador;
    }

    @Override
    public void run(){
        synchronized (objetoContador){
            for (int n = 0; n <300; n++){
                objetoContador.decrementar(10);
                try{
                    sleep(20);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("El valor del restador es: " + objetoContador.getValor());
        }

    }

}
