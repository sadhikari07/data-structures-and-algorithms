package java401_code_challenges.leftJoin;

import java401_code_challenges.hashtable.HashTable;
import java401_code_challenges.hashtable.Node;

import java.util.ArrayList;

public class LeftJoin{

    public static ArrayList leftJoiner(HashTable synonymTable, HashTable antonymTable) {
        ArrayList result = new ArrayList();
        for (int i = 0; i < synonymTable.numberOfBuckets; i++) {
            if (synonymTable.bucketsArray[i].head != null) {

                if (antonymTable.contains(synonymTable.bucketsArray[i].head.key)) {
                    synonymTable.bucketsArray[i].head.next = new Node(synonymTable.bucketsArray[i].head.key, antonymTable.get(synonymTable.bucketsArray[i].head.key));
                }
                else {
                    synonymTable.bucketsArray[i].head.next = new Node(synonymTable.bucketsArray[i].head.key, "Null");
                }
            }
        }


        for (int i = 0; i < synonymTable.numberOfBuckets; i++) {
            if (synonymTable.bucketsArray[i].head != null) {
                String[] valuesArray = new String[3];
                valuesArray[0] = synonymTable.bucketsArray[i].head.key;
                valuesArray[1] = (String) synonymTable.bucketsArray[i].head.value;
                valuesArray[2] = (String) synonymTable.bucketsArray[i].head.next.value;
                result.add(valuesArray);
            }
        }
        return result;
    }

}
