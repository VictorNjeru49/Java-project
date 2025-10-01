public class Friend {
    static int numoffriends;
    String name;

    Friend(String name){
        this.name = name;
        numoffriends++;
    }

    static void showfriend(){
        System.out.println("You have "+ numoffriends + "total friend");
    }
}
