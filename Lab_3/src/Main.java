public class Main {
    public static void main(String[] args) {

        // Створення UserStory
        UserStory story1 = new UserStory(1, "User registration", 5, new UserStory[0]);
        UserStory story2 = new UserStory(2, "Login page", 3, new UserStory[0]);

        // Створення Sprint
        Sprint sprint = new Sprint(10, 5);

        // Додавання UserStory у Sprint
        System.out.println("Add story1: " + sprint.addUserStory(story1));
        System.out.println("Add story2: " + sprint.addUserStory(story2));

        // Завершення UserStory
        story1.complete();
        story2.complete();

        // Створення Bug
        Bug bug1 = Bug.createBug(101, "Fix password validation", 2, story1);
        Bug bug2 = Bug.createBug(102, "Fix login error", 1, story2);

        // Додавання Bug у Sprint
        System.out.println("Add bug1: " + sprint.addBug(bug1));
        System.out.println("Add bug2: " + sprint.addBug(bug2)); //Пропуск через перевищення capacity (10)

        System.out.println("Total estimate: " + sprint.getTotalEstimate());

        System.out.println("Tickets in sprint:");
        for (Ticket t : sprint.getTickets()) {
            System.out.println(t);
        }
    }
}