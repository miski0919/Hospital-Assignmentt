package Hospital;

    public class Inpatient extends Patient {
        public double labCharge;

        public Inpatient(String name, double consultFee, double labCharge) {
            super(name, consultFee);
            this.labCharge = labCharge;
        }

        public double calculateBill() {
            return labCharge + consultFee;
        }
    }

