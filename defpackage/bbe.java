package defpackage;

import android.content.Context;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.as.oss.R;
import j$.util.StringJoiner;
import j$.util.function.Function$CC;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bbe implements Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bbe(bfr bfrVar, bfg bfgVar, int i) {
        this.c = i;
        this.b = bfrVar;
        this.a = bfgVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        int i = this.c;
        return i != 0 ? i != 1 ? i != 2 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.c;
        if (i == 0) {
            return bbf.i((byte[]) this.a, (byte[]) this.b, (csd) obj);
        }
        if (i != 1) {
            if (i != 2) {
                final beo beoVar = (beo) obj;
                Object obj2 = this.a;
                final bfr bfrVar = (bfr) this.b;
                final bfg bfgVar = (bfg) obj2;
                return cnx.F(new dir() { // from class: bfq
                    @Override // defpackage.dir
                    public final djy a() {
                        bfr bfrVar2 = bfrVar;
                        Map map = bfrVar2.f;
                        bfg bfgVar2 = bfgVar;
                        beo beoVar2 = beoVar;
                        String str = beoVar2.b;
                        efm efmVar = beoVar2.c;
                        bew bewVar = (bew) map.get(bfgVar2);
                        asr asrVar = (asr) bfa.a.createBuilder();
                        if (!asrVar.a.isMutable()) {
                            asrVar.B();
                        }
                        bfa bfaVar = (bfa) asrVar.a;
                        bewVar.getClass();
                        bfaVar.d = bewVar;
                        bfaVar.b |= 2;
                        bem bemVar = beoVar2.d;
                        if (bemVar == null) {
                            bemVar = bem.a;
                        }
                        if (!asrVar.a.isMutable()) {
                            asrVar.B();
                        }
                        bfa bfaVar2 = (bfa) asrVar.a;
                        bemVar.getClass();
                        bfaVar2.c = bemVar;
                        bfaVar2.b |= 1;
                        return bfr.d(str, efmVar, ((bfa) asrVar.z()).toByteArray(), bfrVar2.d, bfrVar2.g, bfrVar2.h, bfrVar2.e, bfrVar2.b);
                    }
                }, bfrVar.c);
            }
            Map.Entry entry = (Map.Entry) obj;
            ViewGroup viewGroup = (ViewGroup) this.b;
            View viewInflate = ((LayoutInflater) this.a).inflate(R.layout.survey_confirm_item, viewGroup, false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.survey_confirm_question_text);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.survey_confirm_answer_text);
            textView.setText((CharSequence) entry.getKey());
            textView2.setText((CharSequence) entry.getValue());
            viewGroup.addView(viewInflate);
            return viewInflate;
        }
        czn cznVar = awt.a;
        aww awwVar = new aww(cxc.o((Collection) obj));
        StringJoiner stringJoiner = new StringJoiner("\n");
        cxc cxcVar = awwVar.b;
        int size = cxcVar.size();
        long jE = 0;
        long jC = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ava avaVar = (ava) cxcVar.get(i2);
            jE += avaVar.e();
            jC += avaVar.c();
            if (avaVar.f().isInitialized() && !avaVar.f().b.isEmpty()) {
                stringJoiner.add(avaVar.f().b);
            }
        }
        Object obj3 = this.a;
        cwy cwyVar = new cwy();
        Context context = (Context) obj3;
        cwyVar.j(cxc.m(avu.a(awwVar.f()), new awn(context.getString(R.string.details_page_status), awt.d(context, 1))));
        if (jE > 0) {
            cwyVar.h(new awn(context.getString(R.string.details_page_upload_size), Formatter.formatShortFileSize(context, jE)));
        }
        if (jC > 0) {
            cwyVar.h(new awn(context.getString(R.string.details_page_download_size), Formatter.formatShortFileSize(context, jC)));
        }
        cwyVar.j(cxc.q(new aws(context.getString(R.string.details_page_policies), stringJoiner.toString(), (auh) this.b)));
        return cwyVar.g();
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.c;
        return i != 0 ? i != 1 ? i != 2 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ bbe(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
