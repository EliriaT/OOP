package LAB3;

public class Main {
    public static void main(String[] args) {
        String text = "An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. It is called an iterator because iterating is the technical term for looping.";
        //Task1
        System.out.println("Number of sentences is: "+TextHelper.getNrOfSentences(text));
        System.out.println("Number of words is: "+TextHelper.getNrOfWords(text));

        //Task2
        System.out.println("Number of letter is: "+TextHelper.getNrOfLetters(text));
        System.out.println("Number of consonants is: "+TextHelper.getNrOfConsonants(text));
        System.out.println("Numarul de vocale este: "+TextHelper.getNrOfVowels(text));

        //Task3
        System.out.println("Top five words are: ");
        TextHelper.getTopFiveWord(text);
        TextHelper.getTheLongestWord(text);
    }
}