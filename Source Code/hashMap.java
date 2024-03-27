import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashMap {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari keyboard
        Scanner scanner = new Scanner(System.in);

        // Membuat objek HashMap untuk menyimpan data
        Map<String, Integer> hashMap = new HashMap<>();

        // Meminta pengguna untuk memasukkan nilai dan kunci
        System.out.println("Masukkan jumlah data yang ingin dimasukkan:");
        int jumlahData = scanner.nextInt();

        // Memasukkan data ke dalam HashMap
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Masukkan kunci ke-" + (i + 1) + ":");
            String kunci = scanner.next();

            System.out.println("Masukkan nilai untuk kunci '" + kunci + "':");
            int nilai = scanner.nextInt();

            hashMap.put(kunci, nilai);
        }

        // Menampilkan isi HashMap
        System.out.println("\nIsi HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Kunci: " + entry.getKey() + ", Nilai: " + entry.getValue());
        }

        // Menutup objek Scanner
        scanner.close();
    }
}
