package week1.day1;

public class Mobile {
	String MobileName = "Nokia";
	Long MobileNumber = 1234567890L;
	
public void SendMessage() {
	
	String Message = "Hi, How are you!";
	System.out.println(Message);
	
}

public void MakeCall() {
	
	Long Number = 1234567899L;
	System.out.println(Number);
}

public void SaveContact() {
	
	String Contact = "Save the contact";
	System.out.println(Contact);
}

public static void main(String[] args) {
	Mobile Info = new Mobile();
	Info.MakeCall();
	Info.SendMessage();
	Info.SaveContact();	
}

}
