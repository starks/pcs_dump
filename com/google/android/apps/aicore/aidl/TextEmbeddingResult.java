package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import defpackage.akm;
import defpackage.bmt;
import defpackage.cxc;
import defpackage.cyp;
import defpackage.eia;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TextEmbeddingResult implements DecoratableResult, bmt {
    public static final Parcelable.Creator CREATOR = new TextEmbeddingResultParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.TextEmbeddingResult.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public TextEmbeddingResult readFromBundle(Bundle bundle, String str) {
            return (TextEmbeddingResult) createFromBundle(bundle, str, TextEmbeddingResult.CREATOR);
        }
    };
    private final InferenceEventTraceResult inferenceEventTraceResult;
    private final cxc results;

    public TextEmbeddingResult(List list, InferenceEventTraceResult inferenceEventTraceResult) {
        this.results = cxc.o(list);
        this.inferenceEventTraceResult = inferenceEventTraceResult;
    }

    public static TextEmbeddingResult create(List list) {
        return new TextEmbeddingResult(list, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextEmbeddingResult)) {
            return false;
        }
        TextEmbeddingResult textEmbeddingResult = (TextEmbeddingResult) obj;
        return Objects.equals(this.results, textEmbeddingResult.results) && Objects.equals(this.inferenceEventTraceResult, textEmbeddingResult.inferenceEventTraceResult);
    }

    @Override // com.google.android.apps.aicore.aidl.DecoratableResult
    public InferenceEventTraceResult getInferenceEventTraceResult() {
        return this.inferenceEventTraceResult;
    }

    public cxc getInferenceImageResultsForSafety(akm akmVar, eia eiaVar) {
        int i = cxc.d;
        return cyp.a;
    }

    public cxc getInferenceResultsForSafety(akm akmVar, eia eiaVar) {
        int i = cxc.d;
        return cyp.a;
    }

    public cxc getResults() {
        return this.results;
    }

    public int hashCode() {
        return Objects.hash(this.results, this.inferenceEventTraceResult);
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public /* synthetic */ void writeToBundle(Bundle bundle, String str) {
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TextEmbeddingResultParcelableCreator.writeToParcel(this, parcel, i);
    }

    @Override // com.google.android.apps.aicore.aidl.DecoratableResult
    public TextEmbeddingResult withInferenceEventTraceResult(InferenceEventTraceResult inferenceEventTraceResult) {
        return new TextEmbeddingResult(this.results, inferenceEventTraceResult);
    }
}
