public class OperacoesMatematicas {

    public static double calculaMedia(int[] vetor){
        double soma=0;

        for(int i=0;i< vetor.length;i++){
            soma = soma+vetor[i];
        }
        return soma/vetor.length;
    }
    public static boolean estaOrdenada (int[] vetor) {
        boolean resultado = false;
        for(int i=0; i < vetor.length-1; i++){
            if (vetor[i] <= vetor[i+1]) {
                resultado= true;
            }else{
                resultado=false;
                break;
            }
        }
        return resultado;
    }

    public static int calculaFatorial(int valor){
        int resultado=1;

        if(valor>0){
            for(int i=1; i<=valor;i++){
                resultado= resultado*i;
            }

        } else if (valor==0){
            resultado=1;

        } else{
             throw new RuntimeException("Valor incorreto");
        }
        return resultado;
    }

    public static double converteTemperatura(double celsius){
        double tempFahrennheit;
        return tempFahrennheit = (celsius*1.8)+32;
    }

    public static boolean ePrimo(int numero){
        int numDivisores =0;

        for(int i=1; i<=numero;i++){
            if(numero%i==0){
                numDivisores++;
            }
        }
        if(numDivisores==2){
            return true;
        } else
            return false;

    }


}

