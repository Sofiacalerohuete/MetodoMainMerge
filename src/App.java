public class App {
    public static void main(String[] args) {
        int [] arr = {38, 27, 43 3, 9, 82, 10};
        int n= arr.lenght;
        mergeSort(arr, left:0, n-1);

        System.out.println("Arreglo ordenado");
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
