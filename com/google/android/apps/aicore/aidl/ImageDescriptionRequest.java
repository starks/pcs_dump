package com.google.android.apps.aicore.aidl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import com.google.android.apps.aicore.aidl.IImageDescriptionStreamingCallback;
import defpackage.akm;
import defpackage.bmr;
import defpackage.clq;
import defpackage.cxc;
import defpackage.cyp;
import defpackage.eia;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ImageDescriptionRequest extends bmr implements Request {
    private static final String ADDITIONAL_TEXT_BUNDLE_KEY = "additional_text";
    private static final String BITMAP_COUNT_BUNDLE_KEY = "bitmap_count";
    public static final Parcelable.Creator CREATOR = new ImageDescriptionRequestParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.ImageDescriptionRequest.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public ImageDescriptionRequest readFromBundle(Bundle bundle, String str) {
            ImageDescriptionRequest imageDescriptionRequest = (ImageDescriptionRequest) createFromBundle(bundle, str, ImageDescriptionRequest.CREATOR);
            int i = bundle.getInt(ImageDescriptionRequest.BITMAP_COUNT_BUNDLE_KEY);
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                Bitmap bitmap = (Bitmap) bundle.getParcelable(ImageDescriptionRequest.getBitmapBundleKey(i2), Bitmap.class);
                bitmap.getClass();
                arrayList.add(bitmap);
            }
            imageDescriptionRequest.setImages(arrayList);
            return imageDescriptionRequest;
        }
    };
    private final String appendedResult;
    private List images;
    private IImageDescriptionStreamingCallback streamingCallback;

    /* compiled from: PG */
    public abstract class Builder {
        public abstract ImageDescriptionRequest build();

        public abstract Builder setAppendedResult(String str);

        public abstract Builder setImages(List list);

        public abstract Builder setStreamingCallback(IImageDescriptionStreamingCallback iImageDescriptionStreamingCallback);
    }

    protected ImageDescriptionRequest(List list, IImageDescriptionStreamingCallback iImageDescriptionStreamingCallback, String str) {
        this.images = list;
        this.streamingCallback = iImageDescriptionStreamingCallback;
        this.appendedResult = str;
    }

    public static Builder builder() {
        return new AutoBuilder_ImageDescriptionRequest_Builder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getBitmapBundleKey(int i) {
        return String.format(Locale.US, "bitmap_%d", Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImages(List list) {
        this.images = list;
    }

    public void attachCallbacks(final Consumer consumer) {
        this.streamingCallback = new IImageDescriptionStreamingCallback.Stub(this) { // from class: com.google.android.apps.aicore.aidl.ImageDescriptionRequest.2
            @Override // com.google.android.apps.aicore.aidl.IImageDescriptionStreamingCallback
            public void onNewText(String str) {
                if (clq.O(str)) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString(ImageDescriptionRequest.ADDITIONAL_TEXT_BUNDLE_KEY, str);
                consumer.accept(bundle);
            }
        };
    }

    public ImageDescriptionRequest copyAppendResult(String str) {
        if (getAppendedResult() != null) {
            str = String.valueOf(getAppendedResult()).concat(String.valueOf(str));
        }
        Builder builder = builder();
        builder.setImages(getImages());
        builder.setStreamingCallback(getStreamingCallback());
        builder.setAppendedResult(str);
        return builder.build();
    }

    public void forwardOnDevicePartialResults(Bundle bundle) {
        IImageDescriptionStreamingCallback iImageDescriptionStreamingCallback;
        String string = bundle.getString(ADDITIONAL_TEXT_BUNDLE_KEY);
        if (string == null || (iImageDescriptionStreamingCallback = this.streamingCallback) == null) {
            return;
        }
        iImageDescriptionStreamingCallback.onNewText(string);
    }

    public String getAppendedResult() {
        return this.appendedResult;
    }

    public List getImages() {
        return this.images;
    }

    public cxc getInferenceImageRequestsForSafety(akm akmVar, eia eiaVar) {
        List list = this.images;
        if (list != null) {
            return cxc.o(list);
        }
        int i = cxc.d;
        return cyp.a;
    }

    public cxc getInferenceRequestsForSafety(akm akmVar, eia eiaVar) {
        int i = cxc.d;
        return cyp.a;
    }

    public String getRequestContentForSafety(akm akmVar, eia eiaVar) {
        return "";
    }

    public int getSafetyClassificationMode() {
        return 1;
    }

    public IImageDescriptionStreamingCallback getStreamingCallback() {
        return this.streamingCallback;
    }

    public IBinder getStreamingCallbackBinder() {
        IImageDescriptionStreamingCallback iImageDescriptionStreamingCallback = this.streamingCallback;
        if (iImageDescriptionStreamingCallback == null) {
            return null;
        }
        return iImageDescriptionStreamingCallback.asBinder();
    }

    public boolean hasBundledCallbacks() {
        return this.streamingCallback != null;
    }

    public boolean hasStreamingCallback() {
        return getStreamingCallback() != null;
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public void writeToBundle(Bundle bundle, String str) {
        List list = this.images;
        list.getClass();
        IImageDescriptionStreamingCallback iImageDescriptionStreamingCallback = this.streamingCallback;
        this.streamingCallback = null;
        this.images = null;
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
        bundle.putInt(BITMAP_COUNT_BUNDLE_KEY, list.size());
        for (int i = 0; i < list.size(); i++) {
            bundle.putParcelable(getBitmapBundleKey(i), ((Bitmap) list.get(i)).asShared());
        }
        this.images = list;
        this.streamingCallback = iImageDescriptionStreamingCallback;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ImageDescriptionRequestParcelableCreator.writeToParcel(this, parcel, i);
    }

    public ImageDescriptionRequest(List list, IBinder iBinder, String str) {
        this.images = list;
        this.streamingCallback = iBinder == null ? null : IImageDescriptionStreamingCallback.Stub.asInterface(iBinder);
        this.appendedResult = str;
    }
}
