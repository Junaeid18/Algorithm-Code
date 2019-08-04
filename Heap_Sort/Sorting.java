
package Heap_Sort;

public class Sorting {
    public static void main(String[] args)
    {
        int[] ar = {20,15,10,100,7,13,-15};
        int n = ar.length;
        BuildHeap(ar); 
        print(ar,n);
        
    }
    public static void BuildHeap(int[] ar)
    {
        int n = ar.length;
        for(int i = n/2 - 1 ;i >= 0; i--)
        {
            Heapify(ar,n,i);
        }
        HeapSort(ar,n);
        
    }
    public static void HeapSort(int[] ar,int n)
    {
        for(int i = n - 1 ; i >= 0 ; i--)
        {
            int s = ar[i];
            ar[i] = ar[0];
            ar[0] = s;
            
            Heapify(ar, i ,0);
        }
        
    }
    public static void Heapify(int[] ar,int n , int i)
    {
        int largest = i;
        int l = 2 * i + 1 ;
        int r = 2 * i + 2;
        if( l < n && ar[l] > ar[largest])
            largest = l ;
        if( r < n && ar[r] > ar[largest])
            largest = r ;
        if( largest != i)
        {
            int a = ar[largest];
            ar[largest] = ar[i];
            ar[i] = a ;
            
            Heapify(ar,n,largest);
        }
    }
    public static void print(int[] ar,int n)
    {
        for(int a = 0 ; a < n ; a++  )
        {
            System.out.printf(" %d \n",ar[a]);
        }
    }
}
