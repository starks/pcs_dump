package defpackage;

import android.accounts.Account;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqw {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    private final Object e;

    public fqw(byte[] bArr) {
        this.e = bzm.a;
    }

    public final fqw a(String str, String str2) {
        str2.getClass();
        ((fsc) this.e).k(str, str2);
        return this;
    }

    public final fqw b(String str, fqz fqzVar) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (fqzVar == null) {
            if (fjs.c(str, "POST") || fjs.c(str, "PUT") || fjs.c(str, "PATCH") || fjs.c(str, "PROPPATCH") || fjs.c(str, "REPORT")) {
                throw new IllegalArgumentException(a.z(str, "method ", " must have a request body."));
            }
        } else if (!fsl.a(str)) {
            throw new IllegalArgumentException(a.z(str, "method ", " must not have a request body."));
        }
        this.b = str;
        this.c = fqzVar;
        return this;
    }

    public final fqw c(String str) throws NumberFormatException, EOFException {
        str.getClass();
        if (fjz.f(str, "ws:", true)) {
            String strSubstring = str.substring(3);
            strSubstring.getClass();
            str = "http:".concat(strSubstring);
        } else if (fjz.f(str, "wss:", true)) {
            String strSubstring2 = str.substring(4);
            strSubstring2.getClass();
            str = "https:".concat(strSubstring2);
        }
        char[] cArr = fqq.a;
        fqp fqpVar = new fqp();
        fqpVar.c(null, str);
        this.a = fqpVar.a();
        return this;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Map] */
    public final fqx d() {
        Map mapUnmodifiableMap;
        Object obj = this.a;
        if (obj == null) {
            throw new IllegalStateException("url == null");
        }
        Object obj2 = this.b;
        fqo fqoVarH = ((fsc) this.e).h();
        Object obj3 = this.c;
        ?? r9 = this.d;
        byte[] bArr = frh.a;
        r9.getClass();
        if (r9.isEmpty()) {
            mapUnmodifiableMap = fgn.a;
        } else {
            mapUnmodifiableMap = DesugarCollections.unmodifiableMap(new LinkedHashMap((Map) r9));
            mapUnmodifiableMap.getClass();
        }
        return new fqx((fqq) obj, (String) obj2, fqoVarH, (fqz) obj3, mapUnmodifiableMap);
    }

    public final void e(String str, String str2) {
        str.getClass();
        str2.getClass();
        ((fsc) this.e).i(str, str2);
    }

    public final void f(String str) {
        ((fsc) this.e).l(str);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Set] */
    public final blh g() {
        Object obj = this.b;
        ?? r2 = this.d;
        Object obj2 = this.c;
        return new blh((Account) obj, r2, null, (String) obj2, (String) this.a, (bzm) this.e);
    }

    public fqw() {
        this.d = new LinkedHashMap();
        this.b = "GET";
        this.e = new fsc((byte[]) null);
    }

    public fqw(fqx fqxVar) {
        LinkedHashMap linkedHashMap;
        this.d = new LinkedHashMap();
        this.a = fqxVar.a;
        this.b = fqxVar.b;
        this.c = fqxVar.d;
        if (fqxVar.e.isEmpty()) {
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = new LinkedHashMap(fqxVar.e);
        }
        this.d = linkedHashMap;
        this.e = fqxVar.c.g();
    }
}
