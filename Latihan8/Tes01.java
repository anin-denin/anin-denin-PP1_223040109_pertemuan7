package Latihan8;


public class Tes01 {
    public static void main(String[] args) {
        ListMataKuliah list = new ListMataKuliah();

        list.addHead(new MataKuliah("IF001", "Dasar Pemrograman", 4));
        list.addHead(new MataKuliah("IF002", "Pemrograman Web", 3));
        list.addHead(new MataKuliah("IF003", "Struktur Diskrit", 3));
        list.addHead(new MataKuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
        list.displayElement();
    }
}
