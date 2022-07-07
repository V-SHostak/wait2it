package EnumSeasons;

import java.util.Locale;
import java.util.Scanner;

public class EnumMain {


    public static void main(String[] args) {
        Months[] months = Months.values();
        Seasons[] seasons = Seasons.values();
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Check if there is such a month");
        System.out.println("2. Display all months with the same season.");
        System.out.println("3. Display all months that have the same number of days.");
        System.out.println("4. Display on the screen all months with fewer days.");
        System.out.println("5. Display on the screen all months with more days.");
        System.out.println("6. Display on the screen the next season.");
        System.out.println("7. Display on the screen the previous season.");
        System.out.println("8. Display on the screen all months with an even number of days.");
        System.out.println("9. Display on the screen all months with an odd number of days.");
        System.out.println("10. Display on the screen whether the month entered from the console has an even number of days.");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Enter the number (from 1 to 10) of the task you want to solve: ");

        switch (sc.next()) {
            case "1": {
                System.out.print("Enter month: ");
                sc = new Scanner(System.in);
                String scMonth = sc.next().toUpperCase();

                boolean flag = false;

                for (Months m : months) {
                    if (m.name().equalsIgnoreCase(scMonth)) {
                        System.out.println("Month exists: " + m);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("Month doesn't exist.");
                }
                break;
            }
            case "2": {
                System.out.print("Enter season: ");
                sc = new Scanner(System.in);
                String scSeason = sc.next().toUpperCase();

                boolean flag = false;

                for (Months m : months) {
                    if (m.getSeasons().name().equalsIgnoreCase(scSeason)) {
                        System.out.println(m);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println();
                }
                break;
            }
            case "3": {
                System.out.print("Enter number 28-31: ");
                sc = new Scanner(System.in);
                int numberMonth = sc.nextInt();

                boolean flag = false;


                for (Months m : months) {
                    if (m.getDays() == numberMonth) {
                        System.out.println(m);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("Months with " + numberMonth + " days doesn't exist");
                }
                break;
            }
            case "4": {
                System.out.print("Enter amount of days: ");
                sc = new Scanner(System.in);
                int scDays = sc.nextInt();

                boolean flag = true;

                for (Months m : months) {
                    if (m.getDays() < scDays) {
                        System.out.println(m);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("Month doesn't exist");
                }
                break;
            }
            case "5": {
                System.out.print("Enter amount of days: ");
                sc = new Scanner(System.in);
                int scDays = sc.nextInt();

                boolean flag = false;

                for (Months m : months) {
                    if (m.getDays() > scDays) {
                        System.out.println(m);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("Month doesn't exist");
                }
                break;
            }
            case "6": {
                System.out.print("Enter season: ");
                sc = new Scanner(System.in);
                String scSeason = sc.next().toUpperCase();

                boolean flag = false;

                for (Seasons s : seasons) {
                    if (s.name().equals(scSeason)) {
                        flag = true;
                    }
                }
                if (flag) {
                    Seasons seasons2 = Seasons.valueOf(scSeason);
                    int ordinal = seasons2.ordinal();

                    if (ordinal == seasons.length - 1) {
                        ordinal = 0;
                        System.out.println(seasons[ordinal]);
                    } else {
                        System.out.println(seasons[ordinal + 1]);
                    }
                }
                if (!flag) {
                    System.out.println("Seoson doesn't exist");
                }
                break;
            }
            case "7": {
                System.out.print("Enter season: ");
                sc = new Scanner(System.in);
                String scSeason = sc.next().toUpperCase();

                boolean flag = false;

                for (Seasons s : seasons) {
                    if (s.name().equals(scSeason)) {
                        flag = true;
                    }
                }
                if (flag) {
                    Seasons seasons2 = Seasons.valueOf(scSeason);
                    int ordinal = seasons2.ordinal();

                    if (ordinal == seasons.length - 1) {
                        ordinal = 0;
                        System.out.println(seasons[ordinal]);
                    } else {
                        System.out.println(seasons[ordinal - 1]);
                    }
                }
                if (!flag) {
                    System.out.println("Seasons doesn't exist");

                }
                break;
            }
            case "8": {
                for (Months m : months) {
                    if (m.getDays() % 2 == 0) {
                        System.out.println(m);
                    }
                }
                break;
            }
            case "9": {
                for (Months m : months) {
                    if (m.getDays() % 2 == 1) {
                        System.out.println(m);
                    }
                }
                break;
            }
            case "10": {
                System.out.print("Enter month: ");
                sc = new Scanner(System.in);
                String scMonth = sc.next().toUpperCase();

                boolean flag = false;

                for (Months m : months) {
                    if (m.name().equalsIgnoreCase(scMonth)) {
                        if (m.getDays() % 2 == 0) {
                            System.out.println(m + " has an even number of days: " + m.getDays());
                            flag = true;
                        } else {
                            System.out.println(m + " has an odd number of days: " + m.getDays());
                        }
                    }
                }
                if (!flag) {
                    System.out.println("Month doesn't exist");
                }
                break;
            }
        }
    }
}
