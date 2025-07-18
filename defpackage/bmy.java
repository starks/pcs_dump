package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmy extends bln {
    private final bmq s;

    public bmy(Context context, Looper looper, blh blhVar, bmq bmqVar, bjx bjxVar, bkn bknVar) {
        super(context, looper, 270, blhVar, bjxVar, bknVar);
        this.s = bmqVar;
    }

    @Override // defpackage.blg
    protected final boolean B() {
        return true;
    }

    @Override // defpackage.bln, defpackage.blg, defpackage.biw
    public final int a() {
        return 203400000;
    }

    @Override // defpackage.blg
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof bmv ? (bmv) iInterfaceQueryLocalInterface : new bmu(iBinder);
    }

    @Override // defpackage.blg
    protected final String c() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.blg
    protected final String d() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.blg
    public final bhq[] e() {
        return bhn.b;
    }

    @Override // defpackage.blg
    protected final Bundle s() {
        Bundle bundle = new Bundle();
        String str = this.s.b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }
}
