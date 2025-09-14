package hospitalManagementSystem;

public class HospitalManagementSystem {

	public static void main(String[] args) {
		
		HospitalResources resources = new HospitalResources();
		
		Doctor doctor = new Doctor(resources);
		Pharmacy pharmacy = new Pharmacy(resources);
		Lab lab = new Lab(resources);
		
		doctor.start();
		pharmacy.start();
		lab.start();
		
	}

}
