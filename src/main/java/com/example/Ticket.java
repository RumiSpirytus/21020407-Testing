package com.example;

public class Ticket {
    private String typeOfDay;
    private Integer age;

    public Ticket(String typeOfDay, Integer age) {
        this.typeOfDay = typeOfDay;
        this.age = age;
    }

    public String gettypeOfDay() {
        return typeOfDay;
    }

    public Integer getAge() {
        return age;
    }

    public void setTypeOfDay(String typeOfDay) {
        this.typeOfDay = typeOfDay;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String priceOfTicket(){
    if(typeOfDay.equals("Ngày thường")){
        if(age >= 0 && age <= 22){
            return "50000";
        } else if(age > 22 && age <= 200){
            return "100000";
        } else {
            return "Invalid Input";
        }
    } else if(typeOfDay.equals("Ngày cuối tuần")){
        if(age >= 0 && age <= 22){
            return String.valueOf(50000*120/100);
        } else if(age > 22 && age <= 200){
            return  String.valueOf(100000*120/100);
        } else {
            return "Invalid Input";
        }
    } else {
        return "Invalid Input";
    }
}
    }