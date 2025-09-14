package hospitalManagementSystem;

public class Pharmacy extends Thread {
	private HospitalResources resources;

    public Pharmacy(HospitalResources resources) {
        this.resources = resources;
    }

    @Override
    public void run() {
        resources.processPrescription("PharmacySystem");
    }

}
