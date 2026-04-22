public class BubbleSort {
  public BubbleSort(){
//metodo contructor 
System.out.println("Se creo la clase en el constructor");
  }  
public void sortAcendente(int numeros[]){
    for(int i=0; i < numeros.length;i++){
        for(int j=i+1; j<numeros.length;j++){
            //comparacion
                if(numeros[i]>numeros[j]){
                //si se cumple se realiza el intercambio
                int aux = numeros[i];
                numeros[i]= numeros[j];
                numeros[j]= aux;
            }
        }
    }
}
public void printArrreglo(int[] numeros) {
    for(int i : numeros){
        System.out.print(i+", ");
    }
    System.out.println();
}
public static void sortDescendente(int[] numeros){
    for(int i=0; i < numeros.length;i++){
        for(int j=i+1; j<numeros.length;j++){
            //comparacion
            if(numeros[i]<numeros[j]){
                //si se cumple se realiza el intercambio
                int aux = numeros[i];
                numeros[i]= numeros[j];
                numeros[j]= aux;
            }
        }
    }
        ///
        /// {asc} True ordenara acendente
        /// {asc} False ordenara desediente
    }
    public void sort(int[] numeros, boolean asc){
        if (asc==true) {
            for(int i=0; i < numeros.length;i++){
        for(int j=i+1; j<numeros.length;j++){
            //comparacion
                if(numeros[i]>numeros[j]){
                //si se cumple se realiza el intercambio
                int aux = numeros[i];
                numeros[i]= numeros[j];
                numeros[j]= aux;
            }
        }
    }
        }
 else{
for(int i=0; i < numeros.length;i++){
        for(int j=i+1; j<numeros.length;j++){
            //comparacion
                if(numeros[i]<numeros[j]){
                //si se cumple se realiza el intercambio
                int aux = numeros[i];
                numeros[i]= numeros[j];
                numeros[j]= aux;
            }
        }
    }
    /*
    if(asc==tru){
    Sort
    }

     */
 }
}
}
