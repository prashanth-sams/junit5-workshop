/**
 *
 * Listeners
 * Author - Prashanth Sams
 *
 * ⌃O or Ctrl + O  to auto-populate override methods in MAC
 *
 * Apply @ExtendWith(Listener.class) decorator to take this Listener class into effect
 **/

package listeners;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class Listener implements TestWatcher {

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        TestWatcher.super.testDisabled(context, reason);
        System.out.println("------------------");
        System.out.println("This test was disabled: " + context.getDisplayName() + " - with reason: " + reason);
        System.out.println("------------------");
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        TestWatcher.super.testSuccessful(context);
        System.out.println("------------------");
        System.out.println("This test was successful: " + context.getTestMethod());
        System.out.println("------------------");
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        TestWatcher.super.testAborted(context, cause);
        System.out.println("------------------");
        System.out.println("This test was aborted: " + cause.getMessage());
        System.out.println("------------------");
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        TestWatcher.super.testFailed(context, cause);
        System.out.println("------------------");
        System.out.println("This test was failed: " + cause.getMessage());
        System.out.println("------------------");
    }
}
