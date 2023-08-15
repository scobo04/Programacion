import java.util.Random;

public class SopaLletresInterficieTerminal implements SopaLletresInterficie{
    @Override
    public void imprimir(Lletra[][] matriu) {
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();

        for(int i=0; i<matriu.length; i++){
            for(int j=0; j<matriu[i].length; j++){
                if(matriu[j][i]==null){
                    int aleatori = random.nextInt(alfabet.length());
                    char lletraRandom = alfabet.charAt(aleatori);
                    System.out.print(lletraRandom);
                    //System.out.print("X");
                } else {
                    System.out.print(matriu[j][i].getLletra());
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    @Override
    public void separacio() {
        System.out.println("-----------------------");
    }
}
