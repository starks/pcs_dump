package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.net.URI;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exo {
    public final Object a;
    public final Object b;

    public exo(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public static exo f(long j) {
        return new exo(Long.TYPE, (Object) Long.valueOf(j), (byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    public final void a() {
        ((eqt) this.a).b = true;
        this.b.cancel(false);
    }

    public final boolean b() {
        eqt eqtVar = (eqt) this.a;
        return (eqtVar.c || eqtVar.b) ? false : true;
    }

    public final eea c() {
        ((eei) this.a).ag();
        return new edy((byte[]) this.b);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final Enum d(Object obj) throws GeneralSecurityException {
        Enum r1 = (Enum) this.a.get(obj);
        if (r1 != null) {
            return r1;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(String.valueOf(obj))));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final Object e(Enum r2) throws GeneralSecurityException {
        Object obj = this.b.get(r2);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(String.valueOf(r2))));
    }

    public exo(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public exo(Object obj, Object obj2, char[] cArr) {
        this.a = obj;
        this.b = obj2;
    }

    public exo(byte[] bArr, char[] cArr) {
    }

    public exo(eqi eqiVar, Map map) {
        this.a = eqiVar;
        this.b = DesugarCollections.unmodifiableMap(new HashMap(map));
    }

    public exo(byte[] bArr) {
        this.b = new HashMap();
        this.a = new HashMap();
    }

    public exo(byte[] bArr, char[] cArr, byte[] bArr2) {
        this((byte[]) null, (char[]) null);
        this.b = new Rect();
        this.a = new Rect();
    }

    public exo(eqt eqtVar, ScheduledFuture scheduledFuture) {
        this.a = eqtVar;
        scheduledFuture.getClass();
        this.b = scheduledFuture;
    }

    exo() {
        this(cyu.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public exo(exo exoVar) {
        this.b = new HashMap((Map) exoVar.b);
        this.a = new HashMap((Map) exoVar.a);
    }

    public exo(Class cls, Context context, Parcelable parcelable) throws bob {
        this.a = new byte[0];
        try {
            this.b = cls.getDeclaredConstructor(Context.class, Parcelable.class).newInstance(context, parcelable);
        } catch (Exception e) {
            throw new bob(e);
        }
    }

    public exo(cxg cxgVar) {
        int i = erf.a;
        this.b = new ere();
        this.a = cxgVar;
    }

    private exo(Class cls, Object obj, byte[] bArr) {
        this(cls, obj, (char[]) null);
    }

    public exo(eok eokVar, String str) {
        eokVar.getClass();
        this.a = eokVar;
        str.getClass();
        this.b = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public exo(exo exoVar, byte[] bArr) {
        this.b = new HashMap((Map) exoVar.b);
        this.a = new HashMap((Map) exoVar.a);
    }

    public exo(URI uri, epp eppVar) {
        uri.getClass();
        this.a = uri;
        this.b = eppVar;
    }

    public exo(byte[] bArr, byte[] bArr2) {
        this.a = dwt.b(bArr);
        this.b = dwt.b(bArr2);
    }

    public exo(int i) {
        byte[] bArr = new byte[i];
        this.b = bArr;
        this.a = eei.af(bArr);
    }

    public exo(eqo eqoVar, Object obj) {
        eqoVar.getClass();
        this.a = eqoVar;
        this.b = obj;
    }
}
