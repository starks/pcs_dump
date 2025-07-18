package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adu {
    public static final zl f = new zl();
    private static final String[] g = {"INSERT", "UPDATE", "DELETE"};
    public final add a;
    public final boolean b;
    public final acv c;
    private final Map h;
    private final Map i;
    private final fiy j;
    private final String[] l;
    private final fsc m;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public fin e = new afi(1);
    private final Map k = new LinkedHashMap();

    public adu(add addVar, Map map, Map map2, String[] strArr, boolean z, fiy fiyVar) {
        String lowerCase;
        this.a = addVar;
        this.h = map;
        this.i = map2;
        this.b = z;
        this.j = fiyVar;
        String[] strArr2 = new String[1];
        for (int i = 0; i <= 0; i++) {
            String lowerCase2 = strArr[i].toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            this.k.put(lowerCase2, Integer.valueOf(i));
            String str = (String) this.h.get(strArr[i]);
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.l = strArr2;
        for (Map.Entry entry : this.h.entrySet()) {
            String lowerCase3 = ((String) entry.getValue()).toLowerCase(Locale.ROOT);
            lowerCase3.getClass();
            if (this.k.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
                lowerCase4.getClass();
                Map map3 = this.k;
                map3.put(lowerCase4, ffh.u(map3, lowerCase3));
            }
        }
        this.c = new acv(1);
        this.m = new fsc(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.acw r5, defpackage.fhk r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.adn
            if (r0 == 0) goto L13
            r0 = r6
            adn r0 = (defpackage.adn) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            adn r0 = new adn
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.b
            fhs r6 = defpackage.fhs.a
            int r1 = r0.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r5 = r0.a
            java.util.Set r5 = (java.util.Set) r5
            defpackage.ffh.c(r4)
            return r5
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            java.lang.Object r5 = r0.a
            acw r5 = (defpackage.acw) r5
            defpackage.ffh.c(r4)
            goto L53
        L3e:
            defpackage.ffh.c(r4)
            adm r4 = new adm
            r1 = 0
            r4.<init>(r1)
            r0.a = r5
            r0.d = r3
            java.lang.String r1 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.a(r1, r4, r0)
            if (r4 == r6) goto L68
        L53:
            java.util.Set r4 = (java.util.Set) r4
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L67
            r0.a = r4
            r0.d = r2
            java.lang.String r1 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = defpackage.zl.e(r5, r1, r0)
            if (r5 == r6) goto L68
        L67:
            return r4
        L68:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adu.a(acw, fhk):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0086 A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:32:0x007e, B:34:0x0086, B:47:0x00c2, B:37:0x0092, B:38:0x0094, B:40:0x00a4, B:42:0x00ae, B:44:0x00b4, B:43:0x00b2, B:45:0x00b9, B:20:0x0048, B:22:0x0050, B:25:0x0056, B:27:0x0064, B:30:0x006a), top: B:59:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.fhk r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adu.b(fhk):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (r15 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ca, code lost:
    
        if (r15 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d2, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ca -> B:27:0x00cd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.acw r13, int r14, defpackage.fhk r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adu.c(acw, int, fhk):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0077 -> B:19:0x007a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.acw r9, int r10, defpackage.fhk r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.adr
            if (r0 == 0) goto L13
            r0 = r11
            adr r0 = (defpackage.adr) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            adr r0 = new adr
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.d
            fhs r1 = defpackage.fhs.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r8 = r0.c
            int r9 = r0.b
            java.lang.String[] r10 = r0.h
            java.lang.String r2 = r0.g
            java.lang.Object r4 = r0.a
            defpackage.ffh.c(r11)
            r11 = r10
            r10 = r4
            goto L7a
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            defpackage.ffh.c(r11)
            java.lang.String[] r8 = r8.l
            r8 = r8[r10]
            java.lang.String[] r10 = defpackage.adu.g
            r11 = 3
            r2 = 0
            r7 = r2
            r2 = r8
            r8 = r11
            r11 = r10
            r10 = r9
            r9 = r7
        L4c:
            if (r9 >= r8) goto L7c
            r4 = r11[r9]
            java.lang.String r4 = defpackage.zl.d(r2, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "DROP TRIGGER IF EXISTS `"
            r5.<init>(r6)
            r5.append(r4)
            r4 = 96
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r0.a = r10
            r0.g = r2
            r0.h = r11
            r0.b = r9
            r0.c = r8
            r0.f = r3
            java.lang.Object r4 = defpackage.zl.e(r10, r4, r0)
            if (r4 != r1) goto L7a
            return r1
        L7a:
            int r9 = r9 + r3
            goto L4c
        L7c:
            ffz r8 = defpackage.ffz.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adu.d(acw, int, fhk):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.fhk r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.ads
            if (r0 == 0) goto L13
            r0 = r9
            ads r0 = (defpackage.ads) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads r0 = new ads
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            fhs r1 = defpackage.fhs.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ayo r8 = r0.d
            defpackage.ffh.c(r9)     // Catch: java.lang.Throwable -> L29
            goto L55
        L29:
            r9 = move-exception
            goto L5e
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            defpackage.ffh.c(r9)
            add r9 = r8.a
            ayo r9 = r9.i
            boolean r2 = r9.d()
            if (r2 == 0) goto L62
            add r2 = r8.a     // Catch: java.lang.Throwable -> L5a
            adp r4 = new adp     // Catch: java.lang.Throwable -> L5a
            r5 = 2
            r6 = 0
            r4.<init>(r8, r6, r5, r6)     // Catch: java.lang.Throwable -> L5a
            r0.d = r9     // Catch: java.lang.Throwable -> L5a
            r0.c = r3     // Catch: java.lang.Throwable -> L5a
            r8 = 0
            java.lang.Object r8 = r2.d(r8, r4, r0)     // Catch: java.lang.Throwable -> L5a
            if (r8 == r1) goto L59
            r8 = r9
        L55:
            r8.c()
            goto L62
        L59:
            return r1
        L5a:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L5e:
            r8.c()
            throw r9
        L62:
            ffz r8 = defpackage.ffz.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adu.e(fhk):java.lang.Object");
    }

    public final ffs f(String[] strArr) {
        fhd fhdVar = new fhd();
        String str = strArr[0];
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        Set set = (Set) this.i.get(lowerCase);
        if (set != null) {
            fhdVar.addAll(set);
        } else {
            fhdVar.add(str);
        }
        String[] strArr2 = (String[]) ffh.p(fhdVar).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            Map map = this.k;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) map.get(lowerCase2);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(String.valueOf(str2)));
            }
            iArr[i] = num.intValue();
        }
        return new ffs(strArr2, iArr);
    }
}
