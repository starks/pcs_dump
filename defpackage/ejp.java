package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejp implements ekj {
    public final aad a;
    public final Context b;
    private volatile ejh c;
    private final Object d = new Object();

    public ejp(lx lxVar) {
        this.a = lxVar;
        this.b = lxVar;
    }

    public final aac a(aad aadVar, Context context) {
        return new aac(aadVar, new eju(context, 1));
    }

    @Override // defpackage.ekj
    public final /* bridge */ /* synthetic */ Object aS() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = ((ejn) a(this.a, this.b).a(ejn.class)).a;
                }
            }
        }
        return this.c;
    }
}
