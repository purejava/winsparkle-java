// Generated by jextract

package org.purejava.windows;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;
class constants$6 {

    static final FunctionDescriptor win_sparkle_init$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle win_sparkle_init$MH = RuntimeHelper.downcallHandleVariadic(
        "win_sparkle_init",
        constants$6.win_sparkle_init$FUNC
    );
    static final FunctionDescriptor win_sparkle_cleanup$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle win_sparkle_cleanup$MH = RuntimeHelper.downcallHandleVariadic(
        "win_sparkle_cleanup",
        constants$6.win_sparkle_cleanup$FUNC
    );
    static final FunctionDescriptor win_sparkle_set_lang$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle win_sparkle_set_lang$MH = RuntimeHelper.downcallHandle(
        "win_sparkle_set_lang",
        constants$6.win_sparkle_set_lang$FUNC
    );
    static final FunctionDescriptor win_sparkle_set_langid$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle win_sparkle_set_langid$MH = RuntimeHelper.downcallHandle(
        "win_sparkle_set_langid",
        constants$6.win_sparkle_set_langid$FUNC
    );
    static final FunctionDescriptor win_sparkle_set_appcast_url$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle win_sparkle_set_appcast_url$MH = RuntimeHelper.downcallHandle(
        "win_sparkle_set_appcast_url",
        constants$6.win_sparkle_set_appcast_url$FUNC
    );
    static final FunctionDescriptor win_sparkle_set_dsa_pub_pem$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle win_sparkle_set_dsa_pub_pem$MH = RuntimeHelper.downcallHandle(
        "win_sparkle_set_dsa_pub_pem",
        constants$6.win_sparkle_set_dsa_pub_pem$FUNC
    );
}


