package acme.hash;

public class HashEntry {

	int key;
	String value;

	public HashEntry(int hash, String value) {
		this.key = hash;
		this.value = value;
	}

}