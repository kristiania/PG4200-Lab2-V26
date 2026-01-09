import assignment.Delete;
import assignment.Insert;
import assignment.Search;
import assignment.Traverse;

void main() {
    int[] arr = {10, 7, 11, 5, 13, 8, 38, 37, 14, 92, 84, 74, 77, 20, 40, 47, 33, 65, 62, 69, 73};
    IO.println("");                                                      
    IO.println("------------------------------------------------------");
    IO.println("Task 1.1 reverse traverse");
    Traverse tv = new Traverse(arr);
    int[] revArr = tv.inReverse();
    for(int elem : revArr){
           IO.print(elem + " ");
    }

  int myValue = 666;
  IO.println("");
  IO.println("------------------------------------------------------");
  IO.println(String.format( "Task 1.2 insert %d at start ", myValue));
  Insert in = new Insert(arr);
  int[] newArr = in.atStart(myValue);
  for(int elem : newArr){
         IO.print(elem + " ");
  }
  IO.println("");                                                           
  IO.println("------------------------------------------------------");
  IO.println(String.format( "Task 1.2 insert %d at end ", myValue));
  newArr = in.atEnd(myValue);
  for(int elem : newArr){
         IO.print(elem + " ");
  }
  int myRandPosition = (int) ((Math.random() * (arr.length-1)));
  IO.println("");
  IO.println("------------------------------------------------------");
  IO.println(String.format( "Task 1.2 insert %d at random index %d ", myValue, myRandPosition));
  newArr = in.atIndex(myValue, myRandPosition)   ;
  for(int elem : newArr){            
         IO.print(elem + " ");       
  }                                  


  Delete del = new Delete(arr);
  IO.println("");
  IO.println("------------------------------------------------------");
  IO.println("Task 1.3 delete element at beginning ");

  newArr = del.atStart();
  for(int elem : newArr){
         IO.print(elem + " ");
  }
  IO.println("");
  IO.println("------------------------------------------------------");
  IO.println("Task 1.3 delete element at end ");
  newArr = del.atEnd();
  for(int elem : newArr){
         IO.print(elem + " ");
  }
  myRandPosition = (int) ((Math.random() * (arr.length-1)));
  IO.println("");
  IO.println("------------------------------------------------------");
  IO.println(String.format( "Task 1.3 delete at given index %d ",myRandPosition));
  newArr = del.atIndex(myRandPosition)   ;
  for(int elem : newArr){
         IO.print(elem + " ");
  }

}