package com.google.android.apps.aicore.aidl;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* compiled from: PG */
@Target({ElementType.TYPE_USE, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
/* loaded from: classes.dex */
public @interface AIFeatureStatus {
    public static final int AVAILABLE = 3;
    public static final int DOWNLOADABLE = 1;
    public static final int DOWNLOADING = 2;
    public static final int UNAVAILABLE = 0;
}
