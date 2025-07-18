package defpackage;

import android.net.Uri;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ces {
    public final Uri a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public ces(Uri uri, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final ces a() {
        return new ces(this.a, this.b, this.c, this.d, true, this.f);
    }

    public final ces b() {
        if (this.a == null) {
            Log.w("PhenotypeFlag", "Setting enableAutoSubpackage on SharedPrefs-backed flags");
        }
        return new ces(this.a, this.b, this.c, this.d, this.e, true);
    }

    public final ces c() {
        if (this.b.isEmpty()) {
            return new ces(this.a, this.b, this.c, true, this.e, this.f);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final ceu d(String str, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        int i = ceu.d;
        return new cep(this, str, boolValueOf);
    }

    public ces(Uri uri) {
        this(uri, "", "", false, false, false);
    }
}
