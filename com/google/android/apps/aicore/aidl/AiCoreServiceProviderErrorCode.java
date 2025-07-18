package com.google.android.apps.aicore.aidl;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* compiled from: PG */
@Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
/* loaded from: classes.dex */
public @interface AiCoreServiceProviderErrorCode {
    public static final int APK_SERVING_GROUP_MISMATCH = 3;
    public static final int BINDING_FAILURE = 1;
    public static final int ERROR_NEEDS_SYSTEM_UPDATE = 2;
    public static final int UNKNOWN = 0;
}
