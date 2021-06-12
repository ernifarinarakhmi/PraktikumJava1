import javax.swing.JOptionPane;
import java.util.Scanner;

public class InputdenganInputDialog{
	public static void main(String []args){

	Scanner scanner = new Scanner(System.in);

	String namaDepan = "Erni";
	String namaTengah = "Farina";
	String namaBelakang = "Rakhmi";
	int usia = 17;
	int targetTahunKuliah = 4;
	double ipk = 3.89764512;
	char nilaiAbjad = 'A';
	boolean Cantik = true;

	System.out.print("Input Nama Depan : ");
	namaDepan = scanner.nextLine();
	System.out.print("Input Usia : ");
	usia = scanner.nextInt ();
	System.out.print("Input Usia : ");
	ipk = scanner.nextDouble();
	System.out.print("");
	System.out.print("Input Nilai Abjad : ");
	nilaiAbjad =scanner.next().charAt(0);
	System.out.print("Cantik? : ");
	Cantik = scanner.nextBoolean();

	System.out.println("========================OUTPUT======================");
	System.out.println("Nama depan : " + namaDepan);
	System.out.println("Nama tengah : " + namaTengah);
	System.out.println("Nama belakang : " + namaBelakang);
	System.out.println("Usia : " + usia);
	System.out.println("Target Kuliah : " + targetTahunKuliah + "tahun");
	System.out.println("IPK : " + ipk);
	System.out.println("Nilai PBO : " + nilaiAbjad);
	System.err.println("Cantik : " + Cantik);

	namaBelakang = JOptionPane.showInputDialog("Nama Belakang : ");
	}
}