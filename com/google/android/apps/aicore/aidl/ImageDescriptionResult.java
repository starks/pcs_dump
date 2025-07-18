package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import defpackage.akm;
import defpackage.bmr;
import defpackage.cxc;
import defpackage.cyp;
import defpackage.eia;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ImageDescriptionResult extends bmr implements DecoratableResult {
    public static final Parcelable.Creator CREATOR = new ImageDescriptionResultParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.ImageDescriptionResult.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public ImageDescriptionResult readFromBundle(Bundle bundle, String str) {
            return (ImageDescriptionResult) createFromBundle(bundle, str, ImageDescriptionResult.CREATOR);
        }
    };
    private final List descriptions;
    private final InferenceEventTraceResult inferenceEventTraceResult;
    private final List results;

    /* compiled from: PG */
    public abstract class Builder {
        public abstract ImageDescriptionResult build();

        public abstract Builder setDescriptions(List list);

        public abstract Builder setInferenceEventTraceResult(InferenceEventTraceResult inferenceEventTraceResult);

        public abstract Builder setResults(List list);
    }

    public ImageDescriptionResult(List list, InferenceEventTraceResult inferenceEventTraceResult, List list2) {
        this.descriptions = list;
        this.inferenceEventTraceResult = inferenceEventTraceResult;
        this.results = list2;
    }

    public static Builder builder() {
        return new AutoBuilder_ImageDescriptionResult_Builder();
    }

    public List getDescriptions() {
        return this.descriptions;
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
        return cxc.o(getDescriptions());
    }

    public List getResults() {
        return this.results;
    }

    @Override // com.google.android.apps.aicore.aidl.DecoratableResult
    public ImageDescriptionResult withInferenceEventTraceResult(InferenceEventTraceResult inferenceEventTraceResult) {
        return new ImageDescriptionResult(this.descriptions, inferenceEventTraceResult, this.results);
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public /* synthetic */ void writeToBundle(Bundle bundle, String str) {
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ImageDescriptionResultParcelableCreator.writeToParcel(this, parcel, i);
    }
}
