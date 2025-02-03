package string;

public class StringEx5 {
    public static void main(String[] args) {
        String a1 = "Иван Иванов";
        String b1 = "иван иванов";
        checkUserName(a1,b1);
    }

    static void checkUserName(String a, String b){
        String result;
        if (a.equalsIgnoreCase(b) == true){
//            result = "Выберите другое имя пользователя";
            System.out.println("Выберите другое имя пользователя");
        } else {
//            result = "Отличное имя";
            System.out.println("Отличное имя");
        }
    }
}
