import java.util.Random;
public class ServerNameGenerator {
    public static String randomString(String[] array) {
        Random random = new Random();
        int randomIndex = random.nextInt(array.length);
        return array[randomIndex];
    }

    public static void main(String[] args) {
        String[] adjective = {"pretty", "angry", "sad", "kind", "cooing", "strong", "weak", "whimsical", "loutish", "perfect"};
        String[] noun = {"girl", "boy", "woman", "man", "dog", "cat", "tornado", "hurricane", "house", "car"};

        String randomAdjective = randomString(adjective);
        String randomNoun = randomString(noun);
        System.out.println("Here is your randomly generated team name: ");
        System.out.printf("%s-%s\n", randomAdjective, randomNoun);
    }
}
