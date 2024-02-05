package myList;

public class minhaLista implements List{
    private int tamanho;
    private int[]array;

    public minhaLista() {
        this.tamanho = 0;
        this.array = new int[10];
    }
    public int get(int index){
        return this.array[index];
    }
    public void add(int elemento){
        if (this.tamanho >= this.array.length){
            increaseList();
        }
        this.array[this.tamanho] = elemento;
        this.tamanho++;
    }

    private void increaseList() {
        int novoTamanho = this.array.length * 2;
        int[] novoArray = new int[novoTamanho];
        for (int i = 0; i < this.array.length; i++) {
            novoArray[i] = this.array[i];
        }
        this.array = novoArray;
    }
    public int getTamanho(){
        return this.tamanho;
    }
}
