public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "sunny";
        switch (weather) {
            case "sunny":
                System.out.println("you can wear shirt");
                break;
            case "cloudy":
                System.out.println("you should wear a sweater");
                break;
            case "rainy":
                System.out.println("you should wear a raincoat");
                break;
            case "snowy":
                System.out.println("you should wear a jacket");
                break;
            default:
                System.out.println("you can wear whatever you want");
                break;
        }
        // Determine what to wear based on the weather (e.g., sunny, cloudy, rainy,
        // snowy)
        // Decide whether to use if-else or switch

        // Section 2: User role
        int role = 2;

        switch (role) {
            case 1:
                System.out.println("you are a admin");
                break;
            case 2:
                System.out.println("you are an editor");
                break;
            case 3:
                System.out.println("you are a user");
                break;
            default:
                System.out.println("plese contact HR");
                break;

        }
        // Determine user access level based on the role (e.g., 1: admin, 2: editor, 3:
        // user)
        // Decide whether to use if-else or switch

        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;

        if (temperature >= 80 && humidity >= 60) {
            System.out.println("it's too hot and humid");
        } else if (temperature >= 80) {
            System.out.println("it's too hot\n");
        } else if (temperature <= 60 && humidity >= 60) {
            System.out.println("it's too cold and humid\n");
        } else if (temperature <= 60) {
            System.out.println("it's too cold\n");
        } else {
            System.out.println("it's comfortable\n");
            // Determine the comfort level based on both temperature and humidity (e.g., too
            // hot, too cold, comfortable)
            // Decide whether to use if-else or switch

            // Section 5: Age and income
            int age = 25;
            int income = 50000;
            // Determine eligibility for a specific credit card based on age and income
            // Decide whether to use if-else or switch

            if (age >= 18 && age <= 60 && income >= 30000) {
                System.out.println("congratulations! you are eligible for the credit card\n");
            } else {
                System.out.println("sorry, you are no eligible for the credit card\n");
            }
            // Section 1: Traffic light colors
            String lightColor = "green";
            // Determine what action to take based on the traffic light color (e.g., green,
            // yellow, red)
            // Decide whether to use if-else or switch

            switch (lightColor) {
                case "green":
                    System.out.println("Go!");
                    break;
                case "red":
                    System.out.println("Stop!");
                    break;
                case "yellow":
                    System.out.println("slow down!");
                    break;
                default:
                    System.out.println("power outage!");
                    break;

            }
            // Section 2: Exam grade
            int grade = 85;
            // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
            // Decide whether to use if-else or switch
            if (grade >= 80) {
                System.out.println("You got an A!");
            } else if (grade >= 70) {
                System.out.println("You got an B!");
            } else if (grade >= 60) {
                System.out.println("You got an C.");
            } else if (grade >= 50) {
                System.out.println("You got an D.");
            } else {
                System.out.println("You failed :(");
            }
            // Section 3: Browser type
            String browser = "Chrome";
            // Check if the browser is one of the following: Chrome, Firefox, Safari
            // Decide whether to use if-else or switch
            switch (browser) {
                case "chrome":
                    System.out.println("Enjoy your chrome extertions!");
                    break;
                case "Firefox":
                    System.out.println("The best nonprofit browser");
                    break;
                case "Safari":
                    System.out.println("I see you're a proud Apple user");
                    break;
                default:
                    System.out.println("Curious? what browser do you use?");
                    break;

            }

        }
    }
}