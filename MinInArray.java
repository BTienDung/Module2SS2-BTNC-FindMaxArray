package season_2.TimMinTrongMang;

import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so luong phan tu cua mang: ");
        int sizeArr = sc.nextInt();
        int array[] = new int[sizeArr];
        for (int i=0; i<sizeArr;i++){
            System.out.printf("arr["+i+"]: ");
            array[i] = sc.nextInt();
        }
        int minArr = array[0];
        for (int i=0;i<sizeArr;i++){
            if (minArr>array[i]){
                minArr = array[i];
            }
        }
        System.out.printf("Min trong mang la: "+minArr);
    }
}
