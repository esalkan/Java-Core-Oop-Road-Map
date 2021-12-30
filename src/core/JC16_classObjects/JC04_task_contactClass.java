package core.JC16_classObjects;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC04_task_contactClass {
	
	String name;
	String phoneNumber;
	String email;

	public void call() {
		System.out.println("Calling " + name + " ....");
	}

	public void sendMessage() {
		System.out.println("Sending message to " + phoneNumber + " | name: " + name);
	}

	public void sendEmail() {
		System.out.println("Sending email to " + email + " ....");
	}
}
