package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elj implements eli {
    public static final ceu a;
    public static final ceu b;

    static {
        ces cesVarB = new ces(cej.a("com.google.android.gms.droidguardclient")).c().a().b();
        a = cesVarB.d("ClientLibraryFeature__enable_v2_proxy_for_v1_get_results", false);
        b = cesVarB.d("ClientLibraryFeature__use_singleton_vm_manager", true);
    }

    @Override // defpackage.eli
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.eli
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }
}
