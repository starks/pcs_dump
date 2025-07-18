package defpackage;

import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class amn implements IBinder.DeathRecipient {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ amn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        if (this.b != 0) {
            ((amp) this.a).a("PCS<>AICore binder died", true);
        } else {
            ((amo) this.a).a.a("PCS<>AICore binder died", true);
        }
    }
}
