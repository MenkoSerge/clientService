package com.sergemenko.clientorder;

import com.sergemenko.clientorder.domain.ClientOrder;

public class SaveClientOrder {
    public static void main(String[] args) {
     ClientOrder clientOrder = new ClientOrder();
     clientOrder.setHusbandFirstName("John");
     clientOrder.setHusbandLastName("Doe");
     clientOrder.setWifeFirstName("Jane");
     clientOrder.setWifeLastName(clientOrder.getHusbandLastName());

     long ans = saveClientOrder(clientOrder);
     System.out.println(ans);

    }

    static Long saveClientOrder(ClientOrder clientOrder) {
        System.out.println("Saving client order: "
                + clientOrder.getWifeFirstName() + " "
                + clientOrder.getWifeLastName());

        long clientAnswer = 199L;
        return clientAnswer;
    }
}
