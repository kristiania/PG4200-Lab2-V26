package solution;

public class Delete {

    public int [] arr;

    public Delete(int[] arr) {
        this.arr = arr;
    }

    public int[] atStart(){
        var arrLen = this.arr.length;
        int [] newArr = new int[arrLen-1];


        for(int i=0;i<arrLen-1;i++) {

            newArr[i] = this.arr[i+1];
        }
        return newArr;
    }

    public int[] atEnd(){
        var arrLen = this.arr.length;
        int [] newArr = new int[arrLen-1];


        for(int i=0;i<arrLen-1;i++) {

            newArr[i] = this.arr[i];
        }
        return newArr;
    }

    public int[] atIndex(int pos){
        var arrLen = this.arr.length;
        int [] newArr = new int[arrLen-1];

        //how to not crash
        if (pos > arrLen - 1){
            return this.atEnd();
        }

        for(int i=0;i<arrLen-1;i++) {
            if (i < pos) {
                newArr[i] = this.arr[i];
            }
            else if (i >= pos) {
                newArr[i] = this.arr[i+1];
            }


        }
        return newArr;
    }

}
