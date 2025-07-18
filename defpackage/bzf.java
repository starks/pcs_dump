package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzf extends bln {
    public bzf(Context context, Looper looper, blh blhVar, bjb bjbVar, bjc bjcVar) {
        super(context, looper, 51, blhVar, bjbVar, bjcVar);
    }

    @Override // defpackage.bln, defpackage.blg, defpackage.biw
    public final int a() {
        return 9410000;
    }

    @Override // defpackage.blg
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return iInterfaceQueryLocalInterface instanceof bze ? (bze) iInterfaceQueryLocalInterface : new bzd(iBinder);
    }

    @Override // defpackage.blg
    protected final String c() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // defpackage.blg
    protected final String d() {
        return "com.google.android.gms.phenotype.service.START";
    }

    @Override // defpackage.blg
    public final bhq[] e() {
        return byj.j;
    }
}
