//import java.util.Scanner;
//
//public class Bird extends Animal {
//    private boolean isFly;
//    private String birdSound;
//
//    public Bird() {
//        super();
//    }
//
//    public Bird(String animalName, int numberOfLegs, String furColor, double averageLifeExpectancy,
//                boolean isFly, String birdSound) {
//        super(animalName, numberOfLegs, furColor, averageLifeExpectancy);
//        this.isFly = isFly;
//        this.birdSound = birdSound;
//    }
//
//    public boolean isFly() {
//        return isFly;
//    }
//
//    public void setFly(boolean fly) {
//        isFly = fly;
//    }
//
//    public String getBirdSound() {
//        return birdSound;
//    }
//
//    public void setBirdSound(String birdSound) {
//        this.birdSound = birdSound;
//    }
//
//    @Override
//    public void input(Scanner sc) {
//        super.input(sc);
//
//        System.out.print("chim co bay duoc khong? (y/n): ");
//        this.isFly = readBooleanYesNo(sc);
//
//        System.out.print("nhap tieng hot: ");
//        this.birdSound = sc.nextLine().trim();
//    }
//
//    @Override
//    public void display() {
//        super.display();
//        System.out.println("co bay duoc: " + (isFly ? "co" : "khong"));
//        System.out.println("tieng hot: " + birdSound);
//    }
//}
