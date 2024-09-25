public class BubbleSort {
    public static void main(String args[]){
        int[] a={5,4,3,2,1};
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int s = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = s;
                }
            }
            for(int s=0;s<a.length;s++){
                System.out.print(a[s]);
            }
            System.out.println();
        }
    }
}