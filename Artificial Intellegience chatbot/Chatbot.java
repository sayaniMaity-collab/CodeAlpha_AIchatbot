import java.util.HashMap;
import java.util.Map;

public class Chatbot {
    private Map<String, String> faq;

    public Chatbot() {
        faq = new HashMap<>();
        trainBot();
    }

    // Train with FAQs
    private void trainBot() {
        faq.put("hello", "Hi there! How can I help you?");
        faq.put("how are you", "I'm just code, but I'm doing great!");
        faq.put("what is ai", "Artificial Intelligence is the simulation of human intelligence by machines.");
        faq.put("bye", "Goodbye! Have a nice day.");
    }

    // Simple NLP: lowercase + keyword match
    public String getResponse(String input) {
        input = input.toLowerCase().trim();

        for (String key : faq.keySet()) {
            if (input.contains(key)) {
                return faq.get(key);
            }
        }
        return "Sorry, I don’t understand that yet. Can you rephrase?";
    }
}

