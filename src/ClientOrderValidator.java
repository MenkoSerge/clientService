public class ClientOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }
    static void checkAll(){
        ClientOrder clientOrder = readClientOrder ();

        AnswerCityRegistrer cityAnswer = checkCityRegister(clientOrder);
        AnswerMarrige answerMarrige = checkMarrige(clientOrder);
        AnswerChildren answerChildren = checkChildren(clientOrder);
        AnswerClient answerClient = checkClient(clientOrder);


        sendMail(clientOrder);
    }

     static void sendMail(ClientOrder clientOrder) {
        System.out.println("Sending mail...");
    }

    static ClientOrder readClientOrder() {
        ClientOrder clientOrder = new ClientOrder();
        return clientOrder;
    }


    static AnswerCityRegistrer checkCityRegister(ClientOrder clientOrder){
        System.out.println("Checking city register...");
        return  new AnswerCityRegistrer();
    }
    static AnswerMarrige checkMarrige(ClientOrder clientOrder){
        System.out.println("Checking Marrie...");
        return new AnswerMarrige();
    }
    static AnswerChildren checkChildren(ClientOrder clientOrder){
        System.out.println("Checking Children...");
        return new AnswerChildren();
    }
    static AnswerClient checkClient(ClientOrder clientOrder){
        System.out.println("Checking Client...");
        return new AnswerClient();
    }
}
