package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbf extends dbg {
    public static final dbf a = new dbf();

    private dbf() {
    }

    @Override // defpackage.dbg
    public final int b() {
        return 0;
    }

    @Override // defpackage.dbg
    public final dae c(int i) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }

    @Override // defpackage.dbg
    public final Object d(dae daeVar) {
        return null;
    }

    @Override // defpackage.dbg
    public final Object e(int i) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }
}
