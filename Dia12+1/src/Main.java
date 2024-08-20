public class Main {
    public static void main(String[] args) {
        ReservaEntradas reservaEntradas = new ReservaEntradas(22);

        Thread cliente1 = new HiloReserva(reservaEntradas, 8);
        Thread cliente2 = new HiloReserva(reservaEntradas, 8);
        Thread cliente3 = new HiloReserva(reservaEntradas, 8);

        cliente1.start();
        cliente2.start();
        cliente3.start();

        try{
            cliente1.join();
            cliente2.join();
            cliente3.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
