package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.apps.aicore.aidl.AIFeature;
import java.io.InputStream;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cfz implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ cfz(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [djy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v17, types: [bqc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [eme, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [fbj, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                Map mapA = cgg.a(((cem) this.a).c);
                Object obj = this.b;
                if (!mapA.containsKey(obj)) {
                    Log.e("PhenotypeCombinedFlags", a.z((String) obj, "Config package ", " cannot use PROCESS_STABLE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags."));
                    break;
                }
                break;
            case 1:
                SharedPreferences sharedPreferencesQ = clq.q((Context) this.a);
                SharedPreferences.Editor editorEdit = null;
                for (Map.Entry<String, ?> entry : sharedPreferencesQ.getAll().entrySet()) {
                    if (entry.getValue() instanceof String) {
                        if (entry.getValue().equals(this.b)) {
                            if (editorEdit == null) {
                                editorEdit = sharedPreferencesQ.edit();
                            }
                            editorEdit.remove(entry.getKey());
                        }
                    }
                }
                if (editorEdit != null) {
                    editorEdit.commit();
                    break;
                }
                break;
            case 2:
                ((cge) this.a).b(this.b);
                break;
            case 3:
                try {
                    cnx.H(this.b);
                    break;
                } catch (Exception e) {
                    Log.w("MobStoreFlagStore", "Failed to register flag update listener on flag read for: " + ((cge) this.a).b + " which may lead to stale flags.", e);
                    return;
                }
            case 4:
                try {
                    cnx.H(this.b);
                    break;
                } catch (Exception e2) {
                    Log.w("MobStoreFlagStore", "Failed to store account on flag read for: " + ((cge) this.a).b + " which may lead to stale flags.", e2);
                    return;
                }
            case 5:
                ((czy) this.b).a.remove(this.a);
                break;
            case 6:
                ((dxx) this.b).c(this.a);
                break;
            case 7:
                ((eur) this.a).g(eqo.f.e(((StringBuilder) this.b).toString()), true);
                break;
            case 8:
                eqo eqoVar = (eqo) this.a;
                ((eur) this.b).b.a(eqoVar.p, eqoVar.q);
                break;
            case 9:
                ((eur) this.a).b.d(this.b);
                break;
            case 10:
                ((euq) this.b).d.z((epc) this.a);
                break;
            case 11:
                ((euq) this.a).d.A(this.b);
                break;
            case 12:
                ((eut) this.b).f.d((eqo) this.a);
                break;
            case 13:
                ((euv) this.b).f.i(this.a);
                break;
            case 14:
                ((euv) this.b).f.m((emu) this.a);
                break;
            case 15:
                ((euv) this.b).f.j((ems) this.a);
                break;
            case 16:
                ((euv) this.a).f.k((InputStream) this.b);
                break;
            case 17:
                ((euv) this.b).f.d((eqo) this.a);
                break;
            case 18:
                ((euu) this.a).a.d(this.b);
                break;
            case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                ((euu) this.b).a.c((epc) this.a);
                break;
            default:
                epl eplVar = new epl();
                eplVar.a = eqq.b((eqo) ((euw) this.a).a);
                ((eva) this.b).b.T(eplVar.a());
                break;
        }
    }

    public cfz(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }

    public /* synthetic */ cfz(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public cfz(Object obj, Object obj2, int i, short[] sArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }
}
