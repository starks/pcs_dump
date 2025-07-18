package defpackage;

import j$.util.function.BiConsumer$CC;
import j$.util.stream.Collector;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvu {
    public static final Collector a;

    static {
        final int i = 2;
        final int i2 = 1;
        int i3 = 4;
        final int i4 = 0;
        a = Collector.CC.of(new bbg(i), new BiConsumer() { // from class: cvs
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                int i5 = i2;
                if (i5 == 0) {
                    ((cxm) obj).c(obj2);
                } else if (i5 != 1) {
                    ((brb) obj).n((cyl) obj2);
                } else {
                    ((cwy) obj).h(obj2);
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                int i5 = i2;
                return i5 != 0 ? i5 != 1 ? BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new cvr(i), new bog(i3), new Collector.Characteristics[0]);
        int i5 = 3;
        Collector.CC.of(new bbg(i5), new BiConsumer() { // from class: cvs
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                int i52 = i4;
                if (i52 == 0) {
                    ((cxm) obj).c(obj2);
                } else if (i52 != 1) {
                    ((brb) obj).n((cyl) obj2);
                } else {
                    ((cwy) obj).h(obj2);
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                int i52 = i4;
                return i52 != 0 ? i52 != 1 ? BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new cvr(i5), new bog(5), new Collector.Characteristics[0]);
        Collector.CC.of(new bbg(i3), new BiConsumer() { // from class: cvs
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                int i52 = i;
                if (i52 == 0) {
                    ((cxm) obj).c(obj2);
                } else if (i52 != 1) {
                    ((brb) obj).n((cyl) obj2);
                } else {
                    ((cwy) obj).h(obj2);
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                int i52 = i;
                return i52 != 0 ? i52 != 1 ? BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new cvr(i4), new bog(i5), new Collector.Characteristics[0]);
    }

    public static Collector a(final Function function, final Function function2) {
        function2.getClass();
        return Collector.CC.of(new bbg(5), new BiConsumer() { // from class: cvt
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Collector collector = cvu.a;
                ((cxe) obj).b(function.apply(obj2), function2.apply(obj2));
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new cvr(4), new bog(6), new Collector.Characteristics[0]);
    }
}
