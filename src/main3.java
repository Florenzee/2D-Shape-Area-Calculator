import java.util.Scanner;

abstract class BangunGeometri {
    protected double luas;
    protected int warna;

    public abstract void hitungLuas();

    public double getLuas() {
        return luas;
    }

    public int getWarna() {
        return warna;
    }
}

class Segitiga extends BangunGeometri {
	  private double alas;
	  private double tinggi;

	  public Segitiga(double alas, double tinggi, int warna) {
	        this.alas = alas;
	        this.tinggi = tinggi;
	        this.warna = warna;
	  }

	  public void hitungLuas() {
	    luas = (alas * tinggi) / 2;
	  }
	}

class Persegi extends BangunGeometri {
	  private double panjang;
	  private double lebar;
	  
	  public Persegi(double panjang, double lebar, int warna) {
	        this.panjang = panjang;
	        this.lebar = lebar;
	        this.warna = warna;
	  }

	  public void hitungLuas() {
	    luas = panjang * lebar;
	  }
	}

class Lingkaran extends BangunGeometri {
	private double radius;
	
	public Lingkaran(double radius, int warna) {
        this.radius = radius;
        this.warna = warna;
    }
	
	public void hitungLuas() {
		luas = Math.PI * Math.pow(radius, 2);
	}
}

class Trapesium extends BangunGeometri {
	private double atas;
	private double bawah;
	private double tinggi;
	
	public Trapesium(double atas, double bawah, double tinggi, int warna) {
        this.atas = atas;
        this.bawah = bawah;
        this.tinggi = tinggi;
        this.warna = warna;
    }
	
	public void hitungLuas() {
		luas = 0.5 * (atas + bawah) * tinggi;
	}
}

public class main3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    double totalLuas = 0;
   
    System.out.println("-------- Petunjuk --------");
	System.out.println("Untuk pengisian warna geometri:");
	System.out.println("0 = tidak berwarna");
	System.out.println("1 = berwarna");
	System.out.println("Harap tidak memasukan angka lain selain 0 dan 1, terima kasih.");
	System.out.println("");

//--------------------------- Segitiga ---------------------------
	// Input data
	System.out.print("Masukkan alas segitiga: ");
	double alasSegitiga = input.nextDouble();
	
	System.out.print("Masukkan tinggi segitiga: ");
	double tinggiSegitiga = input.nextDouble();
	
	System.out.print("Masukkan warna segitiga (0/1): ");
	int warnaSegitiga = input.nextInt();
	
	// Membuat objek
	Segitiga segitiga = new Segitiga(alasSegitiga, tinggiSegitiga, warnaSegitiga);
	
	// Menghitung luas
	segitiga.hitungLuas();
	
	// Menghitung total luas
	if (segitiga.getWarna() == 1) {
        totalLuas += segitiga.getLuas();
    }
	else if(segitiga.getWarna() ==0) {
		totalLuas -= segitiga.getLuas();
	}
	
	//print hasil
	System.out.println("Luas segitiga: " + segitiga.getLuas());
	System.out.println("");

//--------------------------- Persegi ---------------------------	
	// Input data
    System.out.print("Masukkan panjang persegi: ");
    double panjangPersegi = input.nextDouble();
    	
   	System.out.print("Masukkan lebar persegi: ");
   	double lebarPersegi = input.nextDouble();
   	
   	System.out.print("Masukkan warna persegi (0/1): ");
	int warnaPersegi = input.nextInt();
    	
   	// Membuat objek
   	Persegi persegi = new Persegi(panjangPersegi, lebarPersegi, warnaPersegi);
    	
   	// Menghitung luas
    persegi.hitungLuas();
    
    // Menghitung total luas
 	if (persegi.getWarna() == 1) {
         totalLuas += persegi.getLuas();
     }
 	else if(persegi.getWarna() == 0) {
 		totalLuas -= persegi.getLuas();
 	}

   	//print hasil
    System.out.println("Luas persegi: " + persegi.getLuas());
    System.out.println("");

//--------------------------- Lingkaran ---------------------------   
    // Input data 
    System.out.print("Masukkan radius lingkaran: ");
    double radiusLingkaran = input.nextDouble();
    
    System.out.print("Masukkan warna lingkaran (0/1): ");
	int warnaLingkaran = input.nextInt();
	
   	// Membuat objek
   	Lingkaran lingkaran = new Lingkaran(radiusLingkaran, warnaLingkaran);
    	
   	// Menghitung luas
    lingkaran.hitungLuas();
    
    // Menghitung total luas
    if (lingkaran.getWarna() == 1) {
        totalLuas += lingkaran.getLuas();
    }
	else if(lingkaran.getWarna() == 0) {
		totalLuas -= lingkaran.getLuas();
	}
    	
   	//print hasil
    System.out.println("Luas lingkaran: " + lingkaran.getLuas());
    System.out.println("");
    
//--------------------------- Trapesium ---------------------------
    // Input data
    System.out.print("Masukkan sisi atas trapesium: ");
    double atasTrapesium = input.nextDouble();
    	
   	System.out.print("Masukkan sisi bawah trapesium: ");
   	double bawahTrapesium = input.nextDouble();
   	
   	System.out.print("Masukkan tinggi trapesium: ");
   	double tinggiTrapesium = input.nextDouble();
   	
   	System.out.print("Masukkan warna trapesium (0/1): ");
	int warnaTrapesium = input.nextInt();
    	
   	// Membuat objek
   	Trapesium trapesium = new Trapesium(atasTrapesium, bawahTrapesium, tinggiTrapesium, warnaTrapesium);
    	
   	// Menghitung luas
    trapesium.hitungLuas();
    
    // Menghitung total luas
    if (trapesium.getWarna() == 1) {
        totalLuas += trapesium.getLuas();
    }
	else if(trapesium.getWarna() ==0) {
		totalLuas -= trapesium.getLuas();
	}
    	
   	// Print hasil
    System.out.println("Luas trapesium: " + trapesium.getLuas());
    System.out.println("");
    
  //--------------------------- HASIL TOTAL LUAS ---------------------------
    // Print total luas sesuai aturan
    System.out.println("--------- Total Luas: " + totalLuas);

	
  }
}
