package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbt implements ccb {
    private final ConnectivityManager a;

    public cbt(Context context) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    @Override // defpackage.ccb
    public final int a() {
        ConnectivityManager connectivityManager = this.a;
        if (connectivityManager == null) {
            return dfr.a;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) ? dfr.b : this.a.isActiveNetworkMetered() ? dfr.c : dfr.d;
    }
}
