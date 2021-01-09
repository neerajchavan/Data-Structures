public class DuplicateZeroes{
   // Copy paste Solution1 class in leetcode compiler
   // Change name of solution1 to Solution while running code in leetcode compiler
}

class Solution1 {
    public void duplicateZeros(int[] arr) {
      int i=0;
      while(i<arr.length-1){
          if(arr[i] == 0){
              for(int j=arr.length-1; j>i; j--){
                  arr[j] = arr[j-1];
              }
              arr[i+1] = 0;
              i+=2;
          }
          else
              i++;
      }  
    }
}