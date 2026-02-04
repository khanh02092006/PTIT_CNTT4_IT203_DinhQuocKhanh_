import java.util.Scanner;

public class MamalAnimal extends Animal {
    private String foodType;
    private boolean isLiveWithHuman;
    private String mamalSound;

    public MamalAnimal() {
        super();
    }

    public MamalAnimal(String animalName, int numberOfLegs, String furColor, double averageLifeExpectancy,
                       String foodType, boolean isLiveWithHuman, String mamalSound) {
        super(animalName, numberOfLegs, furColor, averageLifeExpectancy);
        this.foodType = foodType;
        this.isLiveWithHuman = isLiveWithHuman;
        this.mamalSound = mamalSound;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public boolean isLiveWithHuman() {
        return isLiveWithHuman;
    }

    public void setLiveWithHuman(boolean liveWithHuman) {
        isLiveWithHuman = liveWithHuman;
    }

    public String getMamalSound() {
        return mamalSound;
    }

    public void setMamalSound(String mamalSound) {
        this.mamalSound = mamalSound;
    }

    @Override
    public void input(Scanner sc) {
        super.input(sc);

        System.out.print("nhap kieu thuc an: ");
        this.foodType = sc.nextLine().trim();

        System.out.print("co song voi con nguoi khong? (y/n): ");
        this.isLiveWithHuman = readBooleanYesNo(sc);

        System.out.print("nhap tieng keu: ");
        this.mamalSound = sc.nextLine().trim();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("kieu thuc an: " + foodType);
        System.out.println("song voi con nguoi: " + (isLiveWithHuman ? "co" : "khong"));
        System.out.println("tieng keu: " + mamalSound);
    }
}
