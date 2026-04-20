public class App {
    public static void main(String[] args) throws Exception {
        runBubbleSort();
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
    
}
