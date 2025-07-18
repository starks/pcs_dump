package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import defpackage.bmr;
import defpackage.cxc;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TextClassificationResult extends bmr implements DecoratableResult {
    public static final Parcelable.Creator CREATOR = new TextClassificationResultParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.TextClassificationResult.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public TextClassificationResult readFromBundle(Bundle bundle, String str) {
            return (TextClassificationResult) createFromBundle(bundle, str, TextClassificationResult.CREATOR);
        }
    };
    private final InferenceEventTraceResult inferenceEventTraceResult;
    private final cxc results;

    public TextClassificationResult(List list, InferenceEventTraceResult inferenceEventTraceResult) {
        this.results = cxc.o(list);
        this.inferenceEventTraceResult = inferenceEventTraceResult;
    }

    public static TextClassificationResult create(List list) {
        return new TextClassificationResult(list, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextClassificationResult)) {
            return false;
        }
        TextClassificationResult textClassificationResult = (TextClassificationResult) obj;
        return Objects.equals(this.results, textClassificationResult.results) && Objects.equals(this.inferenceEventTraceResult, textClassificationResult.inferenceEventTraceResult);
    }

    @Override // com.google.android.apps.aicore.aidl.DecoratableResult
    public InferenceEventTraceResult getInferenceEventTraceResult() {
        return this.inferenceEventTraceResult;
    }

    public cxc getResults() {
        return this.results;
    }

    public int hashCode() {
        return Objects.hash(this.results, this.inferenceEventTraceResult);
    }

    public String toString() {
        InferenceEventTraceResult inferenceEventTraceResult = this.inferenceEventTraceResult;
        return "TextClassificationResult{results=" + String.valueOf(this.results) + ", inferenceEventTraceResult=" + String.valueOf(inferenceEventTraceResult) + "}";
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public /* synthetic */ void writeToBundle(Bundle bundle, String str) {
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TextClassificationResultParcelableCreator.writeToParcel(this, parcel, i);
    }

    @Override // com.google.android.apps.aicore.aidl.DecoratableResult
    public TextClassificationResult withInferenceEventTraceResult(InferenceEventTraceResult inferenceEventTraceResult) {
        return new TextClassificationResult(this.results, inferenceEventTraceResult);
    }
}
