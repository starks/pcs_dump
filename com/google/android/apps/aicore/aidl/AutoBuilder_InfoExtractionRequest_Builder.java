package com.google.android.apps.aicore.aidl;

import com.google.android.apps.aicore.aidl.InfoExtractionRequest;
import defpackage.cxc;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class AutoBuilder_InfoExtractionRequest_Builder extends InfoExtractionRequest.Builder {
    private String appendedResult;
    private cxc inputs;
    private int preferredImageHeight;
    private int preferredImageWidth;
    private int safetyClassificationMode;
    private byte set$0;
    private IInfoExtractionStreamingCallback streamingCallback;
    private ITaskStateChangeCallback taskStateChangeCallback;
    private Float temperature;
    private Integer topK;

    public AutoBuilder_InfoExtractionRequest_Builder() {
    }

    @Override // com.google.android.apps.aicore.aidl.InfoExtractionRequest.Builder
    public InfoExtractionRequest build() {
        if (this.set$0 == 7) {
            return new InfoExtractionRequest(this.inputs, this.safetyClassificationMode, this.streamingCallback, this.preferredImageWidth, this.preferredImageHeight, this.taskStateChangeCallback, this.appendedResult, this.temperature, this.topK);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.set$0 & 1) == 0) {
            sb.append(" safetyClassificationMode");
        }
        if ((this.set$0 & 2) == 0) {
            sb.append(" preferredImageWidth");
        }
        if ((this.set$0 & 4) == 0) {
            sb.append(" preferredImageHeight");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.apps.aicore.aidl.InfoExtractionRequest.Builder
    public InfoExtractionRequest.Builder setAppendedResult(String str) {
        this.appendedResult = str;
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.InfoExtractionRequest.Builder
    public InfoExtractionRequest.Builder setInputs(List list) {
        this.inputs = list == null ? null : cxc.o(list);
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.InfoExtractionRequest.Builder
    public InfoExtractionRequest.Builder setPreferredImageHeight(int i) {
        this.preferredImageHeight = i;
        this.set$0 = (byte) (this.set$0 | 4);
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.InfoExtractionRequest.Builder
    public InfoExtractionRequest.Builder setPreferredImageWidth(int i) {
        this.preferredImageWidth = i;
        this.set$0 = (byte) (this.set$0 | 2);
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.InfoExtractionRequest.Builder
    public InfoExtractionRequest.Builder setSafetyClassificationMode(int i) {
        this.safetyClassificationMode = i;
        this.set$0 = (byte) (this.set$0 | 1);
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.InfoExtractionRequest.Builder
    public InfoExtractionRequest.Builder setStreamingCallback(IInfoExtractionStreamingCallback iInfoExtractionStreamingCallback) {
        this.streamingCallback = iInfoExtractionStreamingCallback;
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.InfoExtractionRequest.Builder
    public InfoExtractionRequest.Builder setTaskStateChangeCallback(ITaskStateChangeCallback iTaskStateChangeCallback) {
        this.taskStateChangeCallback = iTaskStateChangeCallback;
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.InfoExtractionRequest.Builder
    public InfoExtractionRequest.Builder setTemperature(Float f) {
        this.temperature = f;
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.InfoExtractionRequest.Builder
    public InfoExtractionRequest.Builder setTopK(Integer num) {
        this.topK = num;
        return this;
    }

    AutoBuilder_InfoExtractionRequest_Builder(InfoExtractionRequest infoExtractionRequest) {
        this.inputs = infoExtractionRequest.getInputs();
        this.safetyClassificationMode = infoExtractionRequest.getSafetyClassificationMode();
        this.streamingCallback = infoExtractionRequest.getStreamingCallback();
        this.preferredImageWidth = infoExtractionRequest.getPreferredImageWidth();
        this.preferredImageHeight = infoExtractionRequest.getPreferredImageHeight();
        this.taskStateChangeCallback = infoExtractionRequest.getTaskStateChangeCallback();
        this.appendedResult = infoExtractionRequest.getAppendedResult();
        this.temperature = infoExtractionRequest.getTemperature();
        this.topK = infoExtractionRequest.getTopK();
        this.set$0 = (byte) 7;
    }
}
