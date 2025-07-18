package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fnk extends flx {
    protected final String c() {
        fnk fnkVarG;
        flx flxVar = fml.a;
        fnk fnkVar = fox.a;
        if (this == fnkVar) {
            return "Dispatchers.Main";
        }
        try {
            fnkVarG = fnkVar.g();
        } catch (UnsupportedOperationException unused) {
            fnkVarG = null;
        }
        if (this == fnkVarG) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public abstract fnk g();

    @Override // defpackage.flx
    public String toString() {
        String strC = c();
        if (strC != null) {
            return strC;
        }
        return fme.a(this) + "@" + fme.b(this);
    }
}
