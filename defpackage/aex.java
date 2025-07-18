package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aex {
    public static final up a = new up(null);
    public final fsc b;
    private final aez c;

    public aex(aez aezVar) {
        this.c = aezVar;
        this.b = new fsc(aezVar, (byte[]) null);
    }

    public static final aex a(aey aeyVar) {
        return up.e(aeyVar);
    }

    public final void b() {
        this.c.a();
    }

    public final void c(Bundle bundle) {
        aez aezVar = this.c;
        if (!aezVar.c) {
            aezVar.a();
        }
        if (aezVar.a.E().a().a(yv.STARTED)) {
            yv yvVarA = aezVar.a.E().a();
            Objects.toString(yvVarA);
            throw new IllegalStateException("performRestore cannot be called when owner is ".concat(String.valueOf(yvVarA)));
        }
        if (aezVar.e) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            if (!bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                throw new IllegalArgumentException("No saved state was found associated with the key 'androidx.lifecycle.BundlableSavedStateRegistry.key'.");
            }
            bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle2 == null) {
                throw new IllegalStateException("The saved state value associated with the key 'androidx.lifecycle.BundlableSavedStateRegistry.key' is either null or not of the expected type. This might happen if the value was saved with a different type or if the saved state has been modified unexpectedly.");
            }
        }
        aezVar.d = bundle2;
        aezVar.e = true;
    }

    public final void d(Bundle bundle) {
        Bundle bundleE = un.E((ffs[]) Arrays.copyOf(new ffs[0], 0));
        aez aezVar = this.c;
        Bundle bundle2 = aezVar.d;
        if (bundle2 != null) {
            bundleE.putAll(bundle2);
        }
        synchronized (aezVar.g) {
            for (Map.Entry entry : aezVar.b.entrySet()) {
                bundleE.putBundle((String) entry.getKey(), ((aew) entry.getValue()).a());
            }
        }
        if (bundleE.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleE);
    }
}
