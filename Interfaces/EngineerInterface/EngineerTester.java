package EngineerInterface;

public class EngineerTester {
    public static void main(String[] args){
        Software Billy = new Software();

        Billy.getTitle("Manager");
        Billy.designProduct("Google Travel");
        Billy.payDues(3000000);
        Billy.useCad(false);

    }
}
