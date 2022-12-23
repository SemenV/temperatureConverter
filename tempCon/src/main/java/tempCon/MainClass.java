package tempCon;

public class MainClass {

	public static void main(String[] args) {
		MainClass q = new MainClass();
		q.launch(args);
			
	}
	
	void launch(String[] args) {
		if(!validateData(args)) {
			System.out.println("Wrong input data");
			System.out.println("Write -cf | -fc | -fk | -ck | -kx | -kf number");
		}
		else {
			if (args[0].equals("-cf")) {
				System.out.println("Cel to Far = " + 
			p_CelToFar(Double.parseDouble(args[1])));
			}
			if (args[0].equals("-fc")) {
				System.out.println("Far to Cel = " + 
				(p_FarToCel(Double.parseDouble(args[1]))));
			}
			if (args[0].equals("-ck")) {
				System.out.println("Cel to Kel=" + 
			p_CelToKel(Double.parseDouble(args[1])));
			}
			if (args[0].equals("-fk")) {
				System.out.println("Far to Kel=" + 
			p_FarToKel(Double.parseDouble(args[1])));
			}
			if (args[0].equals("-kf")) {
				System.out.println("Kel to Far=" + 
			p_KelToFar(Double.parseDouble(args[1])));
			}
			if (args[0].equals("-kc")) {
				System.out.println("Kel to Cel=" + 
			p_KelToCel(Double.parseDouble(args[1])));
			}
			
			
		}
		
	}
	
	boolean validateData(String[] args) {
		if (args.length < 2) {
			return false;
		} else 
		if ((args[0].equals("-cf")) || (args[0].equals("-fc")) || (args[0].equals("-fk")) 
				|| (args[0].equals("-ck")) || (args[0].equals("-kx")) || 
				(args[0].equals("-kf"))) {

			if (args[1].matches("-*[0-9]+")) {
				return true;
			}
		} 
		return false;

	}
	
	double p_CelToFar(double cel) {
		return cel*1.8+32;
	}
	
	double p_FarToCel(double far) {
		return (far-32)/1.8;
	}
	
	double p_CelToKel(double cel) {
		return cel+273.15;
	}
	
	double p_FarToKel(double far){
		return (far-32)/1.8+273.15;
	}
	
	double p_KelToFar(double kel){
		return 1.8*(kel - 273.15) + 32;
	}
	
	double p_KelToCel(double kel){
		return kel-273.15;
	}
	
}
