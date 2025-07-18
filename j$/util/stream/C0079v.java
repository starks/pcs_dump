package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0079v extends AbstractC0080w {
    private final Object[] h;

    C0079v(Spliterator spliterator, AbstractC0060b abstractC0060b, Object[] objArr) {
        super(spliterator, abstractC0060b, objArr.length);
        this.h = objArr;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        Object[] objArr = this.h;
        this.f = i + 1;
        objArr[i] = obj;
    }

    C0079v(C0079v c0079v, Spliterator spliterator, long j, long j2) {
        super(c0079v, spliterator, j, j2, c0079v.h.length);
        this.h = c0079v.h;
    }
}
