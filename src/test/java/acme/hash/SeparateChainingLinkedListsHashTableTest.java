package acme.hash;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SeparateChainingLinkedListsHashTableTest {

	@Test
	public void lengthOfBackingArrayIsCapacity() {
		SeparateChainingLinkedListsHashTable hashTable = new SeparateChainingLinkedListsHashTable(
				16);

		assertEquals(16, hashTable.backingArray.length);
	}

	@Test
	public void putInCorrectBucket() {
		SeparateChainingLinkedListsHashTable hashTable = new SeparateChainingLinkedListsHashTable(
				16);

		// use internals to force put with given hash
		hashTable.putHash(1, "foo");

		assertEquals("foo", hashTable.getHash(1));
	}

	@Test
	public void getCorrectEntryOnCollission() {
		SeparateChainingLinkedListsHashTable hashTable = new SeparateChainingLinkedListsHashTable(
				16);

		// use internals to force put with given hash
		hashTable.putHash(1, "foo");
		hashTable.putHash(17, "bar");

		// use internals to force get with given hash
		assertEquals("bar", hashTable.getHash(17));
	}

}
