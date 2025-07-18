package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dcd extends dbc {
    private final String a;

    protected dcd(String str) {
        this.a = str;
    }

    @Override // defpackage.dbc
    public String a() {
        return this.a;
    }

    @Override // defpackage.dbc
    public void b(RuntimeException runtimeException, daz dazVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }
}
