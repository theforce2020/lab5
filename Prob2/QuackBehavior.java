package Prob2;

public interface QuackBehavior {
	default void quack() {
		System.out.println("  quack");
}
}
