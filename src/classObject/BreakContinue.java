package classObject;

public class BreakContinue {

	public static void main(String[] args) {
		
		// BREAK
		
		/* Aciklama: break deyimi döngülerden ansızın çıkmanızı ve döngüyü istediğiniz
		 * durumlarda sonlandırmanızı sağlamaktadır. 
		 * Örneğin, bir veritabanından tüm id değerlerini çektiniz 
		 * ve id değerlerinden ilk 15 tanesini listeleyeceksiniz.
		 * Eğer elinizde 15’ten fazla kayıt varsa döngüyü bir şekilde sonlandırmanız gerekmektedir.
		 */
		
		
	       int dataBaseCount = 35;
	       
	        for(int i=1; i<dataBaseCount; i++) {
	            System.out.println(i + ". Record");
	            if(i == 15) {
	                break;
	            }
	        }
	        
	    	int dataBase = 35;
	        int count = 1;
	        while(dataBase >= 0) {
	            System.out.println(count + ". record");
	            if(count == 12) {
	                break;
	            }
	            count++;
	            dataBase--;
	    }
	

	        // CONTINUE
	        
	        
		/* ACIKLAMA: 
		 * Bir veritabanından yine tüm kayıtları çektiniz. 
		 * Kayıtlar arasından 5. kayıdı atlamak istiyor ve döngünün devam etmesini istiyorsunuz. 
		 * Bu gibi durumlarda continue kullanılabilecek en güzel tercihtir.
		 */
	        
	        int dataBaseNumber = 15;
	        for(int i =1; i<=dataBaseNumber; i++) {
	            if(i == 5) {
	                continue;
	            }
	            System.out.println(i + ". Record");
	        
 }
	        
	        
	}
	        
}
	

