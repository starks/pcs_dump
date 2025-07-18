package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bmr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FailedResult extends bmr {
    public static final Parcelable.Creator CREATOR = new FailedResultParcelableCreator();
    private final int error;
    private final InferenceEventTraceResult inferenceEventTraceResult;

    public FailedResult(int i, InferenceEventTraceResult inferenceEventTraceResult) {
        this.error = i;
        this.inferenceEventTraceResult = inferenceEventTraceResult;
    }

    public static FailedResult create(int i, InferenceEventTraceResult inferenceEventTraceResult) {
        return new FailedResult(i, inferenceEventTraceResult);
    }

    public int getError() {
        return this.error;
    }

    public InferenceEventTraceResult getInferenceEventTraceResult() {
        return this.inferenceEventTraceResult;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        FailedResultParcelableCreator.writeToParcel(this, parcel, i);
    }
}
