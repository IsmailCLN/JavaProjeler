import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        int[] list = {4, 87, 36, 28, 45, 96, 12};
        double sum = 0.0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        double average = sum / list.length;
        System.out.println(average);
    }
}