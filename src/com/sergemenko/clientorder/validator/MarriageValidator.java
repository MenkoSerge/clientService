package com.sergemenko.clientorder.validator;

import com.sergemenko.clientorder.domain.AnswerMarrige;
import com.sergemenko.clientorder.domain.ClientOrder;

public class MarriageValidator {
     public AnswerMarrige checkMarrige(ClientOrder clientOrder){
        System.out.println("Checking Marrie...");
        return new AnswerMarrige();
    }
}
