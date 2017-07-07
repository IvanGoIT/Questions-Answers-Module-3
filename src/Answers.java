public class Answers {
    public static void main(String[] args) {
        int[] array = {1, 3, 4};

        // {3, 9, 1, 0} // {0, 1, 9, 3} зеркальная
        // {1, 3, 4} // {4, 3, 1}

        int middle = array.length / 2;

        for (int leftIndex = 0,
             rightIndex = array.length - 1;
             leftIndex < middle; leftIndex++, rightIndex--)
        {
            int tmp = array[leftIndex];
            array[leftIndex] = array[rightIndex];
            array[rightIndex] = tmp;
        }

        for(int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
