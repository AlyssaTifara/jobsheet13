public class TerimaKasih_3 {
    public static void UcapanTerimakasih() {
        System.out.println("Thank you for being the best teacher in the world.\n" +
        "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }
    public static void UcapanTahmbahan (String ucapan){
        System.out.println(ucapan);
    }
    public static void main (String[] args) {
        UcapanTerimakasih();
        String ucapan = "Terimakasih Pak.. Bu.. Semoga Sehat Selalu";
        UcapanTahmbahan(ucapan);
    }
}