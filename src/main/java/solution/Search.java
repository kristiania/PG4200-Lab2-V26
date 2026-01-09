package solution;

public class Search {
    public int [] arr;

    public Search(int[] arr) {
        this.arr = arr;

    }
    public int linearSearch(int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return i;
            }
                //System.out.println("Item found at " + i);
            }
        return -1;
        }

    public int stepsLinearSearch(int target){
        int numberOfSteps = linearSearch(target);
        if (numberOfSteps >= 0) {
                 return numberOfSteps+1;
        }
        else {
            return arr.length;
        }

    }



}
