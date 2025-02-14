package application;

public class _02_InitialiserChaines {
	
	public static void main(String[] args) {
		
		// recommande
		String chanteur = "Bob Marley";
		
		String film = new String("Lords of the rings");
		
		char[] groupe = {'Q','u','e','e','n'};
		
		System.out.println(new String(groupe));
		
		byte ascii[] = {66, 111, 110, 106, 111, 117, 114};
		String bonjour = new String(ascii);
		
		System.out.println(bonjour);
		
		// length
		System.out.println("Length: " + film.length());
		System.out.println("Length: " + "Bob".length());
		
		
	}

}
