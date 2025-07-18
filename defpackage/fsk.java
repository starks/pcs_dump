package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsk {
    private static final fvn a;
    private static final fvn b;

    static {
        fvn fvnVar = fvn.a;
        a = fwv.h("\"\\");
        b = fwv.h("\t ,=");
    }

    public static final void a(fqi fqiVar, fqq fqqVar, fqo fqoVar) {
        List listUnmodifiableList;
        if (fqiVar == fqi.a) {
            return;
        }
        fme fmeVar = fqg.g;
        List listE = fqoVar.e("Set-Cookie");
        int size = listE.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            fqg fqgVarG = fmeVar.g(fqqVar, (String) listE.get(i));
            if (fqgVarG != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fqgVarG);
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        } else {
            listUnmodifiableList = fgm.a;
        }
        if (listUnmodifiableList.isEmpty()) {
            return;
        }
        fqiVar.b(listUnmodifiableList);
    }

    public static final boolean b(frb frbVar) {
        if (fjs.c(frbVar.a.b, "HEAD")) {
            return false;
        }
        int i = frbVar.d;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && frh.i(frbVar) == -1 && !fjz.q("chunked", frb.a(frbVar, "Transfer-Encoding"))) ? false : true;
    }
}
