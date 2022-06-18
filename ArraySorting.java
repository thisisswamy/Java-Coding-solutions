package PRACTICE;

public class ArraySorting {

    public static void sortArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
            
        }
        System.out.println("--------- Printing Sorted Array -----------------");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("--------- Printing Sorted Array -----------------");
        
    }

    public static void main(String[] args) {
        int[] arr=new int[]{10,2,23,2,9,4,1,1,33,0}; // 2 2 4 9 10 23
        sortArray(arr);
        

    }
    
}
