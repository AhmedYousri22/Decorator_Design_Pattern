public class test {

    public static void main(String[] args) {

Sandwitch basicSandwitch=new Burger(new Ranch(new BasicSandwitch()));
        System.out.printf("ingredients is  %s%n" , basicSandwitch.getDescription());
        System.out.printf("the cost is %.2f", basicSandwitch.getCost());
    }}
