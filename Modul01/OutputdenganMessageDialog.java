import javax.swing.JOptionPane;

public class OutputdenganMessageDialog{
	public static void main(String [] args){

	String namaDepan = "Erni";
	String namaTengah = "Farina";
	String namaBelakang = "Rakhmi";
	int usia = 17;
	int targetTahunKuliah = 4;
	double ipk = 3.89764512;
	char nilaiAbjad = 'A';
	boolean cantik = true;

	System.out.println("Nama depan : " + namaDepan);
	System.out.println("Nama tengah : " + namaTengah);
	System.out.println("Nama belakang : " + namaBelakang);
	System.out.println("Usia : " + usia);
	System.out.println("Target Kuliah : " + targetTahunKuliah + "tahun");
	System.out.println("IPK : " + ipk);
	System.out.println("Nilai PBO : " + nilaiAbjad);
	System.err.println("Cantik : " + cantik);

	JOptionPane.showMessageDialog(null,"Hai," + namaDepan + namaTengah + namaBelakang);
}
}
