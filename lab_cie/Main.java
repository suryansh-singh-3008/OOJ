import java.util.*;
interface Sortable{
    public void sort();

}
class BubbleSort implements Sortable{
    Scanner sc=new Scanner(System.in);
    public void sort(){
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("sorted array bubble sort");
        for(int i=0;i<n;i++){
            System.out.println(arr[i] );
        }

    }
    public void sort(int arr[]){
        int n=arr.length;
                for(int i=0;i<=n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        for(int i=0;i<n;i++){
            System.out.println(arr[i] );
        }


    }
}
class SelectionSort implements Sortable{
    Scanner sc=new Scanner(System.in);
    public void sort(){
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<=n-1;i++){
            for(int j=i;j<n-i-1;j++){
                int min=arr[j];
                if(min>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=min;
                    min=temp;
                    arr[j]=min;
                }
                
            }
        }
        System.out.println("sorted array selection sort");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
}
class Main{
    public static void main(String[] args) {
        BubbleSort bs=new BubbleSort();
        SelectionSort ss= new SelectionSort();


        int arr[]=new int[2];
        arr[0]=12;
        arr[1]=4;
        System.out.println("Modification");
        bs.sort(arr);
        bs.sort();
        ss.sort();
    }

}
