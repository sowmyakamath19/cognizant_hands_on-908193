
public class MyBio {

	private static int personId;
	private static String personName;
	private static String personContact;
	private static String Email;

	public static void main(String[] args) {
		getInput(1001,"Sowmya Kamath","7259449052","Sowmya.Kamath@cognizant.com");
		showOutput();
	}

	private static void showOutput() {
		// TODO Auto-generated method stub
		System.out.println(""+personId);
		System.out.println(""+personName);
		System.out.println(""+personContact);
		System.out.println(""+Email);
	}

	private static void getInput(int pId, String pname, String pContact, String em) {
		personId=pId;
		personName=pname;
		personContact=pContact;
		Email=em;
	}

}
