package week1.week6;

public class Programmer {
    String name;
    String company;
    String position;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "intern";
    }

    String getPosition(){
        System.out.println(this.position);
        return this.position;
    }

    String work(){
        switch (position){
            case "intern": this.position = "junior";
            break;
            case "junior": this.position = "middle";
            break;
            case "middle": this.position = "senior";
            break;
            case "senior": this.position = "lead";
            break;
        }
        return this.position;
    }
}
