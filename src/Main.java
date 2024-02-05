import myList.List;
import myList.minhaLista;

public class Main {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        int i = 1;
        List lista = new minhaLista();
        System.out.println(lista.getTamanho());
        while (lista.getTamanho() < 100000000){
             lista.add(i + 1);
            i++;
            }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Tempo decorrido: " + elapsedTime + " milissegundos");
    }
}