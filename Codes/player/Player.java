package player;

import java.util.Scanner;

public class Player {
    private String name;
    private String address;
    private String contactNumber;
    private String emailId;
    private int age;

    public void setPlayerDetails(String name, String address, String contactNumber, String emailId, int age) {
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.emailId = emailId;
        this.age = age;
    }

    public String getPlayerName() {
        return this.name;
    }

    public void getPlayerDetails() {
        System.out.println("Player Name: " + this.name);
        System.out.println("Player EmailId: " + this.emailId);
        System.out.println("Player Age: " + this.age);
        System.out.println("Player Contact Number: " + this.contactNumber);
        System.out.println("Player Address: " + this.address);
    }

    public void setPlayerDetailsFromUserInput(Player p) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player name, contact no., address, emailId and age");
        String name = sc.nextLine();
        String contactNumber = sc.nextLine();
        String address = sc.nextLine();
        String emailId = sc.nextLine();
        int age = sc.nextInt();
        p.setPlayerDetails(name, address, contactNumber, emailId, age);
    }

}
