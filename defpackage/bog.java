package defpackage;

import j$.util.function.Function$CC;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collections;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bog implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ bog(int i) {
        this.a = i;
    }

    public final /* synthetic */ Function andThen(Function function) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        cyl cylVar;
        int i = this.a;
        if (i == 0) {
            UUID uuid = (UUID) obj;
            return ByteBuffer.wrap(new byte[16]).order(ByteOrder.BIG_ENDIAN).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array();
        }
        if (i == 1) {
            return ((beg) obj).b;
        }
        if (i == 2) {
            return new AtomicReference();
        }
        if (i != 3) {
            return i != 4 ? i != 5 ? ((cxe) obj).e() : ((cxm) obj).i() : ((cwy) obj).g();
        }
        brb brbVar = (brb) obj;
        cwy cwyVar = new cwy(brbVar.a.size());
        ?? r1 = brbVar.a;
        cyl cylVar2 = cyl.a;
        Collections.sort(r1, cyk.a);
        Iterator it = brbVar.a.iterator();
        cxv cxvVar = it instanceof cxv ? (cxv) it : new cxv(it);
        while (cxvVar.hasNext()) {
            cyl cylVar3 = (cyl) cxvVar.next();
            while (cxvVar.hasNext()) {
                if (!cxvVar.b) {
                    cxvVar.c = cxvVar.a.next();
                    cxvVar.b = true;
                }
                cyl cylVar4 = (cyl) cxvVar.c;
                if (cylVar3.b.compareTo(cylVar4.c) > 0 || cylVar4.b.compareTo(cylVar3.c) > 0) {
                    break;
                }
                int iCompareTo = cylVar3.b.compareTo(cylVar4.b);
                int iCompareTo2 = cylVar3.c.compareTo(cylVar4.c);
                if (iCompareTo >= 0 && iCompareTo2 <= 0) {
                    cylVar = cylVar3;
                } else if (iCompareTo > 0 || iCompareTo2 < 0) {
                    cwl cwlVar = iCompareTo >= 0 ? cylVar3.b : cylVar4.b;
                    cwl cwlVar2 = iCompareTo2 <= 0 ? cylVar3.c : cylVar4.c;
                    clq.D(cwlVar.compareTo(cwlVar2) <= 0, "intersection is undefined for disconnected ranges %s and %s", cylVar3, cylVar4);
                    cylVar = new cyl(cwlVar, cwlVar2);
                } else {
                    cylVar = cylVar4;
                }
                clq.D(cylVar.b(), "Overlapping ranges not permitted but found %s overlapping %s", cylVar3, cylVar4);
                cyl cylVar5 = (cyl) cxvVar.next();
                int iCompareTo3 = cylVar3.b.compareTo(cylVar5.b);
                int iCompareTo4 = cylVar3.c.compareTo(cylVar5.c);
                if (iCompareTo3 > 0 || iCompareTo4 < 0) {
                    if (iCompareTo3 < 0 || iCompareTo4 > 0) {
                        cylVar5 = new cyl(iCompareTo3 <= 0 ? cylVar3.b : cylVar5.b, iCompareTo4 >= 0 ? cylVar3.c : cylVar5.c);
                    }
                    cylVar3 = cylVar5;
                }
            }
            cwyVar.h(cylVar3);
        }
        cxc cxcVarG = cwyVar.g();
        return cxcVarG.isEmpty() ? cxl.a : (((cyp) cxcVarG).c == 1 && ((cyl) dcr.A(cxcVarG)).equals(cyl.a)) ? cxl.b : new cxl(cxcVarG);
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }
}
