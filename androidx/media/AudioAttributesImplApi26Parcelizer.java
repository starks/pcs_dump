package androidx.media;

import android.media.AudioAttributes;
import defpackage.air;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(air airVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) airVar.b(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = airVar.a(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, air airVar) {
        airVar.i(audioAttributesImplApi26.a, 1);
        airVar.h(audioAttributesImplApi26.b, 2);
    }
}
