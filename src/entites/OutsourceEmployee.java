package entites;

public class OutsourceEmployee extends Employee {

    private Double additionalCharge;

    OutsourceEmployee() {
        super();
    }

    public OutsourceEmployee(String name, Integer hours, double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }


    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
    }


}
