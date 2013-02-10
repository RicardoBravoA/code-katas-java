package acme.pattern.singleton;

/**
 * Joshua Bloch claims that
 * "a single-element enum type is the best way to implement a singleton" for any
 * Java that supports enums. The use of an enum is very easy to implement and
 * has no drawbacks regarding serializable objects, which have to be
 * circumvented in the other ways.
 *
 * <p>
 * This approach implements the singleton by taking advantage of Java's
 * guarantee that any enum value is instantiated only once in a Java program.
 * Since Java enum values are globally accessible, so is the singleton. The
 * drawback is that the enum type is somewhat inflexible; for example, it does
 * not allow lazy initialization.
 *
 */
public enum EnumSingleton {
	INSTANCE;
	public void execute(String arg) {
		// ... perform operation here ...
	}
}
