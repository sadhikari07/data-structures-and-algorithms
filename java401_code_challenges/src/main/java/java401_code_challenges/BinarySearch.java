package java401_code_challenges;


//Portions of following codes have been referenced from https://www.baeldung.com/java-binary-search
public class BinarySearch {
    public int binarySearchFunction(int[] sortedArray, int searchkey) {
        int firstIndex = 0;
        int lastIndex = sortedArray.length-1;
        int outputIndex = 0;

            while(firstIndex<=lastIndex){
                int midPoint = (firstIndex+lastIndex)/2;
                if(sortedArray[midPoint]<searchkey){
                    firstIndex = midPoint+1;
                }
                else if(sortedArray[midPoint]>searchkey){
                    lastIndex = midPoint - 1;
                }
                else if(sortedArray[midPoint]==searchkey){
                    outputIndex = midPoint;
                    break;
                }

            }
         if (lastIndex<firstIndex){
             outputIndex = -1;
         }
        return outputIndex;
    }
    }

