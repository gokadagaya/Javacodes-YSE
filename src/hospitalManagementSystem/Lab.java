package hospitalManagementSystem;

public class Lab extends Thread {
	  private HospitalResources resources;

	    public Lab(HospitalResources resources) {
	        this.resources = resources;
	    }

	    @Override
	    public void run() {
	        resources.updatePatientRecord("LabSystem");
	        resources.viewPatientRecord("LabSystem");
	    }

}
