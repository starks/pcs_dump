package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cry implements csc {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cry(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.csc
    public final Iterator a(csd csdVar, CharSequence charSequence) {
        int i = this.b;
        Object obj = this.a;
        return i != 0 ? new csa(csdVar, charSequence, (String) obj) : new crz(csdVar, charSequence, (crl) obj);
    }
}
