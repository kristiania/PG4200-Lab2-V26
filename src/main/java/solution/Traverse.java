package solution;

public class Traverse {
    public int [] arr;

    public Traverse(int[] arr) {
        this.arr = arr;
    }

    public int[] inReverse(){
        var arrLen = this.arr.length;
        int [] revArr = new int[arrLen];
        int i;
        for(i=arrLen-1;i>=0;i--) {
            IO.print(this.arr[i] + " ");
            revArr[arrLen - i - 1] = this.arr[i];
        }
        return revArr;
    }

}
