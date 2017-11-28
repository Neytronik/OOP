package orlovich.property.gamer;

public class User {

    private User() {
    }

    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public static User createUser(String userName) {
        User user = new User();
        user.setUserName(userName);
        return user;
    }

    public enum Purse {
        MONEY;
        private int money = 250;

        public void addMoney(int sum) {
            money += sum;
        }

        public void takeMoney(int sum) {
            money -= sum;
        }

        public int showMoney() {
            return money;
        }
    }
}