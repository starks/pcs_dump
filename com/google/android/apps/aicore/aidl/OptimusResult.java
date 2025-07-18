package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import defpackage.bmr;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OptimusResult extends bmr implements DecoratableResult {
    public static final Parcelable.Creator CREATOR = new OptimusResultParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.OptimusResult.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public OptimusResult readFromBundle(Bundle bundle, String str) {
            return (OptimusResult) createFromBundle(bundle, str, OptimusResult.CREATOR);
        }
    };
    private final InferenceEventTraceResult inferenceEventTraceResult;
    private final List results;

    public OptimusResult(List list, InferenceEventTraceResult inferenceEventTraceResult) {
        this.results = list;
        this.inferenceEventTraceResult = inferenceEventTraceResult;
    }

    public static OptimusResult create(List list) {
        return new OptimusResult(list, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptimusResult)) {
            return false;
        }
        OptimusResult optimusResult = (OptimusResult) obj;
        return Objects.equals(this.results, optimusResult.results) && Objects.equals(this.inferenceEventTraceResult, optimusResult.inferenceEventTraceResult);
    }

    @Override // com.google.android.apps.aicore.aidl.DecoratableResult
    public InferenceEventTraceResult getInferenceEventTraceResult() {
        return this.inferenceEventTraceResult;
    }

    public List getResults() {
        return this.results;
    }

    public int hashCode() {
        return Objects.hash(this.results, this.inferenceEventTraceResult);
    }

    @Override // com.google.android.apps.aicore.aidl.DecoratableResult
    public OptimusResult withInferenceEventTraceResult(InferenceEventTraceResult inferenceEventTraceResult) {
        return new OptimusResult(this.results, inferenceEventTraceResult);
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public /* synthetic */ void writeToBundle(Bundle bundle, String str) {
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        OptimusResultParcelableCreator.writeToParcel(this, parcel, i);
    }
}
