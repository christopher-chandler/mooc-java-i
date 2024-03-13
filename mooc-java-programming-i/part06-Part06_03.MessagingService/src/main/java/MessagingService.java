import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> newMessage = new ArrayList();

    public MessagingService(){

    }

    public void add(Message message){

        if (message.getContent().length() <=280){

        newMessage.add(message);
        }
    }

    public ArrayList<Message> getMessages(){

        return newMessage;
    }

}
