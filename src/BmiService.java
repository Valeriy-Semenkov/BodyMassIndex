public class BmiService {
    public double calculate(double bodymass, float height) {
        float a1 = height;
        float b1 = 2;
        height = (float) Math.pow(a1, b1);
        int index = (int) (bodymass / height);
        return index;


    }
}
