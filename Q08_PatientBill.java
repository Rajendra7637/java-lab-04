class PatientBill {
    private double consultation, medicine, test;

    void setConsultationFee(double x) {
        if (x >= 0)
            consultation = x;
    }

    void setMedicineFee(double x) {
        if (x >= 0)
            medicine = x;
    }

    void setTestFee(double x) {
        if (x >= 0)
            test = x;
    }

    double calculateTotal() {
        return consultation + medicine + test;
    }
}

public class Q08_PatientBill {
    public static void main(String[] args) {
        PatientBill b = new PatientBill();
        b.setConsultationFee(500);
        b.setMedicineFee(350);
        b.setTestFee(250);
        System.out.println("Total bill: " + b.calculateTotal());
    }
}
