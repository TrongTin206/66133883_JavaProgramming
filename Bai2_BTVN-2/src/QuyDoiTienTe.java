/**
 * 
 */

/**
 * 
 */
public class QuyDoiTienTe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int usd = 10;
        int eur = 10;

        final int GiaTri_USD = 23500;
        final int GiaTri_EUR = 27000;

        int tiendo = usd * GiaTri_USD;
        int tieneur = eur * GiaTri_EUR;

        System.out.println(usd + " USD = " + tiendo + " VND");
        System.out.println(eur + " EUR = " + tieneur + " VND");
	}

}
