package pattern.adapter.builder;

import java.util.ArrayList;
import java.util.List;

public class Builder {
    private List<Sender> list = new ArrayList<>();

    public void produceMailSender (int count) {
        for (int i = 0; i < count ; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSMSSender (int count) {
        for (int i = 0; i < count ; i++) {
            list.add(new SMSSender());
        }
    }
}
