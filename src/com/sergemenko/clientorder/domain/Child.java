package com.sergemenko.clientorder.domain;

import java.time.LocalDate;

public class Child extends Person{
    private String certificateNumber;
    private LocalDate birthDate;
    private String issueDepartment;


    public String getCertificateNumber() {

        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(String issueDepartment) {
        this.issueDepartment = issueDepartment;
    }


}
