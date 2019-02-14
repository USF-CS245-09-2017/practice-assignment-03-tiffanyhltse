//binary search
//sequence of elements sorted to increasing order
public class BinaryIterativeSearch implements Practice03Search {
    public String searchName(){
        return "binary iterative search.";
    }

    public int search(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end){
            mid = (start + end) / 2; //know where midpoint is
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target ){ //left of midpoint
                start = mid+1;

            } else {
                end = mid-1; //right of midpoint
            }
        }
        return -1;

    }


}
