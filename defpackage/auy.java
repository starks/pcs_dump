package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auy {
    private static final czn a = czn.j("com/google/android/apps/miphone/astrea/networkusage/db/Converters");

    public static ajc a(byte[] bArr) {
        try {
            een eenVar = een.a;
            egr egrVar = egr.a;
            return (ajc) efb.parseFrom(ajc.a, bArr, een.a);
        } catch (efp e) {
            ((czl) ((czl) ((czl) a.d()).h(e)).i("com/google/android/apps/miphone/astrea/networkusage/db/Converters", "policyProtoFromBytes", '9', "Converters.java")).p("Unable to parse PolicyProto.");
            return ajc.a;
        }
    }

    public static auj b(byte[] bArr) {
        try {
            een eenVar = een.a;
            egr egrVar = egr.a;
            return (auj) efb.parseFrom(auj.a, bArr, een.a);
        } catch (efp e) {
            ((czl) ((czl) ((czl) a.d()).h(e)).i("com/google/android/apps/miphone/astrea/networkusage/db/Converters", "connectionKeyFromBytes", (char) 21, "Converters.java")).p("Unable to parse ConnectionKey.");
            return auj.a;
        }
    }
}
