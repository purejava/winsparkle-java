// Generated by jextract

package org.purejava.windows;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
public interface win_sparkle_update_skipped_callback_t {

    void apply();
    static MemorySegment allocate(win_sparkle_update_skipped_callback_t fi, MemorySession session) {
        return RuntimeHelper.upcallStub(win_sparkle_update_skipped_callback_t.class, fi, constants$11.win_sparkle_update_skipped_callback_t$FUNC, session);
    }
    static win_sparkle_update_skipped_callback_t ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                constants$12.win_sparkle_update_skipped_callback_t$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


