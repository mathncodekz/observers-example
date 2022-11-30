package example1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class AdviseObserver implements Observer {
    private String printRandomMessage(List<String> messages) {
        int index = ThreadLocalRandom.current().nextInt(0, messages.size());
        return messages.get(index);
    }

    @Override
    public void handle(Temperature t) {
        if (t.getCelsiusDegrees() > 30) {
            List<String> possibleMessages = new ArrayList<>();
            possibleMessages.add("Don't Forget to drink water!");
            possibleMessages.add("Limit your activities in hot weather");

            String message = printRandomMessage(possibleMessages);
            System.out.println(message);
        } else if (t.getCelsiusDegrees() < 30) {
            List<String> possibleMessages = new ArrayList<>();
            possibleMessages.add("Put on your warm clothes!");
            possibleMessages.add("Try to stay in a warm place");

            String message = printRandomMessage(possibleMessages);
            System.out.println(message);
        }
    }
}
