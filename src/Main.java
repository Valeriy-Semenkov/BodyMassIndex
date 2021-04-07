public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodymass = 89;
        float height = (float) 1.85;
        {

            int index = (int) service.calculate(bodymass, height);
            System.out.println(index);
        }
    }
}