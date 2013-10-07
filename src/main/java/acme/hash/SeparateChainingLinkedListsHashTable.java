package acme.hash;

import java.util.Iterator;
import java.util.LinkedList;

public class SeparateChainingLinkedListsHashTable {

	private final int capacity;
	final LinkedList<HashEntry>[] backingArray;

	@SuppressWarnings("unchecked")
	public SeparateChainingLinkedListsHashTable(int capacity) {
		this.capacity = capacity;
		this.backingArray = new LinkedList[capacity];
	}

	public void put(String key, String value) {
		int hash = hash(key);
		putHash(hash, value);
	}

	protected void putHash(int hash, String value) {
		int pos = hash % capacity;
		LinkedList<HashEntry> bucket = backingArray[pos];
		if (bucket == null) {
			bucket = new LinkedList<HashEntry>();
			backingArray[pos] = bucket;
		}
		bucket.add(new HashEntry(hash, value));
	}

	public String get(String key) {
		int hash = hash(key);
		return getHash(hash);
	}

	protected String getHash(int hash) {
		LinkedList<HashEntry> bucket = backingArray[hash % capacity];
		if (bucket == null) {
			return null;
		}

		int bucketSize = bucket.size();
		if (bucketSize == 1) {
			return bucket.get(0).value;
		}

		Iterator<HashEntry> bucketIter = bucket.iterator();
		while (bucketIter.hasNext()) {
			HashEntry entry = bucketIter.next();
			if (entry.key == hash) {
				return entry.value;
			}
		}

		return null;
	}

	private int hash(String key) {
		return key.hashCode();
	}

}