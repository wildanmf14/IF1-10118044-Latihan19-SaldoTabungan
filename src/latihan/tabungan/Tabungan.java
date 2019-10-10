package latihan.tabungan;

public class Tabungan {

	public static void main(String[] args) 
	{
		float saldoAwal = 2500000;
		float bunga = 0.15f;
		float saldoSekarang = saldoAwal;
		for (int i = 1; i <= 6; i++) 
		{
			saldoSekarang += bunga * saldoSekarang;
			System.out.printf("Saldo di bulan ke-"+i+" : Rp.%,.0f%n", saldoSekarang);		
		}

	}

}
