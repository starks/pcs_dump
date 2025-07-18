package defpackage;

import android.os.Message;
import android.support.v7.widget.Toolbar;
import android.view.View;
import androidx.preference.Preference;
import com.android.settingslib.widget.CollapsableTextView;
import com.google.android.apps.miphone.astrea.survey.service.SurveyConfirmActivity;
import j$.util.Collection;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gc implements View.OnClickListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public gc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        switch (this.b) {
            case 0:
                ((ei) this.a).f();
                break;
            case 1:
                cj cjVar = (cj) this.a;
                Message messageObtain = (view != cjVar.i || (message3 = cjVar.k) == null) ? (view != cjVar.l || (message2 = cjVar.n) == null) ? (view != cjVar.o || (message = cjVar.q) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                cj cjVar2 = (cj) this.a;
                cjVar2.H.obtainMessage(1, cjVar2.b).sendToTarget();
                break;
            case 2:
                ((Toolbar) this.a).j();
                break;
            case 3:
                ((Preference) this.a).b(view);
                break;
            case 4:
                CollapsableTextView collapsableTextView = (CollapsableTextView) this.a;
                collapsableTextView.h = !collapsableTextView.h;
                collapsableTextView.f();
                break;
            case 5:
                break;
            case 6:
                ((SurveyConfirmActivity) this.a).D();
                break;
            case 7:
                ((SurveyConfirmActivity) this.a).D();
                break;
            default:
                SurveyConfirmActivity surveyConfirmActivity = (SurveyConfirmActivity) this.a;
                surveyConfirmActivity.G();
                bfr bfrVar = surveyConfirmActivity.k;
                bfg bfgVarB = bfg.b(surveyConfirmActivity.j.d);
                if (bfgVarB == null) {
                    bfgVarB = bfg.UNRECOGNIZED;
                }
                bep bepVar = surveyConfirmActivity.j.b;
                if (bepVar == null) {
                    bepVar = bep.a;
                }
                bfp bfpVar = new bfp(surveyConfirmActivity);
                if (bfgVarB != null && bfrVar.f.containsKey(bfgVarB)) {
                    Stream map = Collection.EL.stream(bepVar.b).map(new bbe(bfrVar, bfgVarB, 3));
                    int i = cxc.d;
                    cnx.J(cnx.z((cxc) map.collect(cvu.a)), new ars(bfpVar, 5), diy.a);
                    break;
                } else {
                    bfpVar.b(new IllegalArgumentException("Survey session not found"));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ gc(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
