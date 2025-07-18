package com.google.android.apps.aicore.aidl;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* compiled from: PG */
@Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
/* loaded from: classes.dex */
public @interface InferenceError {
    public static final int BAD_DATA = 2;
    public static final int BAD_REQUEST = 3;
    public static final int BUSY = 9;
    public static final int CANCELLED = 7;
    public static final int COMPUTE_ERROR = 5;
    public static final int INTERNAL_ERROR = 14;
    public static final int INTERNAL_ERROR_DOUBLE_MODEL_LOAD_ATTEMPT = 18;
    public static final int INTERNAL_ERROR_MODEL_NOT_LOADED = 20;
    public static final int IPC_ERROR = 6;
    public static final int NOT_AVAILABLE = 8;
    public static final int NOT_SUPPORTED = 16;
    public static final int REQUEST_NOT_SAFE = 4;
    public static final int REQUEST_TOO_LARGE = 12;
    public static final int RESPONSE_IS_CANNED = 15;
    public static final int RESPONSE_NOT_SAFE = 11;
    public static final int SAFETY_ERROR = 10;
    public static final int SUSPENDED = 13;
    public static final int SUSPENDED_STATELESS = 17;
    public static final int UNKNOWN = 0;
}
