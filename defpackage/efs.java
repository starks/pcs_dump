package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class efs implements Map.Entry {
    public Map.Entry a;

    public efs(Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((efu) this.a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof egi)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        efu efuVar = (efu) this.a.getValue();
        egi egiVar = efuVar.a;
        efuVar.b = null;
        efuVar.a = (egi) obj;
        return egiVar;
    }
}
