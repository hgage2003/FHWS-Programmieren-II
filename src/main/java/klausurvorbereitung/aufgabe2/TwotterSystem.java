package klausurvorbereitung.aufgabe2;

import klausurvorbereitung.aufgabe1.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwotterSystem {
    private Map<User, List<Message>> map;

    public TwotterSystem() {
        map = new HashMap<>();
    }

    public void addMessage(User u, Message m) {
        List<Message> messages;
        messages = map.get(u);

        if(messages == null) {
            messages = new ArrayList<>();
            messages.add(m);
        }
        messages.add(m);
    }

    public List<Message> getAllMessagesFromUser(User u) {
        return map.get(u);
    }

    public List<Message> getAllMessagesFromDate(String date) {
        List<Message> messages = new ArrayList<>();

        for(Map.Entry<User, List<Message>> entry : map.entrySet()) {
            for(Message m : entry.getValue()) {
                if(m.getCreationDate().equals(date)) {
                    messages.add(m);
                }
            }
        }
        return messages;
    }
}
