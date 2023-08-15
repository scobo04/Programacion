import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class SopaLletres {
    private final int FILES = 10;
    private final int COLUMNES = 10;
    private Lletra[][] lletres;
    private Paraula[] paraules;
    private SopaLletresInterficie interficie;

    public SopaLletres(){
        interficie = new SopaLletresInterficieTerminal();
        this.lletres = new Lletra[FILES][COLUMNES];

        char[] paraulaEstudis = new char[]{'E','S','T','U','D','I','S'};
        this.paraules = new Paraula[]{
                new Paraula("ESCOLA"),
                new Paraula("BIBLIOTECA"),
                new Paraula(paraulaEstudis),
                new Paraula("AULA"),
                new Paraula("FUTUR")
        };
        this.ordernarParaules();


        //INSERIR LES PARAULES DINS LA GRAELLA
        //1- bucle de les paraules
        //2- per a cada paraula, recorrer les lletres
        //3- posar cada lletra a una fila distina del tauler

        //4- igual que el 3 però les files aleatòries
        //5- iguql que el 4 però la posició de la columna aleatòria
    }

    private void ordernarParaules(){
        for(int i=0; i<this.paraules.length; i++){
            for(int j=0; j<this.paraules.length - i - 1; j++){
                if(this.paraules[i].getLletres().length < this.paraules[j].getLletres().length){
                    Paraula aux = this.paraules[i];
                    this.paraules[i] = this.paraules[j];
                    this.paraules[j] = aux;
                }
            }
        }
    }

    public boolean esPotInserir(Paraula paraula, int x, int y){
        //Comprovem si la paraula hi cap depenent si ha d'estar escrita horitzontal, vertial, diagonal

        //HORITZONTAL
        if(paraula.getDireccioParaula().equals(DireccioParaula.HORITZONTAL)){
            for(int i=0; i<paraula.getLletres().length; i++){
                //Si la posició NO està buida i a més la lletra que hi ha no es solapa (nivell 5)
                if((x+i) >= COLUMNES){
                    return false;
                } else if(this.lletres[x+i][y]!=null && !this.lletres[x+i][y].equals(paraula.getLletres()[i])){
                    return false;
                }
            }
        }

        //VERTICAL
        if(paraula.getDireccioParaula().equals(DireccioParaula.VERTICAL)){
            for(int i=0; i<paraula.getLletres().length; i++){
                //Si la posició NO està buida i a més la lletra que hi ha no es solapa (nivell 5)
                if((y+i) >= FILES){
                    return false;
                } else if(this.lletres[x][y+i]!=null && !this.lletres[x][y+i].equals(paraula.getLletres()[i])){
                    return false;
                }
            }
        }

        //DIAGONAL
        if(paraula.getDireccioParaula().equals(DireccioParaula.DIAGONAL)){
            for(int i=0; i<paraula.getLletres().length; i++){
                //Si la posició NO està buida i a més la lletra que hi ha no es solapa (nivell 5)
                if((x+i) >= COLUMNES || (y+i) >= FILES){
                    return false;
                } else if(this.lletres[x+i][y+i]!=null && !this.lletres[x+i][y+i].equals(paraula.getLletres()[i])){
                    return false;
                }
            }
        }

        return true;
    }

    public void emplenarNivell1(){
        //Per a cada paraula escollim el mètode horitzontal i sense reverse
        for(Paraula paraula: this.paraules){
            paraula.setDireccioParaula(DireccioParaula.HORITZONTAL);
            paraula.setReverse(false);
        }

        //Emplenam cada paraula
        final int MAX_INTENTS = 100000;
        Random rn = new Random();
        for(Paraula paraula: this.paraules){
            int intents = 0;
            int x = rn.nextInt(FILES);
            int y = rn.nextInt(COLUMNES);
            while(!esPotInserir(paraula,x,y) && intents<MAX_INTENTS){
                x = rn.nextInt(FILES);
                y = rn.nextInt(COLUMNES);
                intents++;
            }
            if(esPotInserir(paraula,x,y)){
                for(int i=0; i<paraula.getLletres().length; i++){
                    this.lletres[x+i][y] = paraula.getLletres()[i];
                }
            }
        }
    }

    public void emplenarNivell5(){
        Random rn = new Random();

        //Per a cada paraula escollim el mètode horitzontal i sense reverse
        for(Paraula paraula: this.paraules){
            int direccio = rn.nextInt(DireccioParaula.values().length);
            int reverse = rn.nextInt(2);

            paraula.setDireccioParaula(DireccioParaula.values()[direccio]);
            paraula.setReverse(reverse==0);
        }

        //Emplenam cada paraula
        final int MAX_INTENTS = 100000;
        for(Paraula paraula: this.paraules){
            int intents = 0;
            int x = rn.nextInt(FILES);
            int y = rn.nextInt(COLUMNES);
            while(!esPotInserir(paraula,x,y) && intents<MAX_INTENTS){
                x = rn.nextInt(FILES);
                y = rn.nextInt(COLUMNES);
                intents++;
            }
            if(esPotInserir(paraula,x,y)){
                Paraula p = new Paraula(paraula.getLletres());
                if(paraula.isReverse()){
                    Lletra[] lletresInversa = paraula.getLletres();
                    Collections.reverse(Arrays.asList(lletresInversa));
                    p = new Paraula(lletresInversa);
                }

                if(paraula.getDireccioParaula().equals(DireccioParaula.HORITZONTAL)) {
                    for (int i = 0; i < paraula.getLletres().length; i++) {
                        this.lletres[x + i][y] = p.getLletres()[i];
                    }
                } else if(paraula.getDireccioParaula().equals(DireccioParaula.VERTICAL)){
                    for (int i = 0; i < paraula.getLletres().length; i++) {
                        this.lletres[x][y+i] = p.getLletres()[i];
                    }
                } else if(paraula.getDireccioParaula().equals(DireccioParaula.DIAGONAL)){
                    for (int i = 0; i < paraula.getLletres().length; i++) {
                        this.lletres[x+i][y+i] = p.getLletres()[i];
                    }
                }
            }
        }
    }

    public void buidar(){
        this.lletres = new Lletra[FILES][COLUMNES];
    }

    public void imprimir(){
        interficie.imprimir(lletres);
    }

    public void separacio(){
        interficie.separacio();
    }
}
