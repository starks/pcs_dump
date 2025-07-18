package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aef implements afa {
    public static final un i = new un();
    public final afb f;
    public final String g;
    public boolean h;

    public aef(afb afbVar, String str) {
        this.f = afbVar;
        this.g = str;
    }

    protected final void m() {
        if (this.h) {
            uq.l(21, "statement is closed");
            throw new ffn();
        }
    }

    @Override // defpackage.afa
    public final /* synthetic */ boolean n() {
        return b(0) != 0;
    }

    protected final void o() {
        this.h = true;
    }
}
