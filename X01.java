// 12S24037 - Maxwell Rumahorbo
// 12S24030 - Swasti Sihombing

import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        double minimum, jumlahBuku, transaksi;
        double[] hargaBuku = new double[100];

        minimum = 0;
        n = 0;
        jumlahBuku = 0;
        hargaBuku[n] = Double.parseDouble(input.nextLine());
        minimum = hargaBuku[n];
        while (hargaBuku[n] != 0) {
            jumlahBuku = jumlahBuku + hargaBuku[n];
            if (minimum < hargaBuku[n]) {
                minimum = minimum;
            } else {
                minimum = hargaBuku[n];
            }
            n = n + 1;
            hargaBuku[n] = Double.parseDouble(input.nextLine());
        }
        if (jumlahBuku >= 100.0) {
            transaksi = jumlahBuku - minimum;
        } else {
            transaksi = jumlahBuku;
        }
        System.out.println(toFixed(transaksi,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
