package com.google.android.apps.aicore.aidl;

import com.google.android.apps.aicore.aidl.ImageDescriptionResult;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class AutoBuilder_ImageDescriptionResult_Builder extends ImageDescriptionResult.Builder {
    private List descriptions;
    private InferenceEventTraceResult inferenceEventTraceResult;
    private List results;

    public AutoBuilder_ImageDescriptionResult_Builder() {
    }

    @Override // com.google.android.apps.aicore.aidl.ImageDescriptionResult.Builder
    public ImageDescriptionResult build() {
        List list = this.descriptions;
        if (list != null) {
            return new ImageDescriptionResult(list, this.inferenceEventTraceResult, this.results);
        }
        throw new IllegalStateException("Missing required properties: descriptions");
    }

    @Override // com.google.android.apps.aicore.aidl.ImageDescriptionResult.Builder
    public ImageDescriptionResult.Builder setDescriptions(List list) {
        if (list == null) {
            throw new NullPointerException("Null descriptions");
        }
        this.descriptions = list;
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.ImageDescriptionResult.Builder
    public ImageDescriptionResult.Builder setInferenceEventTraceResult(InferenceEventTraceResult inferenceEventTraceResult) {
        this.inferenceEventTraceResult = inferenceEventTraceResult;
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.ImageDescriptionResult.Builder
    public ImageDescriptionResult.Builder setResults(List list) {
        this.results = list;
        return this;
    }

    AutoBuilder_ImageDescriptionResult_Builder(ImageDescriptionResult imageDescriptionResult) {
        this.descriptions = imageDescriptionResult.getDescriptions();
        this.inferenceEventTraceResult = imageDescriptionResult.getInferenceEventTraceResult();
        this.results = imageDescriptionResult.getResults();
    }
}
