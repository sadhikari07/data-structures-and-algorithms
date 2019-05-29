package array_shift;
import java.lang.Math;


public class ArrayShift {
    public int[] insertShiftArray(int oldArray[], int inputInt){
        int i = 0;
        int j = 0;
        int middleIndex = 0;
        if(oldArray.length%2==0){
            middleIndex = oldArray.length/2;
        }
        else if(oldArray.length%2!=0){
            middleIndex = (oldArray.length+1)/2;
        }
        int answerArray[] = new int[oldArray.length+1];
        while(i<answerArray.length){
            if (i==middleIndex){
                answerArray[i]=inputInt;
                i++;
            }
            else{
                answerArray[i] = oldArray[j];
                i++;
                j++;
            }
        }
        return answerArray;
    }
}