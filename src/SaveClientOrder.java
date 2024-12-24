public class SaveClientOrder {
    public static void main(String[] args) {
     ClientOrder clientOrder = new ClientOrder();
     clientOrder.husbandFirstName = "John";
     clientOrder.husbandLastName = "Doe";
     clientOrder.wifeFirstName = "Emily";
     clientOrder.wifeLastName = "Doe";

        long ans = saveClientOrder(clientOrder);
        System.out.println(ans);

    }

    static Long saveClientOrder(ClientOrder clientOrder) {
        System.out.println("Saving client order: "
                + clientOrder.husbandFirstName + " "
                + clientOrder.husbandLastName);

        long clientAnswer = 199L;
        return clientAnswer;
    }
}
