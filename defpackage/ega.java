package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ega implements egg {
    private final egg[] a;

    public ega(egg... eggVarArr) {
        this.a = eggVarArr;
    }

    @Override // defpackage.egg
    public final egf a(Class cls) {
        for (int i = 0; i < 2; i++) {
            egg eggVar = this.a[i];
            if (eggVar.b(cls)) {
                return eggVar.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // defpackage.egg
    public final boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
