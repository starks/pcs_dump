package com.google.android.apps.aicore.aidl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.Bundleable;
import defpackage.bmr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InfoExtractionInput extends bmr implements Bundleable {
    public static final Parcelable.Creator CREATOR = new InfoExtractionInputParcelableCreator();
    public static final Bundleable.Reader READER = new Bundleable.Reader() { // from class: com.google.android.apps.aicore.aidl.InfoExtractionInput.1
        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public /* synthetic */ Bundleable createFromBundle(Bundle bundle, String str, Parcelable.Creator creator) {
            return Bundleable.Reader.CC.$default$createFromBundle(this, bundle, str, creator);
        }

        @Override // com.google.android.apps.aicore.aidl.Bundleable.Reader
        public InfoExtractionInput readFromBundle(Bundle bundle, String str) {
            InfoExtractionInput infoExtractionInput = (InfoExtractionInput) createFromBundle(bundle, str, InfoExtractionInput.CREATOR);
            infoExtractionInput.setBitmap((Bitmap) bundle.getParcelable(InfoExtractionInput.getBitmapBundleKey(str), Bitmap.class));
            return infoExtractionInput;
        }
    };
    private Bitmap bitmap;
    private final String message;

    public InfoExtractionInput(String str, Bitmap bitmap) {
        this.message = str;
        this.bitmap = bitmap;
    }

    public static InfoExtractionInput create(String str, Bitmap bitmap) {
        return new InfoExtractionInput(str, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getBitmapBundleKey(String str) {
        return String.valueOf(str).concat("_bitmap");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public String getMessage() {
        return this.message;
    }

    @Override // com.google.android.apps.aicore.aidl.Bundleable
    public void writeToBundle(Bundle bundle, String str) {
        Bitmap bitmap = this.bitmap;
        this.bitmap = null;
        Bundleable.CC.writeParcelableToBundle(this, bundle, str);
        bundle.putParcelable(getBitmapBundleKey(str), bitmap);
        this.bitmap = bitmap;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        InfoExtractionInputParcelableCreator.writeToParcel(this, parcel, i);
    }
}
