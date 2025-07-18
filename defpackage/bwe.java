package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bwe implements buw {
    private final /* synthetic */ int a;

    public /* synthetic */ bwe(int i) {
        this.a = i;
    }

    @Override // defpackage.buw
    public final IInterface a(IBinder iBinder) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? bwc.asInterface(iBinder) : bvw.asInterface(iBinder) : buo.asInterface(iBinder) : bvq.asInterface(iBinder);
    }
}
