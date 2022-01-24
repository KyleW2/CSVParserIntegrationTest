public class Main {
    public static void main(String[] args) {
        CSVParser test = new CSVParser("valid.csv");
        System.out.println(test.getCSVString());
    }
}