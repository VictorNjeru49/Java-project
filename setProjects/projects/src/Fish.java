public class Fish implements Predator, Prey{

    @Override
      public void flee() {
        System.out.println("The fish is fleeing");
    }

    @Override
    public void hunt() {
        System.out.println("The fish is hunting");
    }
}
