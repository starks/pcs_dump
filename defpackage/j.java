package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class j extends m {
    private final boolean b;
    private boolean c;
    private bnz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(bw bwVar, boolean z) {
        super(bwVar);
        bwVar.getClass();
        this.b = z;
    }

    public final bnz a(Context context) {
        if (this.c) {
            return this.d;
        }
        bw bwVar = this.a;
        bnz bnzVarW = a.w(context, bwVar.a, bwVar.h == 2, this.b);
        this.d = bnzVarW;
        this.c = true;
        return bnzVarW;
    }
}
