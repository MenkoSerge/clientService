package com.sergemenko.clientorder.validator;

import com.sergemenko.clientorder.domain.AnswerCityRegistrer;
import com.sergemenko.clientorder.domain.ClientOrder;

public class CityRegisterValidator {

    public String hostName;

     public AnswerCityRegistrer checkCityRegister(ClientOrder clientOrder){
        System.out.println("Checking city register..."+ hostName);
        return  new AnswerCityRegistrer();
    }
}
