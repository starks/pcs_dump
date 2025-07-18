package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnn extends bln {
    public bnn(Context context, Looper looper, bjx bjxVar, bkn bknVar) {
        bja bjaVar = new bja(context);
        super(context, looper, 25, new blh(null, bjaVar.a, bjaVar.d, bjaVar.b, bjaVar.c, bjaVar.e.containsKey(bzl.e) ? (bzm) bjaVar.e.get(bzl.e) : bzm.a), bjxVar, bknVar);
    }

    @Override // defpackage.bln, defpackage.blg, defpackage.biw
    public final int a() {
        return 12800000;
    }

    @Override // defpackage.blg
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardService");
        return iInterfaceQueryLocalInterface instanceof bnw ? (bnw) iInterfaceQueryLocalInterface : new bnv(iBinder);
    }

    @Override // defpackage.blg
    protected final String c() {
        return "com.google.android.gms.droidguard.internal.IDroidGuardService";
    }

    @Override // defpackage.blg
    protected final String d() {
        return "com.google.android.gms.droidguard.service.START";
    }
}
