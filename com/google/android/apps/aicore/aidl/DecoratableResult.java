package com.google.android.apps.aicore.aidl;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface DecoratableResult extends Result {
    InferenceEventTraceResult getInferenceEventTraceResult();

    DecoratableResult withInferenceEventTraceResult(InferenceEventTraceResult inferenceEventTraceResult);
}
