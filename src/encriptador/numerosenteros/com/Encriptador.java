package encriptador.numerosenteros.com;

public class Encriptador{

    public long encriptar(Algoritmo alg, long numero){
        return alg.encriptar(numero);
    }

    public long desencriptar(Algoritmo alg, long numero){
        return alg.desencriptar(numero);
    }
}
