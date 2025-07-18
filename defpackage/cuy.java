package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class cuy extends cvj implements cyg {
    private static final long serialVersionUID = 6588350623831699109L;

    protected cuy(Map map) {
        super(map);
    }

    @Override // defpackage.cvj
    public /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    @Override // defpackage.cvj
    public final Collection c(Object obj, Collection collection) {
        return e(obj, (List) collection, null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection, java.util.List] */
    @Override // defpackage.cvj, defpackage.cyg
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final List b(Object obj) {
        Collection collectionA = (Collection) ((cvj) this).a.get(obj);
        if (collectionA == null) {
            collectionA = a();
        }
        return c(obj, collectionA);
    }

    public cuy(Map map, byte[] bArr) {
        this(map);
    }
}
