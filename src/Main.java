import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Планетанын атын танданыз.(Англис тилинде жазыныз) (Миcалы, Mars): ");
        String input = sc.nextLine();

        SolarSystemPlanet planet = SolarSystemPlanet.valueOf(input.toUpperCase());

        switch (planet) {
            case EARTH:
                System.out.println("Жер планетасында биз жашайбыз");
                break;
            case MARS:
                System.out.println("Марс Жер планетасына окшош планета");
                break;
            case JUPITER:
                System.out.println("Юпитер - Кун системасындангы эн чон планета");
                break;
            case SATURN:
                System.out.println("Сатурн шакекчеси менен белгилуу");
                break;
            case URANUS:
                System.out.println("Уран - бул планета да озгочолугу менен белгилуу");
                break;
            case NEPTUNE:
                System.out.println("Нептун - кун системасындагы эн алыскы планета");
                break;
            default:
                System.out.println("Кун системасында андай планета жок");
                break;
        }
    }
}