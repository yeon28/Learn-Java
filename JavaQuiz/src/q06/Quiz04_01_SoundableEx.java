package q06;

public class Quiz04_01_SoundableEx {

	private static void printSound(Quiz04_01_Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Quiz04_01_Cat());
		printSound(new Quiz04_01_Dog());
		
	}

}
