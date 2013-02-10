package acme.pattern.singleton;

/**
 * This method uses double-checked locking, which should not be used prior to
 * J2SE 5.0, as it is vulnerable to subtle bugs. The problem is that an
 * out-of-order write may allow the instance reference to be returned before the
 * Singleton constructor is executed.
 *
 */
public class LazyInitializationSingleton {

	private static volatile LazyInitializationSingleton instance = null;

	private LazyInitializationSingleton() {
	}

	public static LazyInitializationSingleton getInstance() {
		if (instance == null) {
			synchronized (LazyInitializationSingleton.class) {
				if (instance == null) {
					instance = new LazyInitializationSingleton();
				}
			}
		}
		return instance;
	}

}
