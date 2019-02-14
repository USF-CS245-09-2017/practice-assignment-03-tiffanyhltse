public class LinearSearch implements Practice03Search{
    public String searchName(){
        return "linear search.";
    }

    public int search(int [] arr, int target){ //finds a target & returns index of target if exists, -1 if not exists
        for(int i = 0; i < arr.length; i++ ){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}



