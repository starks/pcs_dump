package defpackage;

import android.content.ComponentName;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blo {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    private final ComponentName e;

    public blo(String str, String str2, int i, boolean z) {
        aso.E(str);
        this.a = str;
        aso.E("com.google.android.gms");
        this.b = "com.google.android.gms";
        this.e = null;
        this.c = blp.a;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blo)) {
            return false;
        }
        blo bloVar = (blo) obj;
        if (a.g(this.a, bloVar.a) && a.g(this.b, bloVar.b)) {
            ComponentName componentName = bloVar.e;
            if (a.g(null, null)) {
                int i = bloVar.c;
                if (this.d == bloVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, Integer.valueOf(blp.a), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        return this.a;
    }
}
