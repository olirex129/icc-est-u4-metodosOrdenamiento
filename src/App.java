public class App {
    public static void main(String[] args) throws Exception {
        //runBubbleSort();
        runBubbleSortAvanzado();
    }
    
    public static void runBubbleSort(){
        System.out.println("metodo burbuja");
        //instancia de la clase 
        int[] numeros = {-5,10,2,0,7};
        BubbleSort bubbleSort = new BubbleSort();
        // bubbleSort.printArrreglo(numeros);
        // bubbleSort.sortAcendente(numeros);
        // bubbleSort.printArrreglo(numeros);
        // bubbleSort.sortDescendente(numeros);
        // bubbleSort.printArrreglo(numeros);

        bubbleSort.printArrreglo(numeros);
        bubbleSort.sort(numeros,true);
        bubbleSort.printArrreglo(numeros);
        bubbleSort.sort(numeros, false);
        bubbleSort.printArrreglo(numeros);
    }
    
//El run sirve para ejecutar el metodo completo para poder ordenar
   public static void runBubbleSortAvanzado(){
    System.out.println("metodo de BubbleSortAvanzado");
    int[] array = new int[]{9,2,3,0,8,5,10,50,100};
    BubbleSortAvanzado tSortAvz = new BubbleSortAvanzado(array);
    tSortAvz.printArray();
    tSortAvz.sort(true);
    tSortAvz.printArray();
   }
}
