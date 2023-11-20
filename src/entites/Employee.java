package entites;
public class Employee {

        private String name;
        private Integer hours;
        private double  valuePerHour;

        Employee(){

        }
        Employee (String name , Integer hours, double valuePerHour){
            this.name = name;
            this.hours = hours;
            this.valuePerHour = valuePerHour;
        }
    
}