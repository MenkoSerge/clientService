public class CityRegisterValidator {

    String hostName;

     AnswerCityRegistrer checkCityRegister(ClientOrder clientOrder){
        System.out.println("Checking city register..."+ hostName);
        return  new AnswerCityRegistrer();
    }
}
