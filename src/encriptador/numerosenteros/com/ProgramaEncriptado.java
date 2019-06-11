package encriptador.numerosenteros.com;

import java.util.ArrayList;

public class ProgramaEncriptado {
    
    public static void main(String[] args) {

        ArrayList<Algoritmo> misAlgos = new ArrayList<Algoritmo>();
        ValidateCharacters validChar = new ValidateCharacters();
        
        int option = validChar.validateNumbers("\nSi desea encriptar números escriba ' 1 '.\nSi no escriba ' 2 '.");
        
        switch (option) {
            case 1:
                break;
            case 2:
                System.exit(0);
            default:
                System.out.println("Error... Escriba las opciones correctas.");
                main(null);
        }
        
        long encriptame = validChar.validateLong("\nIngrese el número a encriptar: ");

        Algoritmo alg1 = new AlgoritmoXOR(41256);
        misAlgos.add(alg1);

        Algoritmo alg2 = new AlgoritmoDiferencia(96325);
        misAlgos.add(alg2);

        Algoritmo alg3 = new AlgoritmoMultiplicacion(99251);
        misAlgos.add(alg3);

        Algoritmo alg4 = new AlgoritmoBinario(44668);
        misAlgos.add(alg4);
        
        long encriptaArr[] = new long[4];
        int i = 0;


        for(Algoritmo ag : misAlgos){
            encriptaArr[i] = ag.encriptar(encriptame);
            System.out.println("\nLa Encriptación de "+ag.toString()+" de " + encriptame + " es: "+encriptaArr[i]);
            i++;
        }

        i=0;

        int option2 = validChar.validateNumbers("\nSi desea desencriptar los números escriba ' 1 '.\nSi no escriba ' 2 '.");
        
        switch (option2) {
            case 1:
                break;
            case 2:
                System.exit(0);
            default:
                System.out.println("\nError... Escriba las opciones correctas.");
                main(null);
        }
        
        for(Algoritmo ag : misAlgos){
            System.out.println("\nLa Desencriptción de "+ag.toString()+" de " + encriptaArr[i] + " es: "+ag.desencriptar(encriptaArr[i]));
            i++;
        }	
        validChar.enterToClose("\nEnter para salir...");

    }
    
}
