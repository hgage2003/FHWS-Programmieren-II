package klausurvorbereitung.aufgabe2;

import klausurvorbereitung.aufgabe1.User;

import java.util.List;

public class Twotter {
    public static void main(String[] args) {
        TwotterSystem sys = new TwotterSystem();
        User u = new User("Max", "1234");
        sys.addMessage(u, new Message(" Hello World "));
        //List<Message> a = sys.getAllMessages();
        List<Message> m = sys.getAllMessagesFromDate(" 2018 -01 -31 ");
        List<Message> d = sys.getAllMessagesFromUser(u);
    }
}
