package org.purejava.windows;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;

public class MemoryAllocator {
    public static MemorySegment ALLOCATE_FOR(String str) {
        return RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String(str);
    }

    public static MemorySegment ALLOCATE_WCHAR_T_FOR(String str) {
        str += "\0"; // The \0 character marks the end of the string stored in a char array
        return RuntimeHelper.CONSTANT_ALLOCATOR.allocateArray(ValueLayout.JAVA_CHAR, str.toCharArray());
    }

    public static MemorySegment ALLOCATE_CALLBACK_FOR(win_sparkle_error_callback_t cb, MemorySession session) {
        return win_sparkle_error_callback_t.allocate(cb, session);
    }

    public static MemorySegment ALLOCATE_CALLBACK_FOR(win_sparkle_can_shutdown_callback_t cb, MemorySession session) {
        return win_sparkle_can_shutdown_callback_t.allocate(cb, session);
    }

    public static MemorySegment ALLOCATE_CALLBACK_FOR(win_sparkle_shutdown_request_callback_t cb, MemorySession session) {
        return win_sparkle_shutdown_request_callback_t.allocate(cb, session);
    }

    public static MemorySegment ALLOCATE_CALLBACK_FOR(win_sparkle_did_find_update_callback_t cb, MemorySession session) {
        return win_sparkle_did_find_update_callback_t.allocate(cb, session);
    }

    public static MemorySegment ALLOCATE_CALLBACK_FOR(win_sparkle_did_not_find_update_callback_t cb, MemorySession session) {
        return win_sparkle_did_not_find_update_callback_t.allocate(cb, session);
    }

    public static MemorySegment ALLOCATE_CALLBACK_FOR(win_sparkle_update_cancelled_callback_t cb, MemorySession session) {
        return win_sparkle_update_cancelled_callback_t.allocate(cb, session);
    }

    public static MemorySegment ALLOCATE_CALLBACK_FOR(win_sparkle_update_skipped_callback_t cb, MemorySession session) {
        return win_sparkle_update_skipped_callback_t.allocate(cb, session);
    }

    public static MemorySegment ALLOCATE_CALLBACK_FOR(win_sparkle_update_postponed_callback_t cb, MemorySession session) {
        return win_sparkle_update_postponed_callback_t.allocate(cb, session);
    }

    public static MemorySegment ALLOCATE_CALLBACK_FOR(win_sparkle_update_dismissed_callback_t cb, MemorySession session) {
        return win_sparkle_update_dismissed_callback_t.allocate(cb, session);
    }

    public static MemorySegment ALLOCATE_CALLBACK_FOR(win_sparkle_user_run_installer_callback_t cb, MemorySession session) {
        return win_sparkle_user_run_installer_callback_t.allocate(cb, session);
    }
}
