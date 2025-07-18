package com.google.android.apps.aicore.aidl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import com.google.android.apps.aicore.aidl.IImageEmbeddingCallback;
import com.google.android.apps.aicore.aidl.SonnyRequest;
import defpackage.bmr;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SonnyRequest extends bmr implements Request {
    private static final String BITMAP_COUNT_BUNDLE_KEY = "bitmap_count";
    private static final String IMAGE_EMBEDDING_ID_BUNDLE_KEY = "image_embedding";
    private IImageEmbeddingCallback imageEmbeddingCallback;
    private List images;
    private final int preferredImageHeight;
    private final int preferredImageWidth;
    public static final Parcelable.Creator CREATOR = new SonnyRequestParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.SonnyRequest.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public SonnyRequest readFromBundle(Bundle bundle, String str) {
            SonnyRequest sonnyRequest = (SonnyRequest) createFromBundle(bundle, str, SonnyRequest.CREATOR);
            int i = bundle.getInt(SonnyRequest.BITMAP_COUNT_BUNDLE_KEY);
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                Bitmap bitmap = (Bitmap) bundle.getParcelable(SonnyRequest.getBitmapBundleKey(i2), Bitmap.class);
                bitmap.getClass();
                arrayList.add(bitmap);
            }
            sonnyRequest.setImages(arrayList);
            return sonnyRequest;
        }
    };

    /* compiled from: PG */
    /* renamed from: com.google.android.apps.aicore.aidl.SonnyRequest$2, reason: invalid class name */
    class AnonymousClass2 extends IImageEmbeddingCallback.Stub {
        final /* synthetic */ Consumer val$onPartialResultCallback;

        public AnonymousClass2(SonnyRequest sonnyRequest, Consumer consumer) {
            this.val$onPartialResultCallback = consumer;
        }

        static /* synthetic */ ParcelFileDescriptor[] lambda$onNewEmbeddings$0(int i) {
            return new ParcelFileDescriptor[i];
        }

        @Override // com.google.android.apps.aicore.aidl.IImageEmbeddingCallback
        public void onNewEmbeddings(List list) {
            if (list.isEmpty()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("image_embedding", (Parcelable[]) Collection.EL.toArray(list, new IntFunction() { // from class: com.google.android.apps.aicore.aidl.SonnyRequest$2$$ExternalSyntheticLambda0
                @Override // java.util.function.IntFunction
                public final Object apply(int i) {
                    return SonnyRequest.AnonymousClass2.lambda$onNewEmbeddings$0(i);
                }
            }));
            this.val$onPartialResultCallback.accept(bundle);
        }
    }

    public SonnyRequest(List list, IImageEmbeddingCallback iImageEmbeddingCallback, int i, int i2) {
        this.images = list;
        this.imageEmbeddingCallback = iImageEmbeddingCallback;
        this.preferredImageWidth = i;
        this.preferredImageHeight = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getBitmapBundleKey(int i) {
        return String.format(Locale.US, "bitmap_%d", Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImages(List list) {
        this.images = list;
    }

    public void attachCallbacks(Consumer consumer) {
        this.imageEmbeddingCallback = new AnonymousClass2(this, consumer);
    }

    public void forwardOnDevicePartialResults(Bundle bundle) {
        IImageEmbeddingCallback iImageEmbeddingCallback;
        ParcelFileDescriptor[] parcelFileDescriptorArr = (ParcelFileDescriptor[]) bundle.getParcelableArray("image_embedding", ParcelFileDescriptor.class);
        if (parcelFileDescriptorArr == null || (iImageEmbeddingCallback = this.imageEmbeddingCallback) == null) {
            return;
        }
        iImageEmbeddingCallback.onNewEmbeddings(Arrays.asList(parcelFileDescriptorArr));
    }

    public IImageEmbeddingCallback getImageEmbeddingCallback() {
        return this.imageEmbeddingCallback;
    }

    public IBinder getImageEmbeddingCallbackBinder() {
        IImageEmbeddingCallback iImageEmbeddingCallback = this.imageEmbeddingCallback;
        if (iImageEmbeddingCallback == null) {
            return null;
        }
        return iImageEmbeddingCallback.asBinder();
    }

    public List getImages() {
        return this.images;
    }

    public int getPreferredImageHeight() {
        return this.preferredImageHeight;
    }

    public int getPreferredImageWidth() {
        return this.preferredImageWidth;
    }

    public boolean hasBundledCallbacks() {
        return this.imageEmbeddingCallback != null;
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public void writeToBundle(Bundle bundle, String str) {
        List list = this.images;
        list.getClass();
        IImageEmbeddingCallback iImageEmbeddingCallback = this.imageEmbeddingCallback;
        this.imageEmbeddingCallback = null;
        this.images = null;
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
        bundle.putInt(BITMAP_COUNT_BUNDLE_KEY, list.size());
        for (int i = 0; i < list.size(); i++) {
            bundle.putParcelable(getBitmapBundleKey(i), (Parcelable) list.get(i));
        }
        this.images = list;
        this.imageEmbeddingCallback = iImageEmbeddingCallback;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SonnyRequestParcelableCreator.writeToParcel(this, parcel, i);
    }

    public SonnyRequest(List list, IBinder iBinder, int i, int i2) {
        this.images = list;
        this.imageEmbeddingCallback = iBinder == null ? null : IImageEmbeddingCallback.Stub.asInterface(iBinder);
        this.preferredImageWidth = i;
        this.preferredImageHeight = i2;
    }
}
