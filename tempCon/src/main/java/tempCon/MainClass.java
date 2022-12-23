package tempCon;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("qwerty");
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
	
}
