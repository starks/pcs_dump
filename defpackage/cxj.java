package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cxj extends cvp implements Serializable {
    private static final long serialVersionUID = 0;
    public final transient cxg map;
    final transient int size;

    public cxj(cxg cxgVar, int i) {
        this.map = cxgVar;
        this.size = i;
    }

    @Override // defpackage.cyg
    public /* bridge */ /* synthetic */ Collection b(Object obj) {
        throw null;
    }

    @Override // defpackage.cvl, defpackage.cyg
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final cxg j() {
        return this.map;
    }

    @Override // defpackage.cvl
    public final Map f() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.cvl
    public final Set g() {
        throw new AssertionError("unreachable");
    }

    @Override // defpackage.cyg
    public final boolean i(Object obj) {
        return this.map.containsKey(obj);
    }
}
