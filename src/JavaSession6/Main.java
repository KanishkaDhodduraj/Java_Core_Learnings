package JavaSession6;

import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

class User {
    private int userId;
    private String name, email;
    private List<UserSubscription> subscriptions = new ArrayList<>();

    public User(int userId, String name, String email) {
        this.userId = userId; this.name = name; this.email = email;
    }

    public void addSubscription(UserSubscription sub) { subscriptions.add(sub); }
    public List<UserSubscription> getSubscriptions() { return subscriptions; }
    public void viewDetails() {

        System.out.println("User ID: " + userId + " | " + name + " | " + email);
        System.out.println("Subscriptions: " + subscriptions.size());
        for(UserSubscription s : subscriptions) s.printSummary();
    }
    public int getUserId() {
        return userId; }

    public String getName() {
        return name; }
}

class Plan {
    int planId;
    String planName;
    double price;
    int validityDays;

    public Plan(int planId, String planName, double price, int validityDays) {
        this.planId = planId; this.planName = planName; this.price = price; this.validityDays = validityDays;
    }

    public double getPrice() { return price; }
    public String getPlanName() { return planName; }
    public void showPlan() {
        System.out.println("Plan ID: " + planId + " | " + planName + " | ₹" + price + " | " + validityDays + " days");
    }
}

class UserSubscription {
    private User user;
    private Plan plan;
    private String status = "ACTIVE";
    private Date startDate;
    private int remainingDays;
    private double totalPaid;

    public UserSubscription(User user, Plan plan) {
        this.user = user; this.plan = plan; this.startDate = new Date(); this.remainingDays = plan.validityDays;
        user.addSubscription(this);
    }

    public void useDays(int days) {
        remainingDays -= days;
        if(remainingDays <= 0) status = "EXPIRED";
    }

    public void renew() {
        totalPaid += plan.getPrice();
        remainingDays += plan.validityDays;
        status = "ACTIVE";
        System.out.println(user.getName() + " renewed " + plan.getPlanName());
    }

    public void printSummary() {
        System.out.printf("  %s: %s ($%.0f paid | %d days left) %n", plan.getPlanName(), status, totalPaid, remainingDays);
    }

    public boolean isActive() { return status.equals("ACTIVE"); }
}

class Payment {
    private int paymentId;
    private User user;
    private double amount;
    private String method;

    public Payment(int paymentId, User user, double amount, String method) {
        this.paymentId = paymentId; this.user = user; this.amount = amount; this.method = method;
    }

    public void process() {
        System.out.println("Payment ID: " + paymentId + " | ₹" + amount + " via " + method + " for " + user.getName());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter User ID: "); int id = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Name: "); String name = sc.nextLine();
        System.out.print("Enter Email: "); String email = sc.nextLine();

        User user1 = new User(id, name, email);

        Plan basic = new Plan(101, "Basic", 500, 30);
        Plan premium = new Plan(102, "Premium", 1500, 90);

        basic.showPlan();
        premium.showPlan();

        UserSubscription sub1 = new UserSubscription(user1, basic);
        sub1.useDays(25);
        if(!sub1.isActive()) sub1.renew();

        Payment p1 = new Payment(1001, user1, 500, "UPI");
        p1.process();

        user1.viewDetails();
        sc.close();
    }
}