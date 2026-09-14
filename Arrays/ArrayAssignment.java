import java.util.Scanner;

public class ArrayAssignment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Q 1
        
        // Question1(sc);

        // Array_input

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements:");

        for (int iTemp = 0; iTemp < size; iTemp++) {
            arr[iTemp] = sc.nextInt();
        }

        // Q2 - sort_arr

        //Question2(arr, size);

        // Q3 - Sum

         Question3(arr, size);

        // Q4 - avg
         
        // Question4(arr, size);

        // Q5 - COPY ARRAY copy_arr
        
        // Question5(arr, size);

        // Q 6 - max&min
        
        // Question6(arr, size);

        // Q 7 - reverse_arr
        
        // Question7(arr, size);

        // Q 8 - DUPLICATE VALUES 

        // Question8(arr, size);

        // Q 9 - duplicate_values
         
        // Question9(arr, size);

        // Q 10 - Common_elements
         
        // Question10(sc);

        sc.close();
    }


    // question 1 

    public static void Question1(Scanner sc) {

        ComplexNumber arr[] = new ComplexNumber[5];

        for (int i = 0; i < 5; i++) {

            arr[i] = new ComplexNumber();

            System.out.print("Enter number1: ");
            int number1 = sc.nextInt();
            arr[i].setNumber1(number1);

            System.out.print("Enter number2: ");
            int number2 = sc.nextInt();
            arr[i].setNumber2(number2);
        }

        System.out.println("Results:");

        for (int i = 0; i < 5; i++) {

            System.out.println(
                arr[i].computeComplexNumber()
            );
        }
    }

    // complex_num_class

    static class ComplexNumber {

        private int number1;
        private int number2;


        public int getNumber1() {
            return number1;
        }


        public void setNumber1(int number1) {
            this.number1 = number1;
        }


        public int getNumber2() {
            return number2;
        }


        public void setNumber2(int number2) {
            this.number2 = number2;
        }


        public int computeComplexNumber() {

            return number1 * number2;
        }
    }

    // Question2 (sort_arr)

    public static void Question2(int[] arr, int size) {

        for (int iTemp = 0; iTemp < size - 1; iTemp++) {

            for (int jTemp = iTemp + 1; jTemp < size; jTemp++) {

                if (arr[iTemp] > arr[jTemp]) {

                    int temp = arr[iTemp];

                    arr[iTemp] = arr[jTemp];

                    arr[jTemp] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");

        for (int iTemp = 0; iTemp < size; iTemp++) {

            System.out.print(arr[iTemp] + " ");
        }

        System.out.println();
    }


    // Question3 (sum)

    public static void Question3(int[] arr, int size) {

        int sum = 0;

        for (int i = 0; i < size; i++) {

            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }


    // Question4 (avg)

    public static void Question4(int[] arr, int size) {

        int sum = 0;

        for (int i = 0; i < size; i++) {

            sum += arr[i];
        }

        double average = (double) sum / size;

        System.out.println("Average = " + average);
    }

    // QUESTION 5 - COPY ARRAY    // Question5 (copy_arr)

    public static void Question5(int[] arr, int size) {

        int arr1[] = new int[size];

        for (int i = 0; i < size; i++) {

            arr1[i] = arr[i];
        }

        System.out.println("Copied Array:");

        for (int i = 0; i < size; i++) {

            System.out.print(arr1[i] + " ");
        }

        System.out.println();
    }

    // Question6 (max&min)

    public static void Question6(int[] arr, int size) {

        int max = arr[0];

        int min = arr[0];


        for (int iTemp = 0; iTemp < size; iTemp++) {

            if (max < arr[iTemp]) {

                max = arr[iTemp];
            }


            if (min > arr[iTemp]) {

                min = arr[iTemp];
            }
        }


        System.out.println("Max : " + max);

        System.out.println("Min : " + min);
    }

    // Question7 (reverse_array)

    public static void Question7(int[] arr, int size) {

        System.out.println("Reverse Array:");

        for (int iTemp = size - 1; iTemp >= 0; iTemp--) {

            System.out.print(arr[iTemp] + " ");
        }

        System.out.println();
    }

    // Question8 (Duplicate_vlaues)

    public static void Question8(int[] arr, int size) {

        System.out.println("Duplicate Values:");

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                if (arr[i] == arr[j]) {

                    System.out.println(arr[i]);

                    break;
                }
            }
        }
    }


    //     // Qusestion 9 (duplicate_balues)

    public static void Question9(int[] arr, int size) {

        System.out.println("Duplicate Values:");

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                if (arr[i] == arr[j]) {

                    System.out.println(arr[i]);

                    break;
                }
            }
        }
    }

    // Qusestion 10 (common_elments)

    public static void Question10(Scanner sc) {

        System.out.print("Enter size of first array: ");

        int size1 = sc.nextInt();

        int arr1[] = new int[size1];


        System.out.println("Enter first array elements:");

        for (int i = 0; i < size1; i++) {

            arr1[i] = sc.nextInt();
        }


        System.out.print("Enter size of second array: ");

        int size2 = sc.nextInt();

        int arr2[] = new int[size2];


        System.out.println("Enter second array elements:");

        for (int i = 0; i < size2; i++) {

            arr2[i] = sc.nextInt();
        }


        System.out.println("Common Elements:");

        for (int i = 0; i < size1; i++) {

            for (int j = 0; j < size2; j++) {

                if (arr1[i] == arr2[j]) {

                    System.out.println(arr1[i]);

                    break;
                }
            }
        }
    }
}