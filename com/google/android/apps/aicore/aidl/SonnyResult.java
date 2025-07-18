package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import defpackage.bmr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SonnyResult extends bmr implements DecoratableResult {
    public static final Parcelable.Creator CREATOR = new SonnyResultParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.SonnyResult.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public SonnyResult readFromBundle(Bundle bundle, String str) {
            return (SonnyResult) createFromBundle(bundle, str, SonnyResult.CREATOR);
        }
    };
    private final InferenceEventTraceResult inferenceEventTraceResult;

    public SonnyResult(InferenceEventTraceResult inferenceEventTraceResult) {
        this.inferenceEventTraceResult = inferenceEventTraceResult;
    }

    public static SonnyResult create() {
        return new SonnyResult(null);
    }

    @Override // com.google.android.apps.aicore.aidl.DecoratableResult
    public InferenceEventTraceResult getInferenceEventTraceResult() {
        return this.inferenceEventTraceResult;
    }

    @Override // com.google.android.apps.aicore.aidl.DecoratableResult
    public SonnyResult withInferenceEventTraceResult(InferenceEventTraceResult inferenceEventTraceResult) {
        return new SonnyResult(inferenceEventTraceResult);
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public /* synthetic */ void writeToBundle(Bundle bundle, String str) {
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SonnyResultParcelableCreator.writeToParcel(this, parcel, i);
    }
}
