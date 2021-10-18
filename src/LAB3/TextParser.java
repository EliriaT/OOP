package LAB3;

import java.util.*;
import java.util.stream.Collectors;


class TextHelper {

    static int getNrOfSentences(String text) {
        int numSentences = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '.' || c == '!' || c == '?' ) {
                numSentences++;
            }
        }
        return numSentences;
    }



    static int getNrOfWords(String text) {
        int numWords = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                numWords++;
            }
            ;
        }
        if(text.charAt(text.length()-1)!=' ') {numWords++;} //findca se finiseaza cu un semn de punctuatie doar
        return numWords;
    }



    static int getNrOfLetters(String text) {

        int numLetters = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                numLetters++;
            }
            ;
        }
        return numLetters;
    }



    static int getNrOfConsonants(String text) {
        List<Character> consonants = Arrays.asList('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z', 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'); //y se socoate consoana uneori in engleza

        int numConsonants = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (consonants.contains(c)) {
                numConsonants++;
            }
        }
        return numConsonants;
    }



    static int getNrOfVowels(String text) {
        List<Character> vowels = Arrays.asList('a', 'o', 'u', 'i', 'e', 'A', 'O', 'U', 'I', 'E'); //Y nu se socoate vocala
        int numVowels = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (vowels.contains(c)) {
                numVowels++;
            }
            ;
        }
        return numVowels;
    }

    static void getTheLongestWord(String text){
        int maxLength=0;
        String maxString=null;
        for (String word : text.split(" ")) {
            if(word.length()>maxLength) {
                maxLength= word.length();
                maxString=word;
            }
        }
        if(!Character.isLetter(maxString.charAt(maxLength-1))) //cand dupa cuvant indata urmeaza semn de punctuatie
        {
            maxLength=maxLength-1;
            maxString=maxString.substring(0,maxLength);
        }
        System.out.println("The longest word is "+maxString+" and it's length is "+maxLength+" characters");
    }

    static void getTopFiveWord(String text){
        Hashtable<String, Integer> wordsRating = new Hashtable<String, Integer>();
        for (String word : text.split(" ")) {
            if(wordsRating.get(word)==null){
                wordsRating.put(word, 1);
            }
            else {
                wordsRating.put(word, wordsRating.get(word)+1);
            }
        }
        Hashtable<Integer, ArrayList<String>> reversedWordsRating = new Hashtable<>(); //Pentru ca pentru o lungime anumita pot fi mai multe cuvinte
        for (String word : text.split(" ")) {

            if(reversedWordsRating.get(wordsRating.get(word))!=null)
            {

                ArrayList<String> wordsList=reversedWordsRating.get(wordsRating.get(word));
                if(!wordsList.contains(word)){
                    wordsList.add(word);
                }
                reversedWordsRating.put(wordsRating.get(word),wordsList);
            }
            else
            {
                ArrayList<String> wordsList = new ArrayList<String>();
                wordsList.add(word);
                reversedWordsRating.put(wordsRating.get(word),wordsList);
            }

        }

        Set<Integer> keys = reversedWordsRating.keySet();
        Iterator<Integer> itr = keys.iterator();

        int top=5;
        while (itr.hasNext()&&top>0) {
            Integer i = itr.next();
            List<String> firstNElementsList=reversedWordsRating.get(i).stream().limit(top).collect(Collectors.toList());
            System.out.println(i + " " +firstNElementsList);
            top=top-firstNElementsList.size();
        }
    }
}
