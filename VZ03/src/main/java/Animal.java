// File : Animal.java
// PIC  : Nur Latifah Ulfah - 13514015

/**
 *
 * @author Nur Latifah Ulfah - 13514015
 */
abstract class Animal implements Renderable {
	private int x;
	private int y;

	/**
	* Konstruktor Animal.
	*
	* @param x Posisi x Animal ketika diciptakan
	* @param y Posisi y Animal ketika diciptakan
	*/
	public Animal(int x, int y){
		this.x = x; 
		this.y = y;
	}

	/**
	* Set posisi x dari Animal.
	*
	* @param x Posisi x Animal yang diset
	*/
	public void setX(int x){
		this.x = x;
	}

	/**
	* Set posisi y dari Animal.
	*
	* @param y Posisi y Animal yang diset
	*/
	public void setY(int y){
		this.y = y;
	}

	/**
	* Get posisi x dari Animal.
	*
	* @return Posisi x Animal saat ini
	*/
	public int getX(){
		return x;
	}

	/**
	* Get posisi y dari Animal.
	*
	* @return Posisi y Animal saat ini
	*/
	public int getY(){
		return y;
	}

	/**
	* Mendapatkan reaksi Animal saat berinteraksi
	* dengan pengunjung
	*
	* @return Interaksi yang diberikan Animal
	*/
	public abstract String interact();
	
	/**
	* Mendapatkan nilai bobot dari Animal
	*
	* @return bobot saat ini
	*/
	public abstract int getBobot();
	
	/**
	* Mendapatkan simbol dari Animal
	*
	* @return simbol
	*/
	public abstract char getSimbol();
	
	/**
	* Mendapatkan tipeHabitat dari Animal
	* 
	* @return tipeHabitat
	*/
	public abstract String[] getTipeHabitat();
	
} 
