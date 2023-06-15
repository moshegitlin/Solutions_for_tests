package Summer_2021_first_term.Q13;

public class Message {
    private String sender;
    private int subject;
    private String content;
    private Time receivingTime;
    private boolean hasAttachment;

    public Message(String sender, int subject, String content, Time receivingTime, boolean hasAttachment) {
        this.sender = sender;
        this.subject = subject;
        this.content = content;
        this.receivingTime = receivingTime;
        this.hasAttachment = hasAttachment;
    }

    public String getSender() {
        return sender;
    }

    public int getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public Time getReceivingTime() {
        return receivingTime;
    }

    public boolean isHasAttachment() {
        return hasAttachment;
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender='" + sender + '\'' +"\n"+
                ", subject=" + subject +"\n"+
                ", content='" + content + '\'' +"\n"+
                ", receivingTime=" + receivingTime +"\n"+
                ", hasAttachment=" + hasAttachment +
                '}';
    }
    public Message reply(String text){
        return new Message("support@uni.ac.il", -subject,this.content+"\n"+text,this.receivingTime.addFiveMinutes(),false);
    }


}
