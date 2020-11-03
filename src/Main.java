public class Main {
    public static void main(String[] args) {
        NPSService service = new NPSService();
        int votes[] = {9,9,9,5,6,7,8,9,9,9,7,7,1,1,1,1,1,1,9,9,9,7,7,7,9,9,10,10,10,2,2,2};
        double nps = service.nps(votes);
        System.out.println(nps);
    }
}