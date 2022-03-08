import java.util.Scanner;


public class SortArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] massiv = new int [] {2, 5, 8, 9, 57, 77, 54, 1, -34, 0, -12, -11, -3, 4, 3, 8, 9, 7, 0};
        int min;
        int summ = 0;
        System.out.println("Massiv ustida qanday amal bajarmoqchisiz?\n");
        System.out.println( "\u001B[36m" + "1: Massiv elementlarini asl holida ko'rish\n");
        System.out.println("\u001B[36m" + "2: Massiv elementlarini kamayish tartibida ko'rish\n");
        System.out.println( "\u001B[36m" + "3: Massiv elementlarini o'sish tartibida ko'rish\n");
        System.out.println( "\u001B[36m" + "4: Massiv elementlari yig'indisini ko'rish\n");
        System.out.println( "\u001B[36m" + "5: Massiv elementlar soni\n");

        System.out.print("\u001B[32m" +"Kerakli bo'limni tanlang: -> ");
        int switchnum = scanner.nextInt();

        if (switchnum<=5) {
            if (switchnum==0) {
                System.out.println("\u001B[31m"+"\nSiz mavjud bo'lmagan bo'lim raqamini kiritingiz");
            }

            switch (switchnum) {
                case 1 -> {
                    System.out.println("Massivning asl holatdagi ko'rinishi: \n");
                    for (int k : massiv) {
                        System.out.print(k + " ");
                    }
                }
                case 2 -> {
                    for (int i = 0; i < massiv.length; i++)
                        for (int j = i + 1; j < massiv.length; j++) {
                            if (massiv[i] < massiv[j]) {
                                min = massiv[i];
                                massiv[i] = massiv[j];
                                massiv[j] = min;
                            }
                        }
                    System.out.println();
                    System.out.println("Massivning elementlari kamayish tartibida: \n");
                    for (int j : massiv) {
                        System.out.print(j + " ");
                    }
                }
                case 3 -> {
                    for (int i = 0; i < massiv.length; i++)
                        for (int j = i + 1; j < massiv.length; j++) {
                            if (massiv[i] > massiv[j]) {
                                min = massiv[i];
                                massiv[i] = massiv[j];
                                massiv[j] = min;
                            }
                        }
                    System.out.println();
                    System.out.println("Massivning elementlari o'sish tartibida: \n");
                    for (int j : massiv) {
                        System.out.print(j + " ");
                    }
                }
                case 4 -> {
                    for (int i : massiv) {
                        summ += i;
                    }
                    System.out.print("Massivdagi emelentlar yig'indisi: ");
                    System.out.print(summ);
                }
                case 5 -> System.out.println("Massivdagi elementlar soni: "+massiv.length+ " ta");
            }
        } else {
            System.out.println("\u001B[31m"+"\nSiz mavjud bo'lmagan bo'lim raqamini kiritingiz");
        }
    }
}    