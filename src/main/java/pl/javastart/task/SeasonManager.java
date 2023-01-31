package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public class SeasonManager {

    public void run(Scanner scanner) {
        Season[] seasons = Season.values();
        System.out.println("Podaj porę roku:");
        showSeasons(seasons);
        String userInput = scanner.nextLine();
        for (Season season : seasons) {
            if (userInput.equalsIgnoreCase(season.getPolishName())) {
                System.out.println("W tej porze roku są następujące miesiące:");
                System.out.println(Arrays.toString(season.getMonths()));
                break;
            }
        }
    }

    private void showSeasons(Season[] seasons) {
        for (Season season : seasons) {
            System.out.println(season.getPolishName());
        }
    }
}
