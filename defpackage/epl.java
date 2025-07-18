package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epl {
    public Object a;
    public final Object b;
    public Object c;

    public epl(Context context) {
        this.b = context;
    }

    public final epm a() {
        Object obj = this.b;
        return new epm((eqq) this.a, (elp) obj, (epj) this.c);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public final enx b() {
        return new enx(this.c, (elp) this.b, (Object[][]) this.a);
    }

    public final void c(enw enwVar, Object obj) {
        int length = 0;
        while (true) {
            Object[][] objArr = (Object[][]) this.a;
            if (length >= objArr.length) {
                length = -1;
                break;
            } else if (enwVar.equals(objArr[length][0])) {
                break;
            } else {
                length++;
            }
        }
        if (length == -1) {
            Object obj2 = this.a;
            int length2 = ((Object[][]) obj2).length;
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, length2 + 1, 2);
            System.arraycopy(obj2, 0, objArr2, 0, length2);
            this.a = objArr2;
            length = objArr2.length - 1;
        }
        ((Object[][]) this.a)[length] = new Object[]{enwVar, obj};
    }

    public final void d(List list) {
        clq.w(!list.isEmpty(), "addrs is empty");
        this.c = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    public epl(byte[] bArr) {
        this.b = elp.a;
        this.a = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
    }

    public epl() {
        this.a = new eqq(null, Collections.EMPTY_LIST);
        this.b = elp.a;
    }
}
