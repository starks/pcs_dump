package com.google.android.libraries.micore.learning.training.nativeshared;

import com.google.android.libraries.micore.learning.training.util.StatusOr;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface NativeExampleIterator extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    StatusOr next();
}
