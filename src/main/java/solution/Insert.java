package solution;

public class Insert {
    public int [] arr;

    public Insert(int[] arr) {
        this.arr = arr;
    }

    public int[] atStart(int value){
        var arrLen = this.arr.length;
        int [] newArr = new int[arrLen+1];
        newArr[0] = value;

        for(int i=0;i<arrLen;i++) {

            newArr[i+1] = this.arr[i];
        }
        return newArr;
    }

    public int[] atEnd(int value){
        var arrLen = this.arr.length;
        int [] newArr = new int[arrLen+1];
        newArr[arrLen] = value;

        for(int i=0;i<arrLen;i++) {

            newArr[i] = this.arr[i];
        }
        return newArr;
    }

    public int[] atIndex(int value, int pos){
        var arrLen = this.arr.length;
        int [] newArr = new int[arrLen+1];

        // how to not crash
        if (pos > arrLen - 1){
            return this.atEnd(value);
        }

        for(int i=0;i<arrLen+1;i++) {
            if (i < pos) {
                newArr[i] = this.arr[i];
            }
            else if (i == pos) {
                 newArr[pos] = value;
            }
            else {
                  newArr[i] = this.arr[i-1];
            }

        }
        return newArr;
    }


}
