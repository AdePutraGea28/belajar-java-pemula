package belajar_percabangan_pengkondisian.percabangan_dengan_if_else_if;

public class IfElseIfApp {
    public static void main(String[] args) {
        int hariDalamAngka = 4;

        if(hariDalamAngka == 1) {
            System.out.println("ini adalah hari senin");
        } else if(hariDalamAngka == 2) {
            System.out.println("ini adlaah hari selasa");
        } else if(hariDalamAngka == 3) {
            System.out.println("ini adalah hari rabu");
        } else if(hariDalamAngka == 4) {
            System.out.println("ini adalah hari kamis");
        } else if(hariDalamAngka == 5) {
            System.out.println("ini adalah hari jumat");
        } else if(hariDalamAngka == 6) {
            System.out.println("ini adalah hari sabtu");
        } else if(hariDalamAngka == 7) {
            System.out.println("ini adalah hari minggu");
        } else {
            System.out.println("Angka tidak sesuia dengan jumlah hari");
        }
    }
}
