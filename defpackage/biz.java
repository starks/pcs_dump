package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class biz {
    private final zl a;
    public final Context b;
    public final String c;
    public final biv d;
    public final bjr e;
    public final Looper f;
    public final int g;
    public final bjd h;
    public final bkf i;
    public final brb j;
    public final fcy k;

    public biz(Context context, fcy fcyVar, biv bivVar, biy biyVar) {
        aso.G(context, "Null context is not permitted.");
        aso.G(fcyVar, "Api must not be null.");
        aso.G(biyVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        aso.G(applicationContext, "The provided context did not have an application context.");
        this.b = applicationContext;
        String attributionTag = context != null ? context.getAttributionTag() : null;
        this.c = attributionTag;
        this.j = context != null ? new brb(context.getAttributionSource(), (byte[]) null) : null;
        this.k = fcyVar;
        this.d = bivVar;
        this.f = biyVar.b;
        this.e = new bjr(fcyVar, bivVar, attributionTag);
        this.h = new bkg(this);
        bkf bkfVarB = bkf.b(applicationContext);
        this.i = bkfVarB;
        this.g = bkfVarB.j.getAndIncrement();
        this.a = biyVar.c;
        Handler handler = bkfVarB.n;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    private final cag a(int i, bkv bkvVar) {
        brb brbVar = new brb((byte[]) null, (char[]) null, (byte[]) null);
        bjo bjoVar = new bjo(i, bkvVar, brbVar, this.a);
        bkf bkfVar = this.i;
        cgm cgmVar = new cgm(bjoVar, bkfVar.k.get(), this);
        Handler handler = bkfVar.n;
        handler.sendMessage(handler.obtainMessage(4, cgmVar));
        return (cag) brbVar.a;
    }

    public final cag e(bkv bkvVar) {
        return a(2, bkvVar);
    }

    public final cag f(bkv bkvVar) {
        return a(0, bkvVar);
    }

    public final fqw g() {
        GoogleSignInAccount googleSignInAccountA;
        GoogleSignInAccount googleSignInAccountA2;
        Account accountA = null;
        fqw fqwVar = new fqw((byte[]) null);
        biv bivVar = this.d;
        if (!(bivVar instanceof bit) || (googleSignInAccountA2 = ((bit) bivVar).a()) == null) {
            biv bivVar2 = this.d;
            if (bivVar2 instanceof bis) {
                accountA = ((bis) bivVar2).a();
            }
        } else {
            String str = googleSignInAccountA2.c;
            if (str != null) {
                accountA = new Account(str, "com.google");
            }
        }
        fqwVar.b = accountA;
        biv bivVar3 = this.d;
        Set setA = (!(bivVar3 instanceof bit) || (googleSignInAccountA = ((bit) bivVar3).a()) == null) ? Collections.EMPTY_SET : googleSignInAccountA.a();
        if (fqwVar.d == null) {
            fqwVar.d = new nx();
        }
        ((nx) fqwVar.d).addAll(setA);
        fqwVar.a = this.b.getClass().getName();
        fqwVar.c = this.b.getPackageName();
        return fqwVar;
    }
}
