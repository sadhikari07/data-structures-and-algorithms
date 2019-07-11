//package java401_code_challenges.leftJoin;
//
//import java401_code_challenges.hashtable.HashTable;
//
//import java.util.ArrayList;
//
//public class LeftJoin{
//
//    public static ArrayList leftJoiner(HashTable<String> synonymTable, HashTable<String > antonymTable) {
//        ArrayList result = new ArrayList();
//        for (int i = 0; i < synonymTable.numberOfBuckets; i++) {
//
//            if (synonymTable.bucketsArray[i].head != null) {
//
//                if (antonymTable.contains(synonymTable.bucketsArray[i].head.key)) {
//                    synonymTable.bucketsArray[i].head.next.value = antonymTable.get(synonymTable.bucketsArray[i].head.key);
//                }
//                else {
//                    System.out.println(synonymTable.bucketsArray[i].head.next);
////                    synonymTable.bucketsArray[i].head.next.value = "Null";
//                }
//            }
//        }
//
//        String[] valuesArray = new String[3];
//        for (int i = 0; i < synonymTable.numberOfBuckets; i++) {
//            if (synonymTable.bucketsArray[i].head != null) {
//                valuesArray[0] = synonymTable.bucketsArray[i].head.key;
//                valuesArray[1] = (String) synonymTable.bucketsArray[i].head.value;
//                valuesArray[3] = (String) synonymTable.bucketsArray[i].head.next.value;
//            }
//
//            result.add(valuesArray);
//
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//
//        HashTable synonym = new HashTable();
//
//        synonym.add("Hello", "hi");
//        synonym.add("Home", "house");
//
//
//        HashTable antonym = new HashTable();
//        antonym.add("Hello", "bye");
//
//        ArrayList arr = leftJoiner(synonym, antonym);
//
//        for(int i = 0; i < arr.size(); i++){
//            System.out.println(arr.get(i));
//        }
//
//
//
//
//    }
//}
