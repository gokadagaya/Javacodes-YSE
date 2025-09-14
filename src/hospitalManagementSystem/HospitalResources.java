package hospitalManagementSystem;


class HospitalResources {
	
	private String patientRecord = "Intial Record";
	private String prescription="No Prescription";
	private int medStock =10;
	
	public synchronized void updatePatientRecord(String update )
	{
		System.out.println(update +"is updating");
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		patientRecord = "Updated record by " + update;
        System.out.println("Patient record updated: " + patientRecord);
	}
	public synchronized void viewPatientRecord(String system)
	{
        System.out.println(system + " is viewing patient record: " + patientRecord);
    }
	
	public synchronized void updatePrescription(String newPrescription, String doctor) {
	        System.out.println(doctor + " is writing a prescription");
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        prescription = newPrescription;
	        System.out.println("Prescription updated: " + prescription);
	    }
	 public synchronized void processPrescription(String pharmacyName) {
	        System.out.println(pharmacyName + " processing prescription: " + prescription);
	        if (medStock > 0) {
	            medStock--;
	            System.out.println("Medicine dispensed. Remaining stock: " + medStock);
	        } else {
	            System.out.println("Stock unavailable for prescription");
	        }
	    }
}
