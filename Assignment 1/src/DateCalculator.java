public class DateCalculator {

    public void start() {

        Date date = null;

        int choice;

        do {

            System.out.println("\n===== Date Menu =====");
            System.out.println("1. Set Date");
            System.out.println("2. Add Days");
            System.out.println("3. Add Months");
            System.out.println("4. Add Years");
            System.out.println("5. Display");
            System.out.println("6. Compare Dates (not implement)");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = ConsoleInput.getint();

            switch (choice) {

            case 1:

                System.out.print("Enter day: ");
                int day = ConsoleInput.getint();

                System.out.print("Enter month: ");
                int month = ConsoleInput.getint();

                System.out.print("Enter year: ");
                int year = ConsoleInput.getint();

                Date newDate = new Date(day, month, year);

                if (newDate.isValid()) {

                    date = newDate;

                    System.out.println("Date set successfully.");

                } else {

                    System.out.println("Invalid date.");
                }

                break;

            case 2:

                if (date == null) {

                    System.out.println("Please set date first.");

                } else {

                    System.out.print("Enter days to add: ");
                    int days = ConsoleInput.getint();

                    date.addDays(days);

                    System.out.println("New Date:");
                    date.displayDate();
                }

                break;

            case 3:

                if (date == null) {

                    System.out.println("Please set date first.");

                } else {

                    System.out.print("Enter months to add: ");
                    int months = ConsoleInput.getint();

                    date.addMonths(months);

                    System.out.println("New Date:");
                    date.displayDate();
                }

                break;

            case 4:

                if (date == null) {

                    System.out.println("Please set date first.");

                } else {

                    System.out.print("Enter years to add: ");
                    int years = ConsoleInput.getint();

                    date.addYears(years);

                    System.out.println("New Date:");
                    date.displayDate();
                }

                break;

            case 5:

                if (date == null) {

                    System.out.println("Please set date first.");

                } else {

                    date.displayDate();
                }

                break;

            case 6:

                System.out.println("Compare Dates is not implemented.");

                break;

            case 7:

                System.out.println("Program ended.");

                break;

            default:

                System.out.println("Invalid choice.");
            }

        } while (choice != 7);
    }
}