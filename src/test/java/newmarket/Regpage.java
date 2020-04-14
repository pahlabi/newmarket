package newmarket;

public class Regpage extends Masterpage implements Test {
	
	
	private String name;
	

	public void exportdb() {
		
		System.out.println("This is Export db interface. Database will be handeled by this");
		
	}

	public void exportexcel() {

		this.name = "This is the private string";
		System.out.println("This is export file interface. Data will be save here in excel format" + name);
		
	}
	
	
	public void browserfactory() {
		
		browserfactory();
		
	}

	public void exportimage() {
		// TODO Auto-generated method stub
		
	}
	
	

}
