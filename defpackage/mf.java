package defpackage;

import android.view.View;
import java.util.ListIterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mf extends fjt implements fiy {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf(int i) {
        super(1);
        this.b = i;
        this.a = "";
    }

    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.fiy
    public final /* synthetic */ Object a(Object obj) {
        int i = this.b;
        Object obj2 = null;
        if (i == 0) {
            ((lq) obj).getClass();
            mk mkVar = (mk) this.a;
            fgk fgkVar = mkVar.a;
            ListIterator<E> listIterator = fgkVar.listIterator(fgkVar.a);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                Object objPrevious = listIterator.previous();
                if (((me) objPrevious).b) {
                    obj2 = objPrevious;
                    break;
                }
            }
            me meVar = (me) obj2;
            if (mkVar.b != null) {
                mkVar.a();
            }
            mkVar.b = meVar;
            if (meVar != null) {
                meVar.d();
            }
            return ffz.a;
        }
        if (i == 1) {
            Map.Entry entry = (Map.Entry) obj;
            entry.getClass();
            View view = (View) entry.getValue();
            int[] iArr = ut.a;
            return Boolean.valueOf(ffh.O(this.a, un.l(view)));
        }
        if (i == 2) {
            lq lqVar = (lq) obj;
            lqVar.getClass();
            mk mkVar2 = (mk) this.a;
            me meVar2 = mkVar2.b;
            if (meVar2 == null) {
                fgk fgkVar2 = mkVar2.a;
                ListIterator<E> listIterator2 = fgkVar2.listIterator(fgkVar2.a);
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        break;
                    }
                    Object objPrevious2 = listIterator2.previous();
                    if (((me) objPrevious2).b) {
                        obj2 = objPrevious2;
                        break;
                    }
                }
                meVar2 = (me) obj2;
            }
            if (meVar2 != null) {
                meVar2.c(lqVar);
            }
            return ffz.a;
        }
        if (i == 3) {
            return obj == this.a ? "(this Collection)" : String.valueOf(obj);
        }
        if (i == 4) {
            String str = (String) obj;
            str.getClass();
            return ((String) this.a).concat(str);
        }
        if (i != 5) {
            fki fkiVar = (fki) obj;
            fkiVar.getClass();
            int i2 = fkiVar.a;
            Integer.valueOf(i2).getClass();
            int i3 = fkiVar.b;
            Integer.valueOf(i3).getClass();
            return this.a.subSequence(i2, i3 + 1).toString();
        }
        String str2 = (String) obj;
        str2.getClass();
        if (!fjz.l(str2)) {
            return ((String) this.a).concat(str2);
        }
        int length = str2.length();
        Object obj3 = this.a;
        return length >= ((String) obj3).length() ? str2 : obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf(int i, byte[] bArr) {
        super(1);
        this.b = i;
        this.a = "    ";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }
}
