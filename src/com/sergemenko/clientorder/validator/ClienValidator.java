package com.sergemenko.clientorder.validator;

import com.sergemenko.clientorder.domain.AnswerClient;
import com.sergemenko.clientorder.domain.ClientOrder;

public class ClienValidator {
     public AnswerClient checkClient(ClientOrder clientOrder){
        System.out.println("Checking Client...");
        return new AnswerClient();
    }
}
