package C1;

import java.util.Random;
public class ChatterBot {
    static final String REQUEST_PREFIX = "say ";

String [] repliesToIllegalRequest;
    Random rand = new Random();

    public ChatterBot(String[] repliesToIllegalRequest) {
        this.repliesToIllegalRequest = new String[repliesToIllegalRequest.length];
        for (int i = 0;i < repliesToIllegalRequest.length ; i++) {
            this.repliesToIllegalRequest[i] =repliesToIllegalRequest[i];
        }
    }

    String replyTo(String statement) {
        if(statement.startsWith(REQUEST_PREFIX)) {
            return statement.replaceFirst(REQUEST_PREFIX, "");
        }
        return respondToIllegalRequest(statement);
    }

    String respondToIllegalRequest(String statement) {
        int randomIndex = rand.nextInt(repliesToIllegalRequest.length);
        String reply = repliesToIllegalRequest[randomIndex];
        if(rand.nextBoolean()) {
            reply += statement;
        }
        return reply;
    }
}
