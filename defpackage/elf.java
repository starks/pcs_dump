package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elf implements ele {
    public static final cgr a;
    public static final cgr b;
    public static final cgr c;

    static {
        cyv cyvVar = cyv.a;
        a = cgv.e("CollectionBasisVerifierFeatures__enable_cbv_v2", false, "com.google.android.libraries.consentverifier", cyvVar, true);
        b = cgv.e("CollectionBasisVerifierFeatures__enable_google_signature_check", false, "com.google.android.libraries.consentverifier", cyvVar, true);
        c = cgv.e("CollectionBasisVerifierFeatures__enable_using_log_verifier_result", false, "com.google.android.libraries.consentverifier", cyvVar, true);
    }

    @Override // defpackage.ele
    public final boolean a() {
        return ((Boolean) a.a()).booleanValue();
    }

    @Override // defpackage.ele
    public final boolean b() {
        return ((Boolean) b.a()).booleanValue();
    }

    @Override // defpackage.ele
    public final void c() {
        ((Boolean) c.a()).booleanValue();
    }
}
