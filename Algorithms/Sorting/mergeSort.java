// mergeSort() . n log n

// assumes proper array is being sent in
public void sortArray(int[] unsortedArray){
  int length = unsortedArray.size();
  if(length=1){//done}
  else{
    mergeSort(unsortedArray);
  }
}

public void mergeSort(int[] unsortedArray){
  int length = unsortedArray.size();
  int splitNum = (int) length/2;

  int[] firstHalf = new int[splitNum];
  int[] firstHalf = new int[length-splitNum];
  System.arraycopy(unsortedArray, 0, firstHalf, 0, splitNum);
  System.arraycopy(unsortedArray, splitNum, secondHalf, 0, lenght);

}
