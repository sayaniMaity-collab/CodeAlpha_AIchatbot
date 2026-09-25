public class FAQTrainer {
    public static void main(String[] args) {
        Chatbot bot = new Chatbot();
        System.out.println(bot.getResponse("hello"));
        System.out.println(bot.getResponse("what is ai"));
        System.out.println(bot.getResponse("bye"));
    }
}
