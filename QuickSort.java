public class QuickSort {
    public static int part(int a[],int low,int high){
        int pivot=a[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(a[j]>pivot){
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        i++;
        int temp=a[i];
        a[i]=pivot;
        a[high]=temp;
        return i;
    }
    public static void QS(int a[],int low,int high){
        if(low<high){
            int pivot=part(a,low,high);
            QS(a,low,pivot-1);
            QS(a,pivot+1,high);
        }
    }

    public static void main(String[] args){
        int[] a={2,1,5,4,3};
        int n=a.length;
        QS(a,0,n-1);

        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
