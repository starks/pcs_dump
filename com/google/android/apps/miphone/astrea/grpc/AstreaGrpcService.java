package com.google.android.apps.miphone.astrea.grpc;

import android.content.Intent;
import android.os.IBinder;
import defpackage.ary;
import defpackage.asb;
import defpackage.bot;
import defpackage.czl;
import defpackage.czn;
import defpackage.wh;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AstreaGrpcService extends asb {
    private static final czn c = czn.j("com/google/android/apps/miphone/astrea/grpc/AstreaGrpcService");
    public bot a;
    public wh b;
    private IBinder d;

    @Override // defpackage.zc, android.app.Service
    public final IBinder onBind(Intent intent) {
        super.onBind(intent);
        return this.d;
    }

    @Override // defpackage.asb, defpackage.zc, android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((czl) ((czl) c.c()).i("com/google/android/apps/miphone/astrea/grpc/AstreaGrpcService", "onCreate", 25, "AstreaGrpcService.java")).r("AstreaGrpcService#onCreate called with the following services: %s", this.a.a());
        try {
            IBinder iBinderI = wh.i(this, getClass(), this.a);
            this.d = iBinderI;
            if (iBinderI != null) {
            } else {
                throw null;
            }
        } catch (IOException | NullPointerException e) {
            throw new ary(e);
        }
    }
}
