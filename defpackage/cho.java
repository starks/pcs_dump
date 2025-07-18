package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cho extends cil {
    private final Context a;
    private String d;
    private final Object c = new Object();
    private final cik b = new chs(null);
    private final clq e = new clq();

    public cho(fpf fpfVar) {
        this.a = (Context) fpfVar.b;
    }

    private final boolean h(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    private static final void i() throws chu {
        throw new chu("Android backend cannot perform remote operations without a remote backend");
    }

    @Override // defpackage.cil
    protected final Uri a(Uri uri) throws chw {
        if (h(uri)) {
            throw new chw("Operation across authorities is not allowed.");
        }
        File fileC = c(uri);
        fpf fpfVar = new fpf(null, null);
        ((Uri.Builder) fpfVar.a).path(fileC.getAbsolutePath());
        return ((Uri.Builder) fpfVar.a).encodedFragment(cid.a(((cwy) fpfVar.b).g())).build();
    }

    @Override // defpackage.cil
    protected final cik b() {
        return this.b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    @Override // defpackage.cil, defpackage.cik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.File c(android.net.Uri r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cho.c(android.net.Uri):java.io.File");
    }

    @Override // defpackage.cil, defpackage.cik
    public final InputStream d(Uri uri) throws chu {
        if (!h(uri)) {
            return b().d(a(uri));
        }
        i();
        throw null;
    }

    @Override // defpackage.cik
    public final String e() {
        return "android";
    }

    @Override // defpackage.cil, defpackage.cik
    public final boolean f(Uri uri) throws chu {
        if (!h(uri)) {
            return b().f(a(uri));
        }
        i();
        throw null;
    }
}
