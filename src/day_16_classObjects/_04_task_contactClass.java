package day_16_classObjects;

/**
 * @author esalkan
 */
public class _04_task_contactClass {
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
