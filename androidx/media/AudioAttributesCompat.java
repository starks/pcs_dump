package androidx.media;

import android.util.SparseIntArray;
import defpackage.ais;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class AudioAttributesCompat implements ais {
    public static final /* synthetic */ int b = 0;
    private static final SparseIntArray c;
    public AudioAttributesImpl a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.a;
        return audioAttributesImpl == null ? audioAttributesCompat.a == null : audioAttributesImpl.equals(audioAttributesCompat.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
