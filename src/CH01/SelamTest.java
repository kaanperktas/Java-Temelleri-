package CH01;

public class SelamTest {
    public static void main(String[] args) {
        Selam selam = new Selam();

        String cevap = selam.selamSoyle("Kaan");
        System.out.println(cevap);

        cevap = selam.selamSoyle("");
        System.out.println(cevap);
    }
}
