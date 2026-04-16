import java.util.Arrays;

public class Sprint {
    private final int capacity;
    private final int maxTickets;
    private final Ticket[] tickets;
    private int size;

    public Sprint(int capacity, int maxTickets) {
        this.capacity = capacity;
        this.maxTickets = maxTickets;
        this.tickets = new Ticket[maxTickets];
        this.size = 0;
    }

    public Ticket[] getTickets() {
        return Arrays.copyOf(tickets, size);
    }

    public int getTotalEstimate() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += tickets[i].getEstimate();
        }
        return sum;
    }

    public boolean addUserStory(UserStory userStory) {
        if (userStory == null) return false;
        if (userStory.isCompleted()) return false;
        if (size >= maxTickets) return false;
        if (getTotalEstimate() + userStory.getEstimate() > capacity) return false;
        tickets[size++] = userStory;
        return true;
    }

    public boolean addBug(Bug bugReport) {
        if (bugReport == null) return false;
        if (bugReport.isCompleted()) return false;
        if (size >= maxTickets) return false;
        if (getTotalEstimate() + bugReport.getEstimate() > capacity) return false;
        tickets[size++] = bugReport;
        return true;
    }
}