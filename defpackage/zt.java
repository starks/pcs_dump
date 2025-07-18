package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zt implements aew {
    public Bundle a;
    private boolean b;
    private final ffo c;
    private final fsc d;

    public zt(fsc fscVar, aad aadVar) {
        this.d = fscVar;
        this.c = new ffw(new lw(aadVar, 5));
    }

    private final zu c() {
        return (zu) this.c.a();
    }

    @Override // defpackage.aew
    public final Bundle a() {
        Bundle bundleE = un.E((ffs[]) Arrays.copyOf(new ffs[0], 0));
        Bundle bundle = this.a;
        if (bundle != null) {
            bundleE.putAll(bundle);
        }
        for (Map.Entry entry : c().a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((zo) entry.getValue()).a().a();
            if (!bundleA.isEmpty()) {
                bundleE.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundleE;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleAf = this.d.af("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleE = un.E((ffs[]) Arrays.copyOf(new ffs[0], 0));
        Bundle bundle = this.a;
        if (bundle != null) {
            bundleE.putAll(bundle);
        }
        if (bundleAf != null) {
            bundleE.putAll(bundleAf);
        }
        this.a = bundleE;
        this.b = true;
        c();
    }
}
