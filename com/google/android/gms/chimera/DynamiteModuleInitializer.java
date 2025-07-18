package com.google.android.gms.chimera;

import android.content.Context;
import defpackage.bpq;
import defpackage.yt;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DynamiteModuleInitializer {
    public static void initializeModuleV1(Context context) {
        initializeModuleV2(context, "com.google.android.gms".equals(context.getPackageName()));
    }

    public static void initializeModuleV2(Context context, boolean z) {
        yt.g(context);
        Boolean bool = bpq.a;
        synchronized (bpq.class) {
            if (bpq.a == null) {
                bpq.a = Boolean.valueOf(z);
            }
        }
    }
}
