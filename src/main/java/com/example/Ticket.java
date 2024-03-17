package com.example;

public class Ticket {
    private String type;
    private Integer age;

    public Ticket(String type, Integer age) {
        this.type = type;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public Integer getAge() {
        return age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String priceOfTicket() {
        try {
            if (type.equals("Ngày thường")) {
                if (age >= 0 && age <= 22) {
                    return "50000VND";
                } else if (age > 22 && age <= 200) {
                    return "100000VND";
                } else {
                    throw new Exception();
                }
            } else if (type.equals("Ngày cuối tuần")) {
                if (age >= 0 && age <= 22) {
                    return String.valueOf(50000*120/100) + "VND";
                } else if (age > 22 && age <= 200) {
                    return String.valueOf(100000*120/100) + "VND";
                } else {
                    throw new Exception();
                }
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            return "Invalid Input";
        }
    }
}
