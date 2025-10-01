public class User {
    String username;
    String email;
    int age;

    public User() {
        this.username ="GUEST";
        this.email = "NOT PROVIDED";
        this.age = 0;
    }

    public User(String username) {
        this.username = username;
    }
    
    public User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
            }
    public User(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
}
}
