package com.google.android.libraries.micore.learning.training.nflrunner;

import com.google.android.libraries.micore.learning.training.util.StatusOr;
import com.google.fcp.client.http.HttpClientForNative;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface NativeFLRunnerDeps {
    @Deprecated
    StatusOr createExampleIterator(byte[] bArr);

    StatusOr createExampleIteratorWithContext(byte[] bArr, byte[] bArr2);

    HttpClientForNative createHttpClient();

    byte[] getAccessPolicyEndorsementOptionsBytes();

    String getBaseDir();

    String getCacheDir();

    boolean onTaskCompleted(byte[] bArr);

    void publishEvent(byte[] bArr);

    boolean trainingConditionsSatisfied();
}
