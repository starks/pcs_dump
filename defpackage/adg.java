package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adg extends acq {
    final /* synthetic */ adi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adg(String[] strArr, adi adiVar) {
        super(strArr);
        this.b = adiVar;
    }

    @Override // defpackage.acq
    public final void a(Set set) {
        set.getClass();
        mz mzVarA = mz.a();
        ls lsVar = new ls(this.b, 12);
        if (mzVarA.c()) {
            lsVar.run();
        } else {
            mzVarA.b(lsVar);
        }
    }
}
