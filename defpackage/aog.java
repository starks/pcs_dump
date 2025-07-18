package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aog {
    SYSTEMUI("systemui"),
    TEXTCLASSIFIER("textclassifier"),
    AICORE("aicore"),
    DEVICE_PERSONALIZATION_SERVICES("device_personalization_services");

    public final String e;

    aog(String str) {
        this.e = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.e;
    }
}
