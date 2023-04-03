package belajar_percabangan_pengkondisian.percabangan_dengan_switch;

public class SwitchApp {
    public static void main(String[] args) {
        int hariDalamAngka = 6;

        switch (hariDalamAngka) {
            case 1:
                System.out.println("ini adalah hari senin");
                break;
            case 2:
                System.out.println("ini adalah hari selasa");
                break;
            case 3:
                System.out.println("ini adalah hari rabu");
                break;
            case 4:
                System.out.println("ini adalah hari kamis");
                break;
            case 5:
                System.out.println("ini adalah hari jumat");
                break;
            case 6:
                System.out.println("ini adalah hari sabtu");
                break;
            case 7:
                System.out.println("ini adalah hari minggu");
                break;
            default:
                System.out.println("angka tidak sesuai dengan jumlah hari");
        }
    }
}
