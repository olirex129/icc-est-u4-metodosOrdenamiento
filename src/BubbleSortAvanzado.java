public class BubbleSortAvanzado {
    // variable global 
    int[] array; // tiene valor? 
                 //donde le doy valor? con un constructor

    public BubbleSortAvanzado(int[] arreglo){
        //darle valor directo
        //array = new int[]{10,5,0};
        //darle valor en base a parametro
        this.array = arreglo;
    }
    public void sort(boolean asc){
        int tam = array.length;
        boolean huboIntercambio;
        int comparaciones = 0;
        int intercambios = 0;
        for( int i = 0 ; i<tam-1 ;i++){
            huboIntercambio = false;
            for(int j = 0 ; j<tam -1 -i;j++){
                comparaciones++;
                if(array[j]> array[j+1]){
                    huboIntercambio = true;
                    intercambios++;
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;

                }
            }
            if(!huboIntercambio){//si es false rompe el bucle
                     break;
                }

        }
        System.out.println("Comparaciones totales: " + comparaciones);
        System.out.println("intercambios totales: " + intercambios);
    }
    public void printArray() {
        for(int i : array){
        System.out.print(i+", ");
    }
    System.out.println();
    }
   
}

