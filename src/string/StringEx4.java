package string;

public class StringEx4 {
    public static void main(String[] args) {
        String a = "Иван Иванов";
        String b = "иван иванов";

        if (a.equalsIgnoreCase(b)){
            System.out.println("Выберите другое имя пользователя");
        } else {
            System.out.println("Отличное имя");
        }
    }
}
