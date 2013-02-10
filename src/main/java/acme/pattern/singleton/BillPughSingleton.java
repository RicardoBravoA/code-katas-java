package acme.pattern.singleton;

/**
 * The technique known as the initialization on demand holder idiom, is as lazy
 * as possible, and works in all known versions of Java. It takes advantage of
 * language guarantees about class initialization, and will therefore work
 * correctly in all Java-compliant compilers and virtual machines. The nested
 * class is referenced no earlier (and therefore loaded no earlier by the class
 * loader) than the moment that getInstance() is called. Thus, this solution is
 * thread-safe without requiring special language constructs (i.e. volatile or
 * synchronized).
 *
 */
public class BillPughSingleton {

	// Private constructor prevents instantiation from other classes
	private BillPughSingleton() {
	}

	/**
	 * SingletonHolder is loaded on the first execution of
	 * Singleton.getInstance() or the first access to SingletonHolder.INSTANCE,
	 * not before.
	 */
	private static class SingletonHolder {
		public static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

}
