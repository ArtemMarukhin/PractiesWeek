package week1.week3;

public class Payer {
    String name, surname, address, cardNumber;

    public Payer(String name, String surname, String address, String cardNumber) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return  "{Payer name: " + surname +" " + name + '\'' +
                ", address: " + address + '\'' +
                ", card: " + cardNumber + '\'' +
                '}';
    }
}
