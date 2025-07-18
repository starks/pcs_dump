package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhd extends bln {
    public bhd(Context context, Looper looper, blh blhVar, bjb bjbVar, bjc bjcVar) {
        super(context, looper, 40, blhVar, bjbVar, bjcVar);
    }

    @Override // defpackage.bln, defpackage.blg, defpackage.biw
    public final int a() {
        return 11925000;
    }

    @Override // defpackage.blg
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return iInterfaceQueryLocalInterface instanceof bhi ? (bhi) iInterfaceQueryLocalInterface : new bhh(iBinder);
    }

    @Override // defpackage.blg
    protected final String c() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    @Override // defpackage.blg
    protected final String d() {
        return "com.google.android.gms.clearcut.service.START";
    }

    @Override // defpackage.blg
    public final bhq[] e() {
        return new bhq[]{bgs.a};
    }
}
