// Generated by jextract

package org.purejava.winsparkle;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SequenceLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.OfLong;
class constants$2 {

    static final FunctionDescriptor asctime_r$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle asctime_r$MH = RuntimeHelper.downcallHandle(
        "asctime_r",
        constants$2.asctime_r$FUNC
    );
    static final FunctionDescriptor ctime_r$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ctime_r$MH = RuntimeHelper.downcallHandle(
        "ctime_r",
        constants$2.ctime_r$FUNC
    );
    static final  SequenceLayout __tzname$LAYOUT = MemoryLayout.sequenceLayout(2, Constants$root.C_POINTER$LAYOUT);
    static final MemorySegment __tzname$SEGMENT = RuntimeHelper.lookupGlobalVariable("__tzname", constants$2.__tzname$LAYOUT);
    static final  OfInt __daylight$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle __daylight$VH = constants$2.__daylight$LAYOUT.varHandle();
    static final MemorySegment __daylight$SEGMENT = RuntimeHelper.lookupGlobalVariable("__daylight", constants$2.__daylight$LAYOUT);
    static final  OfLong __timezone$LAYOUT = Constants$root.C_LONG_LONG$LAYOUT;
    static final VarHandle __timezone$VH = constants$2.__timezone$LAYOUT.varHandle();
    static final MemorySegment __timezone$SEGMENT = RuntimeHelper.lookupGlobalVariable("__timezone", constants$2.__timezone$LAYOUT);
    static final  SequenceLayout tzname$LAYOUT = MemoryLayout.sequenceLayout(2, Constants$root.C_POINTER$LAYOUT);
    static final MemorySegment tzname$SEGMENT = RuntimeHelper.lookupGlobalVariable("tzname", constants$2.tzname$LAYOUT);
}


