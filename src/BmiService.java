public class BmiService {
    public double calculate(double bodymass, float height) {
        int index = (int) (bodymass / height);
        return index;


    }
}