package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zs {
    public static final aaf a = new zr();
    public static final aaf b = new zr();
    public static final aaf c = new zr();

    public static final zu a(aad aadVar) {
        zq zqVar = new zq();
        aag aagVarA = aaj.a(aadVar);
        aagVarA.getClass();
        return (zu) new aac(aadVar.ak(), zqVar, aagVarA).b.a(fjy.b(zu.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void b(aey aeyVar) {
        yv yvVarA = aeyVar.E().a();
        if (yvVarA != yv.INITIALIZED && yvVarA != yv.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (aeyVar.aj().ah() == null) {
            zt ztVar = new zt(aeyVar.aj(), (aad) aeyVar);
            aeyVar.aj().ag("androidx.lifecycle.internal.SavedStateHandlesProvider", ztVar);
            aeyVar.E().b(new zp(ztVar, 0));
        }
    }
}
