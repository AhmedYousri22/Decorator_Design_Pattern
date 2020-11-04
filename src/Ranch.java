public class Ranch extends SandwitchDecorator {
    public Ranch(Sandwitch sandwitch)
    {
        super(sandwitch);
    }
    @Override
    public double getCost() {
        return super.getCost() + 10 ;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + ranch + ";
    }
}
