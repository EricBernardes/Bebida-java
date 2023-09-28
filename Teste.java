public class Teste {
    public static void main(String[] args){
        Bebida minhaBebida= new Bebida();
        minhaBebida.setSabor("Maçã");
        minhaBebida.setVolume(1.5);
        System.out.println("Bebida sabor "+ minhaBebida.getSabor());
        System.out.println("Com volume igual a" + minhaBebida.getVolume());

    }
}
