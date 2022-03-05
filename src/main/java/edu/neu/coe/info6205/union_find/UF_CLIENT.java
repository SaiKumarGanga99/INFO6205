package edu.neu.coe.info6205.union_find;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class UF_CLIENT {
    public static void main(String[] args) {
        {
            int runs = 50;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of objects");
            while(sc.hasNext()) {

                int N = sc.nextInt();
                int count =0;
                for(int i=0;i<runs;i++) {
                    count+= count(N);
//                    System.out.println(count);
                }

                int avg = count/runs;
                System.out.println("No.of objects = " + N + " and the average of number of pairs generated for 50 runs " + avg);
                System.out.println("Enter the number of sites");
            }


        }
    }

    private static int count(int n) {
        UF_HWQUPC uf = new UF_HWQUPC(n);
        int count = 0;
        Random r = new Random();
        while(uf.count>1){
            int p = r.nextInt(n);
            int q = r.nextInt(n);
            if(!uf.connected(p,q)){
                uf.union(p,q);
            }
            count+=1;
        }
        return count;
    }

}

