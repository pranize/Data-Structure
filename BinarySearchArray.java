class BinarySearchArray{
 static int BinarySearchArray(int []array, int value, int left, int right){

    if(left>right){
      return -1;
    }

    int middle = (left + right) / 2;

    if(array[middle] == value)
      return middle;
    
    else if (array[middle] > value)
      return BinarySearchArray(array,value,left,middle - 1);

    else 
      return BinarySearchArray(array,value,middle+1,right);
  }
  public static void main(String[] args) {
    int []Array={2,45,30,56,86,99,97,90};
    int index=BinarySearchArray(Array,45,0,Array.length);
    System.out.println("Found 45 at "+index+" index");
    index = BinarySearchArray(Array,97,0,Array.length);
    System.out.println("Found 97 at "+index+" index");
    index = BinarySearchArray(Array,90,0,Array.length+1);
    System.out.println("Found 90 at "+index+" index");

  }  
}
