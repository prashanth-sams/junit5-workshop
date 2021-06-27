/**
 *
 * Timeout
 * Author - Prashanth Sams
 *
 **/

package com.junit5.basic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class Timeouts {

    @Test
    @Timeout(5)
    void timeout() throws InterruptedException {
        System.out.println("This is the timeout test");
        Thread.sleep(6000);
    }
}
