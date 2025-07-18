package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbe {
    public static final cbe a = new cbe();
    private final erb[] b;

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private cbe() {
        /*
            r8 = this;
            r8.<init>()
            int[] r0 = defpackage.eib.values$ar$edu$b46a8d2b_0()
            int r1 = r0.length
            r2 = 0
            r3 = r2
            r4 = r3
        Lb:
            r5 = 0
            if (r3 >= r1) goto L1c
            r6 = r0[r3]
            int r7 = r6 + (-1)
            if (r6 == 0) goto L1b
            int r4 = java.lang.Math.max(r4, r7)
            int r3 = r3 + 1
            goto Lb
        L1b:
            throw r5
        L1c:
            int r4 = r4 + 1
            erb[] r0 = new defpackage.erb[r4]
            r8.b = r0
            int[] r0 = defpackage.eib.values$ar$edu$b46a8d2b_0()
            int r1 = r0.length
        L27:
            if (r2 >= r1) goto L62
            r3 = r0[r2]
            int r4 = r3 + (-1)
            if (r3 == 0) goto L61
            r6 = 17
            if (r4 == r6) goto L4c
            r6 = 27
            if (r4 == r6) goto L4c
            r6 = 78
            if (r4 == r6) goto L4c
            r6 = 82
            if (r4 == r6) goto L4c
            switch(r4) {
                case 12: goto L4c;
                case 13: goto L4c;
                case 14: goto L4c;
                case 15: goto L4c;
                default: goto L42;
            }
        L42:
            switch(r4) {
                case 19: goto L4c;
                case 20: goto L4c;
                case 21: goto L4c;
                default: goto L45;
            }
        L45:
            switch(r4) {
                case 31: goto L4c;
                case 32: goto L4c;
                case 33: goto L4c;
                case 34: goto L4c;
                case 35: goto L4c;
                case 36: goto L4c;
                case 37: goto L4c;
                case 38: goto L4c;
                case 39: goto L4c;
                case 40: goto L4c;
                case 41: goto L4c;
                case 42: goto L4c;
                case 43: goto L4c;
                case 44: goto L4c;
                case 45: goto L4c;
                case 46: goto L4c;
                case 47: goto L4c;
                case 48: goto L4c;
                case 49: goto L4c;
                default: goto L48;
            }
        L48:
            switch(r4) {
                case 56: goto L4c;
                case 57: goto L4c;
                case 58: goto L4c;
                case 59: goto L4c;
                case 60: goto L4c;
                case 61: goto L4c;
                case 62: goto L4c;
                case 63: goto L4c;
                case 64: goto L4c;
                case 65: goto L4c;
                case 66: goto L4c;
                case 67: goto L4c;
                case 68: goto L4c;
                case 69: goto L4c;
                case 70: goto L4c;
                case 71: goto L4c;
                case 72: goto L4c;
                case 73: goto L4c;
                default: goto L4b;
            }
        L4b:
            goto L5d
        L4c:
            erb[] r6 = r8.b
            if (r3 == 0) goto L60
            erb r3 = new erb
            r3.<init>()
            r6[r4] = r3
            int r4 = defpackage.cxc.d
            cxc r4 = defpackage.cyp.a
            r3.a = r4
        L5d:
            int r2 = r2 + 1
            goto L27
        L60:
            throw r5
        L61:
            throw r5
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbe.<init>():void");
    }
}
