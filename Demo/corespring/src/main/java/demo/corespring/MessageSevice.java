package demo.corespring;

public class MessageSevice {
	private Message message;
public MessageSevice(Message message) {
		super();
		this.message = message;
	}


public void printMessage(){
	System.out.println(message.getText());
	
}
}
