import java.util.Scanner;

public class SpamDetector {
    private static final String[] COMMON_SPAM_WORDS = {
            "act now", "apply now", "buy", "click", "click below", "click here", "click to remove", "compare",
            "credit", "double your", "earn", "easy terms", "extra cash", "for free", "free", "get", "guaranteed",
            "increase sales", "insurance", "marketing solution", "meet singles", "money back", "mortgage", "one time",
            "opportunity", "order now", "please read", "removal", "remove", "risk free", "save big", "save up to",
            "special promotion", "this isn't a scam", "this isn't spam", "trial", "unsecured credit", "urgent",
            "weight loss"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an email message: ");
        String message = scanner.nextLine();

        int spamScore = 0;
        for (String spamWord : COMMON_SPAM_WORDS) {
            if (message.toLowerCase().contains(spamWord)) {
                spamScore++;
            }
        }

        double likelihood = spamScore / (double) COMMON_SPAM_WORDS.length;
        System.out.printf("Spam score: %d%n", spamScore);
        System.out.printf("Likelihood of spam: %.2f%n", likelihood);
    }
}