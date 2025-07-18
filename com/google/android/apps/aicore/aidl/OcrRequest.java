package com.google.android.apps.aicore.aidl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import defpackage.bmr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OcrRequest extends bmr implements Request {
    private static final String OCR_BITMAP_BUNDLE_KEY = "ocr_bitmap";
    private final Bitmap bitmap;
    public static final Parcelable.Creator CREATOR = new OcrRequestParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.OcrRequest.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public OcrRequest readFromBundle(Bundle bundle, String str) {
            Bitmap bitmap = (Bitmap) bundle.getParcelable(OcrRequest.OCR_BITMAP_BUNDLE_KEY, Bitmap.class);
            bitmap.getClass();
            return OcrRequest.create(bitmap);
        }
    };

    public OcrRequest(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public static OcrRequest create(Bitmap bitmap) {
        return new OcrRequest(bitmap);
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public void writeToBundle(Bundle bundle, String str) {
        bundle.putParcelable(OCR_BITMAP_BUNDLE_KEY, this.bitmap);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        OcrRequestParcelableCreator.writeToParcel(this, parcel, i);
    }
}
