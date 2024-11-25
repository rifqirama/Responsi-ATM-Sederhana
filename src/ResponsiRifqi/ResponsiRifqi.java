package ResponsiRifqi;

/*
Rifqi Falih Ramadhan IF23E 23SA11A155
 */

import java.util.Scanner;

public class ResponsiRifqi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ketikan nama anda: ");
        String nama = input.nextLine();

        System.out.print("Ketikan saldo : ");
        int saldo = input.nextInt();

        int transaksi = 0; // Jumlah transaksi

        while (true) {
            System.out.println("Menu Transaksi:");
            System.out.println("1. Penarikan");
            System.out.println("2. Menabung");
            System.out.print("Pilih transaksi [1/2]: ");
            int pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.println("Anda akan melakukan penarikan tunai");
                System.out.println("Saldo anda sebesar Rp." + saldo);

                System.out.print("Masukkan jumlah penarikan: ");
                int jumlahpenarikan = input.nextInt();

                if (saldo - jumlahpenarikan < 5000) {
                    System.out.println("Maaf saldo anda tidak cukup");
                    System.out.println("Sisa saldo anda sebesar Rp." + saldo);
                    transaksi++;
                } else if (jumlahpenarikan < 2000) {
                    transaksi++;
                    System.out.println("Penarikan minimal Rp 2000,-");
                    System.out.println("Sisa saldo anda sebesar Rp." + saldo);
                } else if (jumlahpenarikan > saldo) {
                    System.out.println("Maaf saldo anda tidak cukup");
                    System.out.println("Saldo awal anda sebesar Rp." + saldo);
                } else {
                    saldo -= jumlahpenarikan;
                    transaksi++;

                    System.out.println("Anda akan melakukan penarikan sebesar Rp." + jumlahpenarikan);
                    System.out.println("Sisa saldo anda sebesar Rp." + saldo);
                }
            } else if (pilihan == 2) {
                System.out.println("Anda akan melakukan setor tunai");
                System.out.println("Saldo anda sebesar Rp." + saldo);

                System.out.print("Masukkan jumlah setoran: ");
                int jumlahTabung = input.nextInt();

                System.out.println("Saldo awal anda sebesar Rp." + saldo);

                if (jumlahTabung < 2000) {
                    transaksi++;
                    System.out.println("Jumlah setor tunai minimal Rp. 2.000,-");
                    System.out.println("Sisa saldo anda sebesar Rp." + saldo);
                } else {
                    saldo += jumlahTabung;
                    transaksi++;
                    System.out.println("Anda akan melakukan setor tunai sebesar Rp." + jumlahTabung);
                    System.out.println("Jumlah saldo anda sebesar Rp." + saldo);
                }
            } else {
                System.out.println("Pilihan tidak valid");
            }

            System.out.println("Sisa transaksi anda sebanyak " + (5 - transaksi) + " kali");

            if (transaksi >= 5) {
                System.out.println("Apakah anda akan bertransaksi lagi [Y/N]? ");
                char pilihantransaksi = input.next().charAt(0);
                System.out.println("Sisa transaksi anda masih " + (5 - transaksi));
                break;
            }
            
            System.out.println("Apakah anda akan bertransaksi lagi [Y/N]? ");
            char pilihantransaksi = input.next().charAt(0);
            
            
            if (pilihantransaksi == 'Y' || pilihantransaksi == 'y') {
            // Jika pilihannya 'y' atau 'Y' maka transaksi akan berlanjut
            System.out.println("Sisa transaksi anda masih " + (5 - transaksi));
            } else if (pilihantransaksi == 'n' || pilihantransaksi == 'N') {
            // Jika pilihannya 'n' atau 'N' maka transaksi akan berhenti
            System.out.println("Terima kasih telah bertransaksi di ATM Bank Rifqi");
            break;
            } else {
   
            }
        }
    }
}

