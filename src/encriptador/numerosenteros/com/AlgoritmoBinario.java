
package encriptador.numerosenteros.com;

public class AlgoritmoBinario implements Algoritmo{
    
    private long codigo,opBinatyToDec,modulo, exp=0;
  
    public AlgoritmoBinario(long codigo){
        this.codigo = codigo;
    }

    @Override
    public long encriptar(long numero) {
        
        String binary = "";
        while(numero > 0){
            modulo = numero % 2;
            binary = modulo + binary;
            numero = numero / 2;            
        }
        return numero = Long.parseLong(binary);
    }

    @Override
    public long desencriptar(long numero) {
        
        while(numero > 0){
            modulo = numero % 10;
            opBinatyToDec = opBinatyToDec + modulo *(long)Math.pow(2, exp);
            exp++;
            numero = numero / 10;
        }
        return numero = opBinatyToDec;
    }

    @Override
    public String toString() {
        return "Algoritmo Binario";
    }
    
}
