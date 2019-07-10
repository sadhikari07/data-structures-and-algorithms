package java401_code_challenges.repeatedWords;

import java401_code_challenges.hashtable.HashTable;

public class RepeatedWord{

    public static String firstRepeatedWord(String input) {
        input = input.toLowerCase();
        String[] arrayOfWords = input.split("[\\s,.;]+");
        HashTable newHashTable = new HashTable();

        String result = null;

        for (int i = 0; i < arrayOfWords.length; i++) {
            String checkThisWord = arrayOfWords[i];
            if (newHashTable.contains(checkThisWord)) {
                result = checkThisWord;
                return result;
            }
            else {
                newHashTable.add(checkThisWord, 1);
            }
        }
        return result;
    }
}
