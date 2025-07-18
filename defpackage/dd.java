package defpackage;

import android.view.Window;
import com.google.android.apps.aicore.aidl.AIFeature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dd implements fq {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.fq
    public final void a(ff ffVar, boolean z) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                ((de) this.a).z(ffVar);
                return;
            }
            if (ffVar instanceof fy) {
                ffVar.a().i(false);
            }
            fq fqVar = ((ev) this.a).e;
            if (fqVar != null) {
                fqVar.a(ffVar, z);
                return;
            }
            return;
        }
        ff ffVarA = ffVar.a();
        dc dcVarV = ((de) this.a).v(ffVarA != ffVar ? ffVarA : ffVar);
        if (dcVarV != null) {
            if (ffVarA == ffVar) {
                ((de) this.a).A(dcVarV, z);
            } else {
                ((de) this.a).y(dcVarV.a, dcVarV, ffVarA);
                ((de) this.a).A(dcVarV, true);
            }
        }
    }

    @Override // defpackage.fq
    public final boolean b(ff ffVar) {
        Window.Callback callbackX;
        int i = this.b;
        if (i == 0) {
            if (ffVar == ffVar.a()) {
                de deVar = (de) this.a;
                if (deVar.u && (callbackX = deVar.x()) != null && !((de) this.a).B) {
                    callbackX.onMenuOpened(AIFeature.Id.LLM_IT_PER_LAYER_GEM, ffVar);
                }
            }
            return true;
        }
        if (i == 1) {
            Window.Callback callbackX2 = ((de) this.a).x();
            if (callbackX2 != null) {
                callbackX2.onMenuOpened(AIFeature.Id.LLM_IT_PER_LAYER_GEM, ffVar);
            }
            return true;
        }
        Object obj = this.a;
        if (ffVar == ((gl) obj).c) {
            return false;
        }
        fh fhVar = ((fy) ffVar).l;
        fq fqVar = ((ev) obj).e;
        if (fqVar != null) {
            return fqVar.b(ffVar);
        }
        return false;
    }
}
