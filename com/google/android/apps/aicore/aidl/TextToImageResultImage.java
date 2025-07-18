package com.google.android.apps.aicore.aidl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import defpackage.bmr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TextToImageResultImage extends bmr implements Result {
    private static final String IMAGE_RESULT_BITMAP_BUNDLE_KEY = "image_result_bitmap";
    private Bitmap bitmap;
    private final int safetyClassificationResult;
    public static final Parcelable.Creator CREATOR = new TextToImageResultImageParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.TextToImageResultImage.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public TextToImageResultImage readFromBundle(Bundle bundle, String str) {
            TextToImageResultImage textToImageResultImage = (TextToImageResultImage) createFromBundle(bundle, str, TextToImageResultImage.CREATOR);
            Bitmap bitmap = (Bitmap) bundle.getParcelable(TextToImageResultImage.IMAGE_RESULT_BITMAP_BUNDLE_KEY, Bitmap.class);
            if (bitmap != null) {
                textToImageResultImage.setBitmap(bitmap);
            }
            return textToImageResultImage;
        }
    };

    public TextToImageResultImage(Bitmap bitmap, int i) {
        this.bitmap = bitmap;
        this.safetyClassificationResult = i;
    }

    public static TextToImageResultImage create(Bitmap bitmap) {
        return new TextToImageResultImage(bitmap, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public int getSafetyClassificationResult() {
        return this.safetyClassificationResult;
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public void writeToBundle(Bundle bundle, String str) {
        Bitmap bitmap = this.bitmap;
        this.bitmap = null;
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
        bundle.putParcelable(IMAGE_RESULT_BITMAP_BUNDLE_KEY, bitmap);
        this.bitmap = bitmap;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TextToImageResultImageParcelableCreator.writeToParcel(this, parcel, i);
    }

    public static TextToImageResultImage create(Bitmap bitmap, int i) {
        return new TextToImageResultImage(bitmap, i);
    }
}
