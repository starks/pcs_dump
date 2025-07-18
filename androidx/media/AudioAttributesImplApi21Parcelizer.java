package androidx.media;

import android.media.AudioAttributes;
import defpackage.air;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(air airVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) airVar.b(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = airVar.a(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, air airVar) {
        airVar.i(audioAttributesImplApi21.a, 1);
        airVar.h(audioAttributesImplApi21.b, 2);
    }
}
