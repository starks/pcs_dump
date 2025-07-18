package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzt extends bln implements biw {
    private final boolean s;
    private final blh t;
    private final Bundle u;
    private final Integer v;

    public bzt(Context context, Looper looper, boolean z, blh blhVar, Bundle bundle, bjb bjbVar, bjc bjcVar) {
        super(context, looper, 44, blhVar, bjbVar, bjcVar);
        this.s = true;
        this.t = blhVar;
        this.u = bundle;
        this.v = blhVar.g;
    }

    public final void G() {
        h(new bld(this));
    }

    public final void H(bzp bzpVar) {
        GoogleSignInAccount googleSignInAccount;
        try {
            Account account = this.t.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            if ("<<default account>>".equals(account.name)) {
                Context context = this.a;
                Lock lock = bft.a;
                aso.F(context);
                bft.a.lock();
                try {
                    if (bft.b == null) {
                        bft.b = new bft(context.getApplicationContext());
                    }
                    bft bftVar = bft.b;
                    bft.a.unlock();
                    String strA = bftVar.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strA)) {
                        String strA2 = bftVar.a("googleSignInAccount:" + strA);
                        if (strA2 != null) {
                            try {
                                if (!TextUtils.isEmpty(strA2)) {
                                    JSONObject jSONObject = new JSONObject(strA2);
                                    String strOptString = jSONObject.optString("photoUrl");
                                    Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
                                    long j = Long.parseLong(jSONObject.getString("expirationTime"));
                                    HashSet hashSet = new HashSet();
                                    JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
                                    int length = jSONArray.length();
                                    for (int i = 0; i < length; i++) {
                                        hashSet.add(new Scope(jSONArray.getString(i)));
                                    }
                                    String strOptString2 = jSONObject.optString("id");
                                    String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
                                    String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
                                    String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
                                    String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
                                    String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
                                    Long lValueOf = Long.valueOf(j);
                                    String string = jSONObject.getString("obfuscatedIdentifier");
                                    lValueOf.getClass();
                                    aso.E(string);
                                    googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
                                    googleSignInAccount.f = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
                                }
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    googleSignInAccount = null;
                } catch (Throwable th) {
                    bft.a.unlock();
                    throw th;
                }
            } else {
                googleSignInAccount = null;
            }
            Integer num = this.v;
            aso.F(num);
            ((bzr) t()).a(new bzu(1, new bmj(2, account, num.intValue(), googleSignInAccount)), bzpVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                bzpVar.c(new bzv(1, new bho(8, null), null));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // defpackage.bln, defpackage.blg, defpackage.biw
    public final int a() {
        return 12451000;
    }

    @Override // defpackage.blg
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof bzr ? (bzr) iInterfaceQueryLocalInterface : new bzq(iBinder);
    }

    @Override // defpackage.blg
    protected final String c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.blg
    protected final String d() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // defpackage.blg, defpackage.biw
    public final boolean m() {
        return this.s;
    }

    @Override // defpackage.blg
    protected final Bundle s() {
        if (!this.a.getPackageName().equals(this.t.d)) {
            this.u.putString("com.google.android.gms.signin.internal.realClientPackageName", this.t.d);
        }
        return this.u;
    }
}
