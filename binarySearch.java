public class binarySearch {
    public static int LinearSearch(int a[],int target) {
        int s=0;
        for (int i = 0; i < a.length; i++) {
            s++;
            if (target == a[i]) {
                System.out.println(s);
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int a[],int target){
        int s=0,b=0;
        int e=a.length-1;
        while(s<=e){
            b++;
            int mid=(s+e)/2;
            if(target==a[mid]) {
                System.out.println(b);
                return mid;
            }
            else if(a[mid]<target)
                s=mid+1;
            else
                e=mid-1;
        }
        return -1;
    }

    public static int binRec(int a[],int target,int s,int e){
        if(s<=e) {
            int mid=(s+e)/2;
            if (target == a[mid]) {
                return mid;
            } else if (a[mid] < target) {
                return binRec(a, target, mid + 1, e);
            } else {
                return binRec(a, target, s, mid - 1);
            }
        }
        return -1;
    }

    public static void main(String args[]){
        //Linear Search
        int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int target=15;
        int s=0,e=a.length-1;
        //int result=LinearSearch(a,target);
        //int result=binarySearch(a,target);
        int result=binRec(a,target,s,e);
        if(result!=-1){
            System.out.println("Element found at Index "+result);
        }else{
            System.out.println("Element not found");
        }
    }
}
