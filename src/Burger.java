public class Burger extends SandwitchDecorator {
    public Burger(Sandwitch sandwitch)
    {
        super(sandwitch);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " Burger";
    }

    @Override
    public double getCost() {
        return super.getCost() + 60 ;
    }
}
