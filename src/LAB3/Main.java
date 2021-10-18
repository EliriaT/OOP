package LAB3;

public class Main {
    public static void main(String[] args) {
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        //Task1
        System.out.println("Number of sentences is: " + TextHelper.getNrOfSentences(text));
        System.out.println("Number of words is: " + TextHelper.getNrOfWords(text));

        //Task2
        System.out.println("Number of letter is: " + TextHelper.getNrOfLetters(text));
        System.out.println("Number of consonants is: " + TextHelper.getNrOfConsonants(text));
        System.out.println("Numarul de vocale este: " + TextHelper.getNrOfVowels(text));

        //Task3
        System.out.println("Top five words are: ");
        TextHelper.getTopFiveWord(text);
        TextHelper.getTheLongestWord(text);
    }
}