public class SelectionSort {
    public static void main(String[] args){
        int[] a={2,4,1,6,5,3};
        int size=a.length;
        int temp=0;
        int minIndex=-1;

        for(int i:a){
            System.out.print(i+" ");
        }

        for(int i=0;i<size-1;i++){
            minIndex=i;
            for(int j=i+1;j<size;j++){
                if(a[minIndex]>a[j])//for descending change the operator
                    minIndex=j;
            }
            temp=a[minIndex];
            a[minIndex]=a[i];
            a[i]=temp;
        }

        System.out.println();
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
