package org.perfektaprodukter.employees;

public class Intern extends Employee {
    private String endDate;
    private String testimonial;

    public Intern(String name, String gender, String startDate, int employeeId, String endDate) {
        super(name, gender, startDate, employeeId);
        this.endDate = endDate;
        this.testimonial = "";
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getTestimonial() {
        return testimonial;
    }

    public void setTestimonial(String testimonial) {
        this.testimonial = testimonial;
    }
}
