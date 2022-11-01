package org.purejava.windows;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public class MemoryAllocator {
    public static MemorySegment ALLOCATE_FOR(String str) {
        return RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String(str);
    }

    public static MemorySegment ALLOCATE_FOR_WCHAR_T(String str) {
        return RuntimeHelper.CONSTANT_ALLOCATOR.allocateArray(ValueLayout.JAVA_CHAR, str.toCharArray());
    }
}
