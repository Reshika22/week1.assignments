package week3.day1;

public class Automation extends MultipleLanguage implements TestTool,Language 
{

	public static void main(String[] args) {
		Automation aobj = new Automation();
		aobj.java();
		aobj.selenium();
		aobj.ruby();
		aobj.python();

	}

	public void java() {
		System.out.println("Execute Java Program");
		
	}

	public void selenium() {
		
		System.out.println("Execute Selenium Testing Methods");
		
	}

	@Override
	public void ruby() {
		System.out.println("Execute Ruby Programming");
		
	}

}
