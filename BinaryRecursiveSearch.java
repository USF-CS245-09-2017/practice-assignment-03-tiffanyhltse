public class BinaryRecursiveSearch implements Practice03Search {
    public String searchName(){
        return "binary recursive search.";
    }

    public int search(int [] arr, int target){
        return binSearch(arr, target, 0, arr.length-1);

    }

    public int binSearch(int [] arr, int target, int start, int end){
        if (start > end){ //base case
            return -1;
        }

        int mid = (start + end) / 2;
        if (arr[mid] == target){
            return mid;
        } else if (arr[mid] < target){ //left of midpoint
            return binSearch(arr, target, mid+1, end);
        } else {
            return binSearch(arr, target, start, mid-1); //right of midpoint
        }

    }
}
