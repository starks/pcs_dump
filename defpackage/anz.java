package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class anz implements aof {
    static {
        csd.c(",").d();
    }

    private static void e(String str, String str2, Throwable th) {
        ((czl) ((czl) ((czl) any.a.e()).h(th)).i("com/google/android/apps/miphone/astrea/common/config/AbstractFlagManager", "logReadWarning", 154, "AbstractFlagManager.java")).t("Failed to get a property for name %s with type %s, returning safe value", str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    @Override // defpackage.aof
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean a(defpackage.aoc r5, java.lang.Boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = r5.a
            java.lang.String r4 = r4.d(r0)
            if (r4 != 0) goto L9
            return r6
        L9:
            int r0 = r4.hashCode()
            r1 = 3569038(0x36758e, float:5.001287E-39)
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L24
            r1 = 97196323(0x5cb1923, float:1.9099262E-35)
            if (r0 == r1) goto L1a
            goto L2e
        L1a:
            java.lang.String r0 = "false"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L2e
            r0 = r3
            goto L2f
        L24:
            java.lang.String r0 = "true"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L2e
            r0 = r2
            goto L2f
        L2e:
            r0 = -1
        L2f:
            if (r0 == 0) goto L4d
            if (r0 == r3) goto L48
            java.lang.String r5 = r5.a
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Value "
            java.lang.String r2 = " is not a valid boolean"
            java.lang.String r4 = defpackage.a.z(r4, r1, r2)
            r0.<init>(r4)
            java.lang.String r4 = "boolean"
            e(r5, r4, r0)
            return r6
        L48:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        L4d:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anz.a(aoc, java.lang.Boolean):java.lang.Boolean");
    }

    @Override // defpackage.aof
    public final Integer b(aod aodVar, Integer num) {
        String strD = d(aodVar.a);
        if (strD == null) {
            return num;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strD));
        } catch (NumberFormatException e) {
            e(aodVar.a, "integer", e);
            return num;
        }
    }

    @Override // defpackage.aof
    public final Long c(aoe aoeVar, Long l) {
        String strD = d(aoeVar.a);
        if (strD == null) {
            return l;
        }
        try {
            return Long.valueOf(Long.parseLong(strD));
        } catch (NumberFormatException e) {
            e(aoeVar.a, "long", e);
            return l;
        }
    }

    protected abstract String d(String str);
}
