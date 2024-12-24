package com.sergemenko.clientorder;

import com.sergemenko.clientorder.domain.*;
import com.sergemenko.clientorder.mail.MailSender;
import com.sergemenko.clientorder.validator.ChildrenValidator;
import com.sergemenko.clientorder.validator.CityRegisterValidator;
import com.sergemenko.clientorder.validator.ClienValidator;
import com.sergemenko.clientorder.validator.MarriageValidator;

public class ClientOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }
    static void checkAll(){
        while ( true ) {

        ClientOrder clientOrder = readClientOrder ();
            System.out.println("Starting client order...");
        if (clientOrder == null) {
            break;
        }
        AnswerCityRegistrer cityAnswer = checkCityRegister(clientOrder);

        AnswerMarrige answerMarrige = checkMarrige(clientOrder);
        AnswerChildren answerChildren = checkChildren(clientOrder);
        AnswerClient answerClient = checkClient(clientOrder);


        sendMail(clientOrder);}
    }



    static ClientOrder readClientOrder() {
        ClientOrder clientOrder = new ClientOrder();
        return clientOrder;
    }


    static AnswerCityRegistrer checkCityRegister(ClientOrder clientOrder){
        CityRegisterValidator cityRegisterValidator = new CityRegisterValidator();
        cityRegisterValidator.hostName = "host1";
        AnswerCityRegistrer ans1 = cityRegisterValidator.checkCityRegister(clientOrder);
        return  ans1;
    }
    static AnswerMarrige checkMarrige(ClientOrder clientOrder){
        MarriageValidator marriageValidator = new MarriageValidator();
        return marriageValidator.checkMarrige(clientOrder);
    }
    static AnswerChildren checkChildren(ClientOrder clientOrder){
        ChildrenValidator childrenValidator = new ChildrenValidator();
        return childrenValidator.checkChildren(clientOrder);
    }
    static AnswerClient checkClient(ClientOrder clientOrder){

        return new ClienValidator().checkClient(clientOrder);}

    static void sendMail(ClientOrder clientOrder) {
        new MailSender().sendMail(clientOrder);
    }
}
