import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		
		System.out.println("1.In Patient");
		System.out.println("2.Out Patient");
		int choice = Integer.parseInt(read.nextLine());
		
		if (choice == 1) {
			
			System.out.println("Patient Id");
			String patientId = read.nextLine();
			
			System.out.println("Patient Name");
			String patientName = read.nextLine();
			
			System.out.println("Phone Number");
			long mobileNumber = Long.parseLong(read.nextLine());
			
			System.out.println("Gender");
			String gender = read.nextLine();
			
			System.out.println("Room Rent");
			double roomRent = Double.parseDouble(read.nextLine());
			
			System.out.println("Medicinal Bill");
			double medicinalBill = Double.parseDouble(read.nextLine());
			
			System.out.println("Number of Days of Stay");
			int noOfDays = Integer.parseInt(read.nextLine());
			
			InPatient newInPatient = new InPatient(patientId, patientName, mobileNumber, gender, roomRent);
			double TotalBill = newInPatient.calculateTotalBill(noOfDays, medicinalBill);
			System.out.printf("Amount to be paid %.1f",TotalBill);
		} else if (choice == 2) {
			
			System.out.println("Patient Id");
			String patientId = read.nextLine();
			
			System.out.println("Patient Name");
			String patientName = read.nextLine();
			
			System.out.println("Phone Number");
			long mobileNumber = Long.parseLong(read.nextLine());
			
			System.out.println("Gender");
			String gender = read.nextLine();
			
			System.out.println("Consultancy Fee");
			double consultingFee = Double.parseDouble(read.nextLine());
			
			System.out.println("Medicinal Bill");
			double medicinalBill = Double.parseDouble(read.nextLine());
			
			System.out.println("Scan Pay");
			double scanPay = Double.parseDouble(read.nextLine());
			
			OutPatient newOutPatient = new OutPatient(patientId, patientName, mobileNumber, gender, consultingFee);
			double TotalBill = newOutPatient.calculateTotalBill(scanPay, medicinalBill);
			System.out.printf("Amount to be paid %.1f",TotalBill);
		} else {
			System.out.println("Ivalid Input");
		}
	}
}
