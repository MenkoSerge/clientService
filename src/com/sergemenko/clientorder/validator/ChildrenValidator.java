package com.sergemenko.clientorder.validator;

import com.sergemenko.clientorder.domain.AnswerChildren;
import com.sergemenko.clientorder.domain.ClientOrder;

public class ChildrenValidator {
     public AnswerChildren checkChildren(ClientOrder clientOrder){
        System.out.println("Checking Children...");
        return new AnswerChildren();
    }
}
