package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crx extends cru {
    private static final long serialVersionUID = 0;
    private final Object a;

    public crx(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.cru
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.cru
    public final Object b() {
        return this.a;
    }

    @Override // defpackage.cru
    public final boolean c() {
        return true;
    }

    @Override // defpackage.cru
    public final boolean equals(Object obj) {
        if (obj instanceof crx) {
            return this.a.equals(((crx) obj).a);
        }
        return false;
    }

    @Override // defpackage.cru
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.a.toString() + ")";
    }
}
