package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public abstract class Z {
    public static Stream a(Spliterator spliterator, boolean z) {
        spliterator.getClass();
        W w = W.DISTINCT;
        int iCharacteristics = spliterator.characteristics();
        int i = iCharacteristics & 4;
        int i2 = W.f;
        return new K(spliterator, (i == 0 || spliterator.getComparator() == null) ? iCharacteristics & i2 : iCharacteristics & i2 & (-5), z);
    }
}
