import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatbotGUI extends JFrame {
    private JTextArea chatArea;
    private JTextField inputField;
    private Chatbot chatbot;

    public ChatbotGUI() {
        chatbot = new Chatbot();

        setTitle("AI Chatbot");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(chatArea);

        inputField = new JTextField();
        inputField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userText = inputField.getText();
                chatArea.append("You: " + userText + "\n");
                String response = chatbot.getResponse(userText);
                chatArea.append("Bot: " + response + "\n\n");
                inputField.setText("");
            }
        });

        add(scrollPane, BorderLayout.CENTER);
        add(inputField, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ChatbotGUI();
    }
}

