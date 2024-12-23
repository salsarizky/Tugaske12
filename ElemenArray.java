public class ElemenArray {
    public static boolean search(int[] arr, int n, int target){
        if (n == 0) {
            return false;
        }
        if (arr[n -1] == target) {
            return true;
        }
        return search(arr,n - 1, target);
    }
    public static void main(String[] args) {
        int[] arr = {13, 4, 23, 27, 40};
        int target = 27;
        boolean found = search(arr, arr.length, target);
        if(found == true) {
            System.out.println("Element '"+target+"' ada di dalam array.");
        }else{
            System.out.println("Element tidak ada di dalam array.");
        }
    }
}
