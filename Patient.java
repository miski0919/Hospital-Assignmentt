package Hospital;

public class Patient {
        protected String name;
        protected double consultFee;

        public Patient(String name, double consultFee) {
            this.name = name;
            this.consultFee = consultFee;
        }

        public String getName() {
            return name;
        }

        public double getConsultFee() {
            return consultFee;
        }
}

