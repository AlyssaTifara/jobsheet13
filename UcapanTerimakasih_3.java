import java.util.Scanner;
public class UcapanTerimakasih_3{
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapkan :");
        String namaOrang = sc.nextLine();
        return namaOrang;
    }
    public static String UcapanTambahan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan apa yang ingin anda ucapkan pada orang tersebut :");
        String ucapanTambahan = sc.nextLine();
        return ucapanTambahan;
    }

    public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        String tambahan = UcapanTambahan();
        System.out.println("Thank you " + nama + ". " + tambahan);
    }
    public static void main(String[] args){
        UcapanTerimakasih();
    }
}