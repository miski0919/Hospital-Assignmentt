package Hospital;

public class Outpatient extends Patient {
        private double labCharge;

        public Outpatient(String name, double consultFee, double labCharge) {
            super(name, consultFee);
            this.labCharge = labCharge;
        }

        public double calculateBill() {
            return labCharge + consultFee;
        }
    }

