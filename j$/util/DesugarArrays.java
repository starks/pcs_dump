package j$.util;

import j$.util.stream.Stream;
import j$.util.stream.Z;

/* loaded from: classes2.dex */
public final /* synthetic */ class DesugarArrays {
    public static <T> Stream<T> stream(T[] tArr) {
        return Z.a(Spliterators.d(tArr, 0, tArr.length, 1040), false);
    }
}
