package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import defpackage.bmr;
import defpackage.cxc;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TextToImageResult extends bmr implements DecoratableResult {
    public static final Parcelable.Creator CREATOR = new TextToImageResultParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.TextToImageResult.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public TextToImageResult readFromBundle(Bundle bundle, String str) {
            return (TextToImageResult) createFromBundle(bundle, str, TextToImageResult.CREATOR);
        }
    };
    private final InferenceEventTraceResult inferenceEventTraceResult;
    private final cxc results;

    public TextToImageResult(List list, InferenceEventTraceResult inferenceEventTraceResult) {
        this.results = cxc.o(list);
        this.inferenceEventTraceResult = inferenceEventTraceResult;
    }

    public static TextToImageResult create(List list) {
        return new TextToImageResult(list, null);
    }

    @Override // com.google.android.apps.aicore.aidl.DecoratableResult
    public InferenceEventTraceResult getInferenceEventTraceResult() {
        return this.inferenceEventTraceResult;
    }

    public cxc getResults() {
        return this.results;
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public /* synthetic */ void writeToBundle(Bundle bundle, String str) {
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TextToImageResultParcelableCreator.writeToParcel(this, parcel, i);
    }

    @Override // com.google.android.apps.aicore.aidl.DecoratableResult
    public TextToImageResult withInferenceEventTraceResult(InferenceEventTraceResult inferenceEventTraceResult) {
        return new TextToImageResult(this.results, inferenceEventTraceResult);
    }
}
