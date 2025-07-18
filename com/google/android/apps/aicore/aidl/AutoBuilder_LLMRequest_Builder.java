package com.google.android.apps.aicore.aidl;

import android.os.Bundle;
import com.google.android.apps.aicore.aidl.LLMRequest;
import defpackage.cxc;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class AutoBuilder_LLMRequest_Builder extends LLMRequest.Builder {
    private String appendedResult;
    private boolean applySafetyFilter;
    private Bundle auxiliaryFilesBundle;
    private IImageEmbeddingCallback imageEmbeddingCallback;
    private cxc messages;
    private int numSamples;
    private int preferredImageHeight;
    private int preferredImageWidth;
    private boolean privateInferenceEnabled;
    private short set$0;
    private cxc stopTokensList;
    private ILLMStreamingCallback streamingCallback;
    private int targetReplyLengthMax;
    private int targetReplyLengthMin;
    private float temperature;
    private int topK;

    @Override // com.google.android.apps.aicore.aidl.LLMRequest.Builder
    public LLMRequest build() {
        cxc cxcVar;
        cxc cxcVar2;
        if (this.set$0 == 511 && (cxcVar = this.messages) != null && (cxcVar2 = this.stopTokensList) != null) {
            return new LLMRequest(cxcVar, this.temperature, this.topK, cxcVar2, this.targetReplyLengthMin, this.targetReplyLengthMax, this.streamingCallback, this.applySafetyFilter, this.numSamples, this.imageEmbeddingCallback, this.preferredImageWidth, this.preferredImageHeight, this.appendedResult, this.auxiliaryFilesBundle, this.privateInferenceEnabled);
        }
        StringBuilder sb = new StringBuilder();
        if (this.messages == null) {
            sb.append(" messages");
        }
        if ((this.set$0 & 1) == 0) {
            sb.append(" temperature");
        }
        if ((this.set$0 & 2) == 0) {
            sb.append(" topK");
        }
        if (this.stopTokensList == null) {
            sb.append(" stopTokensList");
        }
        if ((this.set$0 & 4) == 0) {
            sb.append(" targetReplyLengthMin");
        }
        if ((this.set$0 & 8) == 0) {
            sb.append(" targetReplyLengthMax");
        }
        if ((this.set$0 & 16) == 0) {
            sb.append(" applySafetyFilter");
        }
        if ((this.set$0 & 32) == 0) {
            sb.append(" numSamples");
        }
        if ((this.set$0 & 64) == 0) {
            sb.append(" preferredImageWidth");
        }
        if ((this.set$0 & 128) == 0) {
            sb.append(" preferredImageHeight");
        }
        if ((this.set$0 & 256) == 0) {
            sb.append(" privateInferenceEnabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.apps.aicore.aidl.LLMRequest.Builder
    public LLMRequest.Builder setAppendedResult(String str) {
        this.appendedResult = str;
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.LLMRequest.Builder
    public LLMRequest.Builder setApplySafetyFilter(boolean z) {
        this.applySafetyFilter = z;
        this.set$0 = (short) (this.set$0 | 16);
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.LLMRequest.Builder
    public LLMRequest.Builder setAuxiliaryFilesBundle(Bundle bundle) {
        this.auxiliaryFilesBundle = bundle;
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.LLMRequest.Builder
    public LLMRequest.Builder setImageEmbeddingCallback(IImageEmbeddingCallback iImageEmbeddingCallback) {
        this.imageEmbeddingCallback = iImageEmbeddingCallback;
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.LLMRequest.Builder
    public LLMRequest.Builder setMessages(List list) {
        this.messages = cxc.o(list);
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.LLMRequest.Builder
    public LLMRequest.Builder setNumSamples(int i) {
        this.numSamples = i;
        this.set$0 = (short) (this.set$0 | 32);
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.LLMRequest.Builder
    public LLMRequest.Builder setPreferredImageHeight(int i) {
        this.preferredImageHeight = i;
        this.set$0 = (short) (this.set$0 | 128);
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.LLMRequest.Builder
    public LLMRequest.Builder setPreferredImageWidth(int i) {
        this.preferredImageWidth = i;
        this.set$0 = (short) (this.set$0 | 64);
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.LLMRequest.Builder
    public LLMRequest.Builder setPrivateInferenceEnabled(boolean z) {
        this.privateInferenceEnabled = z;
        this.set$0 = (short) (this.set$0 | 256);
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.LLMRequest.Builder
    public LLMRequest.Builder setStopTokensList(List list) {
        this.stopTokensList = cxc.o(list);
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.LLMRequest.Builder
    public LLMRequest.Builder setStreamingCallback(ILLMStreamingCallback iLLMStreamingCallback) {
        this.streamingCallback = iLLMStreamingCallback;
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.LLMRequest.Builder
    public LLMRequest.Builder setTargetReplyLengthMax(int i) {
        this.targetReplyLengthMax = i;
        this.set$0 = (short) (this.set$0 | 8);
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.LLMRequest.Builder
    public LLMRequest.Builder setTargetReplyLengthMin(int i) {
        this.targetReplyLengthMin = i;
        this.set$0 = (short) (this.set$0 | 4);
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.LLMRequest.Builder
    public LLMRequest.Builder setTemperature(float f) {
        this.temperature = f;
        this.set$0 = (short) (this.set$0 | 1);
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.LLMRequest.Builder
    public LLMRequest.Builder setTopK(int i) {
        this.topK = i;
        this.set$0 = (short) (this.set$0 | 2);
        return this;
    }
}
