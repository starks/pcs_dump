package defpackage;

import com.google.android.gms.common.api.Scope;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzl {
    public static final bfe a;
    public static final bfe b;
    public static final yt c;
    static final yt d;
    public static final fcy e;

    static {
        bfe bfeVar = new bfe(null, null);
        a = bfeVar;
        b = new bfe(null, null);
        bzi bziVar = new bzi();
        c = bziVar;
        d = new bzj();
        new Scope("profile");
        new Scope("email");
        e = new fcy("SignIn.API", bziVar, bfeVar);
    }
}
