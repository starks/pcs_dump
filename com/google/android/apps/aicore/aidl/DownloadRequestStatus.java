package com.google.android.apps.aicore.aidl;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* compiled from: PG */
@Target({ElementType.TYPE_USE, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
/* loaded from: classes.dex */
public @interface DownloadRequestStatus {
    public static final int DOWNLOADING = 2;
    public static final int OK = 0;
    public static final int UNAVAILABLE = 1;
}
