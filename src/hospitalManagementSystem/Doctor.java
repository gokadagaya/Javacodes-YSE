package hospitalManagementSystem;

public class Doctor extends Thread {
	private HospitalResources resources;

    public Doctor(HospitalResources resources) {
        this.resources = resources;
    }

    @Override
    public void run() {
        resources.updatePatientRecord("DoctorConsole");
        resources.updatePrescription("Paracetamol 500mg - 2 per day", "DoctorConsole");
    }

}
