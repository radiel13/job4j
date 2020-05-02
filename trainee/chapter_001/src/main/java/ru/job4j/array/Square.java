package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i != bound; i++) {
            rst[i] = (i + 1) * (i + 1);
        }
        return rst;
    }
}
/*   int[] numbers = new int[5];
        for(int i = 0; i !=5;i++){
            int value = numbers[i];
            System.out.println(value);
        }

        for(int i = 0; i != 5; i++){
            numbers[i] = numbers.length - i;
            System.out.println(numbers[i]);
        }

        int[] data = {5, 3, 2, 1, 4};
        int tmp = data[0];
        data[0] = data[3];
        data[3] = tmp;
        System.out.println(Arrays.toString(data));

        int[][] table = new int[5][5];
        int count = 0;
        for(int i = 0; i != 5; i++){
            for(int inner = 0; inner != 5; inner++){
                table[i][inner] = count++;
            }
        }

        for(int j = 0; j != 5; j++){
            System.out.println(Arrays.toString(table[j]));
        }
    }


    TEST
    В тестовом классе нужно прямо инициализировать ячейки:
    String[] flats = new String [3];
    flats[0] = "a";
    flats[1] = "b";
    flats[2] = "c";

    Улучшенная запись:
    String[] flats = {
    "a", "b", "c"
    };

    TEST FOR MATRIX
    int[][] field = {
    {0,0,1},
    {1,0,0],
    {0,1,0}
    };
   */