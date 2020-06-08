public class Calculator {
    public static void main(String[] args) {
        Carpet carpet = new Carpet (3.5);
        Floor floor = new Floor (2.75,4.0);
        Calculator calculator = new Calculator(floor,carpet);
        System.out.println(calculator.getTotalCost());
    }

    private Floor floor;
    private Carpet carpet;

    public Calculator (Floor floor, Carpet carpet){
        this.carpet = carpet;
        this.floor = floor;
    }

    public double getTotalCost (){
        return floor.getArea()*carpet.getCost();
    }
}
