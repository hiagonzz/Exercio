package entites;

public class Employee {

    private String name;
    private Integer hours;
    private double valuePerHour;

    Employee() {

    }

    Employee(String name, Integer hours, double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    // getters
    public Integer getHours() {
        return hours;
    }

    public String getName() {
        return name;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    // setters
    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }


    public double payment(){
        return hours*valuePerHour;

    }

}