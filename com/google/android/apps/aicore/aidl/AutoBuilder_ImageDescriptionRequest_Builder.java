package com.google.android.apps.aicore.aidl;

import com.google.android.apps.aicore.aidl.ImageDescriptionRequest;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class AutoBuilder_ImageDescriptionRequest_Builder extends ImageDescriptionRequest.Builder {
    private String appendedResult;
    private List images;
    private IImageDescriptionStreamingCallback streamingCallback;

    public AutoBuilder_ImageDescriptionRequest_Builder() {
    }

    @Override // com.google.android.apps.aicore.aidl.ImageDescriptionRequest.Builder
    public ImageDescriptionRequest build() {
        return new ImageDescriptionRequest(this.images, this.streamingCallback, this.appendedResult);
    }

    @Override // com.google.android.apps.aicore.aidl.ImageDescriptionRequest.Builder
    public ImageDescriptionRequest.Builder setAppendedResult(String str) {
        this.appendedResult = str;
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.ImageDescriptionRequest.Builder
    public ImageDescriptionRequest.Builder setImages(List list) {
        this.images = list;
        return this;
    }

    @Override // com.google.android.apps.aicore.aidl.ImageDescriptionRequest.Builder
    public ImageDescriptionRequest.Builder setStreamingCallback(IImageDescriptionStreamingCallback iImageDescriptionStreamingCallback) {
        this.streamingCallback = iImageDescriptionStreamingCallback;
        return this;
    }

    AutoBuilder_ImageDescriptionRequest_Builder(ImageDescriptionRequest imageDescriptionRequest) {
        this.images = imageDescriptionRequest.getImages();
        this.streamingCallback = imageDescriptionRequest.getStreamingCallback();
        this.appendedResult = imageDescriptionRequest.getAppendedResult();
    }
}
