package Hospital;

public class Main {

        public static void main(String[] args) {
            // Outpatient
            Outpatient op = new Outpatient("Manal", 150.0, 75.5);
            System.out.println(" Outpatient Details ");
            System.out.println("Patient Name: " + op.getName());
            System.out.println("Consultation Fee: $" + op.getConsultFee());
            System.out.println("Total Bill: $" + op.calculateBill());

            System.out.println();

            // Inpatient
            Inpatient ip = new Inpatient("miski Abdimalik",200.0,300.0);
            System.out.println(" Inpatient Details ");
            System.out.println("Patient Name: " + ip.getName());
            System.out.println("Consultation Fee: $" + ip.getConsultFee());
            System.out.println("Total Bill: $" + ip.calculateBill());
        }
    }

