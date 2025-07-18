package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import defpackage.bmr;
import defpackage.ecz;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OcrResult extends bmr implements DecoratableResult {
    public static final Parcelable.Creator CREATOR = new OcrResultParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.OcrResult.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public OcrResult readFromBundle(Bundle bundle, String str) {
            return (OcrResult) createFromBundle(bundle, str, OcrResult.CREATOR);
        }
    };
    private final InferenceEventTraceResult inferenceEventTraceResult;
    private final ecz textParcel;

    public OcrResult(ecz eczVar, InferenceEventTraceResult inferenceEventTraceResult) {
        this.textParcel = eczVar;
        this.inferenceEventTraceResult = inferenceEventTraceResult;
    }

    public static OcrResult create(ecz eczVar) {
        return new OcrResult(eczVar, null);
    }

    @Override // com.google.android.apps.aicore.aidl.DecoratableResult
    public InferenceEventTraceResult getInferenceEventTraceResult() {
        return this.inferenceEventTraceResult;
    }

    public ecz getTextParcel() {
        return this.textParcel;
    }

    @Override // com.google.android.apps.aicore.aidl.DecoratableResult
    public OcrResult withInferenceEventTraceResult(InferenceEventTraceResult inferenceEventTraceResult) {
        return new OcrResult(this.textParcel, inferenceEventTraceResult);
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public /* synthetic */ void writeToBundle(Bundle bundle, String str) {
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        OcrResultParcelableCreator.writeToParcel(this, parcel, i);
    }
}
