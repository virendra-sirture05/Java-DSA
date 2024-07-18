package BinarySearch;

public class SearchInRotetedSortedArr {
    

    // improve karna baaki hai
    static int optimizedSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < arr[end]){  // you are in right side
                if(arr[mid] < target && target < arr[end]){
                    start = mid + 1;
                }
                else if(arr[mid] < target && target > arr[end]){
                    end = mid - 1;
                }
            }
            else if(arr[mid] > arr[end]){  // you are in right part
                if(arr[mid]<target && target < arr[end]){
                    start = mid + 1;
                }
                else if(arr[mid] > target && target > arr[end]){
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {7,8,9,0,1,2,3,4,5,6};
        int target = 3;
        // System.out.println(search(arr, target));

        System.out.println(optimizedSearch(arr, target));
    }

    // very v v v v bad code 
    static int search(int[] arr, int target) {
        if(arr.length <= 2){
            for(int i = 0; i<arr.length; i++){
                if(arr[i] == target){
                    return i;
                }
            }
        }
        int start = 1;
        int end = arr.length - 2;
        int pivot = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                pivot = mid; 
                break;
            }
            else if(arr[mid] < arr[mid+1] && arr[mid] < arr[mid-1]){
                 pivot = mid-1; break;
            }
            else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]){
                if(arr[mid] > arr[arr.length-1]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        
        }
        int ans = binaryS(arr, 0, pivot, target);
        int ans1 = binaryS(arr, pivot+1,arr.length-1, target);

        if(ans == - 1){
            return ans1;
        }
        else{
            return ans;
        }
    }
    static int binaryS(int[] arr, int start, int end,int target){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
