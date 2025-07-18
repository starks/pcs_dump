package androidx.media;

import defpackage.air;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(air airVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = airVar.a(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = airVar.a(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = airVar.a(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = airVar.a(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, air airVar) {
        airVar.h(audioAttributesImplBase.a, 1);
        airVar.h(audioAttributesImplBase.b, 2);
        airVar.h(audioAttributesImplBase.c, 3);
        airVar.h(audioAttributesImplBase.d, 4);
    }
}
