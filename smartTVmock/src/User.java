public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal: "+smartTv.canal);
        System.out.println("Volume: "+smartTv.volume);

        smartTv.ligar();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(2);

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Volume: "+smartTv.volume);
        System.out.println("Canal: "+smartTv.canal);

    }
}
