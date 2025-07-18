package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fta {
    public static final fta a;
    public static final fta b;
    public static final fta c;
    public static final fta d;
    public static final fta e;
    public static final fta f;
    public static final fta g;
    public static final fta h;
    public static final fta i;
    public static final fta j;
    public static final fta k;
    public static final fta l;
    public static final fta m;
    public static final fta n;
    public static final fwv p;
    private static final /* synthetic */ fta[] q;
    public final int o;

    static {
        fta ftaVar = new fta("NO_ERROR", 0, 0);
        a = ftaVar;
        fta ftaVar2 = new fta("PROTOCOL_ERROR", 1, 1);
        b = ftaVar2;
        fta ftaVar3 = new fta("INTERNAL_ERROR", 2, 2);
        c = ftaVar3;
        fta ftaVar4 = new fta("FLOW_CONTROL_ERROR", 3, 3);
        d = ftaVar4;
        fta ftaVar5 = new fta("SETTINGS_TIMEOUT", 4, 4);
        e = ftaVar5;
        fta ftaVar6 = new fta("STREAM_CLOSED", 5, 5);
        f = ftaVar6;
        fta ftaVar7 = new fta("FRAME_SIZE_ERROR", 6, 6);
        g = ftaVar7;
        fta ftaVar8 = new fta("REFUSED_STREAM", 7, 7);
        h = ftaVar8;
        fta ftaVar9 = new fta("CANCEL", 8, 8);
        i = ftaVar9;
        fta ftaVar10 = new fta("COMPRESSION_ERROR", 9, 9);
        j = ftaVar10;
        fta ftaVar11 = new fta("CONNECT_ERROR", 10, 10);
        k = ftaVar11;
        fta ftaVar12 = new fta("ENHANCE_YOUR_CALM", 11, 11);
        l = ftaVar12;
        fta ftaVar13 = new fta("INADEQUATE_SECURITY", 12, 12);
        m = ftaVar13;
        fta ftaVar14 = new fta("HTTP_1_1_REQUIRED", 13, 13);
        n = ftaVar14;
        fta[] ftaVarArr = {ftaVar, ftaVar2, ftaVar3, ftaVar4, ftaVar5, ftaVar6, ftaVar7, ftaVar8, ftaVar9, ftaVar10, ftaVar11, ftaVar12, ftaVar13, ftaVar14};
        q = ftaVarArr;
        fjp.z(ftaVarArr);
        p = new fwv();
    }

    private fta(String str, int i2, int i3) {
        this.o = i3;
    }

    public static fta[] values() {
        return (fta[]) q.clone();
    }
}
