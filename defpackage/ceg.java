package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.util.Log;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ceg {
    private static ceg c;
    public final Object a;
    public final Object b;
    private boolean d;

    private ceg() {
        this.d = false;
        this.a = null;
        this.b = null;
    }

    static ceg a(Context context) {
        ceg cegVar;
        synchronized (ceg.class) {
            if (c == null) {
                c = ul.H(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new ceg(context) : new ceg();
            }
            ceg cegVar2 = c;
            if (cegVar2 == null || cegVar2.b == null || cegVar2.d) {
                cegVar = c;
                cegVar.getClass();
            } else {
                try {
                    context.getContentResolver().registerContentObserver(cap.a, true, (ContentObserver) c.b);
                    ceg cegVar3 = c;
                    cegVar3.getClass();
                    cegVar3.d = true;
                } catch (SecurityException e) {
                    Log.e("GservicesLoader", "Unable to register Gservices content observer", e);
                }
                cegVar = c;
                cegVar.getClass();
            }
        }
        return cegVar;
    }

    static synchronized void c() {
        Object obj;
        ceg cegVar = c;
        if (cegVar != null && (obj = cegVar.a) != null && cegVar.b != null && cegVar.d) {
            ((Context) obj).getContentResolver().unregisterContentObserver((ContentObserver) c.b);
        }
        c = null;
    }

    public final String b(final String str) {
        Object obj = this.a;
        if (obj != null && !cbl.b((Context) obj)) {
            try {
                return (String) uq.o(new ced() { // from class: cee
                    @Override // defpackage.ced
                    public final Object a() {
                        Object obj2 = this.a.a;
                        obj2.getClass();
                        return cao.a.c(((Context) obj2).getContentResolver(), str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
            }
        }
        return null;
    }

    public final void d() {
        this.d = true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [cnl, java.lang.Object] */
    public final void e(Typeface typeface) {
        if (this.d) {
            return;
        }
        this.b.a(typeface);
    }

    public final void f() {
        e((Typeface) this.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    public final dle g() throws GeneralSecurityException {
        int i;
        if (this.d) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.d = true;
        asr asrVar = (asr) dvg.a.createBuilder();
        ArrayList arrayList = new ArrayList(this.b.size());
        ?? r2 = this.b;
        int i2 = 0;
        while (i2 < r2.size() - 1) {
            int i3 = i2 + 1;
            if (((dlb) r2.get(i2)).e == dlc.a && ((dlb) r2.get(i3)).e != dlc.a) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i2 = i3;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (dlb dlbVar : this.b) {
            if (dlbVar.b == null) {
                throw new GeneralSecurityException("Key Status not set.");
            }
            dlc dlcVar = dlbVar.e;
            if (dlcVar == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            if (dlcVar == dlc.a) {
                i = 0;
                while (true) {
                    if (i != 0 && !hashSet.contains(Integer.valueOf(i))) {
                        break;
                    }
                    Charset charset = dsp.a;
                    i = 0;
                    while (i == 0) {
                        byte[] bArrB = dsi.b(4);
                        i = (bArrB[3] & 255) | ((bArrB[0] & 255) << 24) | ((bArrB[1] & 255) << 16) | ((bArrB[2] & 255) << 8);
                    }
                }
            } else {
                i = 0;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException(a.E(i, "Id ", " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            dky dkyVar = dlbVar.c;
            dky dkyVarA = drn.a.a(dlbVar.d, true != dlbVar.d.a() ? null : numValueOf);
            dld dldVar = new dld(dkyVarA, dlbVar.b, i, dlbVar.a);
            asrVar.r(dle.d(dkyVarA, dlbVar.b, i));
            if (dlbVar.a) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (dlbVar.b != dla.a) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(dldVar);
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        int iIntValue = num.intValue();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dvg) asrVar.a).b = iIntValue;
        dvg dvgVar = (dvg) asrVar.z();
        dle.f(dvgVar);
        return new dle(dvgVar, arrayList, (dri) this.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void h() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((dlb) it.next()).a = false;
        }
    }

    public ceg(cnl cnlVar, Typeface typeface) {
        this((byte[]) null);
        this.a = typeface;
        this.b = cnlVar;
    }

    public ceg(byte[] bArr) {
    }

    private ceg(Context context) {
        this.d = false;
        this.a = context;
        this.b = new cef();
    }

    public ceg(char[] cArr) {
        this.b = new ArrayList();
        this.a = dri.a;
        this.d = false;
    }
}
