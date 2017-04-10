package ElevensGame.Activity3;

public class Flipper{
        public int flip() {
            int rand = (int) Math.random() + 1;
            int result = (int) Math.ceil(Math.random() * rand * 2);
            return result;
        }
}
