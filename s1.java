import java.util.Scanner;

class s1 {

    public static void printarr(int a[], int b) {
        for (int i = 0; i < b; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void sum(int a[], int b) {

        for (int i = 0; i < b - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < b; j++) {
                if (a[smallest] > a[j]) {
                    smallest = j;
                }
            }
            int temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;
        }
        printarr(a, b);
        return;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size:");
        int b = sc.nextInt();
        System.out.println("enter elements:");
        int a[] = new int[100];
        for (int i = 0; i < b; i++) {
            a[i] = sc.nextInt();
        }
        sum(a, b);
    }
}