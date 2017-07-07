/**
 * Created by IvanD on 7/7/2017.
 */
public class Answer3 {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3};

        int maxCopies = 0;

        for(int i = 0; i < array.length; i++) {
            int counter = 0;
            for(int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                }
            }
            maxCopies = maxCopies < counter ? counter : maxCopies;
        }

        System.out.println(maxCopies);
    }
}
