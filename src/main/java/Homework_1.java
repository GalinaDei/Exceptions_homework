import java.util.Arrays;

public class Homework_1 {
    public static void main(String[] args) {
    /*    System.out.println( DivByZero(30,0));
        System.out.println(Arrays.toString(FillArray(100)));

        System.out.println(StrLength());*/

        String str [][] = new String[][]{{"2","3","4", "4", "3"}, {"5","6","4", "4", "3"}};
        System.out.println(sum2d(str));

        int[] arr1 = new int[] {1,2,3,4,5,6,7};
        int[]arr2 = new int[] {2,3,4,0,6,7,8};
        int[]arr3 = new int[] {2,3,4,5,6,7};
        int[]arr4 = null;
        System.out.println(Arrays.toString(ArrDifference(arr2, arr1)));
      //  System.out.println(Arrays.toString(ArrDifference(arr2, arr3)));

        System.out.println(Arrays.toString(ArrDivision(arr1, arr2)));
    }
    /*Реализуйте 3,метода, чтобы в каждом из них получить разные стандартные для Java исключения;*/
    private static float DivByZero(float num1, float num2) {
        return (num1 / num2);
    }
    private static int[] FillArray(int index){
        int[]array = new int[10];
        array[index] = 1;
        return array;
    }
    private  static int StrLength() {
        String str = null;
        return str.length();
    }
    /*      Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?*/
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) { // исключение в случае, если длина строки не соответстсвует условию;
                int val = Integer.parseInt(arr[i][j]); // исключение в случае, если невозможно приведение к int;
                sum += val;
            }
        }
        return sum;
    }
    /*  Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращает новый массив,
    каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
    Если длины массивов не равны, необходимо как-то оповестить пользователя.*/

    private static int[] ArrDifference(int[]arr1, int[]arr2){
        int[] newArr = new int[arr1.length];
        if (arr1.length != arr2.length) {
                throw new RuntimeException("Массивы не одинаковой длины");
        } else {
            for (int i = 0; i < arr1.length; i++) {
                newArr[i] = arr1[i] - arr2[i];
            }
            return newArr;
        }
    }
    /*(Не обязательное)* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    и возвращает новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
    Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
    которое пользователь может увидеть - RuntimeException, т.е. ваше.  формат сдачи: ссылка на git.*/
    private static int[] ArrDivision(int[]arr1, int[]arr2) {
        if (arr1 == null || arr2 == null) throw new RuntimeException("Массивов нет.");
        if (arr1.length != arr2.length) throw new RuntimeException("Массивы не одинаковой длины");
        int[] newArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] != 0) {
                newArr[i] = arr1[i] / arr2[i];
            } else {
                throw new RuntimeException("Делитель равен 0");
            }
        }
        return newArr;
    }
}
