package com.google.android.apps.aicore.aidl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import defpackage.bmr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LLMMessage extends bmr implements Bundleable {
    private static final String BITMAP_BUNDLE_KEY = "bitmap";
    private static final String MESSAGE_DATA_BUNDLE_KEY = "message_data";
    private Bitmap bitmap;
    private final ParcelFileDescriptor imageEmbedding;
    private final String message;
    private final int role;
    private final int type;
    private final boolean writeImageEmbedding;
    public static final Parcelable.Creator CREATOR = new LLMMessageParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.LLMMessage.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public LLMMessage readFromBundle(Bundle bundle, String str) {
            Bundle bundle2 = bundle.getBundle(str);
            bundle2.getClass();
            LLMMessage lLMMessage = (LLMMessage) createFromBundle(bundle2, LLMMessage.MESSAGE_DATA_BUNDLE_KEY, LLMMessage.CREATOR);
            if (lLMMessage.getType() == 1) {
                Bitmap bitmap = (Bitmap) bundle2.getParcelable(LLMMessage.BITMAP_BUNDLE_KEY, Bitmap.class);
                bitmap.getClass();
                lLMMessage.setBitmap(bitmap);
            }
            return lLMMessage;
        }
    };

    /* compiled from: PG */
    public @interface Role {
        public static final int LLM = 1;
        public static final int USER = 0;
    }

    /* compiled from: PG */
    public @interface Type {
        public static final int BITMAP = 1;
        public static final int IMAGE_EMBEDDING = 2;
        public static final int TEXT = 0;
    }

    public LLMMessage(int i, String str, Bitmap bitmap, int i2, ParcelFileDescriptor parcelFileDescriptor, boolean z) {
        this.role = i;
        this.message = str;
        this.bitmap = bitmap;
        this.type = i2;
        this.imageEmbedding = parcelFileDescriptor;
        this.writeImageEmbedding = z;
    }

    public static LLMMessage create(int i, Bitmap bitmap, boolean z) {
        bitmap.getClass();
        return new LLMMessage(i, null, bitmap, 1, null, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public ParcelFileDescriptor getImageEmbedding() {
        return this.imageEmbedding;
    }

    public String getMessage() {
        return this.message;
    }

    public int getRole() {
        return this.role;
    }

    public int getType() {
        return this.type;
    }

    public boolean getWriteImageEmbedding() {
        return this.writeImageEmbedding;
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public void writeToBundle(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            this.bitmap = null;
            Bundleable.CC.writeParcelableToBundle(this, bundle2, MESSAGE_DATA_BUNDLE_KEY);
            this.bitmap = bitmap;
            bundle2.putParcelable(BITMAP_BUNDLE_KEY, bitmap);
        } else {
            Bundleable.CC.writeParcelableToBundle(this, bundle2, MESSAGE_DATA_BUNDLE_KEY);
        }
        bundle.putBundle(str, bundle2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LLMMessageParcelableCreator.writeToParcel(this, parcel, i);
    }

    public static LLMMessage create(int i, ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.getClass();
        return new LLMMessage(i, null, null, 2, parcelFileDescriptor, false);
    }

    public static LLMMessage create(int i, String str) {
        str.getClass();
        return new LLMMessage(i, str, null, 0, null, false);
    }
}
